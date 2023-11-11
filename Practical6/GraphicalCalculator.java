import javax.swing.*;
import java.awt.*;

public class GraphicalCalculator{
    private static void createAndShowGUI() {
        JFrame f  =new JFrame("Calculator");
        JTextField tf = new JTextField();
        GridLayout gridlayout = new GridLayout(7,1);
        JPanel panel = new JPanel(gridlayout);
        JButton b[] = new JButton[6];
        b[0] = new JButton("Clear");
        b[1] = new JButton("Add(+)");
        b[2] = new JButton("Subtract(-)");
        b[3] = new JButton("Multiply(*)");
        b[4] = new JButton("Divide(/)");
        b[5] = new JButton("Result(=)");
        panel.add(tf);
        for (int i = 0; i < 6; i++){
            panel.add(b[i]);
        }
        f.add(panel);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        createAndShowGUI();
        }
    });
    }
}