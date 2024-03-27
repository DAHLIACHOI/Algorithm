def solution(people, limit):
    answer = 0
    lt, rt = 0, len(people) - 1
    # 오름차순으로 정렬
    people.sort()
    
    while lt < rt:
        
        if people[lt] + people[rt] <= limit:
            answer += 1
            rt -= 1
            lt += 1
        else:
            answer += 1
            rt -= 1
    
    
    return answer if lt > rt else answer + 1