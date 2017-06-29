/*Created by Administrator on 2017/6/29.
 *���ݣ�ͨ����������ϰMap�����ʹ�ã�ʹ�õ�JFrame����
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import java.util.Set;


public class Main extends JFrame {
    private static final long serialVersionUID = -4595347311922711984L;
    private JTextField textField_3;
    private JTextField textField_1;
    private JComboBox comboBox_1;
    private JTextField textField;
    private JComboBox cityComboBox;
    private JComboBox comboBox;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Main() {
        getContentPane().setLayout(null);
        setBounds(100, 100, 518, 379);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //��ȡĬ�ϵ���/��
        String province=(String)getProvince()[0];
        setTitle("����ָ��ʡ/ֱϽ�в�ѯ��Ӧ������");

        final BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setImage(SwingResourceManager.getImage(Main.class, "/images/background.jpg"));
        backgroundPanel.setBounds(0, 0, 510, 380);
        getContentPane().add(backgroundPanel);

        final JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setBounds(36, 126, 438, 70);
        backgroundPanel.add(panel);
        panel.setLayout(null);
        panel.setBorder(new TitledBorder(null, "��ס��", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        cityComboBox = new JComboBox();
        cityComboBox.setBounds(245, 25, 124, 27);
        panel.add(cityComboBox);

        cityComboBox.setModel(new DefaultComboBoxModel(getCity(province)));

        comboBox = new JComboBox();
        comboBox.setBounds(25, 25, 124, 27);
        panel.add(comboBox);
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(final ItemEvent e) { // ѡ��״̬�����¼�
                itemChange();
            }
        });
        comboBox.setModel(new DefaultComboBoxModel(getProvince())); // ���ʡ����Ϣ

        final JLabel label = new JLabel();
        label.setText("ʡ/ֱϽ��");
        label.setBounds(155, 30, 66, 18);
        panel.add(label);

        final JLabel label_1 = new JLabel();
        label_1.setText("��/��");
        label_1.setBounds(375, 30, 37, 18);
        panel.add(label_1);

        final JLabel label_2 = new JLabel();
        label_2.setBounds(36, 43, 65, 18);
        backgroundPanel.add(label_2);
        label_2.setHorizontalAlignment(SwingConstants.RIGHT);
        label_2.setHorizontalTextPosition(SwingConstants.LEADING);
        label_2.setText("��    ����");

        textField = new JTextField();
        textField.setBounds(113, 38, 154, 28);
        backgroundPanel.add(textField);

        final JLabel label_3 = new JLabel();
        label_3.setBounds(36, 84, 65, 18);
        backgroundPanel.add(label_3);
        label_3.setHorizontalAlignment(SwingConstants.RIGHT);
        label_3.setHorizontalTextPosition(SwingConstants.LEADING);
        label_3.setText("��    ��");

        comboBox_1 = new JComboBox();
        comboBox_1.setBounds(113, 81, 66, 25);
        backgroundPanel.add(comboBox_1);
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"��", "Ů"}));

        final JLabel label_4 = new JLabel();
        label_4.setBounds(36, 212, 65, 18);
        backgroundPanel.add(label_4);
        label_4.setHorizontalAlignment(SwingConstants.RIGHT);
        label_4.setHorizontalTextPosition(SwingConstants.LEADING);
        label_4.setText("��ϸ��ַ��");

        textField_1 = new JTextField();
        textField_1.setBounds(113, 208, 367, 28);
        backgroundPanel.add(textField_1);

        final JLabel label_4_1 = new JLabel();
        label_4_1.setBounds(36, 252, 65, 18);
        backgroundPanel.add(label_4_1);
        label_4_1.setHorizontalTextPosition(SwingConstants.LEADING);
        label_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
        label_4_1.setText("E-mail��");

        textField_3 = new JTextField();
        textField_3.setBounds(113, 248, 367, 27);
        backgroundPanel.add(textField_3);

        final JButton button = new JButton();
        button.setBounds(159, 289, 75, 28);
        backgroundPanel.add(button);
        button.setText("����");

        final JButton button_1 = new JButton();
        button_1.setBounds(265, 289, 75, 28);
        backgroundPanel.add(button_1);
        button_1.setText("����");
        //
    }
    /*��ȡʡ��ֱϽ�У�������
     */
    public Object[] getProvince() {
        Map<String, String[]> map = CityMap.model;// ��ȡʡ����Ϣ���浽Map��
        Set<String> set = map.keySet(); // ��ȡMap�����еļ�������Set���Ϸ���
        Object[] province = set.toArray(); // ת��Ϊ����
        return province; // ���ػ�ȡ��ʡ����Ϣ
    }

    /* ��ȡָ��ʡ��Ӧ����/��
     */
    public String[] getCity(String selectProvince) {
        Map<String, String[]> map = CityMap.model; // ��ȡʡ����Ϣ���浽Map��
        String[] arrCity = map.get(selectProvince); // ��ȡָ������ֵ
        return arrCity; // ���ػ�ȡ����/��
    }

    private void itemChange() {
        String selectProvince = (String) comboBox.getSelectedItem();
        cityComboBox.removeAllItems(); // �����/���б�
        String[] arrCity = getCity(selectProvince); // ��ȡ��/��
        cityComboBox.setModel(new DefaultComboBoxModel(arrCity)); // ���������/���б��ֵ
    }
}
