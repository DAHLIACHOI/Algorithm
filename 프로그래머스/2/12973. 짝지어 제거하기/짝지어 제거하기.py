def solution(str):
    stack = list()
    
    # str을 돌아가면서 스택에 s가 있으면, pop, 없으면 push
    for s in str:
        if (s in stack) and (s == stack[-1]):
            stack.pop()
        else:
            stack.append(s)
    
    return (0 if stack else 1)
        