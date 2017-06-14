/*程序建立时间:2017/06/14
  主题：输入人民币数目
  输出：大写的人民币读法*/
import com.sun.corba.se.pept.transport.ContactInfoList;

import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    static String[] str_srr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾",
            "佰","仟","万","亿","元","角","分","整"};
            //11  12  13
    public static void main(String[] args) {

        /********************************************/
        System.out.println("请输入人民币的数量:");
        Scanner in =new Scanner(System.in);
        double money = in.nextDouble();//使用户能够从 System.in 中读取一个数
        System.out.println("输入的人民币额度是:"+money);
//        double money=7654321.678;
        /********************************************/
        handle_money(money);
//        String result = handle_money(money);
//        System.out.println("计算结果为:"+result);
        /********************************************/
    }

    public static void handle_money(double money){
        String str_money = "";
        String str=String.format("%.2f",money);
        System.out.println(str);
        int index = str.indexOf(".");
        System.out.println(index);
//        /*小数点前面的部分*/
        String a = handle_data(str,index);
        /*小数点后面的部分*/
        String str_1 = str.substring(index+1,index+2);
        String b = str_srr[Integer.parseInt(str.substring(index+1,index+2))]+str_srr[16];//小数点后一位
        String c = str_srr[Integer.parseInt(str.substring(index+2,index+3))]+str_srr[17];//小数点后两位
        System.out.println(a+b+c);
        /********************************************/
    }


    public static String handle_data(String str,int index){
        String a_1 = "";
        str = str.substring(0,index);
        int circle_1 = index/4;
        int circle_2 = index%4;
        if(circle_2!=0){
            for(int i=0;i<(4-circle_2);i++){
                str = "0"+str;
            }
        }

        circle_1 = str.length()/4;
        circle_2 = str.length()%4;

        for(int i=0;i<circle_1;i++){
            for(int j=0;j<4;j++){
                a_1 +=switch_data_1(str.substring(circle_2+4*i+j,circle_2+4*i+j+1))+switch_data_2(j);
            }
            if(i==0&&circle_1==2){
                a_1 +=str_srr[13];
                a_1 =a_1.replaceFirst("元","");
            }
            a_1 =a_1.replace("零仟","");
            a_1 =a_1.replace("零佰","");
            a_1 =a_1.replace("零拾","");
        }
        return a_1;
    }


    public static String switch_data_1(String substring){
        String s = "";
        switch (substring){
            case "0":
                s = "零";
                break;
            case "1":
                s = "壹";
                break;
            case "2":
                s = "贰";
                break;
            case "3":
                s = "叁";
                break;
            case "4":
                s = "肆";
                break;
            case "5":
                s = "伍";
                break;
            case "6":
                s = "陆";
                break;
            case "7":
                s = "柒";
                break;
            case "8":
                s = "捌";
                break;
            case "9":
                s = "玖";
                break;
        }
        return s;
    };

    public static String switch_data_2(int num){
        String s="";
        switch (num){
            case 3:
                s = "元";
                break;
            case 2:
                s = "拾";
                break;
            case 1:
                s = "佰";
                break;
            case 0:
                s = "仟";
                break;
        }
        return s;
    }
}
