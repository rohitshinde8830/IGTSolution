import java.util.Scanner;

class arr2 {
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter length of arr: ");
	int n = sc.nextInt();
	int arr [] = new int[n];
	System.out.println("enter elements: ");
	for(int i=0;i<n;i++){
	arr[i] = sc.nextInt();
}
	int min = Integer.MAX_VALUE;
	for(int j=0;j<n;j++){
	if(arr[j]<min){
	min=arr[j];

}
}System.out.println("min: "+min);

	int max = Integer.MIN_VALUE;
	for(int e: arr){
	if (e>max){
	max=e;
}
}System.out.println("max: "+max);
}
}