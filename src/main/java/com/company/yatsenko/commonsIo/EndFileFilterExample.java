package com.company.yatsenko.commonsIo;

import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.io.IOException;

public class EndFileFilterExample {
    public static void main(String[] args) {
        try {
            usingAndFileFilter();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingAndFileFilter() throws IOException {
        //get the current directory
        File currentDirectory = new File("C:\\");

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");
        for( int i = 0; i < files.length; i++ ) {
            System.out.println(files[i]);
        }

        System.out.println("\nFile starting with . and ends with p\n");
        String[] filesNames = currentDirectory.list(
                new AndFileFilter(new PrefixFileFilter("."), new WildcardFileFilter("*p")));
        for( int i = 0; i < filesNames.length; i++ ) {
            System.out.println(filesNames[i]);
        }
    }
}
