package javaProgrammingBasic;
import java.io. *;

public class basicCH3P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("����� �� ���Դϱ�?"); 
		BufferedReader age = new BufferedReader(new InputStreamReader(System.in));
		String strAge=age.readLine();
		int IntAge=Integer.parseInt(strAge);
		System.out.println("����� " + IntAge + "���Դϴ�.");
		
	}
}
