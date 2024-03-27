def solution(n, words):
    
    # 이전에 말한 단어 저장
    previous_word = words[0]
    # 이전동안 말한 단어 저장
    previous_words = [words[0]]
    
    for i in range(1, len(words)):
        # 끝말잇기가 되지 않거나, 이전에 말했던 문자라면 리턴
        if (previous_word[-1] != words[i][0]) or (words[i] in previous_words):
            return [ i%n + 1, i//n + 1]
        
        previous_words.append(words[i])
        previous_word = words[i]
        
    return [0, 0]