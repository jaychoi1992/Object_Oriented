#https://www.hackerrank.com/challenges/arrays-ds/problem

import math
import os
import random
import re
import sys


# Complete the reverseArray function below.
def reverseArray_Myanswer(a):
    return a.reverse()
    


def reverseArray_otheranswer(a):
    return a[::-1]


if __name__ == '__main__':

    arr_count = int(input())

    arr = list(map(int, input().rstrip().split()))
    res1 = reverseArray_Myanswer(arr)
    res2 = reverseArray_otheranswer(arr)
    print(res1)
    print(res2)
