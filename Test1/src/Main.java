/*Created by Administrator on 2017/6/29.
 *���ݣ�Swing���ô������ϰ�������һ��jLabel�Ŀؼ�
 */

import java.util.Scanner;

public class Main  {

    public static void main(String[] args){
        System.out.print("�����봰���title:");
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        CreateJFrame cjf = new CreateJFrame();
        cjf.CreateJFrame(title);

    }
}
