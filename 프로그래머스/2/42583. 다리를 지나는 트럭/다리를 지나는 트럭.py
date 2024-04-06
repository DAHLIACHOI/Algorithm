from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    tmp_weight = 0
    
    # 대기 큐
    wait_q = deque(truck_weights)
    # 브릿지 큐
    bridge_q = deque([0] * bridge_length)
    bridge_weight = 0
    
    while True:
        
        if len(wait_q) == 0:
            return answer + bridge_length
        
        bridge_weight -= bridge_q.popleft()
        
        # 만약에 다리 길이가 충분하고, 무게가 가능하다면
        # 대기 큐에서 빼고, 브릿지 큐에 넣기
        if len(bridge_q) < bridge_length and bridge_weight  + wait_q[0] <= weight:
            truck = wait_q.popleft()
            bridge_q.append(truck)
            # 다리에 무게 추가
            bridge_weight += truck
            
        # 만약에 다리 길이가 충분하지 않거나 무게가 불가능하다면
        else:
            bridge_q.append(0)
            
        answer += 1
            
            