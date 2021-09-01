# [INSERTION](https://en.wikipedia.org/wiki/Insertion_sort) vs [MERGE](https://en.wikipedia.org/wiki/Merge_sort) sort algorithms:
-- -----------

### TIME COMPLEXITY:
Insertion Sort:  O(n^2);

Merge Sort:  O(n log(n))

### MEMORY:
Insertion sort doesn't consume additional memory to create temporary arrays.

Merge sort creates temporary arrays for each iteration.

### BEHAVIOUR(when partially sorted):
Insertion sort will not continue to compare elements, in case element to the left are already sorted. 
This saves time on
each iteration.

### WHEN TO USE
INSERTION SORT:
Good for sorting small sets of data. Simple implementation.

MERGE SORT:
Efficient to sort large sets of data.
