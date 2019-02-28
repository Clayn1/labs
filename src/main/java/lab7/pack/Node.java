package lab7.pack;
import lab6.AbstractCoach;

public class Node {
    private Node next;
    private AbstractCoach data;
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

    public AbstractCoach getData() {
        return data;
    }

    public void setData(AbstractCoach data) {
        this.data = data;
    }
}
