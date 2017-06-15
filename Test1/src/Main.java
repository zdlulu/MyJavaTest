/*程序建立时间:2017/06/15
  主题：变量行数
  输出：结果是输入行数的杨辉三角
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数:");
        int num_line = sc.nextInt();
        System.out.println("输入行数:"+num_line);
        yanghuitrigle(num_line);
    }

    public static void yanghuitrigle(int num_line){
        int[][] arr_int = new int[num_line][];

        for(int i=0;i<num_line;i++){
            arr_int[i] = new int[i+1];
            for(int j=0;j<arr_int[i].length;j++){
                if(i==0||j==0||j==arr_int[i].length-1){
                    arr_int[i][j]=1;
                }else{
                    arr_int[i][j] = arr_int[i-1][j-1]+arr_int[i-1][j];
                }
                System.out.print(arr_int[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}
