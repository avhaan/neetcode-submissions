
class LinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        Node node = head;
        for (int i = 0; i<index;i++) {
            if (node.next == null) {
                return -1;
            }
            node = node.next;
        }
        return node.data;
    }

    public void insertHead(int val) {
       Node node = new Node(val);
       node.next = head;
       head = node;
    }

    public void insertTail(int val) {
        if (head == null) {
            head = new Node(val);
        } else{
            Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(val);
        }
        
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        Node node = head;
        for (int i = 0; i<index-1;i++) {
            if (node.next == null) {
                return false;
            }
            node = node.next;
        }
        if (node.next == null) {
            return false;
        }
        node.next = node.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> val = new ArrayList<>();
        Node node = head;
        while (node != null) {
            val.add(node.data);
            node = node.next;
        }
        return val;
    }
}
