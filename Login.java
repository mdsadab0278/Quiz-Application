package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
        JTextField text;
        JButton next;
        JButton back;
    Login(){
        super("QUIZ APPLICATION");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));
        Image i=i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);


        JLabel heading=new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        add(heading);

        JLabel name=new JLabel("ENTER YOUR NAME:");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(22,99,54));
        add(name);

        text=new JTextField();
        text.setBounds(80,200,320,25);
        text.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        add(text);

        next=new JButton("Next");
        next.setBounds(250,270,120,25);
        next.addActionListener(this);
        next.setBackground(new Color(22,99,54));
        next.setForeground(Color.WHITE);
        add(next);

        back=new JButton("Back");
        back.setBounds(100,270,120,25);
        back.addActionListener(this);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        add(back);



        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        }else if(e.getSource()==back){
            System.exit(50);
            //setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Login();

    }
}
