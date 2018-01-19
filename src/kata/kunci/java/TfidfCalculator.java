/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.kunci.java;

import java.util.List;

/**
 *
 * @author Huda Mana
 */
public class TfidfCalculator {
    //menghitung frekuensi term dari document
       
    public double tf2(List<String> doc, String term){
        double n= 0;
        for (String word : doc){
            if(term.equalsIgnoreCase(word))
                n++;
        }
        return n;
    }
    
    public double tfidf2(List<String> doc, String term){
        return (1/tf2(doc,term));
    }
    
}
