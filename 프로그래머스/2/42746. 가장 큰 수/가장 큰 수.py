import functools
 
#  t1이 크다면 1  // t2가 크다면 -1  //  같으면 0
def comparator(a,b):
    t1, t2 = a+b, b+a
    return (int(t1) > int(t2)) - (int(t1) < int(t2)) 
 
def solution(numbers):
    n = list(map(str, numbers))
    n = sorted(n, key=functools.cmp_to_key(comparator),reverse=True)
    answer = str(int(''.join(n)))
    return answer