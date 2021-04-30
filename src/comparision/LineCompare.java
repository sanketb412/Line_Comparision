package comparision;
import java.util.Scanner;

public class LineCompare
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("####...Welcome to Line Comparision Computation...####");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter the first cordinates of x1");
		int a = sc.nextInt();
		System.out.println("\nEnter the first cordinates of y1");
		int b = sc.nextInt();
		System.out.println("\nEnter the first cordinates of x2");
		int c = sc.nextInt();
		System.out.println("\nEnter the first cordinates of y2");
		int d = sc.nextInt();
		System.out.println("\nA length as 2 Points are:(" +a +"," +b +")and(" +c +"," +d +")");
		
		Integer x = c - a;
		Integer y = d - b;
		
		if(x.equals(y))
		{
			System.out.println("Equality of 2 Length is preferable");
		}	
		else
		{		
			System.out.println("Equality of 2 Length is not preferable");
		}
		int e = ((x*x)+(y*y));
		
		System.out.println("\nThe Length of a line is:" +squareRoot(e));
	}
	public static double squareRoot (int e) {
		double f;
		double sqrtroot=e/2;
		do
		{
			f=sqrtroot;
			sqrtroot=(f+(e/f))/2;
		}
		while((f-sqrtroot)!=0);
		return sqrtroot;
	}
}
