function solution(x) {
  let total = 0;
  let num = x;
  while (num > 0) {
    total += num % 10;
    num = Math.floor(num / 10);
  }
  return x % total === 0;
}