package com.benz.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Copyright to ShenZhen Sinosun Technology Co.,LTD 2016-2018
 * @Classname:
 * @Project: MSTP
 * @Package: 
 * @Description:
 * @Author:Jiazhen.Ben
 * @Version: 
 * @Date： 
 * @History：
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr={2,1,6,4,8};
		bubblSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubblSort(int arr[],int left,int right)
	{
		
			for(int i = 0 ;i < arr.length;i++)
			{
				boolean isSorted = false;
				for(int j = i+1;j < arr.length;j++)
				{
					if(arr[j] < arr[j-1])
					{
						isSorted = true;
						swap(arr, j, j-1);
					}
				}
				
				if(isSorted)
				{
					break;
				}
			}
		
	}
	public static void swap(int[] data, int i, int j) {
		if (i == j) {
			return;
		}
		data[i] = data[i] + data[j];
		data[j] = data[i] - data[j];
		data[i] = data[i] - data[j];
	}
}
