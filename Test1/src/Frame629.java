import java.awt.*;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Frame629 {
    private Frame frame;

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
        frame.add(new Button("���԰�ť"));
        frame.pack();//�����������������е����
        frame.setVisible(true);//��ʾ����
    }

    public void frame_scan(){
        frame.setVisible(true);
    }

    public void frame_exit(){
        System.exit(0);
    }
}
