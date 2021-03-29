package com.zhenyue.techcenter.mockserver.algorithm.DivideAndConquer;

/**
 *
 * @ClassName:      MultiplyStringsMain
 * @Description:    大整数乘法
 * @Author:         邓举名
 * @CreateDate:     11:23 AM 2021/3/8
 * @Version:        1.0
 */
public class MultiplyStringsMain {

    public static void main(String[] args) {

        // 信息初始化 aNum * bNum
        int aNum = 1356;
        int bNum = 125678;

        // 获取位信息
        String aStr = String.valueOf(aNum);
        String bStr = String.valueOf(bNum);
        int aNo = aStr.length() / 2;
        int bNo = bStr.length() / 2;

        // 分解
        divideNum();

        // 合并 - 将所有的数加起来
        // mergeNum();
    }

    private static void divideNum() {
    }
}
