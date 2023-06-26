
class demo35{
public static void main(String args[]){
	String name = "Rohit";
	System.out.println(name.length());
	//name=null; NullPointerException

	int arr[]={0,1,2,3,4};
	System.out.println(arr.length);

	String num = "100";
	//String num =  "100A"; NumberFormatException
	System.out.println(Integer.parseInt(num));

	//FileNotFoundException
	//InputMismatchException
	//SQLException
}
}