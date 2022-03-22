package student;

public class student {
    private int studentID;
    private int creditHours;
    private int pointsEarned;
    private double GPA;

    public double getGPA(){
        GPA=pointsEarned/creditHours;
        return GPA;
    }



    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCreditHours() {
        return this.creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getPointsEarned() {
        return this.pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}
