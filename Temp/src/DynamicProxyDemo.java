import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		EatImpl eatImpl = new EatImpl();
		EatProxy eatproxy = new EatProxy(eatImpl);
		IEat eat = (IEat)Proxy.newProxyInstance(EatImpl.class.getClassLoader(), 
				EatImpl.class.getInterfaces(), eatproxy);
		eat.eat();
	}

}
