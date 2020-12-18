package arithmetic;

/**
 * @Author: yxm
 * @Date: 2020/12/18 15:46
 * @Emial: yxm1136656235@163.com
 */
public class ErFenFa {

    /**
     * 二分法  必须要求数组排列有序
     */

    public static int ErFenFa(int[] array,int a){
        int lo = 0;         //定义头
        int hi = array.length - 1; //定义尾
        int mid;    //定义中间
        while (lo <= hi){   //当尾数一直小于等于头的时候，说明还在二分查找中
             mid = (lo + hi) / 2; //这时中间数应该是头尾相加除以二   这是下标  不论数组重元素个数是单是双，因为int会自动取整
            if (array[mid] < a){    //当中间下标的元素小于要被查找的元素时，说明被查找的元素a在数组的右边
                lo = mid + 1;       //则把左边的一部分去掉，重新更换数组的头为mid+1
            }else if (array[mid] > a){  //中间下标的元素大于要被查找的元素时，说明被查找的元素a在数组的左边
                hi = mid - 1;       //则把右边的一部分去掉，重新更换数组的尾为mid-1
            }else {
               return mid;      //其他情况则是被查找的数正好与中间数相等，直接返回下标即可
            }
        }
        return -1;      //找不到的时候则返回-1
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,6,7,8,9,11,13,56,78};
        int i = ErFenFa(array, 78);
        System.out.println(i);
    }
}
