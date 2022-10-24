package com.hasbi.image_framework_hasbi.entities.filtrage;

public class FiltreAdapter implements FiltreInterface {
    private AdapteeImpl adaptee = new AdapteeImpl();
    @Override
    public int[] filter(int[] image) {
        int[] data = adaptee.appliquerFiltre("Image*2 filer", image);
        return data;
    }
}
