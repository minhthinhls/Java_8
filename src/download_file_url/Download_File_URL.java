/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package download_file_url;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 *
 * @author thinh.huynh
 */
public class Download_File_URL {

    /**
     * @param args the command line arguments
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        /*  TODO code application logic here
            Make sure that this directory exists! */
        String directoryName = System.getProperty("user.home");
        directoryName += "\\Downloads\\";

        String source = "https://www.tutorialspoint.com/java/java_tutorial.pdf";

        System.setProperty("http.agent", "Chrome");
        // saveFileFromUrlWithCommonsIO("newXLS.xls", source);

        try {
            saveFileFromUrlWithJavaIO(directoryName + getFileName(source), source);
            System.out.println("Finished downloading !");
            System.out.println("Downloaded directory: " + directoryName + getFileName(source));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Using Java IO
    public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(fileName);
            byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }

    // Using Commons IO library
    // Available at http://commons.apache.org/io/download_io.cgi
    public static void saveFileFromUrlWithCommonsIO(String fileName, String fileUrl) throws MalformedURLException, IOException {
        fileName = "D://" + fileName;
        FileUtils.copyURLToFile(new URL(fileUrl), new File(fileName));
    }

    public static String getFileName(String url) throws URISyntaxException {
        String filename = Paths.get(new URI(url).getPath()).getFileName().toString();
        return filename;
    }

}
