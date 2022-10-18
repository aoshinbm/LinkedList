public class CreateList {
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
    void displayList() {
        if (head == null)
            System.out.println("Linked list is empty");
        else {
            Node temp = head;
            while (temp != null) {
                if (temp.ref != null)
                    System.out.print("["+temp.data+"]==>");
                else
                    System.out.println("["+temp.data+"]");
                temp = temp.ref;
            }
        }
    }
    public static void main(String[] args) {
        CreateList list = new CreateList();
        System.out.println("Linked list:");
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.displayList();
    }
}