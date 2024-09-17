package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules  extends JFrame implements ActionListener {
    JButton start,back;
    String name;
    Rules(String name){
        super("Welcome to Guidelines of Quiz:");
        this.name=name;

        JLabel heading=new JLabel("WELCOME"+name+"TO QUIZ TEST");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(new Color(22,99,54));
        add(heading);


        JLabel rules =new JLabel("QUIZ TEST");
        rules.setBounds(70,150,700,350);
        rules.setFont(new Font("Mongolian Baiti",Font.PLAIN,16));
        rules.setForeground(new Color(22,99,54));
        rules.setText(

                "<html>"+
                        "1. This quiz is free for all participation who is more than 18 years." + "<br><br>" +
                        "2. Total number of question is 10. " + "<br><br>" +
                        "3. You have only 15 second to solve one question." + "<br><br>" +
                        "4. No cell phones or other electronic gadget are allowed during exam time." + "<br><br>" +
                        "5. Discussion is not allowed." + "<br><br>" +
                        "6. Only participation and invigilator are allowed in this room." + "<br><br>" +
                        "   &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp&nbsp &nbsp&nbsp &nbsp&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp&nbsp &nbsp&nbsp &nbsp&nbsp &nbsp Best of Luck "+
                        "<html>"

        );

        add(rules);




        back=new JButton("Back");
        back.setBounds(300,500,100,30);
        back.addActionListener(this);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        add(back);


        start=new JButton("Next");
        start.setBounds(450,500,100,30);
        start.addActionListener(this);
        start.setBackground(new Color(22,99,54));
        start.setForeground(Color.WHITE);
        add(start);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/back1.png"));
        Image i=i1.getImage().getScaledInstance(850,600,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel image=new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);



        setSize(800,650);
        setLocation(350,100);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==start){
                setVisible(false);
                new Quiz(name);
            }else if(e.getSource()==back){
                setVisible(false);
                new Login();
            }
    }

    public static void main(String[] args) {

        new Rules("User");
    }
}
