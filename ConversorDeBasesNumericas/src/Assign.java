
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Assign extends JFrame {

    JLabel Titulo;
    JLabel decName;
    JLabel biName;
    JLabel octName;
    JLabel hexName;

    JTextField decTextField;
    JTextField biTextField;
    JTextField octTextField;
    JTextField hexTextField;
   // private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt){
    //decTextField.setText("");
    //}
    public Assign() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        Titulo = new JLabel("Insira o valor em um campo em branco para obter a conversão!/n");
        decName = new JLabel("Decimal : ");
        biName = new JLabel("Binario : ");
        octName = new JLabel("Octal : ");
        hexName = new JLabel("Hexadec : ");

        decTextField = new JTextField(10);
        biTextField = new JTextField(10);
        octTextField = new JTextField(10);
        hexTextField = new JTextField(10);
        

        add(Titulo);
        add(decName);
        add(decTextField);
        add(biName);
        add(biTextField);
        add(octName);
        add(octTextField);
        add(hexName);
        add(hexTextField);
        
        JButton limpar = new JButton("Limpar");
        add(limpar);
        
       

        ConvAction makeConv = new ConvAction();
        decTextField.addActionListener(makeConv);
        biTextField.addActionListener(makeConv);
        octTextField.addActionListener(makeConv);
        hexTextField.addActionListener(makeConv);
        limpar.addActionListener((ActionEvent e) -> {
            decTextField.setText("");
            biTextField.setText("");
            octTextField.setText("");
            hexTextField.setText("");
        });
    }

    private class ConvAction implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent enterPressed) {
            String userText, bin, oct, hex;
            int dec;

            if (enterPressed.getSource() == decTextField) {
                userText = decTextField.getText();

                dec = Integer.parseInt(userText);
                bin = Integer.toBinaryString(dec);
                oct = Integer.toOctalString(dec);
                hex = Integer.toHexString(dec);

                biTextField.setText(bin);
                octTextField.setText(oct);
                hexTextField.setText(hex);
                
                

            } else if (enterPressed.getSource() == biTextField) {
                userText = biTextField.getText();

                dec = Integer.parseInt(userText, 2);
                oct = Integer.toOctalString(dec);
                hex = Integer.toHexString(dec);

                decTextField.setText(String.valueOf(dec));
                octTextField.setText(oct);
                hexTextField.setText(hex);

            } else if (enterPressed.getSource() == octTextField) {
                userText = octTextField.getText();

                dec = Integer.parseInt(userText);
                bin = Integer.toBinaryString(dec);
                hex = Integer.toHexString(dec);

                decTextField.setText(String.valueOf(dec));
                biTextField.setText(bin);
                hexTextField.setText(hex);

            } else if (enterPressed.getSource() == hexTextField) {
                userText = hexTextField.getText();

                dec = Integer.valueOf(userText, 16);
                bin = Integer.toBinaryString(dec);
                oct = Integer.toOctalString(dec);

                decTextField.setText(String.valueOf(dec));
                biTextField.setText(bin);
                octTextField.setText(oct);

            }
        }

    }
       // private javax.swing.JButton jButton1;

}
