/*
ProgrameName : Anemonefish (extends Fish)
Date: 2018/10/31
*/

public class Anemonefish extends Fish
{
	public Anemonefish(String name)
	{	super(name);	}
	
	@Override
	public void swim()
	{	System.out.printf("�p����%s��a\n",name);	}
	
}