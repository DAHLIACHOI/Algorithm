from collections import deque

def solution(progresses, speeds):
    answer = []
    
    q = deque(progresses)
    speeds = deque(speeds)
    
    while True:
        cnt = 0
        
        if len(q) == 0: break
        
        for i, s in enumerate(speeds):
            q[i] += s
                
        if q[0] >= 100:
            while True:
                if len(q) == 0 or q[0] < 100: break
                
                q.popleft()
                speeds.popleft()
                cnt += 1
            answer.append(cnt)

    return answer