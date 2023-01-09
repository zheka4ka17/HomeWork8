package Factory.common;

public class Ex10 {
    public static void main(String[] args) {
        ImageReader reader = ImageReader.ImageReaderFactory.getImageReader(ImageTypes.JPG);

    }
}
enum ImageTypes{
    BMP,
    JPG,
    PNG

}

