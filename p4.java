interface I
{
	
}

abstract class B
{
	int a;
	B(){}

}

class A
{
	int a;
	A(){}
}

class p4{
public static void main(String args[]){
	A a = new A();
	
}
}
//===================
class A
{
    int a;//0
    A(){}
}
class A1{}
//class A2 extends A1,A{}
abstract class B
{
    int a;// 0
    B(){}
}
interface I
{
    //int a;
    //I(){}
    void abc();
}
interface J{}
interface K extends J,I{}
class Demo22
{
    public static void main(String args[])
    {           
        //I i = new I();no    
    }
}