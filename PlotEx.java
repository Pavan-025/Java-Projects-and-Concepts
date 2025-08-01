class Plot
{
	float length;
	float width;
	void setData()
	{
		length=0.0f;
		width=0.0f;
	}
	void setData(float l,float w)
	{
		length=l;
		width=w;
	}
	float area()
	{
		return length*width;
 	}
	void display()
	{
		System.out.println("Length="+length);
		System.out.println("Width="+width);
		System.out.println("Area="+area());
	}	
}
class PlotEx
{
	public static void main(String args[])
	{
		Plot P1 = new Plot();
		P1.display();
		P1.setData(10.0f,20.0f);
		P1.display();
	}
}