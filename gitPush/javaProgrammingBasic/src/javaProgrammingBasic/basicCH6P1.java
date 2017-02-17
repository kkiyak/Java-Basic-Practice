package javaProgrammingBasic;

//1~10까지의 짝수를 출력
public class basicCH6P1 {
	public static void main(String[] args)
	{
		System.out.println("1~10까지의 짝수를 출력합니다."); 
		
		for(int i=1; i<=10; i++ ){
			System.out.println(i+1);
			i+=1;
		}		
	}
}
