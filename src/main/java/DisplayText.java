import MedicalInfo.MedicalNotification;

import javax.swing.*;

public class DisplayText extends JPanel {
    private Status status1;

    public DisplayText(MedicalNotification medicalNotification){
        status1 = new Status(medicalNotification.getService());
        JLabel textLabel = new JLabel("My Text");
        textLabel.setText("<html>"+ "Bay name: " + medicalNotification.getBay()+
                "<br>"+"Services: " + medicalNotification.getService()+
                "<br>"+"Status: " + status1.getStatus()+
                "</html>");


        add(textLabel);
    }
}
