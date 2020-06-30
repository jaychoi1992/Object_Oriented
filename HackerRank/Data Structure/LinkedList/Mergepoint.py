# https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_r=next-challenge&h_v=zen
#!/bin/python3

import math
import os
import random
import re
import sys


class SinglyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, node_data):
        node = SinglyLinkedListNode(node_data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node

        self.tail = node


def print_singly_linked_list(node, sep, fptr):
    while node:
        fptr.write(str(node.data))

        node = node.next

        if node:
            fptr.write(sep)


def printLinkedList(head):
    while head is not None:
        print(head.data)
        head = head.next
# Complete the findMergeNode function below.

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#


def findMergeNode(head1, head2):
    ptr1 = head1
    ptr2 = head2
    temp = {}
    while ptr1 is not None or ptr2 is not None:

        if id(ptr1) in temp:
            return ptr1.data
        else:
            if ptr1 is not None:
                temp[id(ptr1)] = ptr1.data
                ptr1 = ptr1.next
        if id(ptr2) in temp:
            return ptr2.data
        else:
            if ptr2 is not None:
                temp[id(ptr2)] = ptr2.data
                ptr2 = ptr2.next



if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    tests = int(input())

    for tests_itr in range(tests):
        index = int(input())

        llist1_count = int(input())

        llist1 = SinglyLinkedList()

        for _ in range(llist1_count):
            llist1_item = int(input())
            llist1.insert_node(llist1_item)

        llist2_count = int(input())

        llist2 = SinglyLinkedList()

        for _ in range(llist2_count):
            llist2_item = int(input())
            llist2.insert_node(llist2_item)

        ptr1 = llist1.head;
        ptr2 = llist2.head;

        for i in range(llist1_count):
            if i < index:
                ptr1 = ptr1.next

        for i in range(llist2_count):
            if i != llist2_count - 1:
                ptr2 = ptr2.next

        ptr2.next = ptr1

        result = findMergeNode(llist1.head, llist2.head)
        print(result)

        '''fptr.write(str(result) + '\n')

    fptr.close()'''