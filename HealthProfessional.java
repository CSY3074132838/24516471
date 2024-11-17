public class HealthProfessional {
    private int ID;
    private String name;
    private String specialty;
    private String description;

    public HealthProfessional(int ID, String name, String specialty, String description) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
        this.description = description;
    }

    public void printInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Description: " + description);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}