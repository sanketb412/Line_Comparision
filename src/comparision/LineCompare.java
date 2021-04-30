package comparision;
import java.util.Scanner;

public class LineCompare
{
	@SuppressWarnings("resource")
	public static Double Compare()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter the first cordinates of x1");
		int a = sc.nextInt();
		System.out.println("Enter the first cordinates of y1");
		int b = sc.nextInt();
		System.out.println("Enter the first cordinates of x2");
		int c = sc.nextInt();
		System.out.println("Enter the first cordinates of y2");
		int d = sc.nextInt();
		System.out.println("\nA length as 2 Points are:(" +a +"," +b +")and(" +c +"," +d +")");
		
		Integer x = a - b;
		Integer y = c - d;
		
		int comp=(x.compareTo(y));
		switch(comp)
		{
			case 0:
				System.out.println("\nLines are Equal"); break;
			case -1:	
				System.out.println("\nLength of 2nd line is Greater then 1st line"); break;
			case 1:	
				System.out.println("\nLength of 1st line is Greater then 2nd line"); break;
		}		
		int e = (((c-a)*(c-a))+((d-b)*(d-b)));		
		System.out.println("\nThe Length of a line is:" +squareRoot(e));
		return null;
		
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
	public static void main(String[] args)
	{
		System.out.println("####...Welcome to Line Comparision Computation...####");
		LineCompare line = new LineCompare();
		LineCompare.Compare();
	}
}
