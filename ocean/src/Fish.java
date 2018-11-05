/*
Father Role for sub to extends
programname : Fish
*/

public abstract class Fish implements Swimmer
{
	protected String name;
	public Fish(String name)	//define fish name
	{	this.name = name;	}
	
	public String getName()		//return protected name
	{	return name;	}
	
	@Override
	public abstract void swim(); //create swim way
}