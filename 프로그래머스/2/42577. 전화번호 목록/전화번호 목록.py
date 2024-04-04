def solution(phone_book):
    answer = True
    
    phone_book.sort()

    for phone in zip(phone_book, phone_book[1:]):
            if phone[1].startswith(phone[0]):
                return False
    
    
    return answer