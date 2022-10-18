public class DeleteFirst {
    Node head;

    class Node {
        int data;
        Node ref;

        Node(int data) {
            this.data = data;
        }
    }
    void addFirst(int data) {
        Node newNode = new Node(data); // newNode=>[5|null]
        newNode.ref = head;
        head = newNode;
    }

    public void deleteFirst() {
        head = head.ref;
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
        DeleteFirst listt=new DeleteFirst();
        System.out.println("Linked List:");
        listt.addFirst(70);
        listt.addFirst(30);
        listt.addFirst(56);
        listt.print();

        System.out.println("Linked List after deletion:");
        listt.deleteFirst();
        listt.print();
    }
}
