/*程序建立时间:2017/06/13
  主题：输入半径，
  使用：画出一个*输出组成的圆*/
import java.util.Scanner;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        /********************************************/
        // TODO Auto-generated method stub
        System.out.println("请输入圆的半径:");
        Scanner in =new Scanner(System.in);
        int radius = in.nextInt();//使用户能够从 System.in 中读取一个数
        paint(radius);  //手动输入半径5
        /********************************************/
    }

    public static void paint(int r){
        int y = r*2;//y=10
        int x = 0;
        int c = 0;
        int z = 2;
        for(int j=r*2;j>=0;j=j-z){//j>=0 && j<=10 j=8,
            x=getX(r,y);
            System.out.print(getSpace(x)+"*");
            c=(r-x)*2;
            System.out.println(getSpace(c)+"*");
            y-=z;
        }
    }
    public static int getX(int r,int y){
        int x=y-r;//x=5
        double t=Math.sqrt((r*r)-(x*x));
        return (int)Math.round(r-t);
    }
    public static String getSpace(int i){
        String s = " ";
        for(int j=0;j<i;j++){
            s+=" ";
        }
        return s;
    }
}
