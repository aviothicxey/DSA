
public class moveIstToLast{
    public Node moveIstToLast(Node head){
     if(head == null || head.next == null) return head;
        Node temp = head ;
        Node tail = head;
        
        if(head != null){
            head = head.next;
        }
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = temp;
        temp.next = null;
        
        return head;
    }
}