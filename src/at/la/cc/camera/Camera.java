package at.la.cc.camera;

import at.la.cc.cars.Producer;
import at.la.cc.phone.PhoneFile;

public class Camera {
    private int Pixel;
    private int Gewicht;
    private String Farbe;
    private ProducerCamera producerCamera;
    private Lens lens;
    private SDcardCamera sDcardCamera;
    private PhotoFilesCamera photoFilesCamera;

    //region CONSTRUCTOR
    public Camera(int pixel, int gewicht, String farbe, ProducerCamera producerCamera, Lens lens) {
        Pixel = pixel;
        Gewicht = gewicht;
        Farbe = farbe;
        this.producerCamera = producerCamera;
        this.lens = lens;
    }
    //endregion

    public void makePicture(){
        photoFilesCamera = new PhotoFilesCamera("000000147", ".jpg", "2021-05-20", PhotoFilesCamera.SIZE.LARGE);
        sDcardCamera.safePicture(photoFilesCamera);
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

    public PhotoFilesCamera getPhotoFilesCamera() {
        return photoFilesCamera;
    }

    public void setPhotoFilesCamera(PhotoFilesCamera photoFilesCamera) {
        this.photoFilesCamera = photoFilesCamera;
    }

    //endregion
}
