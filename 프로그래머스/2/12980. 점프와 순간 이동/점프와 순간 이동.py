def solution(n):
    ans = 0
    
    while n > 0:
        # n에서 2를 나눈 나머지가 존재한다면, ans 카운드
        if n % 2 != 0:
            ans += 1
        
        # n을 절반으로 나누기
        n = n // 2

    return ans