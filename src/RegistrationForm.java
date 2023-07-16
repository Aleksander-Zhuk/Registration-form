import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        Myform myform = new Myform();
        myform.pack();
        myform.setSize(new Dimension(600,700));
        myform.setLocationRelativeTo(null);
        myform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myform.setVisible(true);
    }

}