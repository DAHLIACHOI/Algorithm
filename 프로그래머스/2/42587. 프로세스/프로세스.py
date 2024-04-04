import queue

def solution(priorities, location):
    
    answer = 0
    q = queue.Queue()
    
    for i, p in enumerate(priorities):
        q.put((p, i))
    
    # 크기대로 정렬
    compare = sorted(priorities)
    answer = 0
    
    # q가 사라질 때까지
    while q.qsize() > 0:
        # 일단 처음 요소 꺼내기
        element = q.get()
        
        # 만약 꺼낸 값보다 큰 값이 있다면 다시 넣기
        if element[0] < compare[-1]:
            q.put(element)
        # 더 큰 값이 없다면 해당 요소 그대로 pop, i --
        else:
            answer += 1
            compare.pop()
            # 만약에 pop한 인덱스가 내가 원하던 값이면 return
            if element[1] == location:
                return answer
            
        
        