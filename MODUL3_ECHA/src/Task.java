import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;
    private String tittle;
    private String priorty;
    private String status;
    public Task( String tittle, String priorty, LocalDate dueDate, String status) {
        this.dueDate = dueDate;
        this.tittle = tittle;
        this.priorty = priorty;
        this.status = status;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public String getTittle() {
        return tittle;
    }
    public String getPriorty() {
        return priorty;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    

    // TO DO: Buat constructor untuk kelas Task

    // TO DO: Buat getter untuk title

    // TO DO: Buat getter untuk priority

    // TO DO: Buat getter untuk dueDate

    // TO DO: Buat getter untuk status
    
    // TO DO: Buat setter untuk status
    
}
