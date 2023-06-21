

class A {
	int a=10;
	int b=21;
	int c=32;

	A()
	{
	System.out.println("A class");
	}
	void abc()
	{
	if (a>=b && a>=c){
	System.out.println(a+" is greater");
}
	else if(b>=c && b>=a){
	System.out.println(b+" is greater");
	}
	else {
	System.out.println(c+" is greater");
}
	}

}
class demo6{
public static void main (String args[]){
  
A a = new A();
a.abc();

}
}