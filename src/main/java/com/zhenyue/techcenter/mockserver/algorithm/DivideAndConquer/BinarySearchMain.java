package com.zhenyue.techcenter.mockserver.algorithm.DivideAndConquer;

/**
 *
 * @ClassName:      BinarySearchMain
 * @Description:    二分查找 / 分治的思想
 * @Author:         邓举名
 * @CreateDate:     10:40 AM 2021/3/5
 * @Version:        1.0
 */
public class BinarySearchMain {

    public static void main(String[] args) {

        // 信息初始化
        int[] nums = {1, 2, 5, 7, 8, 9};
        int searchNum = 9;
        int left = 0;
        int right = nums.length - 1;
        int searchIndex = (right - left) / 2;

        // 二分查找
        binarySearch(nums, searchNum, left, searchIndex, right);
    }

    private static void binarySearch(int[] nums, int searchNum, int left, int searchIndex, int right) {

        // 信息输出
        if(nums[searchIndex] == searchNum) {
            System.out.println("所在位置为：" + searchIndex);
            return;
        }

        if(searchIndex == right) {
            for(;searchIndex <= right; searchIndex++) {
                if(nums[searchIndex] == searchNum) {
                    System.out.println("所在位置为：" + searchIndex);
                    return;
                }
            }
            System.out.println("没有");
            return;
        }

        if(searchIndex == left) {
            for(;left <= searchIndex; left++) {
                if(nums[left] == searchNum) {
                    System.out.println("所在位置为：" + left);
                    return;
                }
            }
            System.out.println("没有");
            return;
        }

        // 左遍历
        if(nums[searchIndex] < searchNum) {
            int _index = (right - searchIndex) / 2;
            int _searchIndex = _index + searchIndex;
            binarySearch(nums, searchNum, searchIndex, _searchIndex, right);
        }

        // 右遍历
        if(nums[searchIndex] > searchNum) {
            int _index = (searchIndex - left) / 2;
            int _searchIndex = _index + left;
            binarySearch(nums, searchNum, left, _searchIndex, searchIndex);
        }
    }
}
