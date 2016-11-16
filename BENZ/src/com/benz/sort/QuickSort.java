package com.benz.sort;

import java.util.Arrays;

/**
 * 快速排序 不稳定 O(n2) 最好O(nlogn)
 * 
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: MSTP
 * @Package:
 * @Description:
 * @Author:Jiazhen.Ben
 * @Version: @Date： @History：
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr={2,1,6,4,8};
		QuickSort.Sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void Sort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = partitioni(arr, left, right);
			Sort(arr, left, mid-1);
			Sort(arr, mid+1, right);
		}
	}
	private static int Partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		int temp;
		for (int j = left; j < right; j++) {
			if(arr[j] < pivot)
			{
				temp = arr[j];
				arr[j] = arr[++i];
				arr[i] = temp;
			}
		}
		temp = arr[++i];
		arr[i] = arr[right];
		arr[right] = temp;
		return i;
	}
	private static int partitioni(int[]arr,int left,int right)
	{
		int pivot = arr[left];
		
		while(left<right && arr[right]>pivot)
		{
			right--;
		}
		arr[left] = arr[right];
		while(left < right && arr[left] < pivot)
		{
			left++;
		}
		arr[right] = arr[left];
		
		arr[left] = pivot;
		
		return left;
		
	}
}
