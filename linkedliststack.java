
public class linkedliststack {
    static node head = null;
    
     static class node{
        int data;
        node next;
         node(int data){
            this.data=data;
            next=null;

        }
    }
    static class stack{
       
        //push the data in linked list
          public  static void push(int data){
            node newnode= new node(data);
            if (head==null){
                head= newnode;
                return;

            }
            newnode.next=head;
            head=newnode;

          }

        //if the list is empty
        public static boolean isempty(){
            
                return head==null;
            
        }

         //to pop the element
         public int popelement(){
            if(isempty()){
                return -1;

            }
            node top=head;
           
            head=head.next;
            return top.data;


         }  
         //peek the element
         public static int peek(){
            if(isempty()){
                return -1;
            }
            node top=head;
            return top.data;
            
        
         } 

        }

    




    
public static void main(String[] args) {
    stack ls=new stack();
    ls.push(1);
    ls.push(2);
    ls.push(3);
    ls.push(4);
    while(!stack.isempty()){
       System.out.println(ls.peek());
       ls.popelement();
    }



    
}
}
    
