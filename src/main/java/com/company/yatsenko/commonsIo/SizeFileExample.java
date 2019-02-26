package com.company.yatsenko.commonsIo;

import org.apache.commons.io.comparator.SizeFileComparator;
import org.apache.commons.io.filefilter.FileFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class SizeFileExample {
    public static void main(String[] args) {
        try {
            usingSizeFileComparator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingSizeFileComparator() throws IOException {
        //get the current directory
        File currentDirectory = new File(".");

        SizeFileComparator comparator = new SizeFileComparator();

        File[] sortedFiles =
                comparator.sort(currentDirectory.listFiles((FileFilter) FileFileFilter.FILE));

        System.out.println("Sorted By Size: ");
        for(File file:sortedFiles) {
            System.out.println(file.getName() + ", size(kb) :" + file.length());
        }
    }
}
