import heapq

def solution(scoville, K):
    answer = 0
    
    heapq.heapify(scoville)
        
    while True:
        try:
            # 첫번째 음식
            food1 = heapq.heappop(scoville)
        
            if food1 >= K:
                return answer
        
            # 두번째 음식
            food2 = heapq.heappop(scoville)
        
            heapq.heappush(scoville, food1 + food2*2)
            answer += 1
        except:
            return -1
            
        
        
    
    
    return answer