arr = list(map(int, input().split()))
n, m = arr[0], arr[1]

answer = [
    list(0 for _ in range(m))
    for _ in range(n)
]

dxs, dys = [0, 1, 0, -1], [1, 0, -1, 0]
dir_num = 0
x, y = 0, 0

answer[x][y] = 1

def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < m

for i in range(2, n * m + 1):
    nx, ny = x + dxs[dir_num], y + dys[dir_num]
    if not in_range(nx, ny) or answer[nx][ny] != 0:
        dir_num = (dir_num + 1) % 4
    x, y = x + dxs[dir_num], y + dys[dir_num]
    answer[x][y] = i

for row in answer:
    for col in row:
        print(col, end = ' ')
    print()
