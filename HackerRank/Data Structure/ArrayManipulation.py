#https://www.hackerrank.com/challenges/crush/problem?h_r=next-challenge&h_v=zen
import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    results =[0]*n
    for query in queries :
        for i in range(query[0]-1, query[1]) :
            results[i] = results[i] + query[2]
    return max(results)

# https://www.hackerrank.com/challenges/crush/forum/comments/505698
def array_efficient(n, queries):
    array = [0] * (n + 1)

    for query in queries:
        a = query[0] - 1
        b = query[1]
        k = query[2]
        array[a] += k
        array[b] -= k

    max_value = 0
    running_count = 0
    for i in array:
        running_count += i
        if running_count > max_value:
            max_value = running_count

    return max_value


if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)
    print(result)
    #fptr.write(str(result) + '\n')

    #fptr.close()