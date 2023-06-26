

//=============================================





interface I {

 

    public final int a = 10;


    void add(); //by default it is public static

    void sub();

}

 

interface J {


    public final int b = 20;

 

    void mul();

    void div();

}

 

interface K extends I, J {

 

}

 

class Cal implements K {

 

    public void add() {

 

        System.out.println(I.a+J.b);

    }

 

    public void sub() {

 

        System.out.println(a-b);//(I.a+J.b)

    }

 

    public void mul() {

 

        System.out.println(a*b);

    }

 

    public void div() {

 

        System.out.println(a/b);

    }

}

 

class demo26 {


    public static void main(String[] args) {


        System.out.println("===Cal===");

        Cal c = new Cal();

        c.add();

        c.sub();

        c.mul();

        c.div();


        System.out.println("===K Interface===");

        K k = c;

        k.add();

        k.sub();

        k.mul();

        k.div();


        System.out.println("===I Interface===");

        I i = c;

        i.add();

        i.sub();


        System.out.println("===J Interface===");

        J j = c;

        j.mul();

        j.div();

    }

}