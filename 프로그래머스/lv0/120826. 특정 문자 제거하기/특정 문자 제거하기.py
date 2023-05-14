def solution(my_string, letter):
    result = [c for c in my_string if c != letter]
    return "".join(result)