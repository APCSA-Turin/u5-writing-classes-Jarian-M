public class Student {
    private String first = "";
    private int points = 0;
    private static int totalPointsEarned = 0;
    private static int greatestPoints = 0;

    public Student(String first) {
        this.first = first;
        points = 0;
    }

    public String studentInfo() {
        String student = "Student: " + first;
        student += "\nStudent's Points: " + points;
        return student;
    }

    public void addPoints(int pts) {
        points += pts;
        totalPointsEarned += pts;
        if(points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public static int getGreatestPoints() {
        return greatestPoints;
    }

    public static String classInfo() {
        String info = "Total points earned by all students: " + totalPointsEarned;
        info += "\nMost points earned by any student: " + greatestPoints;
        return info;
    }
}
