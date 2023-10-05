public class CWEX extends Module {
    private int[] hws = new int[4]; // Homework array that takes contains 4 HW values inputted by the user in the main method
    private int exam;
    private double cwm; // cwm = Coursework mark, calculated in getCWM method
    private double finalmark;

    public CWEX(String mname) {
        super(mname, 2);
    }

    public void setCWM() {
        this.cwm = ((this.hws[0] + this.hws[1] + this.hws[2] + this.hws[3])/4);
    }

    public double getCWM() {
        return this.cwm;
    }

    public void setHW(int index, int hw) {
        this.hws[index] = hw;
    }

    public int getHW(int index) {
        return this.hws[index];
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public int getExam() {
        return this.exam;
    }

    @Override // Overrides class Module setFinal method to apply appropriate weightings for this module
    public void setFinal() {
        this.finalmark = (this.cwm*0.4) + ((this.exam)*0.6); // Applies the appropriate specified weightings for module marks
    }

    @Override
    public double getFinal() {
        return this.finalmark;
    }

}
