package capitulo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsoConstrutor {
	
	public UsoConstrutor(String s) {
		System.out.println("Construtor invocado com: " + s);
	}

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {
		
		Class<UsoConstrutor> c = UsoConstrutor.class;
		Constructor<UsoConstrutor> constr = c.getConstructor(String.class);
		
		
		try {
			UsoConstrutor obj = constr.newInstance("teste");
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("Tipo do constructor errado");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.out.println("Exceção lançada pelo construtor: "
					+ e.getTargetException());
		}
	}
}
