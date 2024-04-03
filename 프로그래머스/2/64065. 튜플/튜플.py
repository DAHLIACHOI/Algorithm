def solution(s):
    answer = []
    s = s.strip('{}')
    str = s.strip('{}').split('},{')
    l = [list(map(int, st.split(','))) for st in s.strip('{}').split('},{')]
    l.sort(key=len)
        
    for elements in l:
        for e in elements:
            if e not in answer:
                answer.append(e)
                
    return answer