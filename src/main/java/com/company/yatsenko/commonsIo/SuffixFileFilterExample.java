package com.company.yatsenko.commonsIo;

import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;

public class SuffixFileFilterExample {
    public static void main(String[] args) {
        try {
            usingSuffixFileFilter();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingSuffixFileFilter() throws IOException {
        //get the current directory
        File currentDirectory = new File("C:\\");

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");
        for( int i = 0; i < files.length; i++ ) {
            System.out.println(files[i]);
        }

        System.out.println("\nFile with extenstion txt\n");
        String[] filesNames = currentDirectory.list( new SuffixFileFilter("txt") );
        for( int i = 0; i < filesNames.length; i++ ) {
            System.out.println(filesNames[i]);
        }
    }
}
