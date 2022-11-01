package Recursion;

/**
 * 完成次数的规律
 * 环数               次数
 *  1                   1       2^1-1
 *  2                   3       2^2-1
 *  3                   7       2^3-1
 *  4                   15      2^4-1
 *
 *  盘子移动的规律
 *  step1       将上一关的盘子(数量)移动到B塔上面
 *
 *  step2       将接下来最大的盘子移动到C塔上面
 *
 *  step3       将上一关的盘子(数量)由B塔移动到C塔
 */
public class towerOfHano {

    //计数器：
    static int count;

    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';
        char C = 'C';
        hanoi(4,A,B,C);
    }

    /**
     * 单个盘子的移动
     * @param disk
     * @param M
     * @param N
     */
    public static void move(int disk,char M,char N){
        System.out.println("第"+(++count)+"次移动，盘子"+disk+" "+M+"--->"+N);
    }


    /**
     * 盘子移动的方式
     * @param n
     * @param A
     * @param B
     * @param C
     */
    public static void hanoi(int n,char A,char B,char C){
        //当环数为1
        if (n==1){
            move(1,A,C);
        }else {
            //step1   将上一关的盘子(数量)移动到B塔上面    C作为中间介质
            hanoi(n-1,A,C,B);


            //step2  将接下来最大的盘子移动到C塔上面
            move(n,A,C);


            //step3   将上一关的盘子(数量)由B塔移动到C塔

            hanoi(n-1,B,A,C);
        }

    }
}
