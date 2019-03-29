package model;
import java.lang.Math;
public class Rectangle
{
	//Atributtes
	private double base;
	private double hight;
	//Getters
	public getBase()
	{
		return this.base
	}
	public getHight()
	{
		return this.hight
	}
	//Setters
	public void set(double newBase)
	{
		base = newBase
	}
	public void setHight(double newHight)
	{
		hight = newHight
	}
	//builder
	public Rectagle (double base, double hight)
	{
		this.base = base;
		this.hight = hight;
	}
	public double calcularPerimetro()
	{
		double perimetro = 0;
		perimetro = (2*base)+(2*hight)
		return perimetro
	}
	public double calcularArea()
	{
		double area = 0;
		area = base * hight
		return area
	}
	public double calcularHypotenuse()
	{
		double hypotenuse = 0;
		hypotenuse = Math.sqrt((base*base)+(hight*hight)) 
		return hypotenuse
	}
}