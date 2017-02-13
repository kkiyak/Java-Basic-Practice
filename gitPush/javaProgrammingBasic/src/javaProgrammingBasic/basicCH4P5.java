package javaProgrammingBasic;
import java.io. *;


public class basicCH4P5 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("과목 1~5의 점수를 정수로 입력하십시오."); 
		
		Integer intSum = 0;
		
		//반복문 아직 안나왔는데 귀찮아서 그냥 썼음..
		for(int i=1; i<=5; i++){
			BufferedReader score = new BufferedReader(new InputStreamReader(System.in));
			String strScore=score.readLine();
			Integer intScore=Integer.parseInt(strScore);
			intSum = intSum+intScore;
			}
		System.out.println("5과목의 합계는 " + intSum + "점입니다."); 
		System.out.println("5과목의 평균은 " + (double)intSum/5 + "점입니다."); 
	}
}
