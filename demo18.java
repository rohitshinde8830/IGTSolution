class A{
	void draw(){
	System.out.println("draw method");
}
	void draw(int a){
	System.out.println("draw method with a: "+a);
}
	void draw(int a, int b){
	System.out.println("draw method with a, b: "+(a+b));
}
}

class demo18{
public static void main(String args[]){
	A a = new A();
	a.draw();
	a.draw(10);
	a.draw(10,20);
}
}