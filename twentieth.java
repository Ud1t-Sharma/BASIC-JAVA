class twentieth{
    public static void main(String [] args){
        String a = "What is a string ??\nA String variable contains a collection of characters surrounded by double quotes:\n";
        String x = "Hi this is not that " , b = "cool." , c = "50" , d = "50" ,g = "variable", f = c + d;
        System.out.println("Length of string a is :- \n" + a.length() + "\nwe use stringName.length() command to find out length of a string.\n");
        System.out.println("~~To convert a string in uppercase we use stringName.toUppercase() command.\n" + a.toUpperCase());
        System.out.println("\n~~To convert a string in lowercase we use stringName.toLowercase() command.\n" + a.toLowerCase());
        System.out.println("\nTo find index of a character of a string we use stringName.indexof() command\nindex of variable in String a is:- " + a.indexOf(g));
        System.out.println("\n+ is used to combine two string for example:-\n"+ x + b + "\n" + f);
        System.out.println("\r:-is a special character in which can be used as a new line character.\rbackslash with double qoute is also a special character that is used to insert a double qoute in a string.\"_\"");
        System.out.println("\nfor using backspace in a string we use a backslash and character b with it x\b.");//\b deletes x in this statement.

    }
}