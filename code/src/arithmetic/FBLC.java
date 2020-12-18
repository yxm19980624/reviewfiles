package arithmetic;

/**
 * @Author: yxm
 * @Date: 2020/11/26 19:38
 */
public class FBLC {

    /** 费伯罗切算法（第一个数是1，第二个数是前面两个数之和也就是第二个数是 1 + 0 = 1，第三个数是前面两数之后就是 1 + 1 = 2，第四个数是前两数之和也就是1 + 2 = 3，以此类推）
     * n表示第多少位数  输出结果表示第n位数是多少
     * 三种情况，当求第n位数是多少时，n如果是0时，n如果是1或者2时，n是其他情况时
     */
    public static int getFblc(int n){
        if(n <= 0){         //第一种情况
            return 0;
        }else if (n == 1 || n == 2){        //第二种情况
            return 1;
        }else {
            return getFblc(n-1) + getFblc(n-2);     //其他情况，调用递归方法求值
        }
    }

    public static void main(String[] args) {
        System.out.println(getFblc(10));
    }
}
