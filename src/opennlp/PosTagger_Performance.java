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

import opennlp.tools.cmdline.PerformanceMonitor; 
import opennlp.tools.postag.POSModel; 
import opennlp.tools.postag.POSSample; 
import opennlp.tools.postag.POSTaggerME; 
import opennlp.tools.tokenize.WhitespaceTokenizer;  

public class PosTagger_Performance { 
   public static void main(String args[]) throws Exception{ 
      //Loading Parts of speech-maxent model       
      InputStream inputStream = new 
         FileInputStream("E:/netbeansprojects/opennlp/src/opennlp/en-pos-maxent.bin"); 
      POSModel model = new POSModel(inputStream); 
       
      //Creating an object of WhitespaceTokenizer class  
      WhitespaceTokenizer whitespaceTokenizer= WhitespaceTokenizer.INSTANCE; 
      
      //Tokenizing the sentence 
      String sentence = "Hi welcome to Tutorialspoint"; 
      String[] tokens = whitespaceTokenizer.tokenize(sentence); 
       
      //Instantiating POSTaggerME class 
      POSTaggerME tagger = new POSTaggerME(model); 
       
      //Generating tags 
      String[] tags = tagger.tag(tokens); 
       
      //Instantiating POSSample class       
      POSSample sample = new POSSample(tokens, tags); 
      System.out.println(sample.toString()); 
       
      //Monitoring the performance of POS tagger 
      PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent"); 
      perfMon.start(); 
      perfMon.incrementCounter(); 
      perfMon.stopAndPrintFinalResult();      
   } 
}
