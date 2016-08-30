import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EatProxy implements InvocationHandler {

	private Object target;
	
	public EatProxy(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("begin invoke...");
		Object result = method.invoke(target, args);
		System.out.println("end invoke...");
		return result;
	}

}
