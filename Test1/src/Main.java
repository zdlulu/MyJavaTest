/*程序建立时间:2017/06/15
  主题：变量菱形
  输出：输入1个变量的值，然后输出菱形框架
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数:");
        int num_line = sc.nextInt();
        System.out.println("输入行数:"+num_line);
        printHollowRhombus(num_line);
    }

    public static void printHollowRhombus(int num_line){
        if(num_line%2==0){
            num_line++;
        }

        for(int i=0;i<(num_line/2)+1;i++){
            for(int j=(num_line/2)+1;j>i+1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=(num_line/2)+1;i<num_line;i++){
            for(int j=0;j<i-(num_line/2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*num_line-1-2*i;j++){
                if(j==0||j==2*(num_line-i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
