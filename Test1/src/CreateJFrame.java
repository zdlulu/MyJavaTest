import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/6/29.
 */
public class CreateJFrame extends JFrame {

    public void CreateJFrame(String title){
        /**窗体的相关信息**********************************************/
        JFrame jf = new JFrame(title);
        jf.setBounds(400,300,500,500);//窗体的坐标位置和长宽
        jf.setVisible(true);                              //窗体是否可见
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//窗体关闭方式
        /**********************************************************/
        Container container = jf.getContentPane();//获取一个容器
        container.setBackground(Color.CYAN);//给容器定义背景
        /**********************************************************/
        setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");//实例化一个标
        jl.setHorizontalAlignment(SwingConstants.CENTER);//标签的位置
        /**********************************************************/
        container.add(jl);//给容器添加一个标签

    }
}
