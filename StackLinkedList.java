public class StackLinkedList {
    node top;
    class node{
        int data;
        node next;
        node(int val){
            data =  val;
            next = null;
        }

    }
    StackLinkedList(){
        top = null;
    }
    public void push (int val){
        node newnode = new node(val);
        newnode.next=top;
        top = newnode;
    }
    public int pop(){
        if(top == null)
            throw new ArrayIndexOutOfBoundsException("stack under flow");
        int temp = top.data;
        top = top.next;
        return temp;
    }
    public int peek(){
        return top.data;
    }
    public boolean isEmpty(){
        return top== null;
    }

}
