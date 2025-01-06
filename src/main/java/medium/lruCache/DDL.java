package medium.lruCache;

public class DDL {

    DDLNode head;
    DDLNode tail;

    private final int maxCapacity;
    private int currentSize;

    public DDL(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentSize = 0;
    }

    public void add(int value) {
        if(isExist(value)) {
            if(head == tail) {
                return;
            }
            DDLNode current = head;
            while(current != null) {
                if(current.value == value) {
                    DDLNode previous = current.previous;
                    DDLNode next = current.next;

                    previous.next = next;
                    if(next != null) {
                        next.previous = previous;
                    }
                    currentSize--;
                }
                current = current.next;
            }
        }
        if(currentSize ==  maxCapacity) {
            removeLast();
            addFirst(value);
        } else {
            addFirst(value);
        }
    }

    public void addFirst(int value) {
        DDLNode newNode = new DDLNode(value);
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else if (head == tail) {
            head = newNode;
            tail.previous = head;
            head.next = tail;
        } else {
            DDLNode current = head;
            head = newNode;
            head.next = current;
            assert current != null;
            current.previous = head;
        }
        currentSize++;
    }

    public void addLast(int value) {
        DDLNode newNode = new DDLNode(value);
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else if(head == tail) {
            tail = newNode;
            tail.previous = head;
            head.next = tail;
        } else {
            DDLNode current = tail;
            tail = newNode;
            tail.previous = current;
            current.next = tail;
        }
        currentSize++;
    }

    public int getSize() {
        return currentSize;
    }

    public int removeLast() {
        int toReturn;
        if(head == null && tail == null) {
            throw new RuntimeException("Empty DDL");
        } else if (head == tail) {
            toReturn = tail.value;
            head = tail = null;
        } else {
            toReturn = tail.value;
            DDLNode previous = tail.previous;
            previous.next = null;
            tail = previous;
        }
        currentSize--;
        return toReturn;
    }

    public boolean isExist(int value) {
        DDLNode current = head;
        while(current != null) {
            if(current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        DDLNode current = head;
        System.out.print("null --> ");
        while(current != null) {
            Integer previous;
            Integer next;

            if(current.previous == null) {
                previous = null;
            } else {
                previous = current.previous.value;
            }

            if(current.next == null) {
                next = null;
            } else {
                next = current.next.value;
            }

            System.out.printf("%d(%d, %d) --> ", current.value, previous, next);
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
}
