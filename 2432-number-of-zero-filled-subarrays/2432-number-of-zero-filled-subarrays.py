class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        zero = res = 0
        for i in nums: 
            if i == 0:
                zero += 1
                res += zero
            else : zero = 0
        return res