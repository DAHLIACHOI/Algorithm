from collections import Counter

def solution(nums):
    answer = 0
    dic = Counter(nums)
    n = len(nums) // 2
    
    return min(n, len(dic))