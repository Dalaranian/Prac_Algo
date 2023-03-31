function solution(people, limit) {
  people.sort((a, b) => a - b); // 오름차순 정렬
  let min = 0;
  let max = people.length - 1;
  let boat = 0;
  while (min <= max) {
    if (people[min] + people[max] <= limit) {
      min++;
    }
    max--;
    boat++;
  }
  return boat;
}