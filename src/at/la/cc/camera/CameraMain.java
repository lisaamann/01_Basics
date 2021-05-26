package at.la.cc.camera;

import at.la.cc.cars.Producer;

public class CameraMain {
    public static void main(String[] args) {

        ProducerCamera producerCamera2 = new ProducerCamera(ProducerCamera.PRODUCERCAMERANAME.CANON, ProducerCamera.PRODUCERCAMERACOUNTRY.DEUTSCHLAND);
        Lens lens1 = new Lens(50, "Canon");
        SDcardCamera sDcardCamera1 = new SDcardCamera(16);
        Camera camera1 = new Camera(100, 5, "Schwarz", producerCamera2, lens1, sDcardCamera1);

        System.out.println("Ihre Kamera ist vom Hersteller: " + camera1.getProducerCamera().producercameraname);
        System.out.println("Auf der Kamera ist das Objektive " + camera1.getLens().getProducerLens() + " aufgesetzt.");

        camera1.makePicture();
        System.out.println(camera1.getFreeCapacity());

    }
}
