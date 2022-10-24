package com.hasbi.image_framework_hasbi.entities.filtrage;

public class FiltreImpl2 implements FiltreInterface {
    @Override
    public int[] filter(int[] image) {
        for (int i = 0; i < image.length; i++) {
            image[i]+=2;
        }
        System.out.println("simple filter 2 is applied!");
        System.out.println("Image after filter 2: ");
        System.out.print("[");
        for (int i = 0; i < image.length; i++) {
            System.out.print(" "+image[i]);
        }
        System.out.print("]");
        return image;
    }
}
