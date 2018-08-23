/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base64_utility;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author thinh.huynh
 */
public class Base64_Utility {

    /**
     * @param args the command line arguments
     */
    private static String encodeFileToBase64Binary(File file) {
        String encodedfile = null;
        try {
            // Read file through FileInputStream without Buffer
            // FileInputStream fileInputStreamReader = new FileInputStream(file);
            
            // Read file through FileInputStream with Buffer(Read many bytes at once), Increasing efficiency !
            InputStream fileInputStreamReader = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[(int) file.length()];   // Create variable bytes with data length = file length
            fileInputStreamReader.read(bytes);  // Write data from file to variable, byte[] bytes, through InputStream under binary data
            encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");  // Convert binary data to base64 String
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }

    public static void writeByteToImageFile(byte[] imgBytes, String imgFileName) throws IOException {
        File imgFile = new File(imgFileName);
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(imgBytes));
        ImageIO.write(img, "png", imgFile);
    }
    /*
    public static byte[] convertToImg(String base64) throws IOException {
        return Base64.decodeBase64(base64);
    }
    */
    public static void decodeBase64BinaryToImage(String decodedString) {
        // Convert base64 string to binary data
        byte[] data = DatatypeConverter.parseBase64Binary(decodedString);   // Convert base64 String to binary data
        String path = "D:/image.png";
        File file = new File(path);
        
        // Write binary data to File
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(data);   // Write data from variable, byte[] data, to file through OutputStream under binary data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        File encodedFile = new File("D:/banner-brand-swim.jpg");
        String encodedstring = encodeFileToBase64Binary(encodedFile);
        System.out.println(encodedstring);
        decodeBase64BinaryToImage(encodedstring);
        System.out.println("Decode successfully !");
        System.out.println("D:/image.png");
    }

}
