from collections import Counter

def solution(participant, completion):
    
    arr = Counter(participant + completion)
    
    for key, value in arr.items():
        if value % 2 != 0:
            return key
