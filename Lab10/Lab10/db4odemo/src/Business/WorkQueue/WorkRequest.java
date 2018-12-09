/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Medicine.Medicine;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private HashSet<Medicine> alternativelist = new HashSet<>();
    private ArrayList<Employee> Doctorlist = new ArrayList<Employee>();

    public HashSet<Medicine> getAlternativelist() {
        return alternativelist;
    }

    public void setAlternativelist(HashSet<Medicine> alternativelist) {
        this.alternativelist = alternativelist;
    }

    public ArrayList<Employee> getDoctorlist() {
        return Doctorlist;
    }

    public void setDoctorlist(ArrayList<Employee> Doctorlist) {
        this.Doctorlist = Doctorlist;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    @Override
    public String toString() {
        return message;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}