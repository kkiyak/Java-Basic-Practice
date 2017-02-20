package javaProgrammingBasic;
import java.io.*;


//정수 입력받아 소수판단
public class basicCH6P5 {
	public static void main(String[] args) throws IOException{
		System.out.println("2 이상의 정수를 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum=br.readLine();
		int intNum=Integer.parseInt(strNum);
		
		if(intNum==2) System.out.println(intNum+"은(는) 소수 입니다"); //2 예외 처리

		for(int i=2; i<intNum; i++) //2부터 입력받은 수-1까지 계속 나누어봄
		{
			int result=intNum%i;
			
			if(result==0){  // 나머지가 한번이라도 0이면 소수가 아님
				System.out.println(intNum+"은(는) 소수가 아닙니다");
				break;
			}
			else if(result>0){
				if(i==(intNum-1)){ // 입력받은 수-1까지 반복했는데 나누어 떨어지지 않았으면 소수로 판단
					System.out.println(intNum+"은(는) 소수 입니다");
					break;
					}
				continue;	
			}
		}		
	}
}


