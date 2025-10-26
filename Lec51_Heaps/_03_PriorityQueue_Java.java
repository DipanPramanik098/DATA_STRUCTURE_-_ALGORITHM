import java.util.Collections;
import java.util.PriorityQueue;

public class _03_PriorityQueue_Java {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();// min heap
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());// max heap

        int[] elements = { 50, 10, 30, 20, 40 };

        for (int num : elements) {
            minHeap.add(num);
            maxHeap.add(num);
        }

        // -------------------------------
        // Display the heaps
        // (Note: internal structure is heap, not sorted)
        // -------------------------------
        System.out.println("Min Heap (PriorityQueue): " + minHeap);
        System.out.println("Max Heap (PriorityQueue): " + maxHeap);

        // -------------------------------
        // Peek (returns smallest/largest without removing)
        // -------------------------------
        System.out.println("\nPeek Min Heap (smallest): " + minHeap.peek());
        System.out.println("Peek Max Heap (largest): " + maxHeap.peek());

        // -------------------------------
        // Remove (removes head element)
        // -------------------------------
        System.out.println("\nRemove from Min Heap: " + minHeap.remove());
        System.out.println("Remove from Max Heap: " + maxHeap.remove());

        System.out.println("After removal:");
        System.out.println("Min Heap: " + minHeap);
        System.out.println("Max Heap: " + maxHeap);

        // -------------------------------
        // Poll (removes head, returns null if empty)
        // -------------------------------
        System.out.println("\nPoll Min Heap: " + minHeap.poll());
        System.out.println("Poll Max Heap: " + maxHeap.poll());

        // -------------------------------
        // Check size and emptiness
        // -------------------------------
        System.out.println("\nSize of Min Heap: " + minHeap.size());
        System.out.println("Is Min Heap empty? " + minHeap.isEmpty());

        // -------------------------------
        // Iterate through remaining elements
        // -------------------------------
        System.out.print("\nIterating Min Heap elements: ");
        for (int num : minHeap) {
            System.out.print(num + " ");
        }

        System.out.print("\nIterating Max Heap elements: ");
        for (int num : maxHeap) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
    }
}
