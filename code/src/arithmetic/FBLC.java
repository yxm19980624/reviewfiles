package arithmetic;

/**
 * @Author: yxm
 * @Date: 2020/11/26 19:38
 */

//费伯罗切算法

/**
 * n表示第多少位数  输出结果表示第n位数是多少
 */
public class FBLC {
    public static int getFblc(int n){
        if(n <= 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else {
            return getFblc(n-1) + getFblc(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFblc(10));
    }
}
