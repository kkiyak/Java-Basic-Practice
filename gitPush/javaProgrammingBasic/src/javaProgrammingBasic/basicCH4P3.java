package javaProgrammingBasic;
import java.io. *;

public class basicCH4P3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("���簢���� �� ���� ���̸� �Է��Ͻʽÿ�."); 
		BufferedReader side = new BufferedReader(new InputStreamReader(System.in));
		String strSide=side.readLine();
		Integer intSide=Integer.parseInt(strSide);
		System.out.println("���簢���� ���̴� " + intSide*intSide + "�Դϴ�."); 
		
	}
}
