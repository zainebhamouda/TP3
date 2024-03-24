/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3;

/**
 *
 * @author zaine
 */
public class XORCipher {
    private String key;
    
    public XORCipher(String key){
        this.key = key;     
    }
    
    public String encrypt(String plaintext){
        
        StringBuffer encryptedText = new StringBuffer();
        for (int i = 0; i < plaintext.length(); i++) {
            encryptedText.append((char) (plaintext.charAt(i) ^ key.charAt(i % key.length())));
        }
        return encryptedText.toString();
    }
    
    public String decrypt(String ciphertext){
        return encrypt(ciphertext); 
    }
    
    
    public static void main(String args[]) {
      
       
          String key = "secret";
          String plaintext = "Hello, world";
          XORCipher xorCipher = new XORCipher(key);
        // Chiffrement du texte clair
          String encryptedText = xorCipher.encrypt(plaintext);
          System.out.println("Texte chiffré : " + encryptedText);
        // Déchiffrement du texte chiffré
          String decryptedText = xorCipher.decrypt(encryptedText);
          System.out.println("Texte déchiffré : " + decryptedText);
    }
}

