package javaProgrammingBasic;
import java.io. *;

public class basicCH3P5 {
	public static void main(String[] args) throws IOException
	{
	System.out.println("키와 몸무게를 입력하십시오."); 
	BufferedReader height = new BufferedReader(new InputStreamReader(System.in));
	String strHeight=height.readLine();
	double doubleHeight=Double.parseDouble(strHeight);
	BufferedReader weigh = new BufferedReader(new InputStreamReader(System.in));
	String strWeigh=weigh.readLine();
	double doubleWeigh=Double.parseDouble(strWeigh);
	System.out.println("키는 " + doubleHeight + "센티미터입니다.");
	System.out.println("몸무게는 " + doubleWeigh + "킬로그램입니다.");
	}
}
