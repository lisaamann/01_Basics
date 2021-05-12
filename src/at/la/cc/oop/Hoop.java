package at.la.cc.oop;

public class Hoop {
    private int hoopSize ;
    private int hoopPosition ;

    public Hoop(int hoopSize, int hoopPosition) {
        this.hoopSize = hoopSize;
        this.hoopPosition = hoopPosition;
    }

    //region GETTER SETTER
    public void getHoopSize(int hoopSize){
        this.hoopSize = hoopSize;
    }

    public void setHoopSize(int hoopSize) {
        this.hoopSize = hoopSize;
    }

    public int getHoopPosition() {
        return hoopPosition;
    }

    public void setHoopPosition(int hoopPosition) {
        this.hoopPosition = hoopPosition;
    }
    //endregion
}
