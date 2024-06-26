import java.util.ArrayList;

public class arrarliststack {
    

    //push the element
 static class stack{
      ArrayList<Integer> list= new ArrayList<>();
        public void push(int data){
            list.add(data);

        }
    
    //is empty
    public boolean isempty(){
        return list.size()==0;
    }

    //pop element

    public int pop(){
        if(isempty()){
            return -1;
        }
        int top= list.remove(list.size()-1);
        return top;
    }
    
    //peek 
     
    public int peek(){
        if(isempty()){
            return -1;

        }
        return list.get(list.size()-1);
    }
}

public static void main(String[] args) {
    stack stack=new stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    while(!stack.isempty()){
        System.out.println(stack.peek());
        stack.pop();
    }


}

}
