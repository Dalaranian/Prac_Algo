func solution(num_list []int) int {
    for i := 0;i <= len(num_list) -1;i++{
        if num_list[i] < 0 {
            return i
        }
    }
    return -1
}