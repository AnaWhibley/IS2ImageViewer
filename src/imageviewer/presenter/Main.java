package imageviewer.presenter;

public class Main {
    public static void main(String[] args) {
        System.out.println("IS2 - Image Viewer working...");
        FileImageLoader imageLoader = new FileImageLoader("images");
        new MainFrame(imageLoader);
    }
}
