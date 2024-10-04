import java.util.Arrays;

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0, j = skill.length - 1;
        long ans = 0;
        long sum = skill[i] + skill[j];  
        while (i < j) {
            if (skill[i] + skill[j] != sum) { 
                return -1;
            }
            ans += (long) skill[i] * skill[j];
            i++;
            j--;
        }
        return ans;
    }
}
