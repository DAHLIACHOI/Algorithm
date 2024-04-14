def solution(sizes):
    
    w_max = 0
    h_max = 0
    
    for w, h in sizes:
        
        # 만약에 세로가 가로보다 길다면 둘이 바꾸기
        if h > w:
            w, h = h, w
        
        # 만약에 명함 가로 길이가 기존 지갑 크기보다 크다면
        if w > w_max:
            w_max = w
        if h > h_max:
            h_max = h
    
    return h_max * w_max