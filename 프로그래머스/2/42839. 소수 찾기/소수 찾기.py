from itertools import permutations

def is_prime_number(x):
    if x == 0 or x == 1:
        return False
    
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def solution(numbers):
    
    answers = set()
    
    numbers = list(numbers)
    answer = 0
    com = []
    
    for i in range(1, len(numbers) + 1):
        com += list(permutations(numbers, i))
    
    for c in com:
        answers.add(int (''.join(c)))
        
    for number in answers:
        if is_prime_number(number):
            answer += 1
    
    return answer