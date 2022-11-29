package mavenproject;
import java.util.Scanner;
public class Main {
	 static int a;
	 static int b;
	 
	 static void myMethod(int x, int z) {
		    System.out.printf("%d and %d", x, z);
		  }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		System.out.printf("Enter Name: ");
		String name = scan.nextLine();
		
		person.myMethod(name);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
//		myMethod(100, 20);
//		for (int i=0; i<=8; i++) {
//		    for(int j=8; j>=i; j--) {
//		        System.out.print(" ");
//		    }
//
//		    for (int k=1; k<=i*2-1; k++) {
//		        if (k%2 == 0)
//		            System.out.print("o");
//		        else
//		            System.out.print("x");
//		    }
//
//		    System.out.println();
//		}
		
//		for(a = 1; a <= 5; a++) {
//			if(a != 3) {
//				System.out.print(" ");
//			}else {
//				System.out.print("*\n");
//			}
//			
//			for(b = 1; b <= 5; b++) {
//				System.out.print("*\n");
//			}
//			if(a % 2 == 1) {
//				System.out.print(a+" is even number\n");
//			}else {
//				System.out.print(a+" is odd number\n");
//			}
//		}
	}
}
