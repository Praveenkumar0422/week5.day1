package week5.day1;

public class Calculator {
	public void add(int x,int y){
		System.out.println("sum of integer"+" "+ (x+y));
	}
	public void add(float x,float y){
		System.out.println("sum of float"+" "+(x+y));
	}
	public void add(long x,long y){
		System.out.println("sum of long"+" "+ (x+y));
	}
	public void add(short x,short y){
		System.out.println("sum of short "+" "+(x+y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		obj.add(100, 20);
		obj.add(2.522F, 2.300F);
		obj.add(5600000L, 1002200L);
		obj.add(3, 2);

	}

}
