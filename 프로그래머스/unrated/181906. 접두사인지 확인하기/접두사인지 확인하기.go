func solution(my_string string, is_prefix string) int {
    if len(is_prefix) > len(my_string) {
        return 0
    }
    
    for i := 0; i < len(is_prefix); i++ {
        if my_string[i] != is_prefix[i] {
            return 0
        }
    }
    
    return 1
}