public class Cat
{
	private String name;
	private int age;
	private String owner;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void eat(String food)
	{
		System.out.println(name +" just ate "+ food);
	}
}
