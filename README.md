# lesson22 - Binary search

## Overview

In this lab we will leverage [recursion]({% link _cs2/lessons/lesson09.md %}) to implement a simple
binary search algorithm. Each recursive call will search one-half of the list that was 
received as an argument.

## Videos

- [Lab Overview]()


## Task 1 - Complete the BinarySearch class

In your starter code you will see a file named **BinarySearch.java**. You job is to complete the
recursive method binarySearch() with the following specifications:

- Parameters:
  - a target integer, this is what you are searching for
  - an LinkedList of integers
  - lower and upper bounds within which the recursive call will search
- Return value:
  - the index within the LinkedList where the target is located
  - -1 if target is not found

The algorithm begins by choosing an index midway between the lower and upper bounds.

- If target == integers.get(index) return index
- If lower == upper, return lower if target == integers.get(lower) else -1 to indicate not found
- Otherwise call the function recursively on half the LinkedList parameter:
  - If integers.get(index) < target, search the LinkedList from index to upper
  - If integers.get(index) > target, search the LinkedList from lower to index

The LinkedList must be ordered, but duplicates are allowed.

## Task 2 - Write Unit Tests

Write enough unit tests to ensure your algorithm is correct. Your Unit tests will be written in
the file **BinarySearchTest.java**.

## Task 3 - Add stats

Once the search algorithm works correctly, add the following to binarySearch():

- Count the number of calls to binarySearch().
- Count the number of times when the target is compared to an element of the LinkedList. Note: lower
  == upper should not be counted.

**Hint:** Use a static variable to count calls and comparisons.

## Task 4 - Test input/output

The input of the program consists of:

- the integers in the LinkedList
- the target to be located

### Example 

Input: 

```
1 2 3 4 5 6 7 8 9
2
```

Output:

```
index: 1, recursions: 2, comparisons: 3
```

