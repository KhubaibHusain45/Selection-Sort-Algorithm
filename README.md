Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.
Step 1: Start with the first element.

Find the smallest element in the entire array.

Swap it with the first element.

Step 2: Move to the second element.

Find the smallest element in the rest of the array (excluding the first).

Swap it with the second element.

Step 3: Continue this process for each element, until the array is sorted.

Array: {7, 8, 3, 1, 2}

First pass (i = 0):

Find smallest in {7, 8, 3, 1, 2} → 1

Swap with 7 → {1, 8, 3, 7, 2}

Second pass (i = 1):

Find smallest in {8, 3, 7, 2} → 2

Swap with 8 → {1, 2, 3, 7, 8}

Third pass (i = 2):

Smallest in {3, 7, 8} is 3 → already in place

Fourth pass (i = 3):

Smallest in {7, 8} is 7 → already in place

Last pass (i = 4):

Only one element left → done!

Sorted array: {1, 2, 3, 7, 8}

✅ Key Points:
Always finds the smallest (or largest, for descending sort) in the remaining array.

Swaps only once per outer loop iteration.

Time Complexity:

Best, Average, Worst = O(n²)

Not very efficient for large datasets.

Space Complexity:

O(1) → In-place sorting (no extra memory used).

