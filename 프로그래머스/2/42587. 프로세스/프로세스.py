import queue
def solution(priorities, location):
    answer = 0
    
    q = queue.Queue()
    
    # 인덱스 번호랑 같이 넣기
    for i, p in enumerate(priorities):
        q.put((i, p))
    
    # 큰 수대로 정렬해서 큰 값 비교하기
    priorities = sorted(priorities)
    
    while q.qsize() > 0:
        # 처음거 먼저 빼기
        process = q.get()
        
        # 만약에 더 큰 값이 있다면 다시 큐에 넣기
        if process[1] < priorities[-1]:
            q.put(process)
        
        # 아니라면 그대로 pop 시키고, 정렬되어있는 마지막 값 제거
        else:
            priorities.pop()
            answer += 1
            
            if process[0] == location:
                return answer