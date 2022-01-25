package _2_linked_list;

public class UtilityFunctions {
    int length = 0;

    // Returns length of given Linked List
    public int listLength(ListNode headNode){
        int length=0;
        ListNode currentNode = headNode;
        while(currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }


    //


}
