/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.awt.image.BufferedImage;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        String file = "D:\\my documents\\java\\NUmberPlateDetection\\src\\Process\\car1.jpg";
        Mat matrix = Imgcodecs.imread(file);
        BufferedImage buff_image = MatToBuffered(matrix);
        LoadImage imageframe = new LoadImage(buff_image);
        imageframe.setVisible(true);
    }

    private static BufferedImage MatToBuffered(Mat matrix) {
        BufferedImage out;
        byte[] data = new byte[320 * 240 * (int) matrix.elemSize()];
        int type;
        matrix.get(0, 0, data);

        if (matrix.channels() == 1) {
            type = BufferedImage.TYPE_BYTE_GRAY;
        } else {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }

        out = new BufferedImage(320, 240, type);

        out.getRaster().setDataElements(0, 0, 320, 240, data);
        return out;
    }
}
