package _2_linked_list;

public class LinkedList {
    private int length =0;
    ListNode head;

    public LinkedList() {
        length = 0;
    }

    public synchronized ListNode getHead(){
        return head;
    }

    //insert a node at the beginning of the list
    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    //insert a node at the end of the list
    public synchronized void insertAtEnd(ListNode node){
        if(head == null)
            head = node;
        else{
            ListNode p, q;
            for(p=head; (q=p.getNext()) != null; p=q ){
                p.setNext(node);
                length++;
            }
        }
    }

    //insert a node at given position
    public synchronized void insertAtPosition(int data, int position){
        //fix position
        if(position < 0 )
            position = 0;
        if(position > length )
            position = length;

        //if list is empty make it be the first element
        if(head == null){
            head = new ListNode(data);
        }

        //addition in the beginning of list
        else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;

        }

        //else identify correct position and insert
        else{
            ListNode temp = head;
            for(int i=1;i<position; i++)
                temp = temp.getNext();

            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode.getNext());
        }
        length++;
    }

    // Remove and return the node at the head of the list
    public synchronized ListNode removeFromBegin(){
        ListNode node = head;
        if(node != null){
            head = head.getNext();
            node.setNext(null);
        }
        return node;
    }

    //remove and return node at the end of the list
    public synchronized ListNode removeFromEnd(){

        if(head == null)
            return null;
        ListNode p=head, q=null, next = head.getNext();
        if(next ==  null){
            head = null;
            return p;
        }
        while((next = p.getNext()) != null){
            q = p;
            p = next;
        }
        q.setNext(null);
        return p;
    }

    //remove a node from a given
    public synchronized void removeMatched(ListNode node){
        if(head == null)
            return;
        if(head.equals(node)) {
            head = head.getNext();
            return;
        }
        ListNode p=head, q=null;
        while((q=p.getNext()) != null){
            if(node.equals(q)){
                p.setNext(q.getNext());
                return;
            }
            p=q;
        }
    }
}
