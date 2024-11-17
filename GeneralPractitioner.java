public class GeneralPractitioner extends HealthProfessional {

    public GeneralPractitioner(int ID, String name, String specialty, String description) {
        super(ID, name, specialty, description);
    }

    @Override
    public void printInfo() {
        System.out.print("General Practitioner - ");
        super.printInfo();
    }
}
