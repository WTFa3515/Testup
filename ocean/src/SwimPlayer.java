public class SwimPlayer extends Human implements Swimmer
{
	
	public SwimPlayer(String name)
	{	super(name);	}
	
	@Override
	public void swim()
	{	System.out.printf("��a���N%s��a\n",this.getName());	}
}

