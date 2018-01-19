/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.kunci.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Huda Mana
 */
public class StopwordCheck {
    private String user= "root";//default user MySql
    private String pass= "";//default password Mysql
    private String db= "stemming"; //nama database (harus ada)
    private String url="jdbc:mysql://localhost:3306/"+db;
    private ResultSet rs;
    private Statement stmt;
    private Connection con = null;
     
    private void Connectdata(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection(url,user,pass); 
            //System.out.println("Connect Sucessful");
	}
	catch(Exception e){
		System.out.println("ERROR = "+ e);
	}
    }
    
    public boolean checkingstopword(String in){
        Connectdata();
        try {
            stmt = con.createStatement();
            String takeString = "SELECT * FROM stemming.stopword WHERE word='"+in+"' ";
            rs = stmt.executeQuery(takeString);
            if (rs.next()){ 
               return true;
            }
            else{
               return false;
            }
            
        } catch (Exception e) {
            
        }
        return false;
    }
    public String caseFolding(String inputFile){
        return inputFile.toLowerCase();
    }
}
