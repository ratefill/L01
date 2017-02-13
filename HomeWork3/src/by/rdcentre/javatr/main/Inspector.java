package by.rdcentre.javatr.main;

import by.rdcentre.javatr.util.Culc;

public class Inspector{
	
	
	public static void main (String[] args){	
		int R=12213118; //заданное число
		
		int P = Culc.Product(R);//произведение цифр числа	
		
		System.out.println("Призведение цифр для числа "+R+" равно "+P+".");
		}
}