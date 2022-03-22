import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBox {
    public static void main(String[] args) throws Exception {
        JFrame frame=new JFrame("This is a ripoff of AIM.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("FILE");
        JMenu m2=new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11=new JMenuItem("Open");
        JMenuItem m22=new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        
        JPanel panel=new JPanel();
        JLabel label=new JLabel("Enter text: ");
        JTextField tf=new JTextField(10);
        JButton send=new JButton("Send");
        send.addActionListener(new ButtonListener());

        JButton reset=new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta=new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);

        frame.setVisible(true);
        private class ButtonListener implements ActionListener{

    }
        
    }
    
}
