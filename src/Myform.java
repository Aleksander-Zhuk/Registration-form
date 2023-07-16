import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myform extends JFrame{
    private JPanel mypanel;
    private JRadioButton RadioButton;

    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JRadioButton RadioButton2;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField8;
    private JTextField textField9;
    private JTextArea textArea1;
    private JButton Button;
    private JCheckBox checkBox1;
    private JSlider slider1;

    Myform () {
        this.getContentPane().add(mypanel);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = slider1.getValue();
                String info =
                        "Анкета для регистрации."+"\n"+"\n"+
                                "Ваше Ф.И.О."+"\n"+"\n"+
                                "   Имя : " + textField3.getText()+"\n"+
                                "   Фамилия : " + textField2.getText()+"\n"+
                                "   Отчество : " + textField1.getText()+"\n"+"\n"+
                                "Пол: " + (RadioButton.isSelected() ? "Мужской" : "Женский") + "\n" +"\n"+
                                "Дата рождения : "+ comboBox1.getSelectedItem() + comboBox3.getSelectedItem() + comboBox2.getSelectedItem()+"\n"+"\n"+
                                "Место проживания : " + "\n"+"\n"+
                                "   Страна : " + textField4.getText() + "\n"+
                                "   Город : " + textField5.getText() + "\n"+
                                "   Улица : " + textField6.getText() + "\n"+
                                "   Дом : " + textField7.getText() + "\n"+"\n"+
                                "Место работы : " + "\n"+"\n"+
                                "   Организация : " + textField8.getText() + "\n"+
                                "   Должность : " + textField9.getText() + "\n" +
                                "   Стаж : " + value + "\n"+"\n"+
                                "Доп. информ. : " + textArea1.getText() ;

                JOptionPane.showMessageDialog(null, info);

            }
        });
    }
}
