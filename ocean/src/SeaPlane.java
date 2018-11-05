public class SeaPlane extends Airplane implements Swimmer
{
	public SeaPlane (String name)
	{	super(name);	}
	
	@Override
	public void fly()
	{	System.out.print("海上");
		super.fly();
	}
	
	@Override
	public void swim()
	{	System.out.printf("海上飛機%s 在水上飄\n",name);	}
}