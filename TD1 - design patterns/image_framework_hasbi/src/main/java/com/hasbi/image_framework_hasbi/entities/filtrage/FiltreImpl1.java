package com.hasbi.image_framework_hasbi.entities.filtrage;

public class FiltreImpl1 implements FiltreInterface {
    @Override
    public int[] filter(int[] image) {
        for (int i = 0; i < image.length; i++) {
            image[i]+=1;
        }
        System.out.println("simple filter 1 is applied!");
        System.out.println("Image after filter 1: ");
        System.out.print("[");
        for (int i = 0; i < image.length; i++) {
            System.out.print(" "+image[i]);
        }
        System.out.print("]");
        return image;
    }
}
