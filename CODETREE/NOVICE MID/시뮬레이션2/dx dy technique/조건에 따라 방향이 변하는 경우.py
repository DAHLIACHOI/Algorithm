dic = {
    'R' : 0,
    'D' : 1,
    'U' : 2,
    'L' : 3
}

dxs, dys = [0, 1, -1, 0], [1, 0, 0, -1]

l = list(map(int, input().split()))
n, t = l[0], l[1]

r, c, L = tuple(input().split())
r, c = int(r), int(c)

def in_range(x, y):
    return 1 <= x and x <= n and 1 <= y and y <= n

dir_num = dic[L]

for i in range(t):
    nx, ny = r + dxs[dir_num], c + dys[dir_num]
    if not in_range(nx, ny):
        dir_num = 3 - dir_num 
    else:
        r, c = r + dxs[dir_num], c + dys[dir_num]

print(r, c)
