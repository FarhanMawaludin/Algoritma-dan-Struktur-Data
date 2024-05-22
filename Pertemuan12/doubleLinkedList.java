package Pertemuan12;

public class doubleLinkedList {
    Node11 head;
    int size;
    
    public doubleLinkedList() {
        head = null;
        size =0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item){
        if(isEmpty()){
            head = new Node11(null, item, head);
        }else{
            Node11 newNode = new Node11(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
}
