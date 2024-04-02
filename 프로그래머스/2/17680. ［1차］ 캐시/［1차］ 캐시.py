from collections import deque

def solution(cacheSize, cities):
    answer = 0
    
    # 큐 선언
    q = deque()
    
    for city in cities:
        
        city = city.upper()
        # 만약에 캐시 안에 있다면
        if city in q:
            # 큐 안에 들어있던 city 제거하고, 새로 넣기
            q.remove(city)
            q.append(city)
            answer += 1
        
        else:
            if cacheSize != 0:
                if len(q) == cacheSize:
                    q.popleft()
            
                q.append(city)
            answer += 5
            

    return answer