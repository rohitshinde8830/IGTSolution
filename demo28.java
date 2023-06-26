import java.util.Scanner;
import java.util.InputMismatchException;

class demo28{
public static void main(String args[]){

	m1();

	}

	static void m1(){
	m2();
	System.out.println("m1 method");
	}
	static void m2(){
	m3();
	System.out.println("m2 method");
	}
	static void m3(){
	
	System.out.println("m3 method");

	Scanner sc=new Scanner (System.in);
	try{
	System.out.println("A value: ");
	int a = sc.nextInt();
	
	System.out.println("B value: ");
	int b = sc.nextInt();

	int c=a/b;
	System.out.println("A/B value: "+c);
}
	catch(ArithmeticException ae){
	System.out.println("Arithmatic ");
}
	catch(InputMismatchException ime){
	System.out.println("ime ");
}

	}
	
}