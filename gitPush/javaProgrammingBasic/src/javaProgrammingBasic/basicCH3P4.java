package javaProgrammingBasic;
import java.io. *;

public class basicCH3P4 {
	public static void main(String[] args) throws IOException
	{
	System.out.println("�������� ���� ���Դϱ�?"); 
	BufferedReader pi = new BufferedReader(new InputStreamReader(System.in));
	String strPi=pi.readLine();
	double doublePi=Double.parseDouble(strPi);
	System.out.println("�������� ���� " + doublePi + "�Դϴ�.");
	}
}
