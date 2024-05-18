package Pertemuan11;


public class MahasiswaMain {
    public static void main(String[] args) {
        MahasiswaLinkedList linkedList = new MahasiswaLinkedList();

        
        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAt(3, 114, "Doni");

        linkedList.cetak();
    }
}
