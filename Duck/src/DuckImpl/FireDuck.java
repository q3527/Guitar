package DuckImpl;

import Duck.Duck;
import FlyBehaviorImpl.FlyNoWay;
import QuackBehaviorImpl.MuteQuack;

public class FireDuck extends Duck {

	public FireDuck() {
	    quackBehavior = new MuteQuack();
	    flyBehavior = new FlyNoWay();
	}
	
	public void display(){
		System.out.println("��ֻѼ�ӵ�����ǻ�ɫ");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
}
