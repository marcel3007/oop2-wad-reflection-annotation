package examples.oop;

abstract class Foo {
    
    abstract void methodVoid();
    
    abstract int methodInt();
    
	public static Object createObject(String className) throws InstantiationException, IllegalAccessException {

		if(className == null || className.trim().isEmpty()) {
		    className = "examples.oop.FooChild"; //setze einen default-Wert
		}
		
		System.out.println("in create: " + className);
		Class<?> c = null;
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class '" + className + "' not found, "
                    + "using 'examples.oop.FooChild' instead");
//            try {
//                c = Class.forName("examples.oop.FooChild");
//            } catch (ClassNotFoundException e1) {
//                e1.printStackTrace();
//                return null;
//            }
        }
		
        // FixMe!!
        return c.newInstance();
     
	}
}