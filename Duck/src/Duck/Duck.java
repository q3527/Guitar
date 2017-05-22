package Duck;

import Behavior.FlyBehavior;
import Behavior.QuackBehavior;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	/**
	 * Ѽ�ӵ���Ӿ
	 */
	public void swim(){
		
	}
	/**
	 * Ѽ�ӵ����
	 */
	public void display(){
		
	}
	/**
	 * Ѽ�ӵĽ���
	 */
	public void performQuack() {
		quackBehavior.quack();
	}
	/**
	 * Ѽ�ӵķ���
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
}
