package javaProgrammingBasic;
import java.io. *;

public class basicCH4P4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�."); 
		BufferedReader base = new BufferedReader(new InputStreamReader(System.in));
		String strBase=base.readLine();
		Integer intBase=Integer.parseInt(strBase);
		BufferedReader height = new BufferedReader(new InputStreamReader(System.in));
		String strHeight=height.readLine();
		Integer intHeight=Integer.parseInt(strHeight);
		System.out.println("�ﰢ���� ���̴� " + (double)(intHeight*intBase)/2 + "�Դϴ�."); 
		
	}
	
}
