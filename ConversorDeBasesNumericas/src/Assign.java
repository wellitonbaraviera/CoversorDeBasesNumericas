
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
    JButton limpar;

    public Assign() {
        setLayout(null);

        Titulo = new JLabel("<html>Insira o valor em um campo em branco <p>"
                + " para obter a conversão e aperte enter! </html>");
        decName = new JLabel("Decimal : ");
        biName = new JLabel("Binario : ");
        octName = new JLabel("Octal : ");
        hexName = new JLabel("Hexadecimal : ");
        limpar = new JButton("Limpar");

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
        add(limpar);
// setbounds(posColuna, posLinha, comprimentoLinha, alturaLinha);

        Titulo.setBounds(50, 30, 500, 40);

        decName.setBounds(50, 80, 100, 20);
        decTextField.setBounds(150, 80, 250, 20);

        biName.setBounds(50, 130, 100, 20);
        biTextField.setBounds(150, 130, 250, 20);

        octName.setBounds(50, 180, 100, 20);
        octTextField.setBounds(150, 180, 250, 20);

        hexName.setBounds(50, 230, 100, 20);
        hexTextField.setBounds(150, 230, 250, 20);

        limpar.setBounds(50, 280, 100, 20);

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

}
