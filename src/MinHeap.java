import java.util.ArrayList;

public class MinHeap {
    public ArrayList<Integer> heap;
    public int size;

    public MinHeap() {
        // Body of constructor
    }
    public void add(int value) {
        heap.add(value);
        size++;
        bubbleUp();
    }
    private void bubbleUp() {
        // Body of .bubbleUp() method
    }
}