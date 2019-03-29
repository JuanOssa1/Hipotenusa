package ui;
import.java.util.Scanner;
public class Main
{
	private Rectangle happyRectangle = new Rectangle(2.2 , 4.1)

		Scanner sc = new Scanner();
		public Main()
		{
			double base = sc.nextDouble();
			double height = ;
			//happyRectangle.calculateArea(base, height);
			happyRectangle = new Rectangle(base,height);
			happyRectangle.calculateArea();
			happyRectangle2 = new Rectangle(base+5,height);
			double area = happyRectangle2.calculateArea();
		}
		public static void main(String args[])
		{
			Main main = new Main();
		}
}