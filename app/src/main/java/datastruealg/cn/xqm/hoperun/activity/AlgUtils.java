package datastruealg.cn.xqm.hoperun.activity;

/**
 * Created by xueqiaoming on 2019/10/12.
 */

public class AlgUtils {
    //给定有序查找表array 二分查找给定的值data
    //查找成功返回下标 查找失败返回-1
    static int funBinSearch(int[] array, int data) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (data == array[mid]) {
                return mid;
            } else if (data < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    // 冒泡排序 注意 flag 的作用
    static void funBubbleSort(int[] array) {

        boolean flag = true;

        for (int i = 0; i < array.length - 1 && flag; i++) {

            flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    flag = true;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /**
     * 简单选择排序
     * 简单选择排序的思想是：设排序序列的记录个数为n，进行n-1次选择，每次在n-i+1(i = 1,2,...,n-1)个记录中选择关键字最小的记录作为有效序列中的第i个记录。
     * 例如，排序序列(3,2,1,5)的过程是，进行3次选择，第1次选择在4个记录中选择最小的值为1，放在第1个位置，得到序列(1,3,2,5)，第2次选择从位置1开始的3个元素
     * 中选择最小的值2放在第2个位置，得到有序序列(1,2,3,5)，第3次选择因为最小的值3已经在第3个位置不需要操作，最后得到有序序列（1,2,3,5）。。
     * @param array
     */
    static void funSelectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int mink = i;

            // 每次从未排序数组中找到最小值的坐标
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[mink]) {
                    mink = j;
                }
            }

            // 将最小值放在最前面
            if (mink != i) {
                int temp = array[mink];
                array[mink] = array[i];
                array[i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }



    // 快速排序
    static void funQuickSort(int[] mdata, int start, int end) {
        if (end > start) {
            int pivotIndex = quickSortPartition(mdata, start, end);
            funQuickSort(mdata, start, pivotIndex - 1);
            funQuickSort(mdata, pivotIndex + 1, end);
        }
    }

    // 快速排序前的划分
    static int quickSortPartition(int[] list, int first, int last) {

        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }



    //斐波那契数列 递归实现

    /**
     * 斐波那契数列，又称黄金分割数列、因数学家列昂纳多·斐波那契以兔子繁殖为例子而引入，
     * 故又称为“兔子数列”，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……在数学上，
     * 斐波纳契数列以如下被以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）。
     * @param index
     * @return
     */
    static long funFib(long index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return funFib(index - 1) + funFib(index - 2);
        }
    }


    static long funFib2(long index) {

        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (index == 0) {
            return f0;
        } else if (index == 1) {
            return f1;
        } else if (index == 2) {
            return f2;
        }

        for (int i = 3; i <= index; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }

        return f2;
    }


}
