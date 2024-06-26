public class linkedlist{
    node head;
    int size;
    linkedlist(){
        this.size=0;
    }
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;

            size++;//size is incremented as node is created
        }
        
    }

    //add first
    public void addfirst(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        
    }
    //print
    public void print(){
        if(head==null){
            System.out.println("the lis is empty");
        }
        node currentnode;
        currentnode=head;
        while(currentnode!=null){
            
            System.out.print(currentnode.data+"->");
            currentnode=currentnode.next;
        }
        System.out.println("null");


    }

    //addlast
    public void addlast(String data){
        node newnode=new node(data);
        if (head==null){
            head=newnode;

        }
        node currentnode=head;
        while(currentnode.next!=null){//search the laast node and add the new node to it
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
        
    }
    //delete first

    public void deletefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;//size is decremented as the node is deleted
        head=head.next;
        
    }

    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("the lis is empty");
            return;
        }
        size--;//size is decremented as the node is deleted
        if(head.next==null){
            head=null;
            return;
        }
        
        node secondlast = head;//delete the last node and make it null
        node lastnode= head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;//searching the last node 
            secondlast=secondlast.next;
        }
        secondlast.next=null;//making the las node as null

        
    }
    public int getsize(){
        return size;
    }


//reverse the list

    public node reverselist(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newhead=reverselist(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }



    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst("hii");
        ll.addfirst("my");
        ll.addfirst("name");
        ll.addfirst("is");
        ll.addfirst("Aniket");
        //ll.print();
        //ll.addlast("123");
        ll.print();
        System.out.println();
        ll.deletelast();
        ll.deletefirst();
        ll.print();
        System.out.println(ll.getsize());
        ll.head=ll.reverselist(ll.head);
        ll.print();
        

        




    }

}