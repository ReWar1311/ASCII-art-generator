import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ASCIIArt {
    static char[] charArray = { ' ', '.', ',', ':', ';', '+', '*', '?', '%', 'S', '#', '@' };;
    private static void createASCII(String url){
        try {
            // Create a BufferedImage from the image file at the specified path
            File imageFile = new File(url);
            BufferedImage originalImage = ImageIO.read(imageFile);
            int width = originalImage.getWidth();
            int height = originalImage.getHeight();
            height = height*100/width;
            width =100;
                    // Create a new BufferedImage for the resized image
            BufferedImage bufferedImage = new BufferedImage(width, height, originalImage.getType());

            
            // Draw the original image resized to the target dimensions
            Graphics2D g2d = bufferedImage.createGraphics();
            g2d.drawImage(originalImage, 0, 0, width, height, null);
            g2d.dispose();

            char[][] art = new char[height][width];
            System.out.println("Image successfully loaded, Width: "+width+" Height: "+height);
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    int rgb = bufferedImage.getRGB(j, i);

                    // Extract the individual color components
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;
         
                    // Calculate the brightness using the weighted formula
                    int  brightness = (int) (0.299 * red + 0.587 * green + 0.114 * blue);
                    int index = (int) (brightness/22);
                    // Output the brightness for the specified pixel
                    art[i][j] = charArray[index];
                    System.out.print(charArray[index]+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading the image file.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter image url/adress: ");
        String urlString = "C:\\Users\\prash\\Desktop\\LabPractice-Week1106_page4_image.png";  
        // String urlString =   scanner.next();
        scanner.close();
        createASCII(urlString);
    }
}
