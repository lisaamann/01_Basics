package at.la.cc.camera;

import at.la.cc.cars.Producer;

public class CameraMain {
    public static void main(String[] args) {
        ProducerCamera producerCamera2 = new ProducerCamera(ProducerCamera.PRODUCERCAMERANAME.CANON, ProducerCamera.PRODUCERCAMERACOUNTRY.DEUTSCHLAND);
        Lens lens1 = new Lens(50, "Canon");
        Camera camera1 = new Camera(100, 5, "Schwarz", producerCamera2, lens1);

        System.out.println("Ihre Kamera ist vom Hersteller: " + camera1.getProducerCamera());
        System.out.println("Auf der Kamera ist das Objektive " + camera1.getLens() + " aufgesetzt.");

        camera1.makePicture();

    }
}
