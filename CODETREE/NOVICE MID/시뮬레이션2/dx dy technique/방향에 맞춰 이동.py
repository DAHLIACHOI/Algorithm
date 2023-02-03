dx, dy = [1, 0, -1, 0], [0, -1, 0, 1]

n = int(input())
nx, ny = 0, 0
arr = ['E', 'S', 'W', 'N']

for i in range(n):
    l = tuple(input().split())
    w = l[0]
    c = int(l[1])
    for j in range(c):
        nx, ny = nx + dx[arr.index(w)], ny + dy[arr.index(w)]

print("{} {}".format(nx, ny))
