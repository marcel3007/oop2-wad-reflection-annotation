package examples.oop;

class FooChild extends Foo {
	
//    @MyFirstAnnotation(
//            issueId="jiraID-1234", 
//            description="Fixes Y2K-Bug",
//            author="Elena", 
//            date="Oct 22, 2017")
    private String t;
    
    @Override
	void methodVoid() {
		System.out.println("In method1(): " + FooChild.class.getName());
	}

    @Override
    int methodInt() {
        System.out.println("In methodInt of FooChild");
        return 22;
    }
    
//	@MyFirstAnnotation(
//            issueId="jiraID-1234", 
//            description="Fixes Y2K-Bug",
//            author="Elena", 
//            date="Oct 22, 2017")
	void testMethod() {
		System.out.println("In testMethod() of FooChild");
	}
	
	@SuppressWarnings("unused")
    private void testMethod2() {
        System.out.println("In testMethod2() of FooChild");
    }
	
	void testMethod3() {
        System.out.println("In testMethod3() of FooChild");
    }
	
	String returnMethod() {
	    return "BOB";
    }
}