package at.la.cc.camera;

import java.util.ArrayList;
import java.util.List;

public class SDcardCamera {
    private int capacitySD;//16GB
    private List<PhotoFileCamera> photoFileCameras;
    private Camera camera;

    //region CONSTRUCTOR
    public SDcardCamera(int capacitySD) {
        this.capacitySD = capacitySD;
        this.photoFileCameras = new ArrayList<>();
        this.camera = camera;
    }
    //endregion

    public void safePicture(PhotoFileCamera photoFileCamera){
        //speichert das neue Foto das mit der Camera-Methode gemacht wurde
        photoFileCameras.add(photoFileCamera);
        System.out.println(photoFileCamera.myToString());
    }

    public int getFreeSpaceOfSDcard() {

        int size = 0;
        for (PhotoFileCamera photoFileCamera : photoFileCameras) {
            size = size + photoFileCamera.getSize();
        }

        this.capacitySD = this.capacitySD - size;

        return capacitySD;
    }

    //region GETTER SETTER
    public int getCapacitySD() {
        return capacitySD;
    }

    public void setCapacitySD(int capacitySD) {
        this.capacitySD = capacitySD;
    }

    public List<PhotoFileCamera> getPhotoFilesCameras() {
        return photoFileCameras;
    }

    public void setPhotoFilesCameras(ArrayList<PhotoFileCamera> photoFileCameras) {
        this.photoFileCameras = photoFileCameras;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    //endregion
}
