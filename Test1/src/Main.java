/*程序建立时间:2017/06/13
  主题：输入一个数比如说是4，
  使用*画倒直线只画边缘线不画内容线和上一个例子是不同的*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直线行数:");
        int input_num = Integer.parseInt(sc.nextLine());
        System.out.println("倒直线设置为:"+input_num);

        for(int i=0;i<input_num;i++){
            for(int j=input_num;j>=0;j--){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
