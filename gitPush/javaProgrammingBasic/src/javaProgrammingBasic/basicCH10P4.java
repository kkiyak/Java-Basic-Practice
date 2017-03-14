package javaProgrammingBasic;
import java.io.*;

public class basicCH10P4 {
	public static void main(String[] args) throws IOException
	{
	
		System.out.println("정수를 2개 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		
		int int1=Integer.parseInt(str1);
		int int2=Integer.parseInt(str2);
		int ans=Math.min(int1, int2);
		
		System.out.println(int1+"와(과) "+int2+" 중 작은 쪽은 "+ans+"입니다.");
	
	}
}
