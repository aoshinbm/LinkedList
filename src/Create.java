public class Create {
    Node head;
    class Node{
        int data;
        Node ref;

        Node(int data){
            this.data=data;
        }
    }
    void  create(int data){
        Node newNode=new Node(data);
        newNode.ref=head;
        head=newNode;
    }
    void displayList() {
        if (head == null)
            System.out.println("Linked list is empty");
        else {
            Node temp = head;
            while (temp != null) {
                if (temp.ref != null) {
                    System.out.print("[" + temp.data + "]==>");
                }
                else {
                    System.out.println("[" + temp.data + "]");
                }
                temp = temp.ref;
            }
        }
    }
    public static void main(String[] args) {
        Create list = new Create();
        System.out.println("Linked list:");
        list.create(56);
        list.create(30);
        list.create(70);
        list.displayList();
    }
}