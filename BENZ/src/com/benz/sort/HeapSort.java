/**
 * 堆排序  堆积排序(Heapsort)是指利用堆积树（堆）这种资料结构所设计的一种排序算法，可以利用数组的特点快速定位指定索引的元素。堆排序是不稳定的排序方法，辅助空间为O(1)， 最坏时间复杂度为O(nlog2n) ，堆排序的堆序的平均性能较接近于最坏性能
 * 用大根堆排序的基本思想

① 先将初始文件R[1..n]建成一个大根堆,此堆为初始的无序区

② 再将关键字最大的记录R[1](即堆顶)和无序区的最后一个记录R[n]交换，由此得到新的无序区R[1..n-1]和有序区R[n]，且满足R[1..n-1].keys≤R[n].key

③由于交换后新的根R[1]可能违反堆性质，故应将当前无序区R[1..n-1]调整为堆。然后再次将R[1..n-1]中关键字最大的记录R[1]和该区间的最后一个记录R[n-1]交换，由此得到新的无序区R[1..n-2]和有序区R[n-1..n]，且仍满足关系R[1..n-2].keys≤R[n-1..n].keys，同样要将R[1..n-2]调整为堆。

……

直到无序区只有一个元素为止。
 */
package com.benz.sort;
import java.util.Arrays;

public class HeapSort {
		public static void main(String[] args) {
			int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3 };

			System.out.println("Before heap:");
			System.out.println(Arrays.toString(array));

			heapSort(array);

			System.out.println("After heap sort:");
			System.out.println(Arrays.toString(array));
		}

		public static void heapSort(int[] array) {
			if (array == null || array.length <= 1) {
				return;
			}

			buildMaxHeap(array);

			for (int i = array.length - 1; i >= 1; i--) {
				swap(array, 0, i);

				maxHeap(array, i, 0);
			}
		}

		private static void buildMaxHeap(int[] array) {
			if (array == null || array.length <= 1) {
				return;
			}

			int half = array.length / 2;
			for (int i = half; i >= 0; i--) {
				maxHeap(array, array.length, i);
			}
		}

		private static void maxHeap(int[] array, int heapSize, int index) {
			int left = index * 2 + 1;
			int right = index * 2 + 2;

			int largest = index;
			if (left < heapSize && array[left] > array[index]) {
				largest = left;
			}

			if (right < heapSize && array[right] > array[largest]) {
				largest = right;
			}

			if (index != largest) {
				swap(array, index, largest);

				maxHeap(array, heapSize, largest);
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