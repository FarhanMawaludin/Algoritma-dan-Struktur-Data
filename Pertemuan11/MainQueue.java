package Pertemuan11;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");
        
        queue.printQueue();
        
        System.out.println("\nDequeue: " + queue.dequeue().nama);
        queue.printQueue();
    }
    
}
