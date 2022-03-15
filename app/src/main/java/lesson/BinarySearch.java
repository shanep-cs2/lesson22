package lesson;

import java.util.List;

/**
 * Do Not modify this interface
 */
public interface BinarySearch {

    /**
     * Perform a binary search of the numbers List. The List must be sorted 
     * before it is passed to this method
     * @param numbers The List to search
     * @param target The target number to find in the list
     * @param lower The lower index to start searching
     * @param upper The upper index to start searching
     * @return The index that the target exists at or -1 if the list does not contain target
     */
    int search(List<Integer> numbers, int target, int lower, int upper);

    /**
     * @return The number of recursions that we made in the search
     */
    public int getNumRecursions();

    /**
     * @return The number of comparisons that we made during the search
     */
    public int getNumComparisons(); 
}
