/*程序建立时间:2017/06/28
  主题：温度转化
  输出：摄氏度转化为华氏温度的工具
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /***********************************/
        System.out.print("请输入摄氏温度为:");
        Scanner in =new Scanner(System.in);
        /***********************************/
        double result = in.nextDouble();
        CelsiusConverter cc = new CelsiusConverter(result);
        System.out.print("转化后的华氏温度为:"+cc.getFahrenheit());
        /***********************************/
    }
}
