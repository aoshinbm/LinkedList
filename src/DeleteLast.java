import java.util.LinkedList;

public class DeleteLast {
    Node head;
    class Node{
        int data;
        Node ref;

        Node(int data){
            this.data=data;
        }
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        } else if (head.ref==null) {
            head.ref=newNode;
        }else {
            Node temp=head;
            while (temp.ref!=null){
                temp=temp.ref;
            }
            temp.ref=newNode;
        }
    }
    void deleteLast(){
        if (head == null)
            System.out.println("Linked List is empty");
        else if (head.ref == null)
            head = null;
        else {
            Node temp = head;
            while (temp.ref.ref != null) {
                temp = temp.ref;
            }
            temp.ref = null;
        }
    }
    void print(){
        if (head==null){
            System.out.println("Linked list is empty");
        }
        else {
            Node temp=head;
            while (temp!=null){
                if (temp.ref!=null){
                    System.out.print("["+temp.data+"]==>");
                }else {
                    System.out.print("["+temp.data+"]==>");
                }
                temp=temp.ref;
            }
        }
    }

    public static void main(String[] args) {
        DeleteLast l=new DeleteLast();
        System.out.println("LInked List:");
        l.addLast(56);
        l.addLast(30);
        l.addLast(70);
        l.print();

        System.out.println("\n\n");
        System.out.println("Linked list after deleting last element:");
        l.deleteLast();
        l.print();
    }
}
