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
        //lable组件
        frame.add(new Label("喜好选择(可复选)"));
        //checkbox组件
        frame.add(new Checkbox("音乐"));
        frame.add(new Checkbox("体育"));
        frame.add(new Checkbox("美术"));
        //Choice 组件
        Choice c = new Choice();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        frame.add(c);
        //List组件
        List l = new List();
        l.add("一年级");
        l.add("二年级");
        l.add("三年级");
        frame.add(l);
        //Button组件
        btn_1.setLabel("退出按钮");
        frame.add(btn_1);
        btn_1.addActionListener(this);
        frame.pack();//调整窗口以容纳所有的组件
        frame.setVisible(true);//显示窗口
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_1){
            System.exit(0);
        }
    }
}
