public class Employee {
    private String first = "";
    private String last = "";
    private int id = 0;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;
    
    public Employee(String first, String last) {
        this.first = first;
        this.last = last;
        mostRecentEmployeeID++;
        id = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }

    public String getFullName() {
        return first + " " + last;
    }

    public int getID() {
        return id;
    }
    
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        String info = "---------------------------------------";
        info += "\nEmployee full name: " + getFullName();
        info += "\nEmployee ID: " + getID();
        info += "\nMost recent ID assigned: " + getMostRecentEmployeeID();
        info += "\nTotal employees hired: " + getTotalEmployeesCreated();
        info += "\n---------------------------------------";
        return info;
    }
}