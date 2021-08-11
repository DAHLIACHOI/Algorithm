import sys

def count_coin(L, k):
    count = 0
    for i in range(len(L)):
        if k == 0: break
        com = L.pop()
        if com <= k:
            count += k//com
            k %= com
    return count

N, K = map(int, sys.stdin.readline().split())
L = [int(sys.stdin.readline()) for i in range(N)]

print(count_coin(L,K))
