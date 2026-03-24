
import java.io.File;


public class fileClass {
    public static void main(String[] args){

        File f = new File("test.txt");

        try {
            if(f.createNewFile()){
                System.out.println("file created: " + f.getName());
            } else{
                System.out.println("file already exist");
            }

            //property
            System.out.println("file name : " + f.getName());
            System.out.println("path : " + f.getAbsolutePath());
            System.out.println("read : " + f.canRead());
            System.out.println("write : " + f.canWrite());
            System.out.println("length : " + f.length());

        } catch (Exception e) {
            System.out.println("error");
        }
        
    }
}
