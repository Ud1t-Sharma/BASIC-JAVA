class three
{
    public static void main (String[] args){
    String a = "------------------------------------CONDITIONAL STATEMENT if else----------------------------------------\n";
    int b = 7;// we will take three values of b; when b is less than 6 , when b is greater than 6 , when b is equal to 6
    System.out.println(a);
    if (b<6)
    {
        System.out.println("b is less than 6");
    }    else if(b>6)
    {
        System.out.println("b is greater than 6");   
    }
    else 
    {
        System.out.println("b is equal to 6");
    }
    var ss = (b!=66)?"b is not eqal to 66" : "b is equal to 66";//this right here is called Ternary Operator.
    System.out.println(ss);
    }   
    
}