package at.la.cc.camera;

public class Camera {
    private int Pixel;
    private int Gewicht;
    private String Farbe;
    private ProducerCamera producerCamera;
    private Lens lens;
    private SDcardCamera sDcardCamera;
    private PhotoFileCamera photoFileCamera;

    //region CONSTRUCTOR
    public Camera(int pixel, int gewicht, String farbe, ProducerCamera producerCamera, Lens lens, SDcardCamera sDcardCamera) {
        Pixel = pixel;
        Gewicht = gewicht;
        Farbe = farbe;
        this.producerCamera = producerCamera;
        this.lens = lens;
        this.sDcardCamera = sDcardCamera;
    }
    //endregion

    public void makePicture(){
        photoFileCamera = new PhotoFileCamera("000000147", ".jpg", "2021-05-20", 6);
        sDcardCamera.safePicture(photoFileCamera);
    }

    public int getFreeCapacity(){
        return sDcardCamera.getFreeSpaceOfSDcard();
    }

    public void capacityIsLow(){
        if (getFreeCapacity() <= 10){
            System.out.println("Achtung! Der Speicher ist gering");
        }
        if (getFreeCapacity() == 0){
            System.out.println("Speicher aufgebraucht. Kein weiteres Foto möglich.");
        }
    }

    //region GETTER SETTER
    public int getPixel() {
        return Pixel;
    }

    public void setPixel(int pixel) {
        Pixel = pixel;
    }

    public int getGewicht() {
        return Gewicht;
    }

    public void setGewicht(int gewicht) {
        Gewicht = gewicht;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }

    public ProducerCamera getProducerCamera() {
        return producerCamera;
    }

    public void setProducerCamera(ProducerCamera producerCamera) {
        this.producerCamera = producerCamera;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public SDcardCamera getsDcardCamera() {
        return sDcardCamera;
    }

    public void setsDcardCamera(SDcardCamera sDcardCamera) {
        this.sDcardCamera = sDcardCamera;
    }

    public PhotoFileCamera getPhotoFilesCamera() {
        return photoFileCamera;
    }

    public void setPhotoFilesCamera(PhotoFileCamera photoFileCamera) {
        this.photoFileCamera = photoFileCamera;
    }

    //endregion
}
