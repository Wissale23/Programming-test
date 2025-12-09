import MedicalInfo.HospitalInformation;
import MedicalInfo.MedicalNotification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class BayPanel extends JPanel {

    public BayPanel(){
        setLayout(null);
        setLayout(new GridLayout(3,3));
        setSize(1200,400);
        MedicalNotification medicalNotification1 = new MedicalNotification("Nightingale","Ultrasound");
        MedicalNotification medicalNotification2 = new MedicalNotification("Seacole","ECG recorder and Masseur");
        MedicalNotification medicalNotification3 = new MedicalNotification("Henderson","Dialysis Machine");
        MedicalNotification medicalNotification4 = new MedicalNotification("Barton","None");
        MedicalNotification medicalNotification5 = new MedicalNotification("Dix","None");
        MedicalNotification medicalNotification6 = new MedicalNotification("Cavell","None");
        MedicalNotification medicalNotification7 = new MedicalNotification("Breckinridge","None");
        MedicalNotification medicalNotification8 = new MedicalNotification("Sanger","None");

        DisplayText displayText1 = new DisplayText(medicalNotification1);
        DisplayText displayText2 = new DisplayText(medicalNotification2);
        DisplayText displayText3 = new DisplayText(medicalNotification3);
        DisplayText displayText4 = new DisplayText(medicalNotification4);
        DisplayText displayText5 = new DisplayText(medicalNotification5);
        DisplayText displayText6 = new DisplayText(medicalNotification6);
        DisplayText displayText7 = new DisplayText(medicalNotification7);
        DisplayText displayText8 = new DisplayText(medicalNotification8);
        add(displayText1);
        add(displayText2);
        add(displayText3);
        add(displayText4);
        add(displayText5);
        add(displayText6);
        add(displayText7);
        add(displayText8);
        displayText1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        displayText8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setVisible(true);
    }
    public void updateSer(){

        System.out.println("bay: "+HospitalInformation.getMedicalNotificationFromDoctor().getBay()+ "Service: " +HospitalInformation.getMedicalNotificationFromDoctor().getService() );
    }

}
