import java.awt.*;
import javax.swing.*;

//  Learning about Swing
public class HelloWorldSwing {

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        //  Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Add the label.
        JLabel label = new JLabel("Hello Java Swing World");
        frame.getContentPane().add(label); // PREFERRED WAY TO ADD COMPONENTS

        //  frame.add(label);
        //  Display the window.
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLocation(new Point(200, 200));
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        HelloWorldSwing hello = new HelloWorldSwing();
        hello.createAndShowGUI();
    }
}