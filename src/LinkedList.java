public class LinkedList {
    /* This is your completed LinkedList from last lab with the following changes:
       0. Change the visibility modifiers in the Node and LinkedList classes as necessary.
          Remember visibility modifiers should be as restrictive as possible.
       1. Add methods isEmpty() and createNode(Object data).
       2. Remove the main method.
    */
    public class Node {
        public Object data;
        public Node next;
        Node (Object obj) {
            this.data = obj;
            this.next = null;
        }
    }



    // TO-DO: declare any required data members
    // ...

    Node head;
    Node tail;
    Node nextNode;
    Node current;
    int length;

    public LinkedList() {
        // TO-DO: initialize all data members to
        // make this an empty LinkedList object.
        // ...
        head = new Node(null);
        nextNode = new Node(null);
        tail = new Node(null);

        length = 0;
    }

    public Object createNode(Object obj){
        Node newNode = new Node(obj);
        newNode.next = null;
        return newNode.data;
    }

    public void add(Object obj) {
        // TO-DO: add "obj" to the end of the LinkedList.
        // ...
        Node thisNode = new Node(obj);
        if(length == 0){
            head = thisNode;
        } else {
            tail.next = thisNode;
        }
        tail = thisNode;

        length++;
    }

    public void first() {
        // TO-DO: set an internal "next" pointer to the head Node of
        // the list.
        // ...
        current = head;

    }

    public Object next() {
        // TO-DO: return the data item pointed at by the internal "next" pointer, and then advance the pointer. move the pointer to the next node and return the data with each method
        if(current != null){
            Node temp = current;
            current = current.next;
            return temp.data;
        }

        return null;
    }


    public Object getAt(int index) {
        // TO-DO: find the Node at the requested index (zero-based)
        // and return the data contained within that Node.
        // ...
        Node pointer = head;
        int i = 0;

        while (pointer != null){
            if(i == index){
                return pointer.data;
            }
            i++;
            pointer = pointer.next;
        }
        return null;

    }

    public boolean isEmpty(){
        if(head == null)
            return true;

        return false;
    }

}