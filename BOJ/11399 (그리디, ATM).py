import sys

n = int(sys.stdin.readline())
L = list(map(int, sys.stdin.readline().split()))

L.sort()

middle, sum = 0, 0

for time in L:
    middle += time
    sum += middle

print(sum)
