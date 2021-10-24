import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_traverse {
    public static void spiral(int[][] a)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i =0, j=a.length-1, k=0, l= a[0].length-1;



        // i j k l are four corners of a matrix

        /*  i         j
              1 2 3 4 
              5 6 7 8
              9 1 2 4
            k         l  */

            while (i<=j && k<= l)
            {
                for (int z =k; z<=l;z++)
                {
                    al.add(a[i][z]);
                  
                }  i++;
                for (int z =i; z<=j;z++)
                {
                    al.add(a[z][l]);
                   
                } l--;
                if (i<=j)
                {
                    for (int z =l; z>=k;z--)
                    {
                        al.add(a[j][z]);
                        
                    } j--;
                }
                if (k<=l)
                {
                    for (int z =j; z>=i;z--)
                {
                    al.add(a[z][k]);
                    
                } k++;
                }
            }
            System.out.println(al);

    }













    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[][]= new int [4][4];
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            a[i][j]= sc.nextInt();
        }
        for (int i =0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        spiral(a);
        sc.close();

    }
    
}
