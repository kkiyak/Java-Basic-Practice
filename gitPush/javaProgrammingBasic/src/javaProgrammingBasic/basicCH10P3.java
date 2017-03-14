package javaProgrammingBasic;
import java.io.*;

public class basicCH10P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("문자열을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		StringBuffer sbStr = new StringBuffer(str);
		
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오.");
		String strP=br.readLine();
		int intP=Integer.parseInt(strP);
				
		StringBuffer sbInsert = new StringBuffer(sbStr.insert(intP,"a"));
		
		System.out.println(sbInsert+"가 되었습니다.");
		
	}
}
