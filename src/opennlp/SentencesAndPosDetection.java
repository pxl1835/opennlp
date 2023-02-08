/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opennlp;

/**
 *
 * @author pliu
 */
import java.io.FileInputStream; 
import java.io.InputStream;  

import opennlp.tools.sentdetect.SentenceDetectorME; 
import opennlp.tools.sentdetect.SentenceModel; 
import opennlp.tools.util.Span; 
   
public class SentencesAndPosDetection { 
  
   public static void main(String args[]) throws Exception { 
     
      String sen = "Hi. How are you? Welcome to Tutorialspoint." 
         + " We provide free tutorials on various technologies. Dear Mandom, Yesterday was the day!"; 
      //Loading a sentence model 
      InputStream inputStream = new FileInputStream("E:/netbeansprojects/opennlp/src/opennlp/en-sent.bin"); 
      SentenceModel model = new SentenceModel(inputStream); 
       
      //Instantiating the SentenceDetectorME class 
      SentenceDetectorME detector = new SentenceDetectorME(model);  
       
      //Detecting the position of the sentences in the paragraph  
      Span[] spans = detector.sentPosDetect(sen);  
      
      //Printing the sentences and their spans of a paragraph 
      for (Span span : spans)         
         System.out.println(sen.substring(span.getStart(), span.getEnd())+" "+ span);  
   } 
}  