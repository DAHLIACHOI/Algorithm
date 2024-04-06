def solution(array, commands):
    answer = []
    
    for start, end, k in commands:
        slicing = array[start - 1: end]
        slicing.sort()
        answer.append(slicing[k - 1])
    
    return answer