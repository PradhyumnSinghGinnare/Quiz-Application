import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200,300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        add(heading);

        JLabel userscore = new JLabel("Your Score is " + score);
        userscore.setBounds(350, 200, 300, 30);
        userscore.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        add(userscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 40);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args){

        new Score("User", 0);
    }
}
