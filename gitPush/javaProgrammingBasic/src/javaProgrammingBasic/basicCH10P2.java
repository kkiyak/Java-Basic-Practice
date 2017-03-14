package javaProgrammingBasic;
import java.io.*;

//문자열 리버스
public class basicCH10P2 {
	public static void main(String[] args) throws IOException
	{

		System.out.println("문자열을 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer sbStr = new StringBuffer(str);
		StringBuffer reversStr= sbStr.reverse();
				
		System.out.println(str+"를 거꾸로 읽으면 "+reversStr+"입니다.");
		
	}
}
