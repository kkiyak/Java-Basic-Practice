package javaProgrammingBasic;
import java.io. *;


public class basicCH4P5 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("���� 1~5�� ������ ������ �Է��Ͻʽÿ�."); 
		
		Integer intSum = 0;
		
		//�ݺ��� ���� �ȳ��Դµ� �����Ƽ� �׳� ����..
		for(int i=1; i<=5; i++){
			BufferedReader score = new BufferedReader(new InputStreamReader(System.in));
			String strScore=score.readLine();
			Integer intScore=Integer.parseInt(strScore);
			intSum = intSum+intScore;
			}
		System.out.println("5������ �հ�� " + intSum + "���Դϴ�."); 
		System.out.println("5������ ����� " + (double)intSum/5 + "���Դϴ�."); 
	}
}
