/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author jose.avelino
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Ag_Id = new javax.swing.JLabel();
        lbl_Ag_Cliente = new javax.swing.JLabel();
        lbl_Ag_Servico = new javax.swing.JLabel();
        lbl_Ag_Valor = new javax.swing.JLabel();
        lbl_Ag_Data = new javax.swing.JLabel();
        lbl_Ag_Hora = new javax.swing.JLabel();
        txt_Ag_Valor = new javax.swing.JTextField();
        lst_Ag_Servico = new javax.swing.JComboBox<>();
        lsl_Ag_Cliente = new javax.swing.JComboBox<>();
        txt_Ag_Hora = new javax.swing.JTextField();
        txt_Ag_Data = new javax.swing.JTextField();
        txt_Ag_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_Ag_Observacao = new javax.swing.JLabel();
        lbl_Ag_H1 = new javax.swing.JLabel();
        lbl_Ag_Painel = new javax.swing.JLabel();
        lbl_Ag_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Ag_Id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Id.setText("Id");
        getContentPane().add(lbl_Ag_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        lbl_Ag_Cliente.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Cliente.setText("Cliente");
        getContentPane().add(lbl_Ag_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        lbl_Ag_Servico.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Servico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Servico.setText("Serviço");
        getContentPane().add(lbl_Ag_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        lbl_Ag_Valor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Valor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Valor.setText("Valor (R$)");
        getContentPane().add(lbl_Ag_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        lbl_Ag_Data.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Data.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Data.setText("Data");
        getContentPane().add(lbl_Ag_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        lbl_Ag_Hora.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Hora.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Hora.setText("Hora");
        getContentPane().add(lbl_Ag_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        txt_Ag_Valor.setText("0");
        txt_Ag_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ag_ValorActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ag_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 170, 40));

        lst_Ag_Servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Corte", "Barba", "Completo" }));
        getContentPane().add(lst_Ag_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 170, 40));

        lsl_Ag_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Pedro", "Tiago", "João" }));
        lsl_Ag_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsl_Ag_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(lsl_Ag_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 170, 40));

        txt_Ag_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ag_HoraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ag_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 170, 40));

        txt_Ag_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ag_DataActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ag_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 170, 40));

        txt_Ag_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ag_IdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ag_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 170, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 350, 270));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AGENDAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 350, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Pedro", "Barba", "10", "22/11/2022", "08:00", null},
                {"2", "Tiago", "Completo", "35", "22/11/2022", "09:00", null},
                {"3", "João", "Corte", "20", "22/11/2022", "10:00", null},
                {"4", "Maria", "Corte", "20", "22/11/2022", "11:00", null}
            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "VALOR", "DATA", "HORA", "OBSERVAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 1110, 340));

        lbl_Ag_Observacao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_Ag_Observacao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_Observacao.setText("Observação");
        getContentPane().add(lbl_Ag_Observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        lbl_Ag_H1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl_Ag_H1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Ag_H1.setText("Agenda");
        getContentPane().add(lbl_Ag_H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        lbl_Ag_Painel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(lbl_Ag_Painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, 1340, 1050));

        lbl_Ag_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(lbl_Ag_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Ag_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ag_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ag_ValorActionPerformed

    private void txt_Ag_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ag_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ag_HoraActionPerformed

    private void txt_Ag_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ag_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ag_DataActionPerformed

    private void txt_Ag_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ag_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ag_IdActionPerformed

    private void lsl_Ag_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsl_Ag_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lsl_Ag_ClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atxt_Ag_Ids.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_Ag_Cliente;
    private javax.swing.JLabel lbl_Ag_Data;
    private javax.swing.JLabel lbl_Ag_Fundo;
    private javax.swing.JLabel lbl_Ag_H1;
    private javax.swing.JLabel lbl_Ag_Hora;
    private javax.swing.JLabel lbl_Ag_Id;
    private javax.swing.JLabel lbl_Ag_Observacao;
    private javax.swing.JLabel lbl_Ag_Painel;
    private javax.swing.JLabel lbl_Ag_Servico;
    private javax.swing.JLabel lbl_Ag_Valor;
    private javax.swing.JComboBox<String> lsl_Ag_Cliente;
    private javax.swing.JComboBox<String> lst_Ag_Servico;
    private javax.swing.JTextField txt_Ag_Data;
    private javax.swing.JTextField txt_Ag_Hora;
    private javax.swing.JTextField txt_Ag_Id;
    private javax.swing.JTextField txt_Ag_Valor;
    // End of variables declaration//GEN-END:variables
}
