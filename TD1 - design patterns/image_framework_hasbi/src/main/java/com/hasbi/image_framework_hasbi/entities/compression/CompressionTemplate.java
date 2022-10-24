package com.hasbi.image_framework_hasbi.entities.compression;

public abstract class CompressionTemplate {
    public int compresser(int[] data){
        int result;
        int sum=0;
        for (int i=0; i<data.length;i++){
            sum+=data[i];
        }
        if(sum%2==0){
            result = operation1(sum);
        }else{
            result = operation2(sum);
        }
        System.out.println("image is compressed ! image = "+ result);
        return result;
    }
    protected abstract int operation1(int x);
    protected abstract int operation2(int x);
}
