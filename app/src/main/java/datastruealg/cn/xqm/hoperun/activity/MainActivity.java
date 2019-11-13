package datastruealg.cn.xqm.hoperun.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import datastructurealg.cn.xqm.hoperun.datastructurealg.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //二分查找  需为有序数组
        int array[] = {0,2,4,3,9,10,11,12};
        int numSearch = AlgUtils.funBinSearch(array,9);
        Log.e("xqm",""+numSearch);

        int arraySort[] = {9,8,2,4,6,5};
        //冒泡排序
        AlgUtils.funBubbleSort(arraySort);

        //选择排序
        AlgUtils.funSelectionSort(arraySort);

        //快速排序
        AlgUtils.funQuickSort(arraySort,2,5);

        //斐波那契数列
        long funFibNum = AlgUtils.funFib(9);
        long funFibNum2 = AlgUtils.funFib2(9);
        Log.e("xqm",funFibNum+"  " +funFibNum2);




    }
}
