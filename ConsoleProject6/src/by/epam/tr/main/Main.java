package by.epam.tr.main;

public class Main{
	
	
	public static void main (String[] args){
		double a; //катет 1
		double b; //катет 2
		double c = 0; //гипотенуза
		double p; //периметр
		double s; // площадь
		
		a = 10;
		b = 5;
		
		c = Math.sqrt(a*a+b*b);
		
		p = a + b + c;
		s = 0.5*a*b;
		
		System.out.println("Периметр= " +p+", площадь = "+s);
	}
}