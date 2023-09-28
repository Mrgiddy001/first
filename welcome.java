import javax.swing.*;

public class welcome {
    public static void main(String[] args){
        JFrame a = new JFrame("Trial");
        JButton b = new JButton("Sign Up");
        b.setBounds(45,100,80,20);
        a.add(b);
        a.setSize(600,600);
        a.setLayout(null);
        a.setVisible(true);
    }
}
