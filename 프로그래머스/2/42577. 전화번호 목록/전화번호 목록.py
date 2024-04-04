def solution(phone_book):
    answer = True
    
    phone_book.sort()
    tmp = '-1'

    for phone in phone_book:
        n = len(tmp)
        # 이전꺼랑 접두사가 일치하면
        if phone[:n] == tmp:
            return False
        else:
            tmp = phone
            
    
    
    return answer