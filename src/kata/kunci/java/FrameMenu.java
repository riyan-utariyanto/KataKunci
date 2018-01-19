/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.kunci.java;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JTextArea;

/**
 *
 * @author riyan
 */
public class FrameMenu extends javax.swing.JFrame {

    //Parameter Global;
    String inputan,kesimpulan,ranking,stem,stopw,tokenize;
    int nToken,nStopw,nStem,nKey;
    public FrameMenu() {
        initComponents();
        getContentPane().setBackground(Color.white);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btnRun = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTokenize = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtStopword = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtStemming = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRanking = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtKesimpulan = new javax.swing.JTextArea();
        txtJumlahTokenize = new javax.swing.JTextField();
        txtJumlahStopw = new javax.swing.JTextField();
        txtJumlahStem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJumlahKey = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KATA KUNCI\n");
        setBackground(new java.awt.Color(255, 153, 153));
        setSize(new java.awt.Dimension(0, 0));

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("INPUT PARAGRAF");

        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtInput.setRows(5);
        txtInput.setLineWrap(true);
        txtInput.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtInput);

        btnRun.setText("JALANKAN");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnRun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRun)
                    .addComponent(btnReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setText("HASIL TOKENIZE");

        jLabel3.setText("STOPWORD REMOVAL");

        jLabel4.setText("STEMMING");

        jLabel5.setText("RANKING OF WORD");

        jLabel6.setText("KATA KUNCI");

        txtTokenize.setColumns(20);
        txtTokenize.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTokenize.setRows(5);
        txtTokenize.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTokenize.setEnabled(false);
        txtTokenize.setLineWrap(true);
        txtTokenize.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtTokenize);

        txtStopword.setColumns(20);
        txtStopword.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtStopword.setRows(5);
        txtStopword.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtStopword.setEnabled(false);
        txtStopword.setLineWrap(true);
        txtStopword.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtStopword);

        txtStemming.setColumns(20);
        txtStemming.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtStemming.setRows(5);
        txtStemming.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtStemming.setEnabled(false);
        txtStemming.setLineWrap(true);
        txtStemming.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtStemming);

        txtRanking.setColumns(20);
        txtRanking.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtRanking.setRows(5);
        txtRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRanking.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRanking.setEnabled(false);
        txtRanking.setLineWrap(true);
        txtRanking.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtRanking);

        txtKesimpulan.setColumns(20);
        txtKesimpulan.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtKesimpulan.setRows(5);
        txtKesimpulan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKesimpulan.setEnabled(false);
        txtInput.setLineWrap(true);
        txtInput.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtKesimpulan);

        txtJumlahTokenize.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJumlahTokenize.setEnabled(false);
        txtJumlahTokenize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahTokenizeActionPerformed(evt);
            }
        });

        txtJumlahStopw.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJumlahStopw.setEnabled(false);
        txtJumlahStopw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahStopwActionPerformed(evt);
            }
        });

        txtJumlahStem.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJumlahStem.setEnabled(false);

        jLabel7.setText("JUMLAH KATA");

        jLabel8.setText("JUMLAH KATA");

        jLabel9.setText("JUMLAH KATA");

        jLabel10.setText("JUMLAH KATA KUNCI");

        txtJumlahKey.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJumlahKey.setEnabled(false);
        txtJumlahKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahKeyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJumlahTokenize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJumlahStopw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahStem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJumlahKey, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJumlahTokenize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJumlahStopw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJumlahStem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10)
                        .addComponent(txtJumlahKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearscreen(){
        txtInput.setText("");
        txtKesimpulan.setText("");
        txtRanking.setText("");
        txtStemming.setText("");
        txtStopword.setText("");
        txtTokenize.setText("");
        txtJumlahKey.setText("");
        txtJumlahStem.setText("");
        txtJumlahStopw.setText("");
        txtJumlahTokenize.setText("");
    }
    private void eksekusiKata(String input){
        List<String> allKata = new ArrayList<>();
        List<String> stopword = new ArrayList<>();
        List<String> stemming = new ArrayList<>();
        List<Komponen> komp = new ArrayList<>();
        String tmp;
        //mengubah semua hruf menjadi kecil
        StopwordCheck cs = new StopwordCheck();
        String kal = cs.caseFolding(input);
       
        // create StringTokenizer object
        StringTokenizer st = new StringTokenizer(kal,"=-+/_() ,.?!:;");
            while(st.hasMoreTokens()) {
            // add tokens to AL
            allKata.add(st.nextToken());
        }
        
        inputan="";
        kesimpulan="";
        ranking="";
        stem="";
        stopw="";
        tokenize="";
        
        
        // original String
        System.out.println("\nString yang masuk : \n  [ " + kal+" ] ");
        
        // iterate through AL - using forEach loop
        System.out.print("\nHasil Tokenisasi : \n  { ");
        tmp = "";
        for(String el : allKata) {
            System.out.print(el+", ");
            tmp = el+", ";
            tokenize = tokenize+tmp;
        }
        
        nToken = allKata.size();
        System.out.println("}\n  Ukuran List-nya : "+allKata.size());
    
        //menghitung kata-kata yang ada
        List listhash = new ArrayList(new HashSet(allKata));       
        System.out.print("\n\nKata-kata dalam list : \n  { ");

        for (int k = 0; k < listhash.size(); k++){
            System.out.print(listhash.get(k)+", ");
        }
        System.out.println("}\n  Jumlah kata : "+listhash.size());
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////        
       
        StopwordCheck checkstopword = new StopwordCheck();
        System.out.print("\nHasil penghapusan Stopword : \n  { ");
        //iterasi cek stopword, jika kata berada dalam daftar stopword kata akan dihapus
        tmp="";
        int n=0;
        for(int k=0;k < allKata.size();k++) {        
            if((checkstopword.checkingstopword(allKata.get(k)+""))==false){
                stopword.add(allKata.get(k)+"");
                System.out.print(allKata.get(k)+", ");
                tmp=allKata.get(k)+", ";
                stopw = stopw+tmp;
                n++;
            }       
        }
        System.out.println("}");
        nStopw = n;
        
        //Membuat Objek Stemming
        Stemming2 objstem = new Stemming2();
        //Memanggil fungsi BacakataDasar u/ load kata dasar dari database
        objstem.BacaKataDasar();
        System.out.print("\nKata setelah Stemming : \n  { ");
        tmp="";
        n = 0;
        //iterasi penyimpanan hasil stemming ke list stemming
        for(int k = 0 ; k <stopword.size(); k++){
           stemming.add(objstem.KataDasar(stopword.get(k)));
           System.out.print(stemming.get(k)+", ");
           tmp = stemming.get(k)+", ";
           stem = stem+tmp;
           n++;
        }
        System.out.println("}");
        nStem = n;
        //Membuat objek 
        TfidfCalculator calculator = new TfidfCalculator();
        //proses perhitungan tf dan idf kemudian di add di List komp
        for(int k = 0 ; k <stemming.size(); k++){
           double tfidf = calculator.tfidf2(stemming,stemming.get(k)+"");
           int tf =  (int) calculator.tf2(stemming, stemming.get(k)+"");
           komp.add(new Komponen(stemming.get(k)+"",tf,tfidf));
        }
        
        //Menghapus kata yang sama.
        HashSet<Komponen> hs = new HashSet<>();
        hs.addAll(komp);
        komp.clear();
        komp.addAll(hs);
        
        //Sorting List berdasar abjad dari term
        Collections.sort(komp, new Comparator<Komponen>() {
            @Override
            public int compare(Komponen o1, Komponen o2) {
                return String.valueOf(o1.getWord()).compareTo(o2.getWord());
            }
        });
                
        //urutkan kata berdasr nilai idf paling kecil
        Collections.sort(komp, new Comparator<Komponen>() {
            @Override
            public int compare(Komponen o1, Komponen o2) {
                return Integer.valueOf(o2.getTf()).compareTo(o1.getTf());
            }
        });
        //Cetak kata dan tf-nya dari hasil yang sudah diurutkan
        System.out.println("\nNilai tf dan idf sort by value:");
        n = 0;
        tmp="";
        for (Komponen k: komp){
            System.out.println((n+1)+". "+k);
            tmp = (n+1)+". "+k+"\n";
            ranking = ranking+tmp; 
            n++;
        }
        System.out.println("  [ Banyak kata setelah penghapusan stopword dan proses stemming : "+n+" ]");
        
        //Kesimpulan
        n=0;
        System.out.println("Kata Kunci : ");
        tmp="";
        for (int i=0;i<komp.size();i++){
            if(komp.get(i).getTf()>=2){
                System.out.println(" - "+komp.get(i).getWord()+" TF : "+komp.get(i).getTf());
                tmp = " - "+komp.get(i).getWord()+" TF : "+komp.get(i).getTf()+"\n";
                kesimpulan = kesimpulan+tmp;
                n++;
            }
        }
        if(n==0){
            kesimpulan = komp.get(0)+"\n";
            n++;
        }
        nKey = n;
    }
    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        inputan = txtInput.getText();
        eksekusiKata(inputan);
        txtKesimpulan.setText(kesimpulan);
        txtRanking.setText(ranking);
        txtStemming.setText(stem);
        txtStopword.setText(stopw);
        txtTokenize.setText(tokenize);
        
        txtJumlahTokenize.setText(""+nToken);
        txtJumlahStopw.setText(""+nStopw);
        txtJumlahStem.setText(""+nStem);
        txtJumlahKey.setText(""+nKey);
        
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearscreen();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtJumlahKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahKeyActionPerformed

    private void txtJumlahStopwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahStopwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahStopwActionPerformed

    private void txtJumlahTokenizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahTokenizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahTokenizeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextField txtJumlahKey;
    private javax.swing.JTextField txtJumlahStem;
    private javax.swing.JTextField txtJumlahStopw;
    private javax.swing.JTextField txtJumlahTokenize;
    private javax.swing.JTextArea txtKesimpulan;
    private javax.swing.JTextArea txtRanking;
    private javax.swing.JTextArea txtStemming;
    private javax.swing.JTextArea txtStopword;
    private javax.swing.JTextArea txtTokenize;
    // End of variables declaration//GEN-END:variables
}
