#그냥 리스트로 풀이
def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    for i in range(len(participant)):
        if i == len(participant)-1 or participant[i] != completion[i]:
            return participant[i]



#딕셔너리(해쉬) 사용해서 풀이
def solution(participant, completion):
    participant.sort()
    completion.sort()
    last = len(participant) -1
    p = dict()
    c = dict()
    for i in range(last):
        p[i] = participant[i]
        c[i] = completion[i]
    p[last] = participant[-1]

    for i in range(last+1):
        if i == last or p[i] != c[i]:
            return p[i]
