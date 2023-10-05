public class EXOnly extends Module {
    private int exam;

    public EXOnly(String mname) {
        super(mname, 1);
    }

    public void setFM(int exam) {
        this.exam = exam;
    }

    public double getFM() {
        return this.exam;
    }
}
