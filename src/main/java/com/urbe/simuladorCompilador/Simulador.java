/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.urbe.simuladorCompilador;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author carlos
 * @author diego
 * @author andrés
 */
public class Simulador extends javax.swing.JFrame {

    /**
     * Creates new form SIMULADOR
     */
    public Simulador() {
        initComponents();
    }

    public Simulador(String fuente) {
        initComponents();
        codigo.setText(fuente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonCorrer = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        abrir = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        lexico = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIMULADOR");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("SIMULADOR DE COMPILADOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("ÁREA DE TRABAJO");

        botonCorrer.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        //botonCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/urbe/simuladorCompilador/Correr.png"))); // NOI18N
        botonCorrer.setText("Léxico");
        botonCorrer.setActionCommand("btnCorrer");

        botonCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lexico l = new Lexico(codigo.getText());
                l.setVisible(true);
                dispose();
            }
        });

        botonBorrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        //botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/com/urbe/simuladorCompilador/Borrar.png"))); // NOI18N
        botonBorrar.setText("Limpiar");
        botonBorrar.setActionCommand("btnBorrar");

        codigo.setColumns(20);
        codigo.setRows(5);
        jScrollPane1.setViewportView(codigo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(270, 283, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonBorrar)
                        .addGap(27, 27, 27)
                        .addComponent(botonCorrer)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCorrer)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        abrir.setText("Archivo");
        abrir.setActionCommand("Menu_file");

        Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					JFileChooser fc = new JFileChooser();
					fc.setCurrentDirectory(new File(System.getProperty("user.home")));
					fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
					fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivo TXT", "txt"));
					fc.setAcceptAllFileFilterUsed(true);
					
					int res = fc.showOpenDialog(jPanel1);
					
					if (res == JFileChooser.APPROVE_OPTION) {
						File archivo = fc.getSelectedFile(); 
						try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
						    while ((br.readLine()) != null) {
						    	String texto = "";
						    	texto = new String(Files.readAllBytes(Paths.get(archivo.getPath())));
						    	codigo.setText(texto);
						    }
						}
					}
				}
				catch (Exception ex){
					ex.printStackTrace();
				}
            }
        });
        abrir.add(Abrir);

        Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  JFileChooser chooser = new JFileChooser();
				  chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
				  int res = chooser.showSaveDialog(jPanel1);
				  if (res == chooser.APPROVE_OPTION) { 
				      File guardar = new File(chooser.getSelectedFile()+"\\Texto.txt");
				      try {
						BufferedWriter bw = new BufferedWriter(new FileWriter(guardar));
						String[] lineas = codigo.getText().split("\n");
						for (int i = 0; i < lineas.length; i++) {
							bw.write(lineas[i]);
                            if(i < lineas.length - 1)
                                bw.write("\n");
						}
						JOptionPane.showMessageDialog(jPanel1, "Se ha guardado el texto en el bloc de notas");
						bw.close();
				      } catch (IOException e1) {
						e1.printStackTrace();
				      };
				      
				  } 
            }
        });
        abrir.add(Guardar);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        abrir.add(salir);

        jMenuBar2.add(abrir);

        lexico.setText("Análisis");
        lexico.setActionCommand("Menu_edit");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Léxico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lexico l = new Lexico(codigo.getText());
                l.setVisible(true);
                dispose();
            }
        });
        lexico.add(jMenuItem4);

        jMenuBar2.add(lexico);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                codigo.setText("");
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Simulador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu abrir;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCorrer;
    private javax.swing.JTextArea codigo;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu lexico;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
