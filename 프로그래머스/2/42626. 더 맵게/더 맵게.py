import heapq

def solution(scoville, K):
    answer = 0
    
    h = []
    for food in scoville:
        heapq.heappush(h, food)
        
    while True:
        try:
                    # 첫번째 음식
            food1 = heapq.heappop(h)
        
            if food1 >= K:
                return answer
        
            # 두번째 음식
            food2 = heapq.heappop(h)
        
            heapq.heappush(h, food1 + food2*2)
            answer += 1
        except:
            return -1
            
        
        
    
    
    return answer