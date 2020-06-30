# https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_r=next-challenge&h_v=zen
#!/bin/python3

import math
import os
import random
import re
import sys

class DoublyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, node_data):
        node = DoublyLinkedListNode(node_data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node
            node.prev = self.tail


        self.tail = node

def print_doubly_linked_list(node, sep, fptr):
    while node:
        fptr.write(str(node.data))

        node = node.next

        if node:
            fptr.write(sep)

def printLinkedList(head):
    while head is not None:
        print(head.data)
        head = head.next
# Complete the sortedInsert function below.

#
# For your reference:
#
# DoublyLinkedListNode:
#     int data
#     DoublyLinkedListNode next
#     DoublyLinkedListNode prev
#
#
def sortedInsert(head, data):
    newNode = DoublyLinkedListNode(data)
    node = head
    if node.data > data:
        newNode.next = node
        head = newNode
    else:

        while node is not None:
            if node.next is None:
                node.next = newNode
                break
            if node.next.data >= data:
                newNode.next = node.next
                node.next = newNode
                break
            else:
                node = node.next
    return head




if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        llist_count = int(input())

        llist = DoublyLinkedList()

        for _ in range(llist_count):
            llist_item = int(input())
            llist.insert_node(llist_item)

        data = int(input())

        llist1 = sortedInsert(llist.head, data)
        printLinkedList(llist1)

        ''''' print_doubly_linked_list(llist1, ' ', fptr)
        fptr.write('\n')

    fptr.close()'''
