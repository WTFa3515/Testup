public class FlyingFish extends Fish implements Flyer
{
	public FlyingFish(String name)
	{	super(name);	}
	
	@Override
	public void fly()
	{	System.out.println("������a");	}
	
	@Override
	public void swim()
	{	System.out.println("�����|��");	}
}