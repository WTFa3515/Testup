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
		
		doSwim(new Anemonefish("����"));
		doSwim(new Shark("����"));
		doSwim(new SwimPlayer("�봵��"));
		doSwim(new Submarine("����@��"));
		doSwim(new SeaPlane("�ŭx�s��"));
		doSwim(new FlyingFish("�ƥ�"));
		
		doFly(new SeaPlane("�ŭx�s��"));
		doFly(new Airplane("�ŭx�\��"));
		doFly(new Helicopter("�ŭx�G��"));
		
		//�|���[�J�L�A�`��
	}
	
	static void doSwim(Swimmer swimmer)
	{	swimmer.swim();	}
	
	static void doFly(Flyer flyer)
	{	flyer.fly();	}
}