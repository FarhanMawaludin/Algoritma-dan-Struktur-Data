package Kuis2;

public class LinkedListTim {
    Node head;
    Node tail;

    public LinkedListTim() {
        head = null;
        tail = null;
    }

    public void addTim(Tim tim) {
        Node newNode = new Node(tim);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Tim findtim(String name) {
        Node current = head;
        while (current != null) {
            if (current.tim.name.equalsIgnoreCase(name)) {
                return current.tim;
            }
            current = current.next;
        }
        return null;
    }

    public void sorttims() {
        if (head == null) {
            return;
        }
        Node current = head;
        Node index;
        Tim temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.tim.poin < index.tim.poin) {
                    temp = current.tim;
                    current.tim = index.tim;
                    index.tim = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void print() {
        System.out.printf("%-35s %2s %6s %6s %6s%n", "TIM", "MAIN", "MENANG", "KALAH", "POIN");
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.tim);
            tmp = tmp.next;
        }
    }


}

