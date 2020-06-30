import heapq


def solution1():
    num = int(input())
    temp = []
    heapq.heapify(temp)
    for _ in range(num):
        x = list(map(int, input().split()))
        code = x[0]
        if code != 3:
            data = x[1]
        if code == 1:
            heapq.heappush(temp, data)
        elif code == 2:
            temp.remove(data)
            heapq.heapify(temp)
        else:
            print(temp[0])
heap = []
item_lookup = set()


def solution2():
    cmd = {1: push, 2: pop, 3: print_min}
    num = int(input())
    for _ in range(num):
        x = list(map(int, input().split()))
        cmd[x[0]](*x[1:])


def push(v):
    heapq.heappush(heap,v)
    item_lookup.add(v)
def pop(v):
    item_lookup.discard(v)
def print_min():
    while heap[0] not in item_lookup:
        heapq.heappop(heap)
    heapq.heapify(heap)
    print(heap[0])


if __name__ == '__main__':
    solution2()