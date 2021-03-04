package com.zhenyue.techcenter.mockserver.algorithm.DivideAndConquer;

import java.util.Random;

/**
 *
 * @ClassName:      DACTest
 * @Description:    分治算法
 * @Author:         邓举名
 * @CreateDate:     12:21 PM 2021/3/1
 * @Version:        1.0
 */
public class DACTest {

    /**
     * @description
     * 1.将 n 个无序的数，进行排序
     *
     * @date: 2021/3/1 12:22 PM
     * @author: 邓举名
     */
    public static void main(String[] args) {

        // 数组初始化
        int n = 9;
        int[] nums = initeIntNum(n);

        // 合并排序
        mergeSortMain(nums);

        // 二分搜索
        binarySearch();

        // 大整数乘法
        karaMain();
    }

    /**
     * 大整数乘法
     */
    private static void karaMain() {

    }

    /**
     * 合并排序
     */
    private static void mergeSortMain(int[] nums) {
        int[] arr = {1, 3, 5, 4, 2, 7, 8, 6, 9};
        int right = arr.length - 1;
        int left = 0;
        mergeSort(arr, left, right);
        for(int i = 0, len =arr.length; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 合并排序 - 合并
     * @param a
     * @param left
     * @param right
     */
    private static void mergeSort(int a[], int left, int right) {
        if(left + 1 < right) {

            int mid = (left + right) / 2;

            // 左递归排序
            mergeSort(a, left, mid);

            // 右递归排序
            mergeSort(a, mid + 1, right);

            // 合并操作
            merge(a, left, mid, right);
        }
    }

    /**
     * 合并排序 - 归并算法
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] arr, int left, int mid, int right) {

        // 右数组索引
        int _rightIndex = mid + 1;

        // 记录初始左索引位置
        int _leftInite = left;

        // 临时数组信息
        int _index = 0;
        int _len = right - left + 1;
        int[] _tempArra = new int[_len];

        while (left <= mid && right >= mid + 1) {
            if(arr[left] < arr[right]) {
                _tempArra[_index++] = arr[left++];
            }else {
                _tempArra[_index++] = arr[_rightIndex++];
            }
        }

        // 右数组有剩余
        if (left > mid) {
            for(; _rightIndex <= right; _rightIndex++) {
                _tempArra[_index++] = arr[_rightIndex];
            }
        }

        // 左数组有剩余
        if(_rightIndex > right) {
            for(; left <= mid; left++) {
                _tempArra[_index++] = arr[left];
            }
        }

        // 最后将 arr 数组进行替换
        for(int j = 0, len = _tempArra.length; j < len; j++) {
            arr[_leftInite++] = _tempArra[j];
        }

    }

    /**
     * 二分搜索算法
     */
    private static void binarySearch() {

    }

    /**
     * 数组初始化
     * @param n
     */
    private static int[] initeIntNum(int n) {
        int[] nums = new int[n];
        Random rand =new Random();
        for(int i = 0; i < n; i++) {
            int _tempInt = rand.nextInt(10000);
            nums[i] = _tempInt;
        }
        return nums;
    }
}
