public class Student {
    private String name;
    private String surname;
    private int id;
    private CWOnly cw001; // Object of type Coursework Only Module
    private EXOnly ex002; // Object of type Exam Only Module
    private CWEX ce003; // Object of type Coursework and Exam Module

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }   

    public void setCWOnly(CWOnly cw001) { // Creates CWOnly object to be stored in the student object
        this.cw001 = cw001;
    }

    public CWOnly getCWOnly() { // Returns CWOnly object
        return this.cw001;
    }

    public void setEXOnly(EXOnly ex002) { // Creates EXOnly object to be stored in the student object
        this.ex002 = ex002;
    }

    public EXOnly getEXOnly() {
        return this.ex002;
    }

    public void setCWEX(CWEX ce003) { // Creates CWEX object to be stored in the student object
        this.ce003 = ce003;
    }

    public CWEX getCWEX() {
        return this.ce003;
    }

    public void displayCW001() { // Displays student name and marks inputted for CW001 in a tabular format
        System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", 
        this.getName(),
        this.getSurname(),
        this.cw001.getCWM() + "%",
        this.cw001.getFP() + "%", 
        this.cw001.getFinal() + "%");
    }

    public void displayEX002() { // Displays student name and marks inputted for EX002 in a tabular format
        System.out.printf("%-20s %-20s %-15s %n", 
        this.getName(),
        this.getSurname(), 
        this.ex002.getFM() + "%");
    }

    public void displayCE003() { // Displays student name and marks inputted for CE003 in a tabular format
        System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", 
        this.getName(),
        this.getSurname(),
        this.ce003.getCWM() + "%",
        this.ce003.getExam() + "%", 
        this.ce003.getFinal() + "%");
    }

    public void displayAll() { // Displays student name and marks inputted for all modules in a tabular format
        System.out.printf("%-20s %-20s %-15s %-15s %-15s %n", 
        this.getName(),
        this.getSurname(),
        String.format("%.2f", this.cw001.getFinal()) + "%",
        this.ex002.getFM() + "%",
        String.format("%.2f", this.ce003.getFinal()) + "%"
      );
    }
}