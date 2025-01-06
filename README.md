# leetcode-solutions
Leetcode Solutions

## Problems
1. LRU Cache <br>
LRU Cache is implemented using the DoublyLinked List.<br>
Max size was set to 10. Performed the following operations,
`DDL ddl = new DDL(10);
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
`<br>
Output:
`null --> 100(null, 40) --> 40(100, 90) --> 90(40, 80) --> 80(90, 70) --> 70(80, 60) --> 60(70, 50) --> 50(60, 30) --> 30(50, 20) --> 20(30, 10) --> 10(20, null) --> null`<br>
`null --> 120(null, 110) --> 110(120, 100) --> 100(110, 40) --> 40(100, 90) --> 90(40, 80) --> 80(90, 70) --> 70(80, 60) --> 60(70, 50) --> 50(60, 30) --> 30(50, null) --> null`<br>
`null --> 100(null, 120) --> 120(100, 110) --> 110(120, 40) --> 40(110, 90) --> 90(40, 80) --> 80(90, 70) --> 70(80, 60) --> 60(70, 50) --> 50(60, 30) --> 30(50, null) --> null`<br>
`null --> 50(null, 100) --> 100(50, 120) --> 120(100, 110) --> 110(120, 40) --> 40(110, 90) --> 90(40, 80) --> 80(90, 70) --> 70(80, 60) --> 60(70, 30) --> 30(60, null) --> null`<br>

