import sys

def greedy_meeting_room(list):
    k = 0
    count = 1
    for i in range(1, len(list)):
        if list[k][1] <= list[i][0]:
            count += 1
            k = i
    return count

N = int(sys.stdin.readline())
list = [[0 for j in range(2)] for i in range(N)]

for i in range(N):
    start, finish = map(int, sys.stdin.readline().split())
    list[i][0], list[i][1] = start, finish

list.sort(key = lambda x : x[0])
list.sort(key = lambda x : x[1])

print(greedy_meeting_room(list))

