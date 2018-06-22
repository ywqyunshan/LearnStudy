package com.iigeo.find;

import java.util.Arrays;

/**
 * 二分法查询
 */
public class BinarySearch {

    public int[] ints;

    public BinarySearch(int[] ints){
        this.ints=ints;
    }

    //递归排序
    public int indexof(int start,int end,int key){
        //1.先排序
        Arrays.sort(ints);
        int mIndex=(start+end)/2;
        int mVaule=ints[mIndex];
        //2.递归查找
        if (key<mVaule) {
            return indexof(start,mIndex-1,key);
        }else if (key>mVaule){
            return indexof(mIndex+1,end,key);
        }else {
            return mIndex;
        }

    }

    public int indexofByWhile(int start,int end,int key){
        //1.排序
        Arrays.sort(ints);
        //2.循环查找
        while (start<=end){
            int mIndex=start+(end-start)/2;
            int mVaule=ints[mIndex];
            if (key<mVaule) {
                end=mIndex-1;
            }else if (key>mVaule){
                start=mIndex+1;
            }else {
                return mIndex;
            }
        }
        return -1;
    }

}
