def solution(s):
    words = s.split(" ")

    p_word1 = []

    for word in words:
        p_word2 = []
        for i in range(len(word)):
            if i == 0:
                p_word2.append(word[i].upper())
            else:
                p_word2.append(word[i].lower())

        p_word1.append(''.join(p_word2))

    return " ".join(p_word1)