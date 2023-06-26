class A {

	int ss=0;
	int mm=0;
	int hh=0;
	void abc(){
	try{
		for (int i=0;i<10000;i++){
		if(i==5){
			mm++;
			i=1;
			}
		System.out.print("\r" + String.format("%d:%d:%d", hh, mm, i));
		Thread.sleep(1000);
		}
	}
	catch(InterruptedException i){}
}
}

class demo38{
public static void main(String args[]){

	A a = new A();
	a.abc();
}

}