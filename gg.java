import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gg extends JFrame {

    JFrame frame;
    JButton button,button1,button2,button3,exitbutton,input,input1,sin,cos,square,cube,sqr;
    JLabel jLabel,jLabel1,jlabel2;
    gg()
    {

        setTitle("Anany-Himanshu");
        input1 = new JButton("Enter");
        button = new JButton("ADD");
        button1 = new JButton("SUBTRACT");
        button3 = new JButton("MULTIPLY");
        button2 = new JButton("DIVISION");
        exitbutton = new JButton("EXIT");
        sin = new JButton("SIN");
        cos = new JButton("COS");
        input = new JButton("Enter");
        jLabel = new JLabel("CALCULATOR APPLICATION");

        jlabel2 = new JLabel("Enter your Suggestions:");
        square = new JButton("SQUARE");
        cube = new JButton("CUBE");
        sqr = new JButton("SQRT");



        button.setBounds(30, 100, 100, 50);
        button1.setBounds(140,100,100,50);
        button2.setBounds(250,100,100,50);
        button3.setBounds(140,170,100,50);
        exitbutton.setBounds(140,320,100,50);
        jLabel.setBounds(100,10,180,100);
        input.setBounds(160,10,150,50);
        input1.setBounds(160,70,150,50);
        sin.setBounds(30,170,100,50);
        cos.setBounds(250,170,100,50);
        square.setBounds(30,240,100,50);
        cube.setBounds(140,240,100,50);
        sqr.setBounds(250,240,100,50);



        add(button);
        add(sin);
        add(cos);
        add(sqr);
        add(square);
        add(cube);

        add(jLabel);

        add(button1);
        add(button2);
        add(button3);
        add(exitbutton);



        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = JOptionPane.showInputDialog("Enter first number");
                String second = JOptionPane.showInputDialog("Enter Second number");
                JOptionPane.showMessageDialog(null,"Addition result is : " +
                        (Integer.parseInt(first) + Integer.parseInt(second)));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = JOptionPane.showInputDialog("Enter first number");
                String second = JOptionPane.showInputDialog("Enter Second number");
                JOptionPane.showMessageDialog(null,"Subtraction result is : " +
                        (Integer.parseInt(first) - Integer.parseInt(second)));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String first = JOptionPane.showInputDialog("Enter first number");
                String second = JOptionPane.showInputDialog("Enter Second number");
                JOptionPane.showMessageDialog(null,"Division result is : " +
                        (Double.parseDouble(first) / Double.parseDouble(second)));
            }
        });
      button3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String first = JOptionPane.showInputDialog("Enter first number");
              String second = JOptionPane.showInputDialog("Enter Second number");
              JOptionPane.showMessageDialog(null,"Multiplication result is : " +
                      (Double.parseDouble(first) + Double.parseDouble(second)));
          }
      });
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter the number");
                JOptionPane.showMessageDialog(null,"Sin of the number is: " +
                        Math.sin(Double.parseDouble(an)));
            }
        });

        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter the number");
                JOptionPane.showMessageDialog(null,"Cos of the number is: " +
                        Math.cos(Double.parseDouble(an)));
            }
        });
        
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter the number");
                JOptionPane.showMessageDialog(null,"Tan of the number is: " +
                        Math.tan(Double.parseDouble(an)));
            }
        });
        
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter a number");
                JOptionPane.showMessageDialog(null,"Square is :" +
                        Math.pow(Double.parseDouble(an),2));
            }
        });


        cube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter a number");
                JOptionPane.showMessageDialog(null,"Cube is :" +
                        Math.pow(Double.parseDouble(an),3));
            }
        });

        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String an = JOptionPane.showInputDialog("Enter a number");
                JOptionPane.showMessageDialog(null,"SquareRoot is :" +
                        Math.pow(Double.parseDouble(an),0.5));
            }
        });

    }

    public static void main(String[]args){
        new gg();
    }

}
