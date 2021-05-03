package comparision;

import java.util.Scanner;

public class LineCompare {
	public void Compare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the first cordinates of x1");
		int a = sc.nextInt();
		System.out.println("Enter the first cordinates of y1");
		int b = sc.nextInt();
		System.out.println("Enter the first cordinates of x2");
		int c = sc.nextInt();
		System.out.println("Enter the first cordinates of y2");
		int d = sc.nextInt();
		System.out.println("\nThe co-ordinates of 2 Points are:(" + a + "," + b + ")and(" + c + "," + d + ")");
		Integer length1 = a - b;
		Integer length2 = c - d;
		int comp = (length1.compareTo(length2));
		switch (comp) {
		case 0:
			System.out.println("\nLines are Equal");
			break;
		case -1:
			System.out.println("\nLength of 2nd line is Greater then 1st line");
			break;
		case 1:
			System.out.println("\nLength of 1st line is Greater then 2nd line");
			break;
		}
		int lengthsqr = (((c - a) * (c - a)) + ((d - b) * (d - b)));
		System.out.println("\nThe Length of a line is:" + squareRoot(lengthsqr));
	}

	public static double squareRoot(int lengthsqr) {
		double temp;
		double sqrtroot = lengthsqr / 2;
		do {
			temp = sqrtroot;
			sqrtroot = Math.floor(temp + (lengthsqr / temp)) / 2;
		} while ((temp - sqrtroot) != 0);
		return sqrtroot;
	}

	public static void main(String[] args) {
		System.out.println("####...Welcome to Line Comparision Computation...####");
		LineCompare line = new LineCompare();
		line.Compare();
	}
}
