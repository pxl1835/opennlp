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

public class SentenceDetectionME { 
  
   public static void main(String args[]) throws Exception { 
   
      String sentence = "Hi. How are you? Welcome to Tutorialspoint. " 
         + "We provide free tutorials on various technologies. Dear Ping? today is my first day!"; 
       
      //Loading sentence detector model 
      //InputStream inputStream = new FileInputStream("C:/OpenNLP_models/en-sent.bin"); 
      InputStream inputStream = new FileInputStream("E:\\netbeansprojects\\opennlp\\src\\opennlp\\en-sent.bin"); 
      
      SentenceModel model = new SentenceModel(inputStream); 
       
      //Instantiating the SentenceDetectorME class 
      SentenceDetectorME detector = new SentenceDetectorME(model);  
    
      //Detecting the sentence
      String sentences[] = detector.sentDetect(sentence); 
    
      //Printing the sentences 
      for(String sent : sentences)        
         System.out.println(sent);  
   } 
}