public abstract class Module {
    // Abstract class Module contains various methods that are inherited in other classes used to initialize Module Names, Statuses, and calculate the final module mark
    // Attributes: mname = Name of Module, status = Module Number, finalmark = Final mark for that module
    private String mname;
    private int status;
    private double finalmark;

    public Module(String mname, int status) {
        this.mname = mname;
        this.status = status;
        this.finalmark = 0.0; // Initializes the Modules final mark as 0 to begin with
    }

    public void setMName(String mname) {
        this.mname = mname;
    }

    public String getMName() {
        return this.mname;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setFinal() {} // Empty method to be overriden in other classes

    public double getFinal() {
        return this.finalmark;
    }
}