# https://www.hackerrank.com/challenges/sparse-arrays/problem?h_r=next-challenge&h_v=zen
import math
import os
import random
import re
import sys


def matchingStrings(strings, queries):
    result = []
    for query in queries:
        counter = 0
        for string in strings:

            if string == query:
                counter += 1

        result.append(counter)
    return result


def otherAnswer(strings, queries):
    return [strings.count(q) for q in queries]



if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    strings_count = int(input())

    strings = []

    for _ in range(strings_count):
        strings_item = input()
        strings.append(strings_item)

    queries_count = int(input())

    queries = []

    for _ in range(queries_count):
        queries_item = input()
        queries.append(queries_item)

    res = matchingStrings(strings, queries)
    res2 = otherAnswer(strings, queries)
    print(res)
    print(res2)
    #fptr.write('\n'.join(map(str, res)))
    #fptr.write('\n')

    #fptr.close()