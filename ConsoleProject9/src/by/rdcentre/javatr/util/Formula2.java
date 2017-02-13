package by.rdcentre.javatr.util;

import static java.lang.Math.cos;
import static java.lang.Math.log;

public class Formula2{
	
	
	public static void calculate (){
		double x = 0; 
		double y = 0; 
		double z = 0; 

		double temp;
		
		x = 4.5;
		
		temp = cos(x) - x/3;
		
		if (temp != 0) {
			
			z=x*log(x) + y/temp;
		}
		else {
		System.out.println("Знаменатель равен нулю.");
				z = Double.NaN;
			
		}
		
		System.out.println("z= "+z);
		
	}
}