class Node:
    def __init__(self, info):
        self.info = info
        self.left = None
        self.right = None
        self.level = None

    def __str__(self):
        return str(self.info)


class BinarySearchTree:
    def __init__(self):
        self.root = None

    def create(self, val):
        if self.root == None:
            self.root = Node(val)
        else:
            current = self.root

            while True:
                if val < current.info:
                    if current.left:
                        current = current.left
                    else:
                        current.left = Node(val)
                        break
                elif val > current.info:
                    if current.right:
                        current = current.right
                    else:
                        current.right = Node(val)
                        break
                else:
                    break


"""
Node is defined as
self.left (the left child of the node)
self.right (the right child of the node)
self.info (the value of the node)
"""


def topView(root):

    lft, rgt, loc, q, rst, i = root, root, [], [], dict(), 0
    q.append(root)
    loc.append(0)
    rst[0] = root.info

    while i < len(q):
        rt = q[i]

        if rt.left:
            q.append(rt.left)
            loc.append(loc[i] - 1)
            if rst.get(loc[i] - 1) is None:
                rst[loc[i] - 1] = rt.left.info

        if rt.right:
            q.append(rt.right)
            loc.append(loc[i] + 1)
            if rst.get(loc[i] + 1) is None:
                rst[loc[i] + 1] = rt.right.info

        i = i + 1
    for i in sorted(rst.keys()):
        print(rst[i], end = " ")

# Another Solutions
def mergeView(resr, resl):
    ret = resr
    for key, value in resl.items():
        if key not in ret.keys():
            ret[key] = value
        else:
            if value[0] < ret[key][0]:
                ret[key] = value
    return ret


def topView(root):
    def getView(node, lvl, pos):
        res = {}
        if node:
            resr = getView(node.right, lvl + 1, pos + 1)
            resl = getView(node.left, lvl + 1, pos - 1)
            res = mergeView(resr, resl)
            res[pos] = (lvl, node.info)
        return res

    view = getView(root, 0, 0)
    poss = sorted(view)
    for pos in poss:
        print(view[pos][1], end=' ')


# Write your code here


tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.create(arr[i])

topView(tree.root)