package Recursion;

public class Maze {
    public static void main(String[] args) {
        //准备
        //定义二维数组
        int [][] arr = new int[8][8];
        //设置墙(上面和下面)
        for (int i = 0; i <8 ; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
        //设置墙(左面和右面)
        for (int i = 0; i <8 ; i++) {
            arr[i][0]=1;
            arr[i][7] = 1;
        }
        //设置路障
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[5][5] = 1;
        arr[6][5] = 1;

        //打印数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }

        //找路
        findway(arr,1,1);
        System.out.println("--------------------------------------------------");

        //打印数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }

    }

    //定义方法
    //返回值true表示路可以走，返回值false表示路不能走
    //参数i和j表示起始坐标
    public static boolean findway(int [][] arr,int i,int j){
        //判断终点是否为2
        if (arr[6][6] ==2){
            return true;
        }
        //判断当前位置是否可走
        if (arr[i][j]==0){
            //假定当前位置可走
            arr[i][j]=2;
            //按照策略找路
            if (findway(arr,i+1,j)||findway(arr,i,j+1)||findway(arr,i-1,j)||findway(arr,i,j-1)){
                //如果有路则返回true
                return true;
            }else{
                //如果是死路则把值改为0
                arr[i][j]=0;
                return false;
            }

        }

        //如果当前位置不可走则返回false
        else {
            return false;
        }
    }
}
