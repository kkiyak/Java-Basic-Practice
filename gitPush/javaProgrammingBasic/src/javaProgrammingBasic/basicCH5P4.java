package javaProgrammingBasic;
import java.io.*;

//값이 0~10인 경우 정답 , 그 외 오답
public class basicCH5P4 {
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("0에서 10까지의 수를 입력하십시오."); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum=br.readLine();
		Integer intNum=Integer.parseInt(strNum);
					
		if(intNum >= 0 && intNum <=10)	System.out.println("정답입니다.");
		else System.out.println("오답입니다.");
	}
}