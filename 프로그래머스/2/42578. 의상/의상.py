def solution(clothes):
    answer = 1
    dic = {}
    
    for c in clothes:
        key = c[1]
        if key in dic:
            dic[key] += 1
        else:
            dic[key] = 1
            
    for value in dic.values():
        answer = answer * (value + 1)
    
    
    return answer - 1