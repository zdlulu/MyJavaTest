/*Created by Administrator on 2017/6/29.
 *内容：Swing常用窗体的练习，添加了一个jLabel的控件
 */

import java.util.Scanner;

public class Main  {

    public static void main(String[] args){
        System.out.print("请输入窗体的title:");
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        CreateJFrame cjf = new CreateJFrame();
        cjf.CreateJFrame(title);

    }
}
