package examples.oop;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

public class ReflectionExample {

	public static void main(String[] args) {
		try {
			Class<FooKind> fooKindClass = FooKind.class;
//             Method[] methodsOfFooKind = fooKindClass.getDeclaredMethods(); 
			Method[] methodsOfFooKind = fooKindClass.getMethods(); // Methoden der Ueberklasse
//			for (Method m : methodsOfFooKind) {
//				System.out.println("method name: " + m.getName());
//				System.out.println("method return type: " + m.getReturnType().getName());
//			}

			String classToLoad = "";

			if (args != null && args.length != 0) {
				classToLoad = args[0];
			} else {
				System.exit(1);
			}

			// classToLoad = "examples.oop.FooChild";

			Object obj = null;

			try {
				obj = Foo.createObject(classToLoad);
			} catch (InstantiationException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				System.exit(1);
			}
			
			

			Method[] methodsOfFoo = obj.getClass().getDeclaredMethods();
			for (Method m : methodsOfFoo) {

				System.out.print("method name: " + m.getName() + " | ");

				for(Annotation a : m.getAnnotations()) {
					System.out.print("method annotation: " + a.annotationType().getSimpleName());
				}
				System.out.println();
				if (m.getName().startsWith("test")) {
					
					try {
						m.invoke(obj); // Was stimmt hier nicht?
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}catch (IllegalArgumentException e) {
						e.printStackTrace();
					}catch (InvocationTargetException e) {
						e.printStackTrace();
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
