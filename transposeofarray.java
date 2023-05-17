import java.util.*;
public class transposeofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        // System.out.println("enter size of array");
        // int size = sc.nextInt();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int transpose[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                arr[i][j]=transpose[i][2-j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
               System.out.print( arr[i][j]+" ");
            }System.out.println();
        }
    
}

}