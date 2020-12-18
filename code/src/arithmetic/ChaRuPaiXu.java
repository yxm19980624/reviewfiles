package arithmetic;

import java.util.Arrays;

/**
 * @Author: yxm
 * @Date: 2020/12/18 16:37
 * @Emial: yxm1136656235@163.com
 */
public class ChaRuPaiXu {
    /**
     * 插入排序     通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
     * 插入排序非常类似于整扑克牌。在开始摸牌时，左手是空的，牌面朝下放在桌上。接着，一次从
     * 桌上摸起一张牌，并将它插入到左手一把牌中的正确位置上。为了找到这张牌的正确位置，要将
     * 它与手中已有的牌从右到左地进行比较。无论什么时候，左手中的牌都是排好序的。
     *
     * @param array 要排序的数组
     */
    public static int[] sort(int[] array) {

        int length;     //定义当前数组长度变量

        //最简单情况，数组为空时，或者数组长度只有1时，直接返回即可，这里也给length赋值了
        if (array == null || (length = array.length) == 0 || length == 1){
            return array;
        }

        //定义当前准备插入的数
        int current;

        //开始循环排序
        for (int i = 0; i < length - 1; i++) {

            //从后置位开始排序，默认第一个数已完成排序，从第二个数开始
        current = array[i + 1];

        // 拿当前的数与之前已排序序列逐一往前比较
        // 如果比较的数据比当前的大，就把该数往后挪一步
        while (i >= 0 && current < array[i]){
            array[i + 1] = array[i];

            //移动下标 继续往前判断
            i --;
        }

            //跳出了while循环，则表示找到了合适的位置，赋值就行
            array[i + 1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] a = {1,4,3,6,8,7,9,10};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }
}
