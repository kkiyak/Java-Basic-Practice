package javaProgrammingBasic;
import java.io. *;

public class basicCH3P5 {
	public static void main(String[] args) throws IOException
	{
	System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�."); 
	BufferedReader height = new BufferedReader(new InputStreamReader(System.in));
	String strHeight=height.readLine();
	double doubleHeight=Double.parseDouble(strHeight);
	BufferedReader weigh = new BufferedReader(new InputStreamReader(System.in));
	String strWeigh=weigh.readLine();
	double doubleWeigh=Double.parseDouble(strWeigh);
	System.out.println("Ű�� " + doubleHeight + "��Ƽ�����Դϴ�.");
	System.out.println("�����Դ� " + doubleWeigh + "ų�α׷��Դϴ�.");
	}
}
