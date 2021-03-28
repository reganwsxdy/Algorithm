/**
 * 汉明距离，移位算法
 * */

public class test461 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0){
            if (xor % 2 == 1){
                count ++;
            }
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }
}
