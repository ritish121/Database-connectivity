import java.io.FileInputStream;
import java.security.MessageDigest;
import javax.swing.*;
import sun.misc.BASE64Encoder;
import static sun.security.jgss.GSSUtil.login;


/**
* Builds the finger print of file, crypto hash value
*/
public class FingerPrint {
  public static void main(String[] args) throws Exception {
    // get the file path e.g. F:\photos\pictures\Screenshots
    String inputText = JOptionPane.showInputDialog("Input file path");

    // trying to build new message digest which represents and encapsulates
    // the Message Java Digest

    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
    // calculating from the given file running its inside
    // while calculating the digest formula

    FileInputStream input = new FileInputStream(inputText);
    byte[] buffer = new byte[8192];
    int length;
    while( (length = input.read(buffer)) != -1 ) {
      messageDigest.update(buffer, 0, length);
    }
    byte[] raw = messageDigest.digest();

    //printout in 64 base
    BASE64Encoder encoder = new BASE64Encoder();
    String base64 = encoder.encode(raw);

    // and display the results
    JOptionPane.showMessageDialog(null, "welcome user");
    logincheck lgnchk =new logincheck();
    lgnchk.setVisible(true);
    System.out.println("your authentication is successful");


  } // main method end

}  // class end/*
// * To change this license header, choose License Headers in Project Properties.
 /* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 //*/
//package project;

/**
 *
 * @author hp
 */
//public class Project {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
   // }
    
//}
