public class linked_list {
    node head;
    class node {
        int data;
        node next;

        node(int val) {
            data = val;
            next = null;
        }
    }
    linked_list(){
            head =null;
    }
    public void insertAtBeginning(int val){
        node newnode =new node(val);
        if (head == null)
            head = newnode;
        else{
            newnode.next=head;
            head =newnode;
        }

    }
    public void traverse(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data +"  ");
            temp=temp.next;
        }
    }
    public void insertAtPos(int pos,int val){
        if (pos ==0) {
            insertAtBeginning(val);
            return;
        }
        node newnode = new node(val);
        node temp = head;
        for (int i = 1; i < pos ; i++) {
            temp = temp.next;
            if (temp==null){
                throw new IllegalArgumentException();

            }
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deleteAtPos(int pos){
        if (head==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos ==0 ){
            head=head.next;
            return;
        }
        node temp =head;
        node prev=null;
        for (int i = 1; i <= pos; i++) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

    }
    public void getPos(int pos){

        node temp = head;
        for (int i = 0; i <= pos ; i++) {

            if (i==pos){
                System.out.println(temp.data);
                break;
            }
            temp=temp.next;
            if (temp==null){
                throw new IllegalArgumentException();

            }
        }


    }
    public void update(int pos,int val){
        node temp = head;
        for (int i = 0; i <= pos; i++) {

            if (i==pos){
                temp.data=val;
                break;
            }
            temp=temp.next;
        }
    }
    public void reverse(){
        node prev=null;
        node current = head;
        node next= head.next;
        while (current != null ){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head = prev;
    }
}
