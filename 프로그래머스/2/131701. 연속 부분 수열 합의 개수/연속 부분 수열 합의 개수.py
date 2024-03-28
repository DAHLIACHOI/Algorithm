def solution(elements):
    answer = 0
    sums = set() 
    n = len(elements)
    
    # n의 길이까지 수열 구하기 때문에 1부터 n까지
    for i in range(1, n + 1):
        
        for j in range(n):
            # 만약에 더해야 되는 수열이 리스트를 넘어간다면 
            if i + j > n:
                sums.add(sum(elements[j:] + elements[:i + j - n]))
            else: 
                sums.add(sum(elements[j:j + i]))

    return len(sums)