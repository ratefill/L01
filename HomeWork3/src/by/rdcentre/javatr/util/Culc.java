package by.rdcentre.javatr.util;

public class Culc{	
	
	public static int Product (int x){
		
		int d = 0;	
		
		if(x==0) //в числе больше нет цифр - условия выхода из рекурсии
		{
			return 1;
		}
		else
		{		
			d = x % 10;//определяет текущую цифру числа справа (остаток от деления на 10)
			d = d* Product(x / 10);//стартуем рекурсию целочисленным делением
			return d;
		}

	}
}