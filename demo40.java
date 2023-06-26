class A extends Thread{
	public void run(){
		try{
		for (int i=0;i<=5;i++){
			if(Thread.currentThread().getName().equals("BMW")){
				System.out.println(Thread.currentThread().getName()+" : "+i);
				}
			if(Thread.currentThread().getName().equals("MARUTI")){
				System.out.println("	"+Thread.currentThread().getName()+" : "+i);
				}
			Thread.sleep(1000);
			}

		}
		catch(Exception e){}
	
	}

}

class demo40{
public static void main(String args[]){

	A a = new A();
	Thread t1= new Thread(a);
	Thread t2= new Thread(a);
	t1.start();
	t2.start();

	t1.setName("BMW");
	t2.setName("MARUTI");

	for(int i=0;i<=10;i++){

	try{
		System.out.println("		I: ");
		Thread.sleep(1000);
		if(i==4){
		t1.stop();
		}
	}
	catch(Exception e){}
}
}
}