class A{
	private int id;
	private String name;
	private int age;
 
	void setid(int id){
	this.id=id;
	}
	int getid(){
	return id;
 	}


	void setname (String name){
	this.name=name ;
	}
	String getname(){
	return name ;
 	}

	void setage(int age ){
	this.age=age;
	}
	int getage(){
	return age;
	}
}
class demo27{
public static void main(String args[]){

	A a = new A();
	a.setid(100);
	a.setname("Rohit");
	a.setage(22);
	System.out.println(a.getid());
	System.out.println(a.getname());
	System.out.println(a.getage());
}
}