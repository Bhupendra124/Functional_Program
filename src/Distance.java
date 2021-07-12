public class Distance {
    //fuction to create array
    static double Distance(int x1,int y1, int x2, int y2)
    {
        //calculation
        return Math.sqrt(Math.pow( x2-x1, 2 ) +Math.pow(y2 -y1 ,2));


    }

    public static void main(String[] args) {
        System.out.println( Distance(1,2,2,1) );
    }
}
