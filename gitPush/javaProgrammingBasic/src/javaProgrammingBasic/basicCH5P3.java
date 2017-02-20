package javaProgrammingBasic;
import java.io.*;

//2개의 정수값을 입력받은 후 대소 비교
public class basicCH5P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("2개의 정수를 입력하십시오."); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum1=br.readLine();
		String strNum2=br.readLine();
		Integer intNum1=Integer.parseInt(strNum1);
		Integer intNum2=Integer.parseInt(strNum2);
		
	
		if(intNum1<intNum2) System.out.println(intNum1 + "보다 " + intNum2 + "이(가) 큽니다.");
		else if(intNum1>intNum2) System.out.println(intNum2 + "보다 " + intNum1 + "이(가) 큽니다.");
		else System.out.println("두 숫자는 같습니다."); 
	}
}
