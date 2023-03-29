def solution(x)
  total = 0
  num = x
  while num > 0 do
    total += num % 10
    num /= 10
  end
  return x % total == 0
end