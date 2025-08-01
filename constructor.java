class Plot
{
	float length;
	float width;
	plot()//default constructor
	{
		length=0.0f;
		width=0.0f;
	}
	plot(float l,float w)
	{
		length=l;
		width=w;
	}
        plot(plot p)
        {
                p.length;
                p.width;
        }
        void setLength(float l)
        {
                length=l;
        }					
	void setWidth(float w)
	{
		width=w;
	}
 	float getLength()
	{
		return length;
	}
	float getWidth()
	{
		return width;
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
class PlotEx2
{
	public static void main(String args[])
	{
		Plot P1 = new Plot();
		P1.display();
		P1.setData(10.0f,20.0f);
		P1.display();
	}
}
