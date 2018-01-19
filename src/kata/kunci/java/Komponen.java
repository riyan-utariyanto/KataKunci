/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.kunci.java;

/**
 *
 * @author riyan
 */
public class Komponen {
    private String word;
    private double tf;
    private int t;
    
    public Komponen(String word){
        this.word=word;
    }
    public Komponen(String word,double tf){
        this.word=word;
        this.tf=tf;
    }
    
    public Komponen(String word,int t,double tf){
        this.word=word;
        this.tf=tf;
        this.t=t;
    }
    
    public int hashCode(){
       // System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = (int) (tf*20);
        hashcode += word.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        //System.out.println("In equals");
        if (obj instanceof Komponen) {
            Komponen pp = (Komponen) obj;
            return (pp.word.equals(this.word) && pp.tf == this.tf);
        } else {
            return false;
        }
    }
    public String getWord(){
        return this.word;
    }
    public double getTfidf(){
        return this.tf;
    }
    public int getTf(){
        return this.t;
    }
    public void setWord(String word){
        this.word = word;
    }
    public void setTf(double tf){
        this.tf=tf;
    }
    public void setT(int t){
        this.t=t;
    }
   public String toString(){
        return "Term : "+word+", TF : "+t;
    }
}
