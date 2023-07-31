class one{
  public static void main(String [] args){
    String a = "Hi guys, lets begin our todays session and make this repository more usefull.\n";
    int c = 32 , d = 64; 
    float b =  -5;
    int f = Math.max(c,d);//Math.max is a method that is used to find highest value in terms of nummber.
    int g = Math.min(c,d);//Math.min is a method that is used to pprint the minimum value in terms of number.
    double s = (int)Math.sqrt(d);//Math.sqrt is a method that is used to display square root of given numbers.
    int j = (int)(Math.random());// prints random integer between 0.0 and 1.0
    float q = (int)(Math.random()*200);// This will allow us to print random integer between 0 and 200.

    System.out.println(a + f );
    System.out.println(g);
    System.out.println(s);
    System.out.println(j);
    System.out.println(q);
    System.out.println(Math.abs(b));//Math.abs gives us the absolute value of the number.
  }
}