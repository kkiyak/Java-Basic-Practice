package javaProgrammingBasic;

//구구단 출력
public class basicCH6P3 {
	public static void main(String[] args){
		
		int result=0;
		
		for(int i=1; i<=9; i++ ){
			System.out.print("\n");
			for(int j=1; j<=9; j++ ){
				result = i*j;
			    System.out.print(result + "\t");
			  
			}
			
		}
	}
}
