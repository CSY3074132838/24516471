import java.util.ArrayList;

public class Main {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner max = new GeneralPractitioner(1, "Max", "General Practitioner", "Dr MAX is very thorough and you can go to her if you can't tell me what's wrong with you.");
        GeneralPractitioner alice = new GeneralPractitioner(4, "Alice", "General Practitioner", "Dr Alice is experienced and specialises in a wide range of common conditions.");
        GeneralPractitioner bob = new GeneralPractitioner(5, "Bob", "General Practitioner", "Dr Bob is friendly and always listens patiently to her patients' problems.");

        OtherHealthProfessional charlies = new OtherHealthProfessional(2, "Charlies", "Dentist", "Dr. Charlies specialises in dental problems, so if you have a dental problem you can't go wrong with him.");
        OtherHealthProfessional julie = new OtherHealthProfessional(3, "Julie", "Nurse", "Nurse Julie is very kind, so if you have any problems with prescriptions, you can go to her.");

        max.printInfo();
        System.out.println("------------------------------");
        alice.printInfo();
        System.out.println("------------------------------");
        bob.printInfo();
        System.out.println("------------------------------");
        charlies.printInfo();
        System.out.println("------------------------------");
        julie.printInfo();

        // Part 5 – Collection of appointments
        createAppointment("Sova", "875163241", "10:00", max);
        createAppointment("William", "387194301", "11:00", alice);

        createAppointment("Elijah", "643152478", "14:00", charlies);
        createAppointment("Mia", "708496321", "15:00", julie);

        System.out.println("Existing Appointments:");
        printExistingAppointments();

        cancelBooking("643152478");

        System.out.println("Updated Appointments:");
        printExistingAppointments();
    }

    public static void createAppointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, patientMobile, preferredTimeSlot, selectedDoctor);
        appointments.add(newAppointment);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(String patientMobile) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }
}