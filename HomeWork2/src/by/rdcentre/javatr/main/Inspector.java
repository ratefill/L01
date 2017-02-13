package by.rdcentre.javatr.main;

import by.rdcentre.javatr.util.Circle;

public class Inspector{
	
	
	public static void main (String[] args){
		
		int R = 6; //задание радиуса
		
		double L = Circle.Length(R);//длина окружности
		double S = Circle.Square(R);//площадь
		
		System.out.println("ДЛя круга с радиусом R="+R+ " длина окружности L="+L+", площадь S="+S+".");
		}
}