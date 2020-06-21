#https://www.hackerrank.com/challenges/dynamic-array/problem?h_r=next-challenge&h_v=zen

import math
import os
import random
import re
import sys

def dynamicArray(n, queries):
    #Write your code here
    lastAnswer = 0
    loc = None
    seq = [[]] * n
    last = []
    for query in queries :
        loc = (query[1] ^ lastAnswer) % n
        if query[0] == 1 :

            seq[loc] = seq[loc] + [query[2]]
        else:
            size = len(seq[loc])
            lastAnswer = seq[loc][query[2] % size]
            last.append(lastAnswer)
    return last


def dynamicArrayother(n, queries):
    lastNumber = 0
    seqList = [];
    for i in range(n):
        seqList.append([])
    res = [];
    for k, x, y in queries:
        index = (x ^ lastNumber) % n
        if k == 1:
            seqList[index].append(y)
            print(seqList)
        else:
            size = len(seqList[index])
            print(seqList)
            print(size)
            lastNumber = seqList[index][y % size]
            print(lastNumber)
            res.append(lastNumber)

    return res


if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    q = int(first_multiple_input[1])

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    result = dynamicArray(n, queries)
    print(result)
    #fptr.write('\n'.join(map(str, result)))
    #fptr.write('\n')

    #fptr.close()