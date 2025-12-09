import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BayUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Bay UI");
        frame.setSize(1200, 400);
        BayPanel panel = new BayPanel();
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        Timer timer = new Timer(24000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.updateSer();
            }
        });
        frame.add(panel);
        timer.start();
    }
}
