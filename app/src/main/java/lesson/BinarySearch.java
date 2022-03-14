package lesson;

import java.util.List;

public interface BinarySearch {

    /**
     * 
     * @param helper A populated search helper
     * @param nums An ordered list of numbers
     * @param start The starting index
     * @param end The ending index
     * @return A populated SearchHelper object
     */
    SearchHelper search(SearchHelper helper, List<Integer> nums, int start, int end);
}
