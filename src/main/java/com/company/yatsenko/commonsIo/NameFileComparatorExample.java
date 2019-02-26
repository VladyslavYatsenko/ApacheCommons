package com.company.yatsenko.commonsIo;

import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.filefilter.FileFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class NameFileComparatorExample {
    public static void main(String[] args) {
        try {
            usingNameFileComparator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingNameFileComparator() throws IOException {
        //get the current directory
        File currentDirectory = new File(".");

        NameFileComparator comparator = new NameFileComparator(IOCase.INSENSITIVE);

        File[] sortedFiles = comparator.sort(currentDirectory.listFiles((FileFilter) FileFileFilter.FILE));

        System.out.println("Sorted By Name: ");
        for(File file:sortedFiles) {
            System.out.println(file.getName());
        }
    }
}
