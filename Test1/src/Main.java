/*程序建立时间:2017/06/13
  主题：输入一个数比如说是4，
  使用*画倒直线只画边缘线不画内容线和上一个例子是不同的,等腰三角形的轮廓*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直线行数:");
        int input_num = Integer.parseInt(sc.nextLine());
        System.out.println("倒直线设置为:"+input_num);

        for(int i=0;i<input_num;i++){

            for(int j=0;j<2*input_num;j++){
                if(j==(input_num-i)){
                    System.out.print("*");
                }else if(j==(i+input_num)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
