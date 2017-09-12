import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		blake.setName("Mr Pickles");
		blake.eat("Chicken Soup");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.YELLOW);
		leo.roar();
	}
}