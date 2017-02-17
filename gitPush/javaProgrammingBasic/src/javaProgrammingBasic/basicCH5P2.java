package javaProgrammingBasic;
import java.io. *;

//정수 입력받아 짝수 홀수 판별
public class basicCH5P2 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("정수를 입력하십시오."); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum=br.readLine();
		Integer intNum=Integer.parseInt(strNum);
					
		if(intNum%2 == 0)	System.out.println(intNum + "은(는) 짝수 입니다.");
		else System.out.println(intNum + "은(는) 홀수 입니다.");
	}
}
