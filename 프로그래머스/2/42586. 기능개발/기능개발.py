from collections import deque

def solution(progresses, speeds):
    answer = []
    
    q = deque(progresses)
    cnt = 0

    while True:
        if len(q) == 0: break
        
        # 개발 속도 추가해주기
        for i in range(len(q)):
            q[i] += speeds[i]
            
        if q[0] >= 100:
            while True:
                if len(q) == 0 or q[0] < 100: break
                cnt += 1
                del speeds[0]
                q.popleft()
            answer.append(cnt)
            cnt = 0
    
    return answer