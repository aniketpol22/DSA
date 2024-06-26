import java.util.*;
public class arrayque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be searched");
        int searchnumber=sc.nextInt();
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter the array");
        for(int i=0; i<size;i++){
        



             array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i=0; i<size;i++){
            if (array[i]== searchnumber){
                System.out.println("your number is at"+ i+ "position");
            }
            

        }

        
    }
    
}
