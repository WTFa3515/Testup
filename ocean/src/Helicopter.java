public class Helicopter extends Airplane
{	
	public Helicopter(String name)
	{	super(name);	}
	
	@Override
	public void fly()
	{	System.out.printf("直升機 %s 在天空飛\n",name);	}
}