package com.esh.creational;

import java.io.Serializable;

//Eager initailization
class SingletonA{
	private SingletonA(){};
	private static final SingletonA SINGLETON_A = new SingletonA();
	
	public static SingletonA getSingletonA(){
		return SINGLETON_A;
	}
}

//Lazy initialization
class SingletonB{
	private SingletonB(){};
	private static SingletonB SINGLETON_B;
	
	public static SingletonB getSingletonB(){
		if(null == SINGLETON_B){
			SINGLETON_B  = new SingletonB();
		}
		return SINGLETON_B;
	}
}

//Thread safe Lazy initialization
class SingletonC{
	private SingletonC(){};
	private static SingletonC SINGLETON_C;
	
	public synchronized static SingletonC getSingletonC(){
		if(null == SINGLETON_C){
			SINGLETON_C  = new SingletonC();
		}
		return SINGLETON_C;
	}
}

//Thread safe double check Lazy initialization
class SingletonD{
	private SingletonD(){};
	private static SingletonD SINGLETON_D;
	
	public static SingletonD getSingletonD(){
		if(null == SINGLETON_D){
			synchronized(SingletonD.class){
				SINGLETON_D  = new SingletonD();
			}
		}
		return SINGLETON_D;
	}
}

//Bill Pugh Singleton Implementation
class  SingletonE implements Serializable{
	private SingletonE(){};
	private static class SingletonHelper {
		final static SingletonE INSTANCE= new SingletonE();
	}
	
	public static SingletonE getSingletonE(){
		return SingletonHelper.INSTANCE;
	}
	
	protected Object readResolve() { // To avoid creation object Deserialization
	    return getSingletonE();
	}
}
public class SingletonPatternEx {

}
