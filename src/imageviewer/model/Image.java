package imageviewer.model;

import java.io.*;

public class Image {

    private File file;

    public Image(File file) {
        this.file = file;
    }

    public String name() {
        return this.file.getName();
    }

}
