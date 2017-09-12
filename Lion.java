import java.awt.Color;

public class Lion extends Cat
{
	private Color mane;
	
	public void roar()
	{
		System.out.println(getName() +" just roared");
	}
	
	public Color getManeColor()
	{
		return mane;
	}
	
	public void setManeColor(Color m)
	{
		mane = m;
	}
}