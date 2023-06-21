import java.util.Scanner;
class emp{
	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	emp(){
	System.out.println("========");
	System.out.println("enter id: ");
	id=sc.nextInt();
	System.out.println("enter name: ");
	name=sc.next();
	System.out.println("========");
}
	void display(){
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
}
}

class clerk extends emp{
	
	String desig= "clerk";
	void display(){
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("Desig: "+desig);
}
	
}
class dev extends emp{
	
	String desig= "devloper";
	void display(){
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("Desig: "+desig);
}
	
}



class demo12{
public static void main(String args[]){

	//emp e =new emp();
	clerk c =new clerk();
	c.display();
	dev d = new dev();
	d.display();
}
}