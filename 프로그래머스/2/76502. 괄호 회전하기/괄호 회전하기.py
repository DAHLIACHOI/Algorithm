def solution(str):
    answer = 0
    
    # s길이 만큼 회전
    for i in range(len(str)):
        stack = []
        for s in str:
            if len(stack) == 0 : 
                stack.append(s)
                continue
            
            if stack[-1] == '(' and s == ')':
                stack.pop()
            elif stack[-1] == '{' and s == '}':
                stack.pop()
            elif stack[-1] == '[' and s == ']':
                stack.pop()
            else:
                stack.append(s)
        if len(stack) == 0: 
            answer += 1
        # 왼쪽으로 회전
        str = str[1:] + str[:1]
                
    return answer