package DuckImpl;

import Duck.Duck;
import FlyBehaviorImpl.FlyWithWings;
import QuackBehaviorImpl.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
	    quackBehavior = new Squeak();
	    flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("��ֻѼ�ӵ�����ǻ�ɫ");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
}
