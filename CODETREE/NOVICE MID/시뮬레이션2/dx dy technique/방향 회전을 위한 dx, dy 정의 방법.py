dir_num = 3
nx, ny = 0, 0
dx, dy = [1, 0, -1, 0], [0, -1, 0, 1]

s = input()
for e in s:
    if e == 'L':
        dir_num = (dir_num - 1 + 4) % 4
    elif e == 'R':
        dir_num = (dir_num + 1) % 4
    else:
        nx, ny = nx + dx[dir_num], ny + dy[dir_num]

print("{} {}".format(nx, ny))
