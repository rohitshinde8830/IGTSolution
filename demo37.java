class A extends Thread
{
public void run()
  {
	try
	{
		for (int i=0;i<5;i++)
		{
		System.out.println("I: "+i);
		Thread.sleep(500);
		}
 	}
	catch(InterruptedException i){}
  }

}
class B extends Thread
{
public void run()
  {
	try
	{
		for (int j=0;j<5;j++)
		{
		System.out.println("	j:"+j);
		Thread.sleep(500);
		}
 	}
	catch(InterruptedException i){}
  }

}
class C extends Thread
{
public void run()
  {
	try
	{
		for (int k=0;k<5;k++)
		{
		System.out.println("		k:"+k);
		Thread.sleep(500);
		}
 	}
	catch(InterruptedException i){}
  }

}

class demo37{
public static void main (String args[]){
		
		A a =new A();
		B b = new B();
		C c = new C();

		a.start();
		b.start();
		c.start();
}

}