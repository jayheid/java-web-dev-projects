import java.util.ArrayList;

public class Course {
    private int courseID;
    private String courseName;
    private ArrayList <String> courseSchedule = new ArrayList<>();

    public Course (int courseID, String courseName, ArrayList<String> courseSchedule){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseSchedule = courseSchedule;
    }

    public ArrayList<String> getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(ArrayList<String> courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
}
