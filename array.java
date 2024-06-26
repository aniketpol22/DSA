import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arrsize=sc.nextInt();
        int array[]= new int[arrsize];
        int i;
        for ( i=0; i<arrsize; i++){
             array[i]=sc.nextInt();
        }
        for(i=0; i<arrsize; i++){
            System.out.println(array[i]);
        }
    }
    
}
