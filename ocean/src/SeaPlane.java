public class SeaPlane extends Airplane implements Swimmer
{
	public SeaPlane (String name)
	{	super(name);	}
	
	@Override
	public void fly()
	{	System.out.print("���W");
		super.fly();
	}
	
	@Override
	public void swim()
	{	System.out.printf("���W����%s �b���W��\n",name);	}
}