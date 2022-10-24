package com.hasbi.image_framework_hasbi.entities.filtrage;

public class AdapteeImpl {

    public int[] appliquerFiltre(String filterName, int[] data){

        for (int i = 0; i < data.length; i++) {
            data[i]*=2;
        }

        System.out.println("Old filter is applied! the filter name is : " + filterName);
        System.out.println("Image after filter : ");
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.print("]");

        return data;
    }
}
