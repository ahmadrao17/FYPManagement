
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
public class Project {
    private String title;
    private String type;
    private String Status;
    private String String;
    private ArrayList listAdvisor = new ArrayList<Advisor>();;
    private ArrayList listEvaluation = new ArrayList<Evaluations>();

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return Status;
    }

    public String getString() {
        return String;
    }

    public ArrayList getListAdvisor() {
        return listAdvisor;
    }

    public ArrayList getListEvaluation() {
        return listEvaluation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setString(String String) {
        this.String = String;
    }

    public void addAdvisor(Advisor a)
    {
        listAdvisor.add(a);
    }
    
    public void addEvaluation(Evaluations e)
    {
        listEvaluation.add(e);
    }
}
