package _2_linked_list;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}
