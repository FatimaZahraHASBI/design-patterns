package com.hasbi.image_framework_hasbi.entities;

import com.hasbi.image_framework_hasbi.entities.compression.CompressionTemplate;
import com.hasbi.image_framework_hasbi.entities.filtrage.FiltreInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor @NoArgsConstructor
@Data
public class FrameworkImage {
    private int[] image;
    private FiltreInterface filtreInterface;
    private CompressionTemplate compressionTemplate;

    public FrameworkImage(int[] data) {
        image = data;
    }
}
