def solution(arr):
    
    answer = []
    tmp = -1
    for e in arr:
        if tmp != e:
            answer.append(e)
            tmp = e
    
    return answer