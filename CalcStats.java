public class CalcStats {
    int stat;
    
    public CalcStats(int stat){
        this.stat = stat;
    }
    
    public int ttrpgCalc() {
        return (int)(Math.floor((this.stat - 10) / 2));
    }
}
