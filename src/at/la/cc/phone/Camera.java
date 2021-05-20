package at.la.cc.phone;

public class Camera {
    private int resolution;
    private SDCard sdCard;
    private PhoneFile phoneFile;


    //region CONCSTRUTOR
    public Camera(int resolution) {
        this.resolution = resolution;
    }
    //endregion

    //region METHODEN
   public void makePicture(){
        phoneFile = new PhoneFile("Blumenwiese", ".jpg", 50);
        sdCard.safePicture(phoneFile);
   }
    //endregion

    //region GETTER SETTER
    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public PhoneFile getPhoneFile() {
        return phoneFile;
    }

    public void setPhoneFile(PhoneFile phoneFile) {
        this.phoneFile = phoneFile;
    }
    //endregion
}
