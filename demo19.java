class A{
	public void display(){
	System.out.println("hiiiiiiii");
}
}
class B extends A{
	public void display(){
	System.out.println("helloooooo");
}
}

class demo19{
public static void main(String args[]){
	
	B b = new B();
	b.display();

} 
}