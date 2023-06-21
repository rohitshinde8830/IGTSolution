class A {
 int a1=10;
 

}

class B extends A {
	int a1=100;
	void xyz(int a1){
	
	System.out.println("B class"+a1);
	System.out.println("B class"+this.a1);
	System.out.println("A class"+super.a1);
}
} 
class demo7{
public static void main(String args[]){
	B b = new B();
	b.xyz(1000);
}
}