package javaProgrammingBasic;
import java.io.*;

//시험점수 입력받고 합계 출력. 0으로 종료
public class basicCH6P2 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int intNum;
		int sum=0;		
		
		do{
			String strNum=br.readLine();
			intNum=Integer.parseInt(strNum);
			sum+=intNum;
		}while(intNum!=0);
		
		System.out.println("시험 점수의 합계는 " + sum + "점 입니다."); 
		
	}
}