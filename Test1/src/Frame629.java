import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Frame629 implements ActionListener {
    private Frame frame;
    private Button btn_1 = new Button();

    public Frame629(){}

    public void do_frame(){
        frame = new Frame("My first windows");
        frame.setLayout(new GridLayout(7,1));
        //lable���
        frame.add(new Label("ϲ��ѡ��(�ɸ�ѡ)"));
        //checkbox���
        frame.add(new Checkbox("����"));
        frame.add(new Checkbox("����"));
        frame.add(new Checkbox("����"));
        //Choice ���
        Choice c = new Choice();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        frame.add(c);
        //List���
        List l = new List();
        l.add("һ�꼶");
        l.add("���꼶");
        l.add("���꼶");
        frame.add(l);
        //Button���
        btn_1.setLabel("�˳���ť");
        frame.add(btn_1);
        btn_1.addActionListener(this);
        frame.pack();//�����������������е����
        frame.setVisible(true);//��ʾ����
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_1){
            System.exit(0);
        }
    }
}
