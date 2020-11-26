package arithmetic;

import java.util.Arrays;

/**
 * @Author: yxm
 * @Date: 2020/11/26 19:44
 */

//冒泡排序
public class MPPX {
    public static void main(String[] args) {

        int [] numbers = {1,5,2,7,67,43,78,43,77};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
