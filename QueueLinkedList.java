public class QueueLinkedList {
    node rear,front;
    class node {
        int data;
        node next;

        node(int val) {
            data = val;
            next = null;
        }
    }
        QueueLinkedList(){
            rear = null;
            front = null;
        }
        public void enqueue(int val){
        node newnode =new node(val);
        if (front == null)
            front=newnode;
        else
            rear.next= newnode;
        rear = newnode;
        }
        public int dequeue(){
        if (front == null)
                throw new ArrayIndexOutOfBoundsException("queue is empty");
        int temp = front.data;
        front = front.next;

        return temp;

        }
    }

