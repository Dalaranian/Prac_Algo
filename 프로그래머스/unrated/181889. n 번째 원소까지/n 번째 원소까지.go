func solution(num_list []int, n int) []int {
    var result []int
    
    for i := 0; i < n; i++ {
        result = append(result, num_list[i])
    }
    
    return result
}