package com.hasbi.image_framework_hasbi;

import com.hasbi.image_framework_hasbi.entities.FrameworkImage;
import com.hasbi.image_framework_hasbi.entities.compression.Compression1;
import com.hasbi.image_framework_hasbi.entities.compression.Compression2;
import com.hasbi.image_framework_hasbi.entities.filtrage.FiltreAdapter;
import com.hasbi.image_framework_hasbi.entities.filtrage.FiltreImpl1;
import com.hasbi.image_framework_hasbi.entities.filtrage.FiltreImpl2;
import com.hasbi.image_framework_hasbi.entities.filtrage.FiltreInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@SpringBootApplication
public class ImageFrameworkHasbiApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ImageFrameworkHasbiApplication.class, args);

        int[] image = {1, 3, 4, 5};
        FrameworkImage data = new FrameworkImage(image);
        System.out.println("-------------------Apply a filter and compress the image------------------");
        System.out.print("The image is presented by the following array : [");
        for (int i = 0; i < data.getImage().length; i++) {
            System.out.print(" "+ data.getImage()[i]);
        }
        System.out.println("]");
        System.out.println("\nMenu 1: (Filter)");

        int filterChoice;
        BufferedReader syl1=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1-Apply filter 1 (FiltreImpl1)");
        System.out.println("2-Apply filter 2 (FiltreImpl2)");
        System.out.println("3-Apply old version of filter (AdapteeImple)");
        System.out.println("4-Don't apply any filter");
        do {
            System.out.println("\nChoose from menu 1:");
            filterChoice=Integer.parseInt(syl1.readLine());
            switch(filterChoice)
            {
                case 1:{
                    data.setFiltreInterface(new FiltreImpl1());
                    data.getFiltreInterface().filter(data.getImage());
                }
                break;
                case 2: {
                    data.setFiltreInterface(new FiltreImpl2());
                    data.getFiltreInterface().filter(data.getImage());
                }
                break;
                case 3: {
                    data.setFiltreInterface(new FiltreAdapter());
                    data.getFiltreInterface().filter(data.getImage());
                }
                break;
            }
        }while (filterChoice!=4);

        System.out.println("\nMenu 2: (Compression)");

        int compressionChoice;
        BufferedReader syl2=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1-Apply Compression 1 ");
        System.out.println("2-Apply Compression 2 ");
        System.out.println("3-Quit");
        do {
            System.out.println("\nChoose from menu 2:");
            compressionChoice=Integer.parseInt(syl2.readLine());
            switch(compressionChoice)
            {
                case 1:{
                    data.setCompressionTemplate(new Compression1());
                    data.getCompressionTemplate().compresser(data.getImage());
                }
                break;
                case 2: {
                    data.setCompressionTemplate(new Compression2());
                    data.getCompressionTemplate().compresser(data.getImage());
                }
                break;
            }
        }while (compressionChoice!=3);

        System.out.println("You quit the frameWork! The program is finished !");

    }

}

