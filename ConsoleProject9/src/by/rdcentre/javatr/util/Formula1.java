package by.rdcentre.javatr.util;


public class Formula1{
	
	
	public static void calculate (){
		double x = 0; 
		double y = 0; 
		double z = 0; 

		double temp;
		
		x = 4.5;
		
		temp = Math.cos(x) - x/3;
		
		if (temp != 0) {
			
			z=x*Math.log(x) + y/temp;
		}
		else {
		System.out.println("Знаменатель равен нулю.");
				z = Double.NaN;
			
		}
		
		System.out.println("z= "+z);
		
	}
}