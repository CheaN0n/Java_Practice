package Recursion;

/**
 * 斐波那契数列
 * 指的是这样一个数列：1      1       2       3       5       8       13      21      34
 *                  num1    num2    numn
 *                          num1    num2    numn
 * 计算出斐波那契数列的第n项
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        //方法1：使用循环
        int num1 = 1;
        int num2 = 1;
        int n = 9;
        int numn = 0;
        int sum = 0;

        for (int i = 3; i <=n ; i++) {
            numn = num1+num2;
            num1 = num2;
            num2 = numn;
            sum+= numn+1+1;
        }
        System.out.println("使用循环"+numn);
        System.out.println();

        //方法2：使用递归

        int result = fibo(9);
        System.out.println("使用递归"+result);

    }


    private static int fibo(int n) {
        int result = 0;
        if (n==1||n==2){
            result = 1;//递归的结束条件
        }else{
            result = fibo(n-2)+fibo(n-1);
        }

        
        return result;
    }


}
