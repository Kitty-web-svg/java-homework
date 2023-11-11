import javax.swing.*;

public class FrameTest{
    private static void createAndShowGUI(){

        JFrame frame = new JFrame();
        frame.setTitle("HelloworldSwing");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel label = new JLabel("Hello world");
        // frame.getContentPane().add(label);

        // frame.pack();
        frame.setSize(200,500);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
}