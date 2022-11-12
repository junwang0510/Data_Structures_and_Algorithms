package LeetCode.NeetCode150.PriorityQueue;

import java.util.*;

class FindMedianFromDataStream {
    // Runtime: O(logn)
    // Space: O(n)

    // Ideas:
    // 1. Two heaps storing two halves of values
    // 2. Default adding to small heap
    // 3. |size(small) - size(big)| <= 1 (balancing the two halves)
    // 4. all values in small heap <= all values in big heap (correct median calculation)

    // max heap storing the smaller half of the values
    PriorityQueue<Integer> small;
    // min heap storing the bigger half of the values
    PriorityQueue<Integer> big;

    public FindMedianFromDataStream() {
        // change to max heap
        small = new PriorityQueue<>((a, b) -> b - a);
        // default: min heap
        big = new PriorityQueue<>();
    }

    public void addNum(int num) {
        small.add(num);

        // Idea 3, 4
        if (small.size() - big.size() > 1 || (!big.isEmpty() &&
                small.peek() > big.peek())) {
            big.add(small.poll());
        }

        // Idea 3
        if (big.size() - small.size() > 1) {
            small.add(big.poll());
        }
    }

    public double findMedian() {
        // Constraints: There will be at least one element in the data structure before calling findMedian()
        if (small.size() == big.size()) {
            return (double) (big.peek() + small.peek()) / 2;
        } else if (small.size() > big.size()) {
            return (double) small.peek();
        } else {
            return (double) big.peek();
        }
    }
}
