package opencvtest;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class HelloCV {
	
    public static void main(String[] args){
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
            System.out.println("mat = " + mat.dump());
            
            FaceDetection.detectFace(new String( "C:\\projects\\opencvtest\\test\\opencv-test.jpg" ), new String( "C:\\projects\\opencvtest\\test\\opencv-test-processed.jpg" )); 
            
    }
}