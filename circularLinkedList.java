public class circularLinkedList <T>{
    node last;
    class node {
        T data;
        node next;
        node(T val){
            data = val;
            next=null;
        }
    }
    circularLinkedList(){
        last = null;
    }
    public void InsertAtBeginning(T val){
        node newnode = new node(val);
        if (last == null){
            newnode.next=newnode;
            last=newnode;

        }
        else{
            newnode.next=last.next;
            last.next=newnode;
        }
    }
    public void InsertAtEnd(T val){
        node newnode = new node(val);
        if (last == null){
            newnode.next=newnode;
            last=newnode;

        }
        else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
    }
    public void display(){
        if(last==null)
            return;
        node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while (temp!=last.next);
    }
    public void deleteAtBeginning(){
        if(last==null)
            throw new ArrayIndexOutOfBoundsException("no element in the list");
        if (last.next == last)
            last=null;
        else {
            last.next=last.next.next;
        }
    }
    public void deleteAtEnd(){
        if(last==null)
            throw new ArrayIndexOutOfBoundsException("no element in the list");
        if (last.next == last)
            last=null;
        else {
            node temp = last.next;
            while (temp.next!=last){
                temp=temp.next;
            }
            temp.next=last.next;
            last=temp;

        }
    }
}
