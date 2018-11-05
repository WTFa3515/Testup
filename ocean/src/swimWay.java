/*****
use different bluemap to run
*****/

public class swimWay
{
	public static void main(String[] args)
	{
		/*
		Anemonefish anemonefish = new Anemonefish("NIMO");
		anemonefish.swim();
		
		Shark shark = new Shark("sa");
		shark.swim();
		
		Piranha piranha = new Piranha("eatt");
		piranha.swim();
		
		Human human = new Human("Justin");
		human.swim();
		*/
		
		doSwim(new Anemonefish("尼莫"));
		doSwim(new Shark("蘭尼"));
		doSwim(new SwimPlayer("賈斯汀"));
		doSwim(new Submarine("黃色一號"));
		doSwim(new SeaPlane("空軍零號"));
		doSwim(new FlyingFish("甚平"));
		
		doFly(new SeaPlane("空軍零號"));
		doFly(new Airplane("空軍么號"));
		doFly(new Helicopter("空軍二號"));
		
		//尚未加入淺，深海
	}
	
	static void doSwim(Swimmer swimmer)
	{	swimmer.swim();	}
	
	static void doFly(Flyer flyer)
	{	flyer.fly();	}
}