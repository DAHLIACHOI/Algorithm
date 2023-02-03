n, m = tuple(input().split())
n, m = int(n), int(m)

s = input()
arr = [
    list(map(int, input().split()))
    for _ in range(n)
]

dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]

r, c = (n // 2), (n // 2) 
sum = arr[r][c]
dir_num = 3

def is_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < n

for e in s:
    if e == 'R':
        dir_num = (dir_num + 1) % 4
    elif e == 'L':
        dir_num = (dir_num + 3) % 4
    else:
        nx, ny = r + dx[dir_num], c + dy[dir_num]
        if is_range(nx, ny):
            r, c =  r + dx[dir_num], c + dy[dir_num]
            sum += arr[r][c]

print(sum)
