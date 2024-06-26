import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(3);
        a1.add(5);
        a1.add(9);
        a1.add(19);
        a1.add(sc.nextInt());

        System.out.println(a1);
        int l = a1.get(3);
        System.out.println(l);
        Collections.sort(a1);
        System.out.println(a1);
        
    }
    
}
