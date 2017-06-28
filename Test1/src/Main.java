import javax.swing.*;

/**
 * Created by Administrator on 2017/6/28.
 * 输出：闹钟的程序，没有明白，直接抄袭的源码
 */
public class Main {

    public static void main(String[] args){
        AlarmClock clock = new AlarmClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "是否退出？");
        System.exit(0);
    }
}
