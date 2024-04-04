def solution(str):
    stack = []
    
    for s in str:
        if s == ')' and '(' in stack:
            stack.pop()
        else:
            stack.append(s)

    return True if len(stack) == 0 else False