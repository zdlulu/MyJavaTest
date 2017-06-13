/*程序建立时间:2017/06/13
  主题：输入一个数比如说是4，
  使用*图标输出半径为4的圆*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("半径:");
        int ir = Integer.parseInt(sc.nextLine());
        System.out.println("半径设置为:"+ir);

        double r = ir;

        for(double x=0;x<=r*2;x++){

            DecimalFormat df = new DecimalFormat("#.00");//保留两位小数
            double y = r+Math.sqrt(Math.pow(r,2)-Math.pow((x-r),2));
//            System.out.println("y="+df.format(y));
//            System.out.println("x="+df.format(x));

            for(int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
