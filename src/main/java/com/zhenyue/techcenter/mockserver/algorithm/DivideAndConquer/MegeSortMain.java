package com.zhenyue.techcenter.mockserver.algorithm.DivideAndConquer;

/**
 *
 * @ClassName:      MegeSortMain
 * @Description:    归并排序
 * @Author:         邓举名
 * @CreateDate:     9:33 AM 2021/3/4
 * @Version:        1.0
 */
public class MegeSortMain {
    public static void main(String[] args) {

        // 初始化数组
        int[] nums = {1, 3, 2, 5, 6, 4, 7, 9, 8};

        int initeLeft = 0;
        int initeRight = nums.length - 1;
        mergeSort(nums, initeLeft, initeRight);

        // 输出
        for(int i = 0, len = nums.length; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void mergeSort(int[] nums, int left, int right) {

        int mid = (right + left) / 2;

        if(left < right) {
            // 分治
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            // 合并
            merge(nums, left, mid, right);
        }
    }

    /**
     * @description 归并算法
     * @date: 2021/3/4 9:54 AM
     * @author: 邓举名
     */
    private static void merge(int[] nums, int left, int mid, int right) {

        // 信息存储
        int initeLeft = left;
        int _rightIndex = mid + 1;

        // 临时数组
        int arrIndex = 0;
        int arrLen = right - left + 1;
        int[] arr = new int[arrLen];

        while (left <= mid && _rightIndex <= right){
            if(nums[left] < nums[_rightIndex]) {
                arr[arrIndex++] = nums[left++];
            }else {
                arr[arrIndex++] = nums[_rightIndex++];
            }
        }

        while (left <= mid) {
            arr[arrIndex++] = nums[left++];
        }

        while (_rightIndex <= right) {
            arr[arrIndex++] = nums[_rightIndex++];
        }

        for(int i = 0; i < arr.length; i++) {
            nums[initeLeft + i] = arr[i];
        }
    }
}
