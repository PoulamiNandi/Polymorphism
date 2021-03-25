package com.altran;
/**
 * @see CalculateArea
 * @see CalculateArea#areaCircle(double)
 * @see CalculateArea#areaRectangle(float, float)
 * @see CalculateArea#areaSquare(float)
 * @author POULAMI
 *
 */
public class CalculateArea {
	/**
	 * calculate area of square
	 * @param x
	 */
	void areaSquare(float x) {
		System.out.println("The area of square:"+x*x);
	}
	/**
	 * calculate area of rectangle
	 * @param x
	 * @param y
	 */
	void areaRectangle(float x,float y) {
		System.out.println("The area of rectangle:"+x*y);
	}
	/**
	 * calculate area of circle
	 * @param r
	 */
	void areaCircle(double r) {
		System.out.println("The area of Circle:"+3.14*r*r);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		CalculateArea calculateArea=new CalculateArea();
		calculateArea.areaSquare(5);
		calculateArea.areaRectangle(5, 6);
		calculateArea.areaCircle(3);
	}

}
