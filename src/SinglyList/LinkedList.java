package SinglyList;

public class LinkedList {
    private ListNode head;//一定要维护头节点
    public LinkedList(){};//构造方法
    public LinkedList(ListNode n){this.head = n;}

    public int getLength(){
        int count = 1;
        ListNode p = head;
        while(p.next!=null){
            p = p.next;
            count++;
        }
        return count;
    }

    public void addHeadNode(int d){//头节点插入
        head = new ListNode(d,head);
    }

    public void ergodic(){
        ListNode p = head;
        while (p.next!=null){
            System.out.println(p.data);
            p = p.next;
            if (p.next==null){
                System.out.println(p.data);
            }
        }
    }

    public void addTailNode(int d){
        ListNode p = head;
        while(p.next!=null){
            p = p.next;
        }
        p.next.next = new ListNode(d,null);
    }

    public void addAtHead(int n,int newdatat){
        for (int i = 0; i < n; i++) {
            head = new ListNode(newdatat,head);
        }
    }

    public void InsertNode(int pos,int d){
        ListNode p = head;
        for (int i = 0; i <pos-1 ; i++) {
            p = p.next;
        }
        ListNode q = new ListNode(d,null);
        q.next = p.next;
        p.next = q;
    }
    public ListNode findNode(int d){
        ListNode p = head;
        while(p.next!=null){
            if (p.data ==d){
                return p;
            }
            p = p.next;
        }
        return null;

    }

    public ListNode deleteNode(int pos){
        ListNode p = head;
        for (int i = 0; i <pos-1 ; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public ListNode findAndDelete(int data){
        ListNode p = head;
        while(p.next!=null){
            if (p.next.data ==data){
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return head;
    }
    public void sortList(){
        ListNode head2 = head;
        ListNode p;
        head = null;
        while (head2!=null){
            p = head2;
            head2 = head2.next;
            insertToSortedList(p);
        }
    }
    public void insertToSortedList(int data){
        ListNode p = head;
        if (head==null||head.data>data){
            head = new ListNode(data,head);
            return;
        }
        while (p.next!=null&&p.next.data<data){
            p = p.next;

        }//定位
        p.next = new ListNode(data,p.next);
    }
    public void insertToSortedList(ListNode n){
        ListNode p = head;
        if (head==null||head.data>n.data){
            n.next = head;
            head = n;
            return;
        }
        while (p.next!=null&&p.next.data<n.data){
            p = p.next;

        }//定位
        n.next = p.next;
        p.next = n;
    }

        public void reverseList(){
        ListNode head2 = head;
        ListNode p;
        head = null;
        while (head2!=null){
            p = head2;
            head2 = head2.next;//头部删除
            p.next = head;
            head = p;//头部插入
        }
        }

        //从第n个位置开始逆转，假设1<n<length
    public void reverseList(int n){
        ListNode pn1= head;
        for (int i = 1; i < n-1; i++) {
            pn1 = pn1.next;
            ListNode p = null,pn2 = null;
            while (pn1.next!=null){
                p = pn1.next;
                pn1.next = pn1.next.next;//删
                p.next= pn2;
                pn2= p;//头部插入
            }
            pn1.next = pn2;
        }


    }


}
