class p6 {

 

    public static void main(String[] args) {

        String s = "This is a string";
        char[] c = s.toCharArray();

 

        for(int i=0, j=s.length()-1; i<j; i++, j--) {

            char t = c[i];
            c[i] = c[j];
            c[j] = t;
        }

 

        System.out.println(new String(c));
    } 
}