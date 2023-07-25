def solution(s):
    count = 0
    removed = 0
    
    while True:
        if s == "1":
            break
        elif s != "1":
            binary_str = ""
            for c in s:
                if c == '0':
                    removed += 1
                else:
                    binary_str += c
            s = bin(len(binary_str))[2:]
        count += 1
        
    return [count, removed]