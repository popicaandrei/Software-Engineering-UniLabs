package Ex2;

public class Main {

    public interface Image {
        void display();
        void rotatedImage();
    }


    public class RealImage implements Image {

        private String fileName;

        public RealImage(String fileName){
            this.fileName = fileName;
            loadFromDisk(fileName);
        }

        @Override
        public void display() {
            System.out.println("Displaying " + fileName);
        }

        public void rotatedImage(){
            System.out.println("Display rotated "+fileName);
        }

        private void loadFromDisk(String fileName){
            System.out.println("Loading " + fileName);
        }
    }


    public class ProxyImage implements Image{

        private RealImage realImage;
        private String fileName;

        public ProxyImage(String fileName,int choose){
            this.fileName = fileName;

            if(choose==0) realImage.display();
            else realImage.rotatedImage();
        }


        @Override
        public void display() {
            if(realImage == null){
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }

        public void rotatedImage(){
            System.out.println("Display rotated "+fileName);
        }
    }
}
