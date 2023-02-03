n, m = tuple(input().split())
n, m = int(n), int(m)

arr = [
    [0] * n
    for _ in range(n)
]

rc = [
    list(map(int, input().split()))
    for _ in range(m)
]

dxs, dys = [0, 1, -1, 0], [1, 0, 0, -1]

def is_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < n

for row in rc:
    cnt = 0
    r, c = row[0]-1, row[1]-1
    arr[r][c] = 1
    for i in range(4):
        nx, ny = r + dxs[i], c + dys[i]
        if is_range(nx, ny) and arr[nx][ny]:
            cnt += 1
    if cnt == 3: print(1)
    else: print(0)
