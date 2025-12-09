import MedicalInfo.HospitalInformation;
import MedicalInfo.MedicalNotification;

public class Status{

    String service;
    public Status(String service) {
        this.service = service;
    }


    public String getStatus(){

        if (service.equals("Ultrasound")){
            if (HospitalInformation.getHourCount() == 3){
                return "Inactive";
            };
        }
        if (service.equals("ECG")){
            if (HospitalInformation.getHourCount() == 1){
                return "Inactive";
            };
        }
        if (service.equals("Dialysis")){
            if (HospitalInformation.getHourCount() == 4){
                return "Inactive";
            };
        }
        if (service.equals("Masseur")){
            if (HospitalInformation.getHourCount() == 2){
                return "Inactive";
            };
        }
        else{
            return "Inactive";
        }
        return "Active";
    }

}
