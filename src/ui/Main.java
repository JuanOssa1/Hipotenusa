package ui;
import.java.util.Scanner;
public class Main
{
	private Rectangle happyRectangle = new Rectangle(2.2 , 4.1)

		Scanner sc = new Scanner();
		public Main()
		{
			int optionSelected = 0;
			System.out.println("Ingrese el ancho de la base del rectanguro")
			double base = sc.nextDouble();
			System.out.println("Ingrese la altura del rectanguro")
			double height = sc.nextDouble();
			System.out.println("Ingrese el numero del valor que desea calcular: " + \n + "1. Calcular Perimetro del Rectangulo" + \n + "2. Calcular Area del Rectangulo" + \n + "3. Calcular Diagonal del Rectangulo")
			optionSelected = sc.nextInt();
			if(optionSelected == 1)
			{
				double perimetro = happyRectangle.calcularPerimetro(base, height);
				System.out.println("El perimetro del rectangulo es: " +perimetro);
			}
			else if(optionSelected == 2)
			{
				double area = happyRectangle.calcularArea(base, height);
				System.out.println("El area del rectangulo es: " +area);
			}
			else if(optionSelected == 3)
			{
				double diagonal = happyRectangle.calcularHypotenuse(base, height);
				System.out.println("La diagonal del rectangulo es: " +diagonal);
			}
			//happyRectangle.calculateArea(base, height);
			//happyRectangle = new Rectangle(base,height);
			//happyRectangle.calcularArea();
			//happyRectangle2 = new Rectangle(base+5,height);
			
		}
		public static void main(String args[])
		{
			Main main = new Main();
		}
}