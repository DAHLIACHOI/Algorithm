answer, n = 0,0
visited = []

def dfs(k, cnt, dungeons):
    global answer, visited
    answer = max(answer, cnt)
    
    for j in range(n):
        if dungeons[j][0] <= k and not visited[j]:
            visited[j] = 1
            dfs(k - dungeons[j][1], cnt + 1, dungeons)
            visited[j] = 0
    


def solution(k, dungeons):
    global n, visited
    n = len(dungeons)
    visited = [0] * n
    dfs(k, 0, dungeons)
    return answer