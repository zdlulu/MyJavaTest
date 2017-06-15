/*程序建立时间:2017/06/14
  主题：变量调换
  输出：输入两个变量的值，然后通过异或运算符来实现两个变量的互换
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个:");
        long A = sc.nextLong();
        System.out.println("输入第一个:"+A);

        System.out.println("输入第二个:");
        long B = sc.nextLong();
        System.out.println("输入第一个:"+B);

        A = A^B;
        B = B^A;
        A = A^B;
        System.out.println("A="+A+":B="+B);
    }

}
