import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame=new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new PushCounterPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
