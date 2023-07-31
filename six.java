class six{
    public static void main (String[] args){
        for(int i = 0 ; i<10;i++){
            if (i == 7){
                break;
            }
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
//here  we have introduced another condition in our for loop.
// when i equals to 7, then the loop will be broken and values wont be printed further.