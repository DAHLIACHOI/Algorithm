def solution(answers):
    answer = []    
    ms = [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    ]
    check = [0] * len(ms)
    
    for i, a in enumerate(answers):
        for j, m in enumerate(ms):
            if m[i % len(m)] == a:
                check[j] += 1
        
    max_answer = max(check)
    for i, c in enumerate(check):
        if c == max_answer:
            answer.append(i + 1)
        
    return answer