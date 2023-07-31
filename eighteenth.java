class eighteenth{
    public static void main (String[]args){
        var a =("today we will learn about the comparison operators.\nComparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.\n");
        int b = 26;
        int c = 23;
        boolean z =  c > b ;// returns true if c is greater than b.
        boolean x =  c < b ;// returns true if b is greater than c.
        boolean v =  b == c;// returns true if b is equal to c.
        boolean n =  b != c;// returns true if b is not equal to c.
        boolean m =  b >= c;// returns true if b is greater or equal to c.
        boolean d =  b <= c;// returns true if b is smaller or equal to c.

        System.out.println(a + "\n\nHere are the results of the comparison operators\n\n" + z +"\n"+x +"\n"+v +"\n"+n +"\n"+m +"\n"+d);
    }
}