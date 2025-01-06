package medium.lruCache;

public class DDLNode {

    DDLNode previous;
    DDLNode next;

    int value;

    public DDLNode() {
    }

    public DDLNode(int value) {
        this.value = value;
    }

}
