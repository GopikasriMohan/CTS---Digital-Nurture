UNDERSTAND ASYMPTOTIC NOTATION

**Big O Notation:**

Big O notation describes how the runtime of an algorithm grows with input size n.

| Complexity | Description      |
| ---------- | ---------------- |
| O(1)       | Constant time    |
| O(n)       | Linear time      |
| O(log n)   | Logarithmic time |
| O(n²)      | Quadratic time   |


**Search Scenarios:**

| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------- | ------------ | ---------- |
| Linear Search | O(1)      | O(n)         | O(n)       |
| Binary Search | O(1)      | O(log n)     | O(log n)   |



ANALYSIS

**Linear Search**

Time Complexity: O(n)

Pros: Simple and works on unsorted data.

Cons: Slow for large datasets.

**Binary Search**

Time Complexity: O(log n)

Pros: Much faster for large datasets.

Cons: Requires the array to be sorted.

For performance-critical e-commerce search functionality, binary search is more efficient and scalable, especially when dealing with sorted 

product listings or applying indexing techniques.