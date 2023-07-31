class fifteenth01{
    public static void main(String[]args){
        var a = ("This is an example of Widening Casting:-\n");
        int s = 55;
        double b = s;
        double x = 5.69d;
        int c = (int) x;//x was containg a doube but we commanded c to store value of double in form of int i.e. without the decimal points.
        System.out.println(a + s + "\n"+ b + "\nThis is an example of Narrow Casting\n" + x + "\n" + c);
    }
}