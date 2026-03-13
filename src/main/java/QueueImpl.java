public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        if (isFull()) throw new FullQueueException();

        this.data[this.p++]=e;

    }


    public E pop() throws EmptyQueueException {
        // TO-DO
        return null;
    }

    private boolean isFull() {
        // TO-DO
        //return this.p == this.data.length;
        return false;
    }

    private boolean isEmpty() {
        // TO-DO
        return false;
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
