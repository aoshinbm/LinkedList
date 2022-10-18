public class AddLast {
    Node head;

    class Node {
        int data;
        Node ref;

        Node(int data) {
            this.data = data;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.ref == null) {
            head.ref = newNode;
        } else {
            Node temp = head;
            while (temp.ref != null) {
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
    }
    void print(){
        if (head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node temp=head;
            while (temp!=null){
                if (temp.ref!=null){
                    System.out.print("["+temp.data+"]==>");
                }
                else {
                    System.out.print("["+temp.data+"]");
                }
                temp=temp.ref;
            }
        }
    }

    public static void main(String[] args) {
        AddLast list1=new AddLast();
        list1.addLast(56);
        list1.addLast(30);
        list1.addLast(70);
        list1.print();
    }
}