interface Shape
{
	static final double pi = 3.14;
	double area();
	void display();
}
class Circle implements Shape
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	void setRadius(double r)
	{
		radius=r;
	}
	double getRadius()
	{
		return radius;	
	}
        public area() 
	{
		return pi*radius*radius;
	}
	public void display ()
	{
 		System.out.println("Circle");
		System.out.println("radius="+radius);
		System.out.println("Circle"+area):		
	}
}
class Rectangle implements Shape
{
	double length,width;
	Rectangle (double l,double w)
	{
		length=l;
		width=w;
	}
	void setlength(double l)
	{
		length=l;
	}
	double getlength()
	{
		return length;	
	}

	void setwidth(double w)
	{
		width=w;
	}
	double getwidth()
	{
		return width;	
	}
        public area() 
	{
		return length*width;
	}
	public void display ()
	{
 		System.out.println("Rectangle");
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("Rectangle"+area):		
	}
}

class ShapeEx
{
	public static void main(String s[])
	{
		Shape s1;
		Circle c1=new Circle();
		Rect r1=new Rect();
		System.out.println("Circle");
		s1=c1;
		s1.display();
		
		System.out.println("Rectangle");
		s1=r1;
		s1.display();
		
	}
}