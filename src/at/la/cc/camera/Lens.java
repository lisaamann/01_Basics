package at.la.cc.camera;

public class Lens {
    private int focalWidth;//Brennweite
    private String producerLens;

    //region CONSTRUCTOR
    public Lens(int focalWidth, String producerLens) {
        this.focalWidth = focalWidth;
        this.producerLens = producerLens;
    }
    //endregion



    //region GETTER SETTER
    public int getFocalWidth() {
        return focalWidth;
    }

    public void setFocalWidth(int focalWidth) {
        this.focalWidth = focalWidth;
    }

    public String getProducerLens() {
        return producerLens;
    }

    public void setProducerLens(String producerLens) {
        this.producerLens = producerLens;
    }
    //endregion
}
