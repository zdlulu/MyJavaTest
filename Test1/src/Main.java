/*程序建立时间:2017/06/13
  主题：输入一个数比如说是4，
  等腰三角形显示星星，行数为4*/


import java.security.Principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("星星行数:");
        int num_star = Integer.parseInt(sc.nextLine());  //输入的是最后一行星星的个数
        System.out.println("星星行数设置为:"+num_star);

        //采用的方式是，每一行输出后进行换行后形成所需要的图形
        for (int i = 0; i < num_star; i++) {
            //需要的空格部分进行输出，空格部分是递减的等差数列，排列的
            for(int j=0;j<num_star-i-1;j++){
                System.out.print("&");
            }
            //每一行的星星数量是等差数列排列的
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
