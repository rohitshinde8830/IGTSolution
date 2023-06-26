class p5 {

 

    public static void main(String[] args) {

        String s = "pop";
        char[] c = s.toCharArray();
        int i, j;

 

        for(i=0, j=s.length()-1; i<j; i++, j--) {

            if(c[i] != c[j]) {

                System.out.println("String is not palindrom");
                break;
            }
        }

 

        if(i>=j) {

                System.out.println("String is palindrom");
        }        
    } 
}