import java.util.Scanner;

class practic{
public static void main (String args[]){

Scanner sc = new Scanner (System.in);

System.out.println("enter number: ");
int a= sc.nextInt();
int b= sc.nextInt();

if(a>b){

System.out.println(a+"is greater");
}else{

System.out.println(b+"is greater");
}
}
}