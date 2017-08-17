
import javax.swing.JFrame;

public class Assign_main {

    public static void main(String[] args) {

        Assign window = new Assign();
        window.setSize(500, 350);
        window.setTitle("Conversor de bases numericas");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }
}
