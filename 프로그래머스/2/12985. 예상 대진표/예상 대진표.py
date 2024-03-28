def win(winner):
    # 짝수면
    if winner % 2 == 0:
        return winner // 2
    # 홀수면
    return winner // 2 + 1
    

def solution(n,a,b):
    answer = 0
    
    while True:
        # 만약에 1차이나면 break
        if (a//2) != (b//2) and abs(a - b) == 1:
            answer += 1
            break
        a = win(a)
        b = win(b)
        answer += 1
    
    return answer