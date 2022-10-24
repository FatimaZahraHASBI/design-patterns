package com.hasbi.image_framework_hasbi.entities.compression;

public class Compression1 extends CompressionTemplate {
    @Override
    protected int operation1(int x) {
        return x/2;
    }

    @Override
    protected int operation2(int x) {
        return x;
    }
}
