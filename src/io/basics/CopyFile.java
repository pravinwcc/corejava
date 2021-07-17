package io.basics;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\MILLICOM-RWANDA-DOC\\HLD\\MCRW BSSaaS SNaaS_HLD PA3.docx");
         out = new FileOutputStream("PRAVIN_MCRW BSSaaS SNaaS_HLD PA3.docx");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}