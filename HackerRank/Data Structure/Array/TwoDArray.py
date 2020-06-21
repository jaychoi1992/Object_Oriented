#https://www.hackerrank.com/challenges/2d-array/problem?h_r=next-challenge&h_v=zen

import math
import os
import random
import re
import sys


def hourglassSum(arr):
    maxval = None
    for col in range(1,5):
        for row in range(0,4):
            tempval = arr[row][col-1] + arr[row][col] + arr[row][col+1]+ arr[row+1][col]+ arr[row+2][col-1]+arr[row+2][col]+ arr[row+2][col+1]
            if maxval == None:
                maxval = tempval
            elif tempval > maxval:
                maxval = tempval
    return maxval


if __name__ == '__main__':

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    print(arr)

    result = hourglassSum(arr)
    print(result)