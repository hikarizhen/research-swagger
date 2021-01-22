import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Base64Sample{
  private static final String UPLOAD__FOLDER = "C:\\temp\\";
  
  public static void main(String[] args){
    System.out.println("Hello World!!");

    //////////////////////////////////////////////////////////////////////
     // Base64サンプル
     Charset charset = StandardCharsets.UTF_8;
     String moji = "abcあいう123";

     //　エンコード
     byte[]a = Base64.getEncoder()
         .encode(moji.getBytes(charset));
     String en1 = new String(a, charset); 
     System.out.println("en1= " + en1);
     // en1= YWJj44GC44GE44GGMTIz

     //　デコード
     byte[]b = Base64.getDecoder().decode(a);
     String de1 = new String(b,charset);
     System.out.println("de1= " + de1);
     // de1= abcあいう123

     //////////////////////////////////////////////////////////////////////
     // データをファイルに書き込むサンプル
     FileInputStream fileInputStream = null;
     try {
        // ファイル名
        String destFileName = "test.txt";
        // original data
        String base64Data = "SGVsbG8gU3dhZ2dlciENClRoaXMgaXMgYSBzYW1wbGUu";
        // decode data
        byte[]bFile = Base64.getDecoder().decode(base64Data.getBytes());

        //save bytes[]into a file
         writeBytesToFileClassic(bFile, UPLOAD__FOLDER + destFileName);
         System.out.println("Done");

     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         if (fileInputStream != null) {
             try {
                 fileInputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

     }
   }

   private static void writeBytesToFileClassic(byte[]bFile, String fileDest) {

    FileOutputStream fileOuputStream = null;
    try {
        fileOuputStream = new FileOutputStream(fileDest);
        fileOuputStream.write(bFile);

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (fileOuputStream != null) {
            try {
                fileOuputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  }
}
