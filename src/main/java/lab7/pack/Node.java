package lab7.pack;
import lab6.Train;

public class Node {
    private Node next;
    private Train data;
    private Node previous;
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Train getData() {
        return data;
    }

    public void setData(Train data) {
        this.data = data;
    }
}
