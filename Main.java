public class Main {
    public static void main(String[] args) {
        GeneralPractitioner max = new GeneralPractitioner(1, "Max", "General Practitioner", "MAX is a general practitioner, if you can't articulate your symptoms, you can go to him.");
        max.printInfo();

        OtherHealthProfessional charlies = new OtherHealthProfessional(2, "Charlies", "Dentist", "Dr. Charlies specialises in dental problems, if you have dental problems you can't go wrong with him.");
        charlies.printInfo();

        OtherHealthProfessional julie = new OtherHealthProfessional(3, "Julie", "Nurse", "Nurse Julie is very kind, if you have problems with prescriptions you can go to her.");
        julie.printInfo();
    }
}
