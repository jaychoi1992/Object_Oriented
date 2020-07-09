using System;
using System.Collections.Generic;
using System.IO;
class HeapQ
{
    
    static void addValue(List<int>heap,int data) {
        heap.Add(data);
    }
    static void heapify(List<int> heap, int n, int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && heap[smallest] > heap[l]) {
            smallest = l;
        }
        if (r < n && heap[smallest] > heap[r]) {
            smallest = r;
        }
        if (smallest != i) {
            int swap = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = swap;
            heapify(heap, n, smallest);
        }
    }
    static void printMin() { }
    static void removeMin(List<int> heap, int n) {
        int last = heap[n - 1];
        heap[0] = last;
        n = n - 1;
        heapify(heap, n, 0);

    }
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        List<int> heapq = new List<int>();
        var hset = new HashSet<int>();
        int queries = Convert.ToInt32(Console.ReadLine());
        for (int i = 0; i < queries; ++i)
        {
            String[] values = Console.ReadLine().Split(' ');
           
            int flag = Convert.ToInt32(values[0]);
            if (flag != 3)
            {
                int data = Convert.ToInt32(values[1]);
                if (flag == 1)
                {
                    addValue(heapq, data);
                    hset.Add(data);
                }
                else
                {
                    hset.Remove(data);

                }

            }
            else {
                for (int idx = heapq.Count/2 -1; idx >=0; --idx)
                {
                    heapify(heapq, heapq.Count, idx);
                }
                while (!hset.Contains(heapq[0])) {
                    removeMin(heapq, heapq.Count);

                }
                Console.WriteLine(heapq[0]);
            }


        }
    }
}