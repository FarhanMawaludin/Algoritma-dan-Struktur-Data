package Pertemuan12;

import org.w3c.dom.Node;

public class Node11 {
    int data;
    Node11 prev,next;

    Node11(Node11 prev, int data, Node11 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
