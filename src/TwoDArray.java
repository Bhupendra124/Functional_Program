
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
       //int [][] a=new int[3][4];
        int[][] a={{10,20,30,40},{50,60},{40,50,60}};
        System.out.println("Two Dimensional Array"+a);
         for (int i=0; i<a.length; i++)
         {
             for (int j=0;j< a[i].length; j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }

    }
    }