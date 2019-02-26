package com.company.yatsenko.commonsIo;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class FileNameUtilsExample {
    public static void main(String[] args) {
        try {
            //Using FilenameUtils
            usingFilenameUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingFilenameUtils() throws IOException {
        String path = "C:\\Users\\Vladyslav_Yatsenko\\Desktop\\Java Pre Lab\\Week2\\ApacheCommons\\input.txt";
        if(new File(path).exists()){
            System.out.println("Full Path: " + FilenameUtils.getFullPath(path));
            System.out.println("Relative Path: " +FilenameUtils.getPath(path));
            System.out.println("Prefix: " +FilenameUtils.getPrefix(path));
            System.out.println("Extension: " + FilenameUtils.getExtension(path));
            System.out.println("Base: " + FilenameUtils.getBaseName(path));
            System.out.println("Name: " + FilenameUtils.getName(path));

            String filename = "C:/commons/io/../lang/project.xml";
            System.out.println("Normalized Path: " + FilenameUtils.normalize(filename));
        }
    }
}
