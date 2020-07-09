#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    sset = set()
    result = 0
    for a in ar:
        sset.add(a)
    for s in sset:
        result = int(ar.count(s)/2) + result
    return result

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)
    print(result)

    #fptr.write(str(result) + '\n')

    #fptr.close()
