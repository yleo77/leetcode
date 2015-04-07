# @param {Integer} n, a positive integer
# @return {Integer}
def hamming_weight(n)
    
  n = n.to_s(2).split('')
  ret = 0
  while n.length > 0 do
    ret += 1 if n.pop == '1'
  end
  ret
end
