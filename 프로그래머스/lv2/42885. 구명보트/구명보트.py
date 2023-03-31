def solution(people, limit):
    people.sort()
    min_index = 0
    max_index = len(people) - 1
    boat = 0
    while min_index <= max_index:
        if people[min_index] + people[max_index] <= limit:
            min_index += 1
        max_index -= 1
        boat += 1
    return boat
