class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFactors = new HashSet<>();
        for (int num : nums) findPrimeFactors(num, primeFactors);
        return primeFactors.size();
    }

    private void findPrimeFactors(int num, Set<Integer> primeFactors) {
        while (num % 2 == 0){primeFactors.add(2); num /= 2;}
        
        for (int i = 3; i * i <= num; i += 2) {  
            while (num % i == 0) {primeFactors.add(i); num /= i;}
        }
        if (num > 1) primeFactors.add(num);  
    }
}