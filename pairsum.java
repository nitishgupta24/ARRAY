import java.util.*;
public class pairsum{
    public static void main(String[] args) {
        System.out.println("\033c");
        int size;
        boolean l=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        size = sc.nextInt();
        int[] array1 = new int[size];
        
        for (int i = 0; i < array1.length; i++) {
            
            System.out.println("Enter element number"+(i+1));
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the pair sum output");
        size = sc.nextInt();
        System.out.println("\033c");
        System.out.print("Your input array {");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+",");
        }System.out.print("} your pair sum input ="+size+"\n");
        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array1.length; j++) {
               if(i!=j)
               {
                if(array1[i]+array1[j]==size){
                    l=true;
                   System.out.println("{"+i+","+j+"}"+" Values at index = {"+array1[i]+","+array1[j]+"}");
                }}} }
            if(l==false){
                System.out.println("\033c");
                System.out.println("No pair sum found");
            }
         
       

    }
    
}
