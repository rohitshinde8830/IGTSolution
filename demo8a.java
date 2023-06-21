class parent{
	int site =5;
	int money = 10000;
	private String car= "BMW";
	

}

class child extends parent {

	int money = 2000;
	void use(){
	System.out.println("site: "+site);
	System.out.println("child money: "+money);
	System.out.println("parent money: "+super.money);
	System.out.println("both: "+(super.money+money));	
	
	}
}

class demo8a{
public static void main(String agrs[]){
	child c=new child();
	c.use();
	parent p= new parent();
	
}
}