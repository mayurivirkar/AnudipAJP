import javax.swing.*;
import java.awt.event.*;

public class eventHandeling {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        JButton button = new JButton("Click");
        JLabel label = new JLabel("Count: 0");

        final int[] count = { 0 };

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                label.setText("Count: " + count[0]);
            }
        });

        frame.setLayout(null);
        label.setBounds(100, 40, 100, 30);
        button.setBounds(90, 80, 100, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
