package javaProgrammingBasic;
import java.io. *;

public class basicCH3P4 {
	public static void main(String[] args) throws IOException
	{
	System.out.println("원주율의 값은 얼마입니까?"); 
	BufferedReader pi = new BufferedReader(new InputStreamReader(System.in));
	String strPi=pi.readLine();
	double doublePi=Double.parseDouble(strPi);
	System.out.println("원주율의 값은 " + doublePi + "입니다.");
	}
}
