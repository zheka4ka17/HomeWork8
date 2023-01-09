package Factory.common;



public interface ImageReader {

    class ImageReaderFactory {

        private ImageReaderFactory() {
        }


        public static ImageReader getImageReader(ImageTypes type) {
            if (type == null) {
                throw new IllegalArgumentException();
            }
            ImageReader imageReader;
            switch (type) {
                case BMP:
                    imageReader = new BmpReader();
                    break;
                case PNG:
                    imageReader = new PngReader();
                    break;
                case JPG:
                    imageReader = new JpgReader();
                default:
                    throw new IllegalArgumentException();


            }
            return imageReader;

        }

    }
}

