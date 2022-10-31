public class TrackAges {
    public static void main(String[]args) {
        MinHeap ages = new MinHeap();
        // Can call public MinHeap .add() method here:
        ages.add(42);
        ages.add(15);
        ages.add(27);
        // Can’t call private MinHeap .bubbleUp() method here
        // Don’t need to because .add() calls .bubbleUp()!
    }
}