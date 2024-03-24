/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3;

/**
 *
 * @author zaine
 */


import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class FileHandler {
    
    private String filePath ;
    private int fileSizeInKb;
    private int numberOfLines;
    private ArrayList<String> fileContent ;
    public int lines(File file){
    
        Scanner r= new Scanner(System.in);
        int l=0;
        while(r.hasNext())
         
            l++;
            r.close();
            return (l);
  
    }
    public ArrayList<String> content(File f){
      Scanner x=new Scanner(System.in);
      ArrayList<String> c = new ArrayList<String>();
      while(x.hasNext())
          
          
          c.add(x.nextLine());
          return (c);
    }
    public FileHandler(String path){
        
       File f= new File(filePath);
       
       if (f.exists() ){
       
        this.filePath= path;
        this.fileContent=content(f);
        this.fileSizeInKb=(int) (f.length() / 1024);
        this.numberOfLines=lines(f);
           
       } else {
          System.out.println("le chemin n'est pas exist"); 
       }
  
    }
    
    public ArrayList<String> findLinesWithPattern(String pattern){
        
      ArrayList<String> array=new ArrayList<String>();
      for(String ch:fileContent){
       
        if (ch.contains(pattern))
            array.add(ch);
      }  
      return(array);
    
    }
    public boolean compareString1(String str1,String str2){
    
        return(str1.equals(str2));
        
    }
    public boolean compareString2(String str1,String str2){
        
        return(str2==str1);
    }
    public boolean compareString3(String str1,String str2){
      return(str1.equalsIgnoreCase(str2));
    }
    public String reverseString(int lineIndex) {
       String ch = this.fileContent.get(lineIndex);
       StringBuffer ch1 = new StringBuffer(ch);
       String ch2 = ch1.reverse().toString();
    return ch2;
    }
    public StringBuffer removeDuplicates(int lineIndex){
    
    String ch =this.fileContent.get(lineIndex);
    StringBuffer ch1=new StringBuffer();
    for(int i=0;i<ch.length();i++){
      for(int j=0;j<ch1.length();j++){
          if (ch1.charAt(j)!=ch.charAt(i))
                 ch1.append(ch.charAt(i));
      
      }
    
    }
    return(ch1);
    }
    
    
     public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFileSizeInKb() {
        return fileSizeInKb;
    }

    public void setFileSizeInKb(Integer fileSizeInKb) {
        this.fileSizeInKb = fileSizeInKb;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public ArrayList<String> getFileContent() {
        return fileContent;
    }

    public void setFileContent(ArrayList<String> fileContent) {
        this.fileContent = fileContent;
    }
    
    
}
