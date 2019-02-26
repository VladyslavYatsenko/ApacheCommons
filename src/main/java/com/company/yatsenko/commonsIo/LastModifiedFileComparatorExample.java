package com.company.yatsenko.commonsIo;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.FileFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

public class LastModifiedFileComparatorExample {
    public static void main(String[] args) {
        try {
            usingLastModifiedFileComparator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingLastModifiedFileComparator() throws IOException {
        //get the current directory
        File currentDirectory = new File(".");

        LastModifiedFileComparator comparator = new LastModifiedFileComparator();

        File[] sortedFiles = comparator.sort(currentDirectory.listFiles((FileFilter) FileFileFilter.FILE));

        System.out.println("Sorted By Last Modified date: ");
        for(File file:sortedFiles) {
            System.out.println(file.getName() + ", Modified on: " + new Date(file.lastModified()));
        }
    }
}
