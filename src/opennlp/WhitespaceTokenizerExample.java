/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opennlp;

/**
 *
 * @author pliu
 */
import opennlp.tools.tokenize.WhitespaceTokenizer;  

public class WhitespaceTokenizerExample {  
   
   public static void main(String args[]){ 
     
      String sentence = "Hi. How are you? Welcome to Tutorialspoint. " 
         + "We provide free tutorials on various technologies"; 
    
      //Instantiating whitespaceTokenizer class 
       WhitespaceTokenizer whitespaceTokenizer = WhitespaceTokenizer.INSTANCE;  
       
      //Tokenizing the given paragraph 
      String tokens[] = whitespaceTokenizer.tokenize(sentence);  
       
      //Printing the tokens 
      for(String token : tokens)     
         System.out.println(token);        
   } 
}