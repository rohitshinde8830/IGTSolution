interface univercity{

	void exam();
	void result();
}
class IITB{
	public void exam(){
	System.out.println("IIB exam");
}
	public void result(){
	System.out.println("IIB result");
}
}
class IITM{
	public void exam(){}
	public void result(){}
}
class IITD{
	public void exam(){}
	public void result(){}
}

class demo29{
public static void main(String args[]){
	IITB i =new IITB();
	i.exam();
	i.result();
}
}