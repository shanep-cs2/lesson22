package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.Arrays;
import java.util.List;

public class MyBinarySearchTest {

    @Test
    public void testSearchLower() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 2, 0, nums.size()-1);
        assertEquals(actual, 1);
        assertEquals(search.getNumComparisons(), 2);
        assertEquals(search.getNumRecursions(), 1);

        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        search = new MyBinarySearch();
        actual = search.search(nums, 2, 0, nums.size()-1);
        assertEquals(actual, 1);
        assertEquals(search.getNumComparisons(), 2);
        assertEquals(search.getNumRecursions(), 1);

    }

    @Test
    public void testSearchFirst() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 1, 0, nums.size()-1);
        assertEquals(actual, 0);
        assertEquals(search.getNumComparisons(), 3);
        assertEquals(search.getNumRecursions(), 2);

        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        search = new MyBinarySearch();
        actual = search.search(nums, 1, 0, nums.size()-1);
        assertEquals(actual, 0);
        assertEquals(search.getNumComparisons(), 3);
        assertEquals(search.getNumRecursions(), 2);
    }

    @Test
    public void testSearchLast() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 9, 0, nums.size()-1);
        assertEquals(actual, 8);
        assertEquals(search.getNumComparisons(), 4);
        assertEquals(search.getNumRecursions(), 3);

        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        search = new MyBinarySearch();
        actual = search.search(nums, 10, 0, nums.size()-1);
        assertEquals(actual, 9);
        assertEquals(search.getNumComparisons(), 4);
        assertEquals(search.getNumRecursions(), 3);
    }

    @Test
    public void testSearchMiddle() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 5, 0, nums.size()-1);
        assertEquals(actual, 4);
        assertEquals(search.getNumComparisons(), 1);
        assertEquals(search.getNumRecursions(), 0);

    }

    @Test
    public void testZeroLength() {
        List<Integer> nums = Arrays.asList();
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 5, 0, 0);
        assertEquals(actual, -1);
        assertEquals(search.getNumComparisons(), 0);
        assertEquals(search.getNumRecursions(), 0);
    }

    @Test
    public void testOne() {
        List<Integer> nums = Arrays.asList(1);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 1, 0, nums.size()-1);
        assertEquals(actual, 0);
        assertEquals(search.getNumComparisons(), 1);
        assertEquals(search.getNumRecursions(), 0);
    }

    @Test
    public void testMissing(){
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 99, 0, nums.size()-1);
        assertEquals(actual, -1);
        assertEquals(search.getNumComparisons(), 5);
        assertEquals(search.getNumRecursions(), 3);
    }

    @Test
    public void testDups(){
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7,8);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 1, 0, nums.size()-1);
        assertEquals(actual, 1);
        assertEquals(search.getNumComparisons(), 2);
        assertEquals(search.getNumRecursions(), 1);
    }

    @Test
    public void testMultiple() {
        List<Integer> nums = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        BinarySearch search = new MyBinarySearch();
        int actual = search.search(nums, 11, 0, nums.size()-1);
        assertEquals(actual, 0);
        assertEquals(search.getNumComparisons(), 3);
        assertEquals(search.getNumRecursions(), 2);

        nums = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        search = new MyBinarySearch();
        actual = search.search(nums, 99, 0, nums.size()-1);
        assertEquals(actual, 8);
        assertEquals(search.getNumComparisons(), 4);
        assertEquals(search.getNumRecursions(), 3);
    }

}
