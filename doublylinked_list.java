public class doublylinked_list {
    node head;
    node tail;
    class node {
        int data;
        node next;
        node prev;

        node(int val) {
            data = val;
            next = null;
            prev=null;
        }
    }
    doublylinked_list(){
        head =null;
        tail=null;
    }
    public void insertAtBeginning(int val){
        node newnode =new node(val);
        if (head == null) {
            tail = newnode;
        }
        else{
            head.prev=newnode;
            newnode.next=head;

        }
        head = newnode;

    }
    public void display(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.data +"  ");
            temp=temp.next;
        }
    }
    public void displayReverse(){
        node temp = tail;
        while (temp!=null){
            System.out.print(temp.data +"  ");
            temp=temp.prev;
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
        newnode.prev=temp;
        if (temp  == tail)
           tail=newnode;
        else
            temp.next.prev=newnode;
        temp.next=newnode;
    }
    public void deleteAtPos(int pos){
        if (head==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos ==0 ){
            head=head.next;
            if (head == null)
                tail = null;
            else
                head.prev=null;
            return;
        }
        node temp =head;
        node prev=null;
        for (int i = 1; i <= pos; i++) {
            prev=temp;
            temp=temp.next;
            if (temp == null )
                throw new ArrayIndexOutOfBoundsException();
        }
        prev.next=temp.next;
        if (temp.next==null)
            tail=prev;
        else
            temp.next.prev=prev;

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

