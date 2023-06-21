import java.util.Scanner; 

class A {

 	int ID;
	A(){
	Scanner sc = new Scanner (System.in);
	System.out.println("A class");
	System.out.println("enter ID: ");
	int  ID =sc.nextInt();
}
	void display(){
	
	System.out.println("Id: "+ ID);
	
}
}
class demo5{
	public static void main(String args[]){
	A a =new A();
	a.display();
}
}