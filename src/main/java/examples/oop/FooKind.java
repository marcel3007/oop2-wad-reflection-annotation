package examples.oop;

class FooKind extends Foo {
	
    @Override
	void methodVoid() {
		System.out.println("In method1() of FooKind");
	}

    @Override
    int methodInt() {
        System.out.println("In methodInt() of FooKind");
        return 0;
    }
    

	@MyFirstAnnotation(
			issueId="jiraID-1234", 
			description="Fixes Y2K-Bug",
			author="Elena", 
			date="Oct 22, 2018")
	void testMethod() {
		System.out.println("In testMethod() of FooKind");
	}
	
	void testMethod2(String str) {
		System.out.println("In testMethod2(str) of FooKind");
	}
	
	String testMethod3() {
        System.out.println("In testMethod3() of FooKind");
        return "";
    }
}