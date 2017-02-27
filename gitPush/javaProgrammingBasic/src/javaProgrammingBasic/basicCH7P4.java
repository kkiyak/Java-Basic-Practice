package javaProgrammingBasic;
import java.io.*;

//배열 - 키보드로 시험 점수를 입력받은 후, 합계/평균/최고점수를 출력
public class basicCH7P4 {
	public static void main(String[] args) throws IOException{
		int[] score=new int[5];
		double TotalScore=0;
		System.out.println(score.length+" 명의 시험 점수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 크기만큼 입력받아 배열에 입력하고 모두 더해 합계 변수에 넣음
		for(int i=0; i<score.length; i++){
			String strNum=br.readLine();
			score[i]=Integer.parseInt(strNum);
			TotalScore+=score[i];
		}

		//순서대로 배열 출력
		for(int j=0; j<score.length; j++){
			System.out.println((j+1)+"번째 사람의 점수는"+score[j] + "입니다.");
		}

		System.out.println("합계는 "+TotalScore + "입니다.");
		System.out.println("평균은 "+TotalScore/score.length + "입니다.");
		
		//최고값을 얻기 위한 정렬 - 0번째 자리에 가장 큰값이 옴
		for(int s=0; s<score.length-1; s++){
			for(int t=s+1; t<score.length; t++){
				if(score[t]>score[s]){
					int tmp=score[t];
					score[t]=score[s];
					score[s]=tmp;	
				}		
			}
		}
		System.out.println("가장 높은 점수는 "+score[0]+ "입니다.");
	}
}
