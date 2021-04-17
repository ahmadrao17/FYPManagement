
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G3NZ
 */
public class FYPmanagement {

    private List<Student> studentList = new ArrayList<Student>();
    private List<Advisor> listAdvisor = new ArrayList<Advisor>();
    private List<Evaluations> listEvaluation = new ArrayList<Evaluations>();
    private List<Group> listGroup = new ArrayList<Group>();
    private List<Project> listProject = new ArrayList<Project>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void addAdvisor(Advisor a) {
        listAdvisor.add(a);
    }

    public void addEvaluation(Evaluations e) {
        listEvaluation.add(e);
    }

    public void addGroup(Group g) {
        listGroup.add(g);
    }

    public void addProject(Project p) {
        listProject.add(p);
    }

    public void updateStudent(Student s, int i) {
        studentList.set(i, s);
    }

    public void updateAdvisor(Advisor a, int i) {
        listAdvisor.set(i, a);
    }

    public void deleteAdvisor(int i) {
        listAdvisor.remove(i);
    }

    public void deleteStudent(int i) {
        studentList.remove(i);
    }

    public void deleteProject(int i) {
        listProject.remove(i);
    }

    public void deleteEvaluation(int i) {
        listEvaluation.remove(i);
    }

    public void saveDataStu() {
        try {
            FileWriter fw = new FileWriter(Student.txt);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("ID,Name,Email,Session,Saved On\n");

            for (int i = 0; i < studentList.size(); i++) {
                bw.write(studentList.get(i).getID() + ","
                        + studentList.get(i).getName() + ", "
                        + studentList.get(i).getEmail() + ","
                        + studentList.get(i).getSession() + "," + "\n"
                );
            }

            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(FYPmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveDataAd() {
        try {
            FileWriter fw = new FileWriter(Student.txt);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("ID,Name,Email,Designation,Saved On\n");

            for (int i = 0; i < listAdvisor.size(); i++) {
                bw.write(listAdvisor.get(i).getID() + ","
                        + listAdvisor.get(i).getName() + ", "
                        + listAdvisor.get(i).getEmail() + ","
                        + listAdvisor.get(i).getDesignation() + "," + "\n"
                );
            }

            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(FYPmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveDataGroup() {
        try {
            FileWriter fw = new FileWriter(Student.txt);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Group ID,Student ID,Name,Email,Designation,Saved On\n");
            for (int x = 0; x < listGroup.size(); x++) {
                List<Student> stulist = new ArrayList<Student>();
                stulist = listGroup.get(x).getStudentList();
                for (int i = 0; i < stulist.size(); i++) {
                    
                    bw.write(listGroup.get(x).getID() +
                            stulist.get(i).getID() + ","
                            + stulist.get(i).getName() + ", "
                            + stulist.get(i).getEmail() + ","
                            + stulist.get(i).getSession() + "," + "\n"
                    );
                }
            }

                bw.flush();
                bw.close();
                fw.close();
            }catch (Exception ex) {
            Logger.getLogger(FYPmanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }
