#!/bin/python3
# https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
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
# Complete the deleteNode function below.

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#
def deleteNode(head, position):
    delVal = head
    if position == 0:
        head = head.next
        delVal = None
    else:
        val = 0
        prev = head
        for pos in range(position):
            delVal = delVal.next

            if pos + 1 != position:
                prev = delVal
        prev.next = delVal.next
        delVal = None
    return head


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    llist_count = int(input())

    llist = SinglyLinkedList()

    for _ in range(llist_count):
        llist_item = int(input())
        llist.insert_node(llist_item)

    position = int(input())

    llist1 = deleteNode(llist.head, position)
    printLinkedList(llist1)
    # print_singly_linked_list(llist1, ' ', fptr)
    # fptr.write('\n')

    # fptr.close()
