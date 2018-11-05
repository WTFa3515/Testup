public class Airplane implements Flyer
{
	protected String name;
	
	public Airplane(String name)
	{	this.name = name;	}
	
	@Override
	public void fly()
	{	System.out.printf("飛機%s 在天空飛\n",name);	}
}