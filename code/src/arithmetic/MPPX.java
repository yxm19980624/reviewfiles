package arithmetic;

import java.util.Arrays;

/**
 * @Author: yxm
 * @Date: 2020/11/26 19:44
 */

public class MPPX {
    public static void main(String[] args) {
        /**
         * 冒泡排序  将一组无序的数组排列成有序数组
         */

        int [] numbers = {1,5,2,7,67,43,78,43,77};  //定义一个无序数组

        for (int i = 0; i < numbers.length; i++) {  //外层循环控制排序次数

            for (int j = 0; j < numbers.length - 1 - i; j++) {  //内层循环控制大小
                if (numbers[j] > numbers[j + 1]) {  //如果数组前一个元素大于后一个元素时
                    int temp = numbers[j];          //就定义第三个变量，方便交换他们的值
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));


        //第二种排序方法  直接调用api排序
        int [] array = {1,65,567,2,4,56,55,11,33};
       Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
