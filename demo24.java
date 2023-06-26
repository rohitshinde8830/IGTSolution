class A{
	
	static int a=10;
	static void abc(){
	System.out.println("abc method");
	}

}

class demo24{
public static void main (String args[] ){

	A.abc();
	System.out.println("A: "+A.a);

}
}