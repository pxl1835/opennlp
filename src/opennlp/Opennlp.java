/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opennlp;

/**
 *
 * @author pliu
 */
public class Opennlp {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("Hello World from opennlp");
//        //System.out.println("Hello World!")
//    }
    public static void main(String args[]){ 
     
      String sentence = " Hi. How are you? Welcome to Tutorialspoint. " 
         + "We provide free tutorials on various technologies"; 
     
      String simple = "[.?!]";      
      String[] splitString = (sentence.split(simple));     
      for (String string : splitString)   
         System.out.println(string);      
   } 
    
}


/*
Using pom.xml

Convert the project into a Maven project and add the following code to its pom.xml.

<project xmlns="http://maven.apache.org/POM/4.0.0" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
http://maven.apache.org/xsd/maven-4.0.0.xsd"> 
   <modelVersion>4.0.0</modelVersion> 
   <groupId>myproject</groupId> 
   <artifactId>myproject</artifactId> 
   <version>0.0.1-SNAPSHOT</version> 
   <build> 
      <sourceDirectory>src</sourceDirectory> 
      <plugins> 
         <plugin> 
            <artifactId>maven-compiler-plugin</artifactId> 
            <version>3.5.1</version> 
            <configuration> 
               <source>1.8</source> 
               <target>1.8</target> 
            </configuration> 
         </plugin> 
      </plugins> 
   </build> 
   <dependencies>  
      <dependency> 
         <groupId>org.apache.opennlp</groupId> 
         <artifactId>opennlp-tools</artifactId> 
         <version>1.6.0</version> 
     </dependency> 
     <dependency> 
         <groupId>org.apache.opennlp</groupId> 
         <artifactId>opennlp-uima</artifactId> 
         <version>1.6.0</version> 
      </dependency>      
  </dependencies>  
</project> 
*/
