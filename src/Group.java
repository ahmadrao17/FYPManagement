
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author G3NZ
 */
public class Group {
    private ArrayList studentList = new ArrayList<Student>();
    private Project projectAssignment;
    private String ID;

    public ArrayList getStudentList() {
        return studentList;
    }

    public Project getProjectAssignment() {
        return projectAssignment;
    }

    public String getID() {
        return ID;
    }

    public void setProjectAssignment(Project projectAssignment) {
        this.projectAssignment = projectAssignment;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void addStudent(Student s)
    {
        studentList.add(s);
    }
}
