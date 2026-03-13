public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;

    public QueueImpl(int len) {
        this.data = (E[])new Object[len];
    }

    public void push(E e) throws FullQueueException {
        if (isFull()) throw new FullQueueException();
        this.data[this.p++] = e;
    }


    public E pop() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();

        E value = this.data[0];
        // Desplaça tots els elements una posició cap a l'esquerra
        for (int i = 1; i < this.p; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.data[--this.p] = null; // allibera referència per al GC
        return value;
    }

    private boolean isFull() {
        return this.p == this.data.length;
    }

    private boolean isEmpty() {
        return this.p == 0;
    }

    public int size() {
        return this.p;
    }
}
