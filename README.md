# Kotlin removeIf Function Unexpected Behavior

This repository demonstrates a potential issue with the `removeIf` function in Kotlin when used with mutable lists.  The `removeIf` function can lead to unexpected behavior if the list is modified during iteration. This example showcases the problem and provides a solution using an iterator.

## Bug Description

The `removeIf` function is used to remove elements from a mutable list based on a given predicate. However, if the predicate modifies the list, the iteration might skip elements unexpectedly, leading to an incomplete removal process.

## Solution

The issue is addressed by using an iterator to remove elements safely. This allows for modification during iteration without causing unexpected skips.