class seven{
    public static void main (String[]args){
        String[] days = {"Monday","Tuesday","Wednesday" , "Thursday","Friday","Saturday","Sunday"};
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        n [6] = 07;//changed the value of 6th index of the array
        System.out.println(days[3]);//[] are used to declare array
        System.out.println(n[6]);
        System.out.println(n[5]);//in print statement we give index values that we want to display
        System.out.println(days.length);// display length of array days.
        System.out.println(n.length);
        for(int i = 0;i<n.length;i++){//loops through arrays
            System.out.println(n[i]);
        }
        for (String x : days){
            System.out.println(x);
        }
        int[][] y = {{8,1,7,8,9,3,8,6,5,1},{9,5,9,9,8,4,8,9,4,8}};//Multi dimensional array
        System.out.println(y.length);// displays length of array
        System.out.println(days[3]);
        for (int s = 0; s < y.length; ++s){
            for(int k = 0; k < y[s].length; ++k){
            System.out.println(y[s][k]);
        }
        }

    }
}