import java.util.Timer;
import java.util.TimerTask;

/*Created by Administrator on 2017/6/29.
 *���ݣ�Frame��һ��JAVA�Ĵ������,������ʾ6����Զ���ʧ,ͨ��timetask��ʱ����ʱ
 */
public class Main {
    public static int i=0;

    public static void main(String[] args){
        Frame629 f629 = new Frame629();
        f629.do_frame();
        f629.frame_scan();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(i!=2){
                    System.out.println("/////////////::::i="+i);
                }else if(i==2){
                    f629.frame_exit();
                }
                i++;
            }
        };
        Timer timer = new Timer();
        long delay = 0;
        long intevalPeriod = 3*1000;
        timer.scheduleAtFixedRate(task,delay,intevalPeriod);
    }

}
