public class Clinic {
    private int numVax = 0;
    private Person recent;
    private static int totalC = 0;
    private static int totalVax = 0;

    public Clinic() {
        numVax = 0;
        totalC++;
    }

    public int getClinicVaccineCount() {
        return numVax;
    }

    public static int getTotalClinics() {
        return totalC;
    }

    public Person mostRecentlyVaccinated() {
        return recent;
    }

    public static int getTotalVaccineCount() {
        return totalVax;
    }

    public boolean vaccinate(Person psn) {
        if(!psn.isVaccinated()) {
            numVax++;
            totalVax++;
            recent = psn;
            psn.setVax(true);
            return true;
        } else {
            return false;
        }
    }
}
