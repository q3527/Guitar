package Test;

import Duck.Duck;
import DuckImpl.FireDuck;
import DuckImpl.MallardDuck;
import DuckImpl.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		System.out.println("��һֻѼ�ӵ���Ϊ��");
		Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("�ڶ�ֻѼ�ӵ���Ϊ��");
	    mallard = new FireDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("����ֻѼ�ӵ���Ϊ��");
	    mallard = new RubberDuck();
	    mallard.performQuack();
	    mallard.performFly();
		
	}

}
