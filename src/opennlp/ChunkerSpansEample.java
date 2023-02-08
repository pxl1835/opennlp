/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opennlp;

/**
 *
 * @author pliu
 */
import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStream;  

import opennlp.tools.chunker.ChunkerME; 
import opennlp.tools.chunker.ChunkerModel; 
import opennlp.tools.cmdline.postag.POSModelLoader; 
import opennlp.tools.postag.POSModel; 
import opennlp.tools.postag.POSTaggerME; 
import opennlp.tools.tokenize.WhitespaceTokenizer; 
import opennlp.tools.util.Span;  

public class ChunkerSpansEample{ 
   
   public static void main(String args[]) throws IOException { 
      //Load the parts of speech model 
      File file = new File("E:/netbeansprojects/opennlp/src/opennlp/en-pos-maxent.bin");     
      POSModel model = new POSModelLoader().load(file); 
       
      //Constructing the tagger 
      POSTaggerME tagger = new POSTaggerME(model); 
  
      //Tokenizing the sentence 
      String sentence = "Hi welcome to Tutorialspoint";       
      WhitespaceTokenizer whitespaceTokenizer= WhitespaceTokenizer.INSTANCE; 
      String[] tokens = whitespaceTokenizer.tokenize(sentence); 
       
      //Generating tags from the tokens 
      String[] tags = tagger.tag(tokens);       
   
      //Loading the chunker model 
      InputStream inputStream = new 
         FileInputStream("E:/netbeansprojects/opennlp/src/opennlp/en-chunker.bin"); 
      ChunkerModel chunkerModel = new ChunkerModel(inputStream);
      ChunkerME chunkerME = new ChunkerME(chunkerModel);       
           
      //Generating the tagged chunk spans 
      Span[] span = chunkerME.chunkAsSpans(tokens, tags); 
       
      for (Span s : span) 
         System.out.println(s.toString());  
   }    
}
