package hello;

import protest.Protest;
import protest.ProtestImpl;
import fan.FanHello;

public abstract class HelloWorld implements ProtestImpl{
	public static void main(String[] args){
        FanHello yu=new FanHello("fanyufeng");
        System.out.println("the person name is :"+yu.name);
		System.out.println("hello");
		ProtestImpl feng=new Protest("ug",3,4);
		int result_sum=feng.sum();
		System.out.println(result_sum);
		System.out.println("I want a girl");
		
	}
}
