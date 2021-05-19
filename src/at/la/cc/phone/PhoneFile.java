package at.la.cc.phone;

public class PhoneFile {
    private String extension;//jpg
    private int size;//10MB
    private String name;//Filename
    private Camera camera;
    private String file;


    //region CONSTRUCTOR
    public PhoneFile(String name, String extension, int size) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }
    //endregion

    //region METHODEN
    public void getInfo(){
        //hier brauche ich die Info von der Camera wenn ich ein neues Foto mache und muss das als einen String bekommen
        this.file = camera.makePicture();
    }
    //endregion

    //region GETTER SETTER
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    //endregion
}
