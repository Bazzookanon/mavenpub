package mavenproject;
import java.util.Arrays;

public class Person {
	
	String names[] = {"Jonathan", "Jane"};
	
	 public void myMethod(String name) {
		 if(Arrays.asList(names).contains(name)) {
			 System.out.print("meron");
		 }else {
			 System.out.print("wala");
		 }
		  }
}
