import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog( "Provide User Name:" );
        JOptionPane.showMessageDialog(null, name);
    }
}
