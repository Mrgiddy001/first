import javax.swing.JOptionPane;
import java.util.Scanner;

public class Simple_GUI {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to GUI operations ☻");
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            JOptionPane.showInputDialog("Enter your Name");
            name = scanner.nextLine();
            if (name.isBlank()) {
                JOptionPane.showMessageDialog(null, "You've Entered Nothing!!");
            }
            JOptionPane.showMessageDialog(null, "Your name is " + name);
        }

        JOptionPane.showMessageDialog(null,"Thank you for your time ☺");
    }

}
