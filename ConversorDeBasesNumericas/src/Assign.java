
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign extends JFrame {

    JLabel decName;
    JLabel biName;
    JLabel octName;
    JLabel hexName;

    JTextField decTextField;
    JTextField biTextField;
    JTextField octTextField;
    JTextField hexTextField;

    public Assign() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        decName = new JLabel("Decimal : ");
        biName = new JLabel("Binario : ");
        octName = new JLabel("Octal : ");
        hexName = new JLabel("Hexadecimal : ");

        decTextField = new JTextField(10);
        biTextField = new JTextField(10);
        octTextField = new JTextField(10);
        hexTextField = new JTextField(10);

        add(decName);
        add(decTextField);
        add(biName);
        add(biTextField);
        add(octName);
        add(octTextField);
        add(hexName);
        add(hexTextField);
    }
private class ConvAction implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent enterPressed){
        
        
        
    }
    
}
}
