# (yellow 가로 * 2) + (yellow 세로 * 2) + 4 = 갈색 블록
def solution(brown, yellow):
    answer = []

    for b in range(1, yellow + 1):
        if yellow % b == 0:
            a = yellow // b
            if a >= b:
                if (a * 2) + (b * 2) + 4 == brown:
                    return [a + 2, b + 2]

    
    # return answer