public class fibonacci {
    public static void fibb(int a, int b, int n) {
        if(n==0){
            return;
        }
     int c=a+b;
     System.out.println(c);
     fibb(b,c,n-1);
       
    
    }
    public static void main(String[] args) {
       
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        fibb(a,b,n-2);

    }
    
}
