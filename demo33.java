import java.io.*;

class A{

	void abc()throws InvalidAgeException{
	
	for(int age=1;age<70;age++){
	
	
	if(age==10)throw new NullPointerException();
	if(age==60) throw new InvalidAgeException ("max age");

	System.out.println("age: "+age);
}
}
}




class demo33{
public static void main(String args[]){
	try{
	A a =new A();
	a.abc();
}
	catch(InvalidAgeException iae){
	System.out.println(iae);
}
	catch(NullPointerException np){
	System.out.println("Null Pointr");
}

}
}
class InvalidAgeException extends Exception{

	InvalidAgeException(String msg){
	super(msg);
}
}