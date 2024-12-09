public class Person {
    private boolean vax = false;
    private String name  = "";

    public Person(String name) {
        this.name = name;
        vax = false;
    }

    public String getName() {
        return name;
    } 

    public boolean isVaccinated() {
        return vax;
    }

    public void setVax(boolean status) {
        vax = status;
    }
}
