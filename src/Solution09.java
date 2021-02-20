import java.math.BigInteger;

/**
 * 题目9：一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶，
 *      求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class Solution09 {

    //递归
    public static BigInteger recursionCountJumpMethods(int n) {
        if (n <= 0) {
            return BigInteger.valueOf(0);
        }
        if (n == 1) {
            return BigInteger.valueOf(1);
        }
        if (n == 2) {
            return BigInteger.valueOf(2);
        }
        return recursionCountJumpMethods(n - 1).add(recursionCountJumpMethods(n - 2));
    }

    //循环
    public static BigInteger recurrenceCountJumpMethods(int n) {
        BigInteger[] jumpMethods = new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(2)};
        if (n <= 2) {
            return jumpMethods[n];
        }
        BigInteger minusOne = BigInteger.valueOf(2);
        BigInteger minusTwo = BigInteger.valueOf(1);
        BigInteger methods = BigInteger.valueOf(2);
        for (int i = 3; i <= n; i++) {
            methods = minusOne.add(minusTwo);
            minusTwo = minusOne;
            minusOne = methods;
        }
        return methods;
    }
}
