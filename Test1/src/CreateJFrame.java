import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/6/29.
 */
public class CreateJFrame extends JFrame {

    public void CreateJFrame(String title){
        /**����������Ϣ**********************************************/
        JFrame jf = new JFrame(title);
        jf.setBounds(400,300,500,500);//���������λ�úͳ���
        jf.setVisible(true);                              //�����Ƿ�ɼ�
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//����رշ�ʽ
        /**********************************************************/
        Container container = jf.getContentPane();//��ȡһ������
        container.setBackground(Color.CYAN);//���������屳��
        /**********************************************************/
        setLayout(null);
        JLabel jl = new JLabel("����һ��JFrame����");//ʵ����һ����
        jl.setHorizontalAlignment(SwingConstants.CENTER);//��ǩ��λ��
        /**********************************************************/
        container.add(jl);//���������һ����ǩ

    }
}
