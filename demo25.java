//final class car
class car{
	final static int speed = 200;
	 static void run(){
	System.out.println("run speed: "+speed);
	
}

}
class BMW extends car{


}

class demo25{
public static void main(String args[]){

	//car c = new car();
	//c.run();
	System.out.println("run speed main: "+car.run());
	System.out.println("run speed main: "+car.speed);

	BMW b =new BMW();
	b.run();
}
}