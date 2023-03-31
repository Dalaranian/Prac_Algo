  def solution(str)
    str_num = ""
    oper = true
    str.each_char do |c|
      if c == '-'
        oper = false
      elsif c == '+'
        next
      else
        str_num += c
      end
    end

    num = str_num.to_i
    oper ? num : num * -1
  end

