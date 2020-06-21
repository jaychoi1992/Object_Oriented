#https://www.hackerrank.com/challenges/array-left-rotation/problem?h_r=next-challenge&h_v=zen
import math
import os
import random
import re
import sys


if __name__ == '__main__':
    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))

    # My Solution
    b = [None] * n
    for i in range(n):
        # b.insert(i-d,a[i])
        b[i - d] = a[i]
    print(' '.join(map(str, b)))

    # Solution2 from 'PkkdGuy'
    for value in (a[d:] + a[0:d]): print (value)

    # Solution3
    print(*(a[d:] + a[:d]))

