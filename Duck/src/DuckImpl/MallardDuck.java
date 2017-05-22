package DuckImpl;

import Duck.Duck;
import FlyBehaviorImpl.FlyWithRocket;
import QuackBehaviorImpl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithRocket();
	}
	
	public void display(){
		System.out.println("��ֻѼ�ӵ�����ǰ�ɫ");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
	
}
