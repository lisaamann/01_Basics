package at.la.cc.camera;

public class ProducerCamera {
    public enum PRODUCERCAMERANAME {CANON, SONY};
    public enum PRODUCERCAMERACOUNTRY {DEUTSCHLAND, USA};
    public ProducerCamera.PRODUCERCAMERANAME producercameraname;
    public ProducerCamera.PRODUCERCAMERACOUNTRY producercameracountry;

    //region CONSTRUCTOR
    public ProducerCamera(PRODUCERCAMERANAME producercameraname, PRODUCERCAMERACOUNTRY producercameracountry) {
        this.producercameraname = producercameraname;
        this.producercameracountry = producercameracountry;
    }
    //endregion


    //region GETTER SETTER

    public PRODUCERCAMERANAME getProducercameraname() {
        return producercameraname;
    }

    public void setProducercameraname(PRODUCERCAMERANAME producercameraname) {
        this.producercameraname = producercameraname;
    }

    public PRODUCERCAMERACOUNTRY getProducercameracountry() {
        return producercameracountry;
    }

    public void setProducercameracountry(PRODUCERCAMERACOUNTRY producercameracountry) {
        this.producercameracountry = producercameracountry;
    }

    //endregion
}
