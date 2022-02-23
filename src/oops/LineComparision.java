package oops;

import java.util.Scanner;

class Point {
	public double x;
	public double y;
	public double length;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

public class LineComparision {
	static void lineCheckEquality() {
		double lineLength1 = lineLength();
		double lineLength2 = lineLength();

		if (lineLength1 == lineLength2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	public static double lineLength() {

		Point point = new Point();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of X1");

		point.setX((scanner.nextInt()));
		double x1 = point.getX();
		System.out.println("Enter the value of X2");

		point.setX((scanner.nextInt()));
		double x2 = point.getX();
		System.out.println("Enter the value of Y1");

		point.setY((scanner.nextInt()));
		double y1 = point.getY();
		System.out.println("Enter the value of Y2");

		point.setY((scanner.nextInt()));
		double y2 = point.getY();
		double x = Math.pow((x1 - x2), 2);
		double y = Math.pow((y1 - y2), 2);
		double length = Math.sqrt(x + y);

		return length;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using OOPS");
		lineCheckEquality();
	}
}
