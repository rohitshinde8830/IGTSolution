import java.io.*;
import java.util.*;

class demo31
{
	public static void main(String args[]) 
	{
		m1();	
	}
	static void m1() {
		m2();
		System.out.println("M1 method");
	}
	static void m2() {
		m3();
		System.out.println("M2 method");
	}
	static void m3() {
		
		try{
		
		//System.out.println("M3 method");
		File f =new File("abc.txt");
		FileReader fr = new FileReader(f);
		}
		catch (IOException ee) {
       		 System.out.println("IOException: " + ee.getMessage());
    } 
		finally{
		System.out.println("Finally");
		}
	}
}