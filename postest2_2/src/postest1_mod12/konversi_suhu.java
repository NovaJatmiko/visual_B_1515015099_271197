/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest1_mod12;
/**
 
 *
 * @author acer
 */
import javax.swing.JOptionPane;

public class konversi_suhu extends javax.swing.JFrame {
int input;
int output_clft=0,output_clkn=0,output_ftcl=0,output_ftkn=0,output_kncl=0,output_knft=0;
    /**
     * Creates new form konversi_suhu
     */
    public konversi_suhu() {
        initComponents();
    }
    public void parsing () {
        try {
       input=Integer.parseInt(kol_in.getText().toString());
       } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(this, "Harap Masukkan Angka saja", "Peringatan !", JOptionPane.CANCEL_OPTION); }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kol_in = new javax.swing.JTextField();
        in_c = new javax.swing.JRadioButton();
        in_f = new javax.swing.JRadioButton();
        in_k = new javax.swing.JRadioButton();
        derajat = new javax.swing.JPanel();
        out_c = new javax.swing.JRadioButton();
        out_f = new javax.swing.JRadioButton();
        out_k = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        kol_out = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel3.setText("PROGRAM KONVERSI SUHU");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Input");

        in_c.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(in_c);
        in_c.setText("Celcius");
        in_c.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                in_cAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        in_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                in_cMouseClicked(evt);
            }
        });

        in_f.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(in_f);
        in_f.setText("Fahrenheid");
        in_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                in_fMouseClicked(evt);
            }
        });

        in_k.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(in_k);
        in_k.setText("Kelvin");
        in_k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                in_kMouseClicked(evt);
            }
        });

        derajat.setBackground(new java.awt.Color(153, 153, 153));

        out_c.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup2.add(out_c);
        out_c.setText("Celcius");
        out_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                out_cMouseClicked(evt);
            }
        });

        out_f.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup2.add(out_f);
        out_f.setText("Fahrenheid");
        out_f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                out_fMouseClicked(evt);
            }
        });

        out_k.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup2.add(out_k);
        out_k.setText("Kelvin");
        out_k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                out_kMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Output");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Konversi Ke");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout derajatLayout = new javax.swing.GroupLayout(derajat);
        derajat.setLayout(derajatLayout);
        derajatLayout.setHorizontalGroup(
            derajatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derajatLayout.createSequentialGroup()
                .addGroup(derajatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajatLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2))
                    .addGroup(derajatLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(kol_out, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, derajatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(out_c, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(out_f, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(out_k, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        derajatLayout.setVerticalGroup(
            derajatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derajatLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(derajatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(out_c)
                    .addComponent(out_f)
                    .addComponent(out_k))
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kol_out, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kol_in, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(in_c, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(in_f, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(in_k, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(derajat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kol_in, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_c)
                    .addComponent(in_f)
                    .addComponent(in_k))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(derajat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_cAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_in_cAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_in_cAncestorAdded

    private void in_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_in_cMouseClicked
this.parsing();
        if(in_c.isSelected()==true) // if check box is checked
       {
         output_clft=(int) ((1.8 * input) + 32);
         output_clkn=input + 273;
            out_c.setEnabled(false);
            out_f.setEnabled(true);
            out_k.setEnabled(true);
         }                     
    }//GEN-LAST:event_in_cMouseClicked

    private void in_fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_in_fMouseClicked
this.parsing();
        if(in_f.isSelected()==true) // if check box is checked
       {    output_ftcl=(int) (0.55 * (input - 32));
            output_ftkn=(int) (0.55 * (input - 32) + 273);
            out_f.setEnabled(false);
            out_c.setEnabled(true);
            out_k.setEnabled(true);
         }
    }//GEN-LAST:event_in_fMouseClicked

    private void in_kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_in_kMouseClicked
this.parsing();
        if(in_k.isSelected()==true) // if check box is checked
       {    output_kncl=input-273;
            output_knft=(int) (1.8 * (input-273)+32);
            out_k.setEnabled(false);
            out_f.setEnabled(true);
            out_c.setEnabled(true);
         }
    }//GEN-LAST:event_in_kMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void out_kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_out_kMouseClicked
        this.parsing();
        if(out_k.isSelected()==true && in_c.isSelected()==true){ kol_out.setText(""+output_clkn);
            }
        else if(out_k.isSelected()==true && in_f.isSelected()==true){ kol_out.setText(""+output_ftkn);
            }
        else { kol_out.setText("");}
    }//GEN-LAST:event_out_kMouseClicked

    private void out_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_out_cMouseClicked
        this.parsing();
        if(out_c.isSelected()==true && in_f.isSelected()==true){ kol_out.setText(""+output_ftcl);
            }
        else if(out_c.isSelected()==true && in_k.isSelected()==true){ kol_out.setText(""+output_kncl);
            }
        else { kol_out.setText("");}
    }//GEN-LAST:event_out_cMouseClicked

    private void out_fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_out_fMouseClicked
        this.parsing();
        if(out_f.isSelected()==true && in_c.isSelected()==true){ kol_out.setText(""+output_clft);
            }
        else if(out_f.isSelected()==true && in_k.isSelected()==true){ kol_out.setText(""+output_knft);
        }
        else { kol_out.setText(""); }
    }//GEN-LAST:event_out_fMouseClicked

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
            java.util.logging.Logger.getLogger(konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konversi_suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversi_suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel derajat;
    private javax.swing.JRadioButton in_c;
    private javax.swing.JRadioButton in_f;
    private javax.swing.JRadioButton in_k;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField kol_in;
    private javax.swing.JTextField kol_out;
    private javax.swing.JRadioButton out_c;
    private javax.swing.JRadioButton out_f;
    private javax.swing.JRadioButton out_k;
    // End of variables declaration//GEN-END:variables
}
