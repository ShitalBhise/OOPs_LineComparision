package oops;

import java.util.Scanner;

public class LineComparision {
	static class Point {
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

	public static double lineLength() {

		Point point = new Point();
		Scanner scanner = new Scanner(System.in);

		point.setX((scanner.nextInt()));
		double x1 = point.getX();
		point.setX((scanner.nextInt()));
		double x2 = point.getX();

		point.setY((scanner.nextInt()));
		double y1 = point.getY();
		point.setY((scanner.nextInt()));
		double y2 = point.getY();

		double x = Math.pow((x1 - x2), 2);
		double y = Math.pow((y1 - y2), 2);
		double length = Math.sqrt(x + y);

		return length;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program using OOPS");

		double lineLength = lineLength();
		lineLength();
		System.out.println("Length of line is " + lineLength);

	}
}
