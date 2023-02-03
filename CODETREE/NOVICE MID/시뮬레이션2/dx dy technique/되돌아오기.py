n = int(input())

arr = [
    list(input().split())
    for _ in range(n)
]

dic = {
    'E' : 0,
    'S' : 1,
    'N' : 2,
    'W' : 3
}

dxs, dys = [0, 1, -1, 0], [1, 0, 0, -1]
x, y = 0, 0
cnt = 0

result = False 

for i in range(n):
    dir_num = dic[arr[i][0]]
    for _ in range(int(arr[i][1])):
        x, y = x + dxs[dir_num], y + dys[dir_num]
        cnt += 1
        if x == 0 and y == 0: 
            result = True
            break
    if x == 0 and y == 0: break

if result:
    print(cnt)
else: print(-1)
