from collections import Counter

def solution(k, tangerine):
    answer = 0
    total = 0
    
    counter = Counter(tangerine)
    counter = sorted(counter.items(), key = lambda x : x[1], reverse = True)
    
    for x in counter:
        total += x[1]
        
        if total >= k:
            answer += 1
            break
        answer += 1
    
    return answer