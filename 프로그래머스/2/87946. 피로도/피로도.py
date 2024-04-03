from itertools import permutations

def solution(k, dungeons):
    answer = -1
    
    for per in permutations(dungeons, len(dungeons)):
        tmp_k = k
        cnt = 0
        for p in per:
            if tmp_k >= p[0]:
                tmp_k -= p[1]
                cnt += 1
            else:
                break
                
        answer = max(answer, cnt)
        
    
    return answer