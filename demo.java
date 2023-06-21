class A {
	A(){
	System.out.println("A class");
}
}
class B {
	B(){
	System.out.println("B class");
}
}
class  C{
	C(){
	System.out.println("C class");
}
}
class demo1 {
	public static void main(String args[]){
	System.out.println("demo1 class");
	A a = new A();
	B b = new B();
	C c = new C();

}
}