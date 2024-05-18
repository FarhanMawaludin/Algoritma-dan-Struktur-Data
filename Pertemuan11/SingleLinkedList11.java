package Pertemuan11;

public class SingleLinkedList11 {
    Node11 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node11 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node11 ndInput = new Node11(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node11 ndInput = new Node11(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node11 ndInput = new Node11(input, null);
        Node11 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node11 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index melebihi panjang linked list!");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Index melebihi panjang linked list!");
            } else {
                temp.next = new Node11(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    int getData(int index){
        Node11 tmp = head;
        for (int i = 0; i < index ; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key){
        Node11 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp != null){
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst(){
        if(!isEmpty()){
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else{
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }

    void removeLast(){
        if(!isEmpty()){
            if(head == tail){
                head = tail = null;
            }else{
                Node11 temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }else{
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }
    

    void remove(int key){
        if(!isEmpty()){
            if(head.data == key){
                removeFirst();
            }else{
                Node11 temp = head;
                while(temp.next != null && temp.next.data != key){
                    temp = temp.next;
                }
                if(temp.next != null){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                }else{
                    System.out.println("Data tidak ditemukan dalam linked list");
                }
            }
        }else{
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }
    }
    
    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        }else if(index == indexOf(tail.data)){
            removeLast();
        }else{
            Node11 temp = head;
            for(int i = 0; i < index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}
