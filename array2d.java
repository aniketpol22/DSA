import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows= sc.nextInt();
        System.out.println("enter number of columns");
        int columns = sc.nextInt();
        System.out.println("enter the number to be searched");
        int search = sc.nextInt();
        int [][]array= new int[rows][columns];
        System.out.println("enter matrix");
        for(int i=0 ; i<rows; i++){
            for(int j=0;j<columns;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ; i<rows; i++){
            for(int j=0;j<columns;j++){
               System.out.print(array[i][j]+"  ");
               
            }
            System.out.println();
        }
        for(int i=0 ; i<rows; i++){
            for(int j=0;j<columns;j++){
               if(array[i][j]==search){
                System.out.println("row="+i+"column="+j);
               }
               else{
                System.out.println("no number present");
               }

            }
           
        }
    }
}
