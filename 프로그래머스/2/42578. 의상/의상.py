def solution(clothes):
    answer = 1
    dic = {}
    
    # 종류별로 카운트
    for c in clothes:
        if c[1] in dic.keys():
            dic[c[1]] += 1
        else:
            dic[c[1]] = 1
    
    for d in dic.values():
        answer *= (d + 1)
    
    return answer - 1