package com.atdk.git.quna.two;

import java.math.BigDecimal;

/**
 * 大数，求平方 n 次方函数
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 解密
     *
     * @param encryptedNumber int整型 待解密数字
     * @param decryption      int整型 私钥参数D
     * @param number          int整型 私钥参数N
     * @return int整型
     */
    public int Decrypt(int encryptedNumber, int decryption, int number) {
        // write code here
        BigDecimal a = BigDecimal.valueOf(encryptedNumber);
        BigDecimal pow = a.pow(decryption);
        BigDecimal[] bigDecimals = pow.divideAndRemainder(BigDecimal.valueOf(number));
        return Integer.valueOf(bigDecimals[1].toString());
    }

    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(4296);
        BigDecimal pow = a.pow(1601);
        BigDecimal[] bigDecimals = pow.divideAndRemainder(BigDecimal.valueOf(4757));
    }
}