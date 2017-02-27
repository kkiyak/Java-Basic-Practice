package javaProgrammingBasic;


class MyPoint{
	
	int x;
	int y;
	
	void setX(int px)
	{
		x=px;
	}
	void setY(int py)
	{
		y=py;
	}
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
}

public class basicCH8P5 {
	public static void main(String[] args){

	 MyPoint mp1 = new MyPoint();
	 mp1.setX(3);
	 mp1.setY(8);
	 
	 int xx=mp1.getX();
	 int yy=mp1.getY();
	 
	 System.out.println("X좌표는 " + xx + ", Y좌표는 " + yy + "입니다.");
	 }	 
}
