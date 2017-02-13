package javaProgrammingBasic;
import java.io. *;

public class basicCH4P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("정사각형의 한 변의 길이를 입력하십시오."); 
		BufferedReader side = new BufferedReader(new InputStreamReader(System.in));
		String strSide=side.readLine();
		Integer intSide=Integer.parseInt(strSide);
		System.out.println("정사각형의 넓이는 " + intSide*intSide + "입니다."); 
		
	}
}
