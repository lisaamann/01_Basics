package at.la.cc.camera;

import at.la.cc.phone.PhoneFile;

import java.util.ArrayList;

public class SDcardCamera {
    private int capacitySD;//16GB
    private ArrayList<PhotoFilesCamera> photoFilesCameras;
    private Camera camera;

    //region CONSTRUCTOR
    public SDcardCamera(int capacitySD) {
        this.capacitySD = capacitySD;
        this.photoFilesCameras = new ArrayList<>();
        this.camera = camera;
    }
    //endregion

    public void safePicture(PhotoFilesCamera photoFilesCamera){
        //wenn capacity frei ist und das phoneFile kleiner als die freie Größe ist, dann speichern
        photoFilesCameras.add(photoFilesCamera);
        System.out.println(photoFilesCamera);
    }

    //region GETTER SETTER
    public int getCapacitySD() {
        return capacitySD;
    }

    public void setCapacitySD(int capacitySD) {
        this.capacitySD = capacitySD;
    }

    public ArrayList<PhotoFilesCamera> getPhotoFilesCameras() {
        return photoFilesCameras;
    }

    public void setPhotoFilesCameras(ArrayList<PhotoFilesCamera> photoFilesCameras) {
        this.photoFilesCameras = photoFilesCameras;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    //endregion
}
