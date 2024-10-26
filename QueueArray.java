public class QueueArray {
    static final int max=30;
    int arr[];
    int front,rear;
    QueueArray(){
        arr=new int[max];
        front=-1;
        rear =-1;
    }
    public  void enqueue(int val){
        if(rear==max-1)
            throw new ArrayIndexOutOfBoundsException("queue is  full");
        if(front==-1)
            front++;
        arr[++rear]=val;
    }
    public int dequeue(){
        if (front==-1||rear<front)
            throw new ArrayIndexOutOfBoundsException("array is empty");

        return arr[front++];
    }
}
