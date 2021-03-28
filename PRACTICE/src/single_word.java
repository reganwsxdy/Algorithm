public class single_word {
    public static int count_single(String s) {
        int count = 1;
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += count * (count + 1) / 2;//到这里是满足上一个子串的要求
                count = 1;
            }
        }
        ans += count*(count+1)/2;
        return ans;
    }
}
