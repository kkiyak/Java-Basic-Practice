package javaProgrammingBasic;
import java.io. *;

public class basicCH4P4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("삼각형의 밑변과 높이를 입력하십시오."); 
		BufferedReader base = new BufferedReader(new InputStreamReader(System.in));
		String strBase=base.readLine();
		Integer intBase=Integer.parseInt(strBase);
		BufferedReader height = new BufferedReader(new InputStreamReader(System.in));
		String strHeight=height.readLine();
		Integer intHeight=Integer.parseInt(strHeight);
		System.out.println("삼각형의 넓이는 " + (double)(intHeight*intBase)/2 + "입니다."); 
		
	}
	
}
