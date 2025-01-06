package medium.lruCache;

public class LRUCache {

    public static void main(String[] args) {
        DDL ddl = new DDL(10);
        ddl.add(10);
        ddl.add(20);
        ddl.add(30);
        ddl.add(50);
        ddl.add(60);
        ddl.add(70);
        ddl.add(80);
        ddl.add(90);
        ddl.add(40);
        ddl.add(100);
        ddl.print();
        ddl.add(110);
        ddl.add(120);
        ddl.print();
        ddl.add(100);
        ddl.print();
        ddl.add(50);
        ddl.print();
    }

}
