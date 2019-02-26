package com.company.yatsenko.commonsIo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.input.TeeInputStream;
import org.apache.commons.io.output.TeeOutputStream;

import java.io.*;
import java.nio.charset.Charset;

public class App01 {
    public void copying() throws IOException {
        File file = FileUtils.getFile(getClass().getClassLoader()
                .getResource("fileTest.txt")
                .getPath());
        File tempDir = FileUtils.getTempDirectory();
        FileUtils.copyFileToDirectory(file, tempDir);
        File newTempFile = FileUtils.getFile(tempDir, file.getName());
        String data = FileUtils.readFileToString(newTempFile,
                Charset.defaultCharset());
    }
    public void path(){
        String fullPath = FilenameUtils.getFullPath("");
        String extension = FilenameUtils.getExtension("");
        String baseName = FilenameUtils.getBaseName("");
    }
    public void func() throws IOException {
        String str = "Hello World.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();

        FilterOutputStream teeOutputStream
                = new TeeOutputStream(outputStream1, outputStream2);
        new TeeInputStream(inputStream, teeOutputStream, true)
                .read(new byte[str.length()]);

//        assert(str, String.valueOf(outputStream1));
//        assert(str, String.valueOf(outputStream2));
    }
}
