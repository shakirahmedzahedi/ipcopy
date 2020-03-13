package Todo;
import java.time.LocalDate;
/**
 * This is a simple task class.
 * this class maintains information of a task.
 * @author  Shakir Ahmed Zahedi
 * @version 1.0
 * @since   2020-03-10
 */
public class Task {
    // the fields
    String titel;
    LocalDate date;
    String status;
    String projectName;
    /**
     * This is a Constructor for object Task.
     * Set titel,date,status and projectName when Task object
     * is constructed.
     * @constructor
     */
    public Task(String titel, LocalDate date, String status, String projectName){
        this.titel=titel;
        this.date=date;
        this.status=status;
        this.projectName=projectName;
    }
    /*
     * Empty constructor
     *
     */
    public Task()
    {
    }
    /**
     * This method
     * @return String
     * for the task titel.
     *
     */
    public String getTitel() {
        return titel;
    }
    /**
     * This method takes
     * @param  titel string
     * and set for the task titel.
     *
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }
    /**
     * This method
     * @return LocalDate
     * for the task titel.
     *
     */
    public LocalDate getDate() {
        return date;
    }
    /**
     * This method takes
     * @param date LocalDate
     * and set for the task duedate.
     *
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    /*
     * This method
     * @return String
     * for the task status.
     *
     */
    public String getStatus() {
        return status;
    }
    /**
     * This method takes
     * @param  status String
     * and set status for the task.
     *
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * This method
     * @return String
     * for the task projectName.
     *
     */
    public String getProjectName() {
        return projectName;
    }
    /**
     * This method takes
     * @param  projectName String
     * and set for the task projectName .
     *
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /**
     *  This method
     * @override toString method
     * This method
     * @return String
     *for the task.
     *
     */
    @Override
    public String toString() {
        return String.format("TaskTitel:%-10s Due date:%-20s Task Status:%-10s Duedate:%-10s",
                titel,date,status,projectName);
    }
}

