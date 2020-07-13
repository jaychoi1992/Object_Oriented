class Node:
    def __init__(self, info):
        self.info = info
        self.left = None
        self.right = None
        self.level = None

    def __str__(self):
        return str(self.info)


def preOrder(root):
    if root == None:
        return
    print(root.info, end=" ")
    preOrder(root.left)
    preOrder(root.right)


class BinarySearchTree:
    def __init__(self):
        self.root = None

    # Node is defined as
    # self.left (the left child of the node)
    # self.right (the right child of the node)
    # self.info (the value of the node)

    def insert(self, val):
        if self.root is None:
            newnode = Node(val)
            self.root = newnode
        else:
            temp = self.root
            while True :

                if val > temp.info:
                    if temp.right is None:
                        temp.right = Node(val)
                        break
                    temp = temp.right
                else :
                    if temp.left is None:
                        temp.left = Node(val)
                        break
                    temp = temp.left





# Enter you code here.

tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.insert(arr[i])

preOrder(tree.root)
