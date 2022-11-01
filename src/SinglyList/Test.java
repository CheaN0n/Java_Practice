package SinglyList;

public class Test {
    public static void main(String[] args) {
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        LinkedList ll = new LinkedList(n1);

//        System.out.println(ll.getLength());
//        ll.ergodic();
        ll.InsertNode(4,60);
//        ll.deleteNode(4);
//        ll.ergodic();
//        System.out.println(ll.findNode(60));
//        ll.findAndDelete(60);
        ll.reverseList();
        ll.ergodic();

    }
}
