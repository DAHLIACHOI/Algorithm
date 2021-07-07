from collections import deque
import queue

def solution(progresses, speeds):
    answer = []

    Q = queue.Queue()
    
    for i in range(len(speeds)):
        count = 0
        dq = deque()
        dq.append(speeds[i])
        dq.append(progresses[i])

        while(dq[-1] < 100):
            temp = dq.popleft()
            dq.append(temp)
            dq.append(dq.popleft() + temp)
            count += 1

        Q.put(count)

    
    max = Q.get()
    num = 1
    print(Q.qsize())
    for i in range(Q.qsize()):
        tmp = Q.get()
        if max >= tmp:
            num += 1
            
        else:
            max = tmp
            answer.append(num)
            num = 1
            
        if Q.qsize() == 0: answer.append(num)

    return answer


progresses = list(map(int,input().split()))
speeds = list(map(int,input().split()))

print(solution(progresses, speeds))
