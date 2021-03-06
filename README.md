# lesson22 - Binary search

## Overview

In this lab we will leverage [recursion](https://shanep-cs2.github.io/lessons/lesson09.html) to implement a simple
binary search algorithm. Each recursive call will search one-half of the list that was 
received as an argument.

## Important Links

- [Lab Overview](https://youtu.be/eKU9VG7m11E)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)


## Task 1 - Complete the BinarySearch class

In your starter code you will see a file named **MyBinarySearch.java**. You job is to implement the
interface BinarySearch. You **MUST** use recursion to solve this problem. The list that is given
to you will always be sorted, but duplicates are allowed! For a list with duplicates you should
return the first instance that you find.

The algorithm begins by choosing an index midway between the lower and upper bounds.

- If target == nums.get(index) return index
- If lower == upper, return lower if target == nums.get(lower) else -1 to indicate not found
- Otherwise call the function recursively on half the List parameter:
  - If target < numbers.get(index), search the List from lower to index-1
  - If target > numbers.get(index), search the List from index+1 to upper


## Task 2 - Add stats

Once the search algorithm works correctly, add some stats to the Search Helper class so we can see
how our algorithm is behaving. Add the following to your SearchHelper return object:

- Count the number of recursive calls
 - The first call should not be counted as recursive. Only count when search calls itself!
- Count the number of times when the target is compared to an element of the List. 
  - `target == numbers.get(index)` 

## Task 3 - Write Unit Tests

Write enough unit tests to ensure your algorithm is correct. Your Unit tests will be written in
the file **MyBinarySearchTest.java**.

## Task 4 - Complete App.java

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
index: 1, recursions: 1, comparisons: 2
```

## Task 5 - Complete the Retrospective

Once you have completed all the tasks open the file Retrospective.md and complete each section with
a TODO comment.

## Task 6 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!