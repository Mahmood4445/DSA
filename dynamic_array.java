import java.util.Scanner;

class array_declaration{
    private static final int initial_capacity=16;
    private int arr[];
    private int size;
    private int capacity;
    array_declaration(){
        size=0;
        arr = new int[initial_capacity];
        capacity = initial_capacity;

    }
    public void add(int val){
        if (size == capacity)
            expand_array();
        arr[size++]=val;

    }
    public void display(){
        System.out.println("Display list");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"  ");

        }

    }
    public void insertat(int pos,int val){
        if (size == capacity)
            expand_array();
        for (int i = size-1; i >=pos ; i--)
            arr[i+1]=arr[i];
        arr[pos]=val;
        size++;
    }
    public void deleteat(int pos){
        for (int i = pos+1; i <size; i++)
            arr[i-1]=arr[i];
        size--;
        if (capacity> initial_capacity && capacity > 3*size)
            shrink_array();
    }
    public void expand_array(){
        capacity *=2;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }
    public void shrink_array(){
        capacity /=2;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }


}

public class dynamic_array{
    public static void main(String[] args) {
        array_declaration list =new array_declaration();
        int val,pos;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("         ");
            System.out.println("-----menu------");
            System.out.println("1.insert at the end ");
            System.out.println("2.display the list");
            System.out.println("3.insert at specific position");
            System.out.println("4.delete at specific position");
            System.out.println("5.exit");
            System.out.println("ENTER YOUR CHOICE?");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the value?");
                    val= in.nextInt();
                    list.add(val);
                    break;
                case 2:list.display();
                        break;
                case 3:
                    System.out.println("enter the position :");
                    pos = in.nextInt();
                    if (pos<0){
                        System.out.println("invalid position :");
                        break;}
                    System.out.println("enter the value :");
                    val= in.nextInt();
                    list.insertat(pos,val);
                    break;
                case 4:
                    System.out.println("enter the position to delete :");
                    pos = in.nextInt();
                    if (pos<0){
                        System.out.println("invalid position :");
                        break;}
                    list.deleteat(pos);
                    break;
                case 5:System.exit(0);
            }
        }
    }
}
