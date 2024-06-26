

public class arrayqueue {
    public static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int size){
            this.size=size;
            arr = new int[size];

        }
//is empty
    public static boolean isempty(){
        return rear==-1;
    }
    //add
    public static void add(int data){
        if(rear==size-1){
            System.out.println("the array is full");
        }
        arr[++rear]=data;
    }

    //remove
    public static int remove(){
        if(isempty()){
            System.out.println("array is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
          arr[i]=arr[i+1];
        }
        rear--;
        return front;

    }
    //peek
    public static int peek(){
        if(isempty()){
            System.out.println("array is empty");
            return -1;
        }
        int front=arr[0];
        return front;
    }


    }
    


    public static void main(String[] args) {

        Queue q=new Queue(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
        
    }
}
