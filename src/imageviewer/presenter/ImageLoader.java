package imageviewer.presenter;

import imageviewer.model.Image;

public interface ImageLoader {

    Image next();

    Image prev();
}
