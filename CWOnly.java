public class CWOnly extends Module {
    private int[] hws = new int[3]; // Homework array containing 3 HW values 
    private double cwm;
    private int fp;
    private double finalmark;

    public CWOnly(String mname) {
        super(mname, 0);
    }

    public void setHW(int index, int hw) {
        this.hws[index] = hw; // Adds a homework value to a specific index
    }

    public int getHW(int index) {
        return this.hws[index]; // Returns a homework value of a specific index
    }

    public void setFP(int fp) {
        this.fp = fp;
    }

    public int getFP() {
        return this.fp;
    }

    public void setCWM() {
        this.cwm = ((this.hws[0] + this.hws[1] + this.hws[2])/3); // Finds and average of each HW value stored in the hws array
    }

    public double getCWM() {
        return this.cwm;
    }

    @Override
    public void setFinal() {
        this.finalmark = ((this.cwm)*0.5) + ((this.fp)*0.5); // Applies appropriate module mark weightings
    }

    @Override
    public double getFinal() {
        return this.finalmark;
    }
}