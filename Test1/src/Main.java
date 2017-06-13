/*程序建立时间:2017/06/13
  主题：自定义截取字符串的方法，
  使用：通过输入两个index的值，来截取某一个字符串的部分内容，并输出结果*/
import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        /********************************************/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input_str = sc.nextLine();
        System.out.println("输入的字符串为:"+input_str);
        /********************************************/
        System.out.println("请输入开始位置:");
        int input_location = Integer.parseInt(sc.nextLine());
        System.out.println("输入开始位置为:"+input_location);
        /********************************************/
        System.out.println("请输入转化长度:");
        int input_len = Integer.parseInt(sc.nextLine());
        System.out.println("输入转化长度为:"+input_len);
        /********************************************/
        String result = cut_str(input_str,input_location,input_len);
        System.out.println("最终的转化结果为:"+result);
        /********************************************/
    }

    private static String cut_str(String str, int begin, int length){
        String result = "";
        if(str!=null){
            byte[] str_byte = str.getBytes();
            int len_byte = str_byte.length;
            if((begin+length)<=len_byte){
                result = new String(str_byte,0,length);
            }else{
                System.out.println("字符串长度输入的有问题!!!!");
            }
        }else{
            System.out.println("字符串输入为空!!!!");
        }
        return result;
    }

}
