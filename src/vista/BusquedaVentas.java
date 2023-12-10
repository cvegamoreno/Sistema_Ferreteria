/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author PC_TONY
 */
public class BusquedaVentas extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaVentas
     */
    public BusquedaVentas() {
        initComponents();
        this.setSize(813, 655);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBuscarDoc = new javax.swing.JButton();
        btnBuscarFecha = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Listado de Ventas");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 210, 50));

        btnBuscarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarDoc.setText("Buscar");
        btnBuscarDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarDocMouseExited(evt);
            }
        });
        getContentPane().add(btnBuscarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, 30));

        btnBuscarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarFechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarFechaMouseExited(evt);
            }
        });
        getContentPane().add(btnBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 30));
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, 30));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("N° Doc (RUC/DNI) :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 240, 50, 30));

        jCalendar1.setBackground(new java.awt.Color(255, 204, 102));
        jCalendar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendar1.setDate(new java.util.Date(1702241555000L));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(255, 204, 102));
        jCalendar1.setDecorationBordersVisible(true);
        jCalendar1.setFocusable(false);
        jCalendar1.setMinimumSize(new java.awt.Dimension(170, 130));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 340, 270));

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha Emision", "N° Documento", "RUC o DNI", "Nombre Empresa", "TOTAL"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 770, 210));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo bl.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDocMouseEntered
        btnBuscarDoc.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnBuscarDocMouseEntered

    private void btnBuscarDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDocMouseExited
        btnBuscarDoc.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarDocMouseExited

    private void btnBuscarFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFechaMouseEntered
        btnBuscarFecha.setBackground(new Color(249, 162, 28 ));
    }//GEN-LAST:event_btnBuscarFechaMouseEntered

    private void btnBuscarFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFechaMouseExited
        btnBuscarFecha.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarFechaMouseExited

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
            java.util.logging.Logger.getLogger(BusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnBuscarDoc;
    private javax.swing.JButton btnBuscarFecha;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}