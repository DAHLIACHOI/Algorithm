import heapq
import sys

def greedy_lecture_num(list):
    q = []
    heapq.heappush(q,list[0][1])
    
    for i in range(1, len(list)):
        if q[0] <= list[i][0]:
            heapq.heappop(q)
        heapq.heappush(q, list[i][1])
    return len(q)

N = int(sys.stdin.readline())
list = [[0 for j in range(2)] for i in range(N)]

for i in range(N):
    start, finish = map(int, sys.stdin.readline().split())
    list[i][0], list[i][1] = start, finish

list.sort(key=lambda x: x[0])

print(greedy_lecture_num(list))
