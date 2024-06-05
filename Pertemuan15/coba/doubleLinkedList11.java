package coba;
public class doubleLinkedList11 {
    node11 head;
    int size;
    
    public doubleLinkedList11() {
        head = null;
        size =0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item , int jarak){
        if(isEmpty()){
            head = new node11(null, item, jarak,null);
        }else{
            node11 newnode11 = new node11(null, item, jarak,head);
            head.prev = newnode11;
            head = newnode11;
        }
        size++;
    }

    
    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            node11 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks diluar batas");
        } 
            node11 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        
    }


    // method getindex
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks diluar batas");
        } 
            node11 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.jarak;
        
    }

    public void remove(int index) throws Exception {
        node11 current = head;
        while (current != null){
            if (current.data == index){
                if (current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }

                if (current.next != null){
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public void setJarak(int index, int jarakBaru) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        node11 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.jarak = jarakBaru;
    }

}
