public class OtherHealthProfessional extends HealthProfessional {

    public OtherHealthProfessional(int ID, String name, String specialty, String description) {
        super(ID, name, specialty, description);
    }

    @Override
    public void printInfo() {
        System.out.print("Other Health Professional - ");
        super.printInfo();
    }
}
