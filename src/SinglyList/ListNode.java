package SinglyList;

public class ListNode {

    int data;
    ListNode next;

    public ListNode(){}
    public ListNode(int d,ListNode node) {
        this.data = d;
        this.next = node;

    }
    public String toString(){
        return "一个存储数据为"+this.data+"的结点";
    }
}
