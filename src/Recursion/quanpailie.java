package Recursion;

import java.util.Scanner;


// 全排列，递归实现
public class quanpailie {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        bfs(arr, 0, arr.length - 1);
    }

    public static void bfs(int []a,int start,int end) {
        /*
         * 递归的终点是，我们拿着start去逐个和后面的集合考虑要不要交换：
         * 当需要交换时，我们交换，start+1
         * 当不需要交换时，我们不交换，start还是要加1，因为我们要靠着start进入递归的最底层
         * 一直start比较到最后了，交不交换都反正都结束了，我们打印处结果。然后返回到递归的上一层。
         * 在上一层（我们的start后退一步），搜索是否应该和start交换的i也加1了。
         * 如处理{1，2，3}全排列
         * 相当于在处理完{2,3}的全排列后，
         * 我们回到上一层，start到了{1}，此时需要考虑将{1} 和{2，3}里面交换。i就是去寻找2,3的
         *
         *
         * */
        if(start == a.length) {
            for(int i:a) {
                System.out.print(i);
            }
            System.out.println();

        }

        for(int i = start;i < a.length;i++) {
            if(isUnique(a,start,i)) {
                swap(a,start,i);
                bfs(a,start+1,i);
                /*
                 * 为什么要再交换呢？
                 * 你比如还是{1，2，3}，我拿着{1}去交换{2，3}中间的{2}，交换完成之后，
                 * 显然成了{2} {1，3} 即2,1,3和2,3,1
                 * 但是，我还要拿{1}去换{2，3}中的3啊，数组成了[2,1,3][2,3,1]我再拿第一个位置交换第三个位置显然乱套
                 * 所以，我们恢复原样。当递归完成，回到上一层的时候，上一层的start，i还在哪给你记着呢，你本来换了哪个数
                 * 原原本本给换回来。每一层都一样，所以不会乱。
                 *
                 *
                 * */
                swap(a,start,i);
            }

        }
    }

    static boolean isUnique(int a[],int start,int end ) {
        /*
         * //如果在需要被交换的数a[end]之前出现了和它一样的数，例如{1}想要交换到{2，3，4}中的4没有问题，
         * 换完之后组成新的集合{2,3,1}进行递归，递归会处理好{2，3，1}的全排列
         * 但是如果{1}想要和{4，3，4}中的后面一个4进行交换就需要排除，因为当{1}和第一个4交换，已经将{1，3，4}的全排列
         * 结果全部给出了。
         * 因此，我们逐个检查a[end]这个元素之前，有没有和它 一样的数
         *
         *
         * */
        for(int i = start ;i < end; i++) {
            if(a[i] == a[end]) {
                return false;
            }
        }
        return true;
    }




    public static void swap(int []a,int m,int n) {
        int t = a[m];
        a[m] = a[n];
        a[n] = t;
    }

}