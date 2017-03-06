package javaProgrammingBasic;
import java.io.*;

class MyPoint9
{
	private	int x;
	private int y;
	
	public MyPoint9(){
		x=0;
		y=0;
	}
	
	public MyPoint9(int px,int py){
		x=px;
		y=py;
	}
	
	public void setX(int px){
		if(px >= 0 && px <=100 ){
		x=px;
		}
		else{
			System.out.println(px + "는(은) 올바른 값이 아닙니다.");
			System.out.println("좌표축의 범위는 0~100 사이가 되어야 합니다.");
		}
	}
	public void setY(int py){
		if(py > 0 && py <=100 ){
			y=py;
			}
			else{
				System.out.println(py + "는(은) 올바른 값이 아닙니다.");
				System.out.println("좌표축의 범위는 0~100 사이가 되어야 합니다.");
			}		
	}
	public int getX(){
		
		return x;
	}
	
	public int getY(){
		
		return y;
	}
}
public class basicCH9P5 {
	public static void main(String[] args) throws IOException
	{
		MyPoint9 mp1=new MyPoint9();
		MyPoint9 mp2=new MyPoint9(1,99);
		
		System.out.println("x, y 좌표를 입력하십시오.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strX=br.readLine();
		String strY=br.readLine();
		
		mp1.setX(Integer.parseInt(strX));
		mp1.setY(Integer.parseInt(strY));
		
		int mp1x = mp1.getX();
		int mp1y = mp1.getY();
		
		System.out.println("x= "+mp1x + ", y= "+ mp1y);

	}
}
