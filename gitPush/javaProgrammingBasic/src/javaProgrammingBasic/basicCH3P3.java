package javaProgrammingBasic;
import java.io. *;

public class basicCH3P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("당신은 몇 살입니까?"); 
		BufferedReader age = new BufferedReader(new InputStreamReader(System.in));
		String strAge=age.readLine();
		int IntAge=Integer.parseInt(strAge);
		System.out.println("당신은 " + IntAge + "살입니다.");
		
	}
}
