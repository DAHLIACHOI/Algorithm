dxs, dys = [1, 0, -1, 0], [0,-1, 0, 1]
x, y = 0, 0
dir_num = 3

string = input()
time = 0
result = False
cnt = 0

for s in string:
    if s == 'F':
        x, y = x + dxs[dir_num], y + dys[dir_num]
    elif s == 'L':
        dir_num = (dir_num + 3) % 4
    else:
        dir_num = (dir_num + 1) % 4
    cnt += 1
    if x == 0 and y == 0: 
        result = True
        break

if result:
    print(cnt)
else:
    print(-1)
