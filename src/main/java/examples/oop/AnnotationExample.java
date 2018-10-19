package examples.oop;

public class AnnotationExample {
	
	@MyFirstAnnotation(
			issueId="jiraID-1234", 
			description="Fixes Y2K-Bug",
			author="Elena", 
			date="Oct 22, 2018")
	public void bugFix() {
		System.out.println("Fixes Y2K-Bug");
	}
}
