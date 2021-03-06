/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modos.mod2;

import Modos.mod1.*;
import classes.Questão;

import classes.Estados;
import classes.MapaEstadosBrasil;
import classes.Mapa;
import javax.swing.ImageIcon;
import java.io.IOException;
import Modos.NewJFrame1;
import classes.MapaContinentesPaises;
import classes.Pais;
import classes.continente;
import java.awt.Image;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alexsander
 */
public class Form2 extends javax.swing.JFrame {

    int questao = 0;

    MapaContinentesPaises[] MapContinentesOceanos;
    private static Mapa map = new Mapa();
    public static Random RND = new Random();

    private static continente continente = new continente();
    private static Pais pais = new Pais();
    private static Questão guest = new Questão();

    public void Modifica() {
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0;
        int pc = RND.nextInt(14);
        int pc1 = RND.nextInt(6);
        while (i1 == 0) {
            if (pc1 == 0 || pc1 < 4) {
                i1 = 1;
                saturno.setText(continente.Continente[pc1]);
            }
            else
                pc1 = RND.nextInt(6);
        }
        while (i2 == 0) {
            if (pc == 0 || pc < 5) {
                i2 = 1;
                jupiter.setText(pais.Pais[pc]);
            }
            else
                pc = RND.nextInt(14);
        }
        while (i3 == 0) {
            if (pc > 4 || pc < 10) {
                i3 = 1;
                urano.setText(pais.Pais[pc]);
            }
            else
                pc = RND.nextInt(14);
        }
        while (i4 == 0) {
            if (pc > 9 || pc < 15) {
                i4 = 1;
                marte.setText(pais.Pais[pc]);
            }
            else
                pc = RND.nextInt(14);
        }
        while (i5 == 0) {
            if (pc1 > 4 || pc1 < 7) {
                i5 = 1;
                mercurio.setText(continente.Continente[pc1]);
            }
            else
                pc1 = RND.nextInt(6);
        }
    }

    public Form2() {
        initComponents();
        MapContinentesOceanos = new MapaContinentesPaises[255];
        MapContinentesOceanos[0] = new MapaContinentesPaises(continente.Continente[0], map.continente[0]);
        MapContinentesOceanos[1] = new MapaContinentesPaises(continente.Continente[6], map.continente[1]);
        MapContinentesOceanos[2] = new MapaContinentesPaises(continente.Continente[7], map.continente[2]);
        MapContinentesOceanos[3] = new MapaContinentesPaises(continente.Continente[8], map.continente[3]);
        MapContinentesOceanos[4] = new MapaContinentesPaises(continente.Continente[9], map.continente[4]);
        MapContinentesOceanos[5] = new MapaContinentesPaises(continente.Continente[10], map.continente[5]);
        MapContinentesOceanos[6] = new MapaContinentesPaises(continente.Continente[11], map.continente[6]);
        MapContinentesOceanos[7] = new MapaContinentesPaises(pais.Pais[0], map.pais[0]);
        MapContinentesOceanos[8] = new MapaContinentesPaises(pais.Pais[1], map.pais[1]);
        MapContinentesOceanos[9] = new MapaContinentesPaises(pais.Pais[2], map.pais[2]);
        MapContinentesOceanos[10] = new MapaContinentesPaises(pais.Pais[3], map.pais[3]);
        MapContinentesOceanos[11] = new MapaContinentesPaises(pais.Pais[4], map.pais[4]);
        MapContinentesOceanos[12] = new MapaContinentesPaises(pais.Pais[5], map.pais[5]);
        MapContinentesOceanos[13] = new MapaContinentesPaises(pais.Pais[6], map.pais[6]);
        MapContinentesOceanos[14] = new MapaContinentesPaises(pais.Pais[7], map.pais[7]);
        MapContinentesOceanos[15] = new MapaContinentesPaises(pais.Pais[8], map.pais[8]);
        MapContinentesOceanos[16] = new MapaContinentesPaises(pais.Pais[9], map.pais[9]);
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
        imagemMOD2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        seleciona_pla = new javax.swing.JLabel();
        mercurio = new javax.swing.JRadioButton();
        jupiter = new javax.swing.JRadioButton();
        saturno = new javax.swing.JRadioButton();
        marte = new javax.swing.JRadioButton();
        urano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagemMOD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/continente/africa.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/proximo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        seleciona_pla.setText("Selecione:");

        buttonGroup1.add(mercurio);
        mercurio.setText("África");
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });

        buttonGroup1.add(jupiter);
        jupiter.setSelected(true);
        jupiter.setText("Alemanha");
        jupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterActionPerformed(evt);
            }
        });

        buttonGroup1.add(saturno);
        saturno.setText("Brasil");
        saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(marte);
        marte.setText("América Sul");
        marte.setActionCommand("América do Sul");
        marte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteActionPerformed(evt);
            }
        });

        buttonGroup1.add(urano);
        urano.setText("Chile");
        urano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemMOD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mercurio)
                        .addGap(81, 81, 81)
                        .addComponent(marte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jupiter)
                                .addGap(122, 122, 122)
                                .addComponent(saturno))
                            .addComponent(seleciona_pla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(urano)
                .addGap(77, 77, 77)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagemMOD2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(seleciona_pla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mercurio)
                            .addComponent(marte)
                            .addComponent(urano))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jupiter)
                            .addComponent(saturno))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jupiterActionPerformed

    private void saturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturnoActionPerformed

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mercurioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*ImageIcon icon = new ImageIcon(MapEstadosBrasil[1].getMap());
         imagemMOD1.setIcon(icon);*/
        Modifica();
        questao++;
        if (questao == 1) {
            if (mercurio.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[1].getMap());
            imagemMOD2.setIcon(icon);
            jupiter.setText("América Central");
        }//-------------------------------------------------------------------------------//
        else if (questao == 2) {
            if (jupiter.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[2].getMap());
            imagemMOD2.setIcon(icon);
            jupiter.setText("América do Norte");
        }//-------------------------------------------------------------------------------//
        else if (questao == 3) {
            if (jupiter.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[3].getMap());
            imagemMOD2.setIcon(icon);
            saturno.setText("América do Sul");
        }//-------------------------------------------------------------------------------//
        else if (questao == 4) {
            if (saturno.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[4].getMap());
            imagemMOD2.setIcon(icon);
            mercurio.setText("Ásia");
        }//-------------------------------------------------------------------------------//
        else if (questao == 5) {
            if (mercurio.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[5].getMap());
            imagemMOD2.setIcon(icon);
            urano.setText("Europa");
        }//-------------------------------------------------------------------------------//
        else if (questao == 6) {
            if (urano.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[6].getMap());
            imagemMOD2.setIcon(icon);
            marte.setText("Oceania");
        }//-------------------------------------------------------------------------------//
        else if (questao == 7) {
            if (marte.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[7].getMap());
            imagemMOD2.setIcon(icon);
            marte.setText("Alemanha");
        }//-------------------------------------------------------------------------------//
        else if (questao == 8) {
            if (marte.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[8].getMap());
            imagemMOD2.setIcon(icon);
            urano.setText("Austrália");
        }//-------------------------------------------------------------------------------//
        else if (questao == 9) {
            if (urano.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[9].getMap());
            imagemMOD2.setIcon(icon);
            mercurio.setText("Brasil");
        }//-------------------------------------------------------------------------------//
        else if (questao == 10) {
            if (mercurio.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[10].getMap());
            imagemMOD2.setIcon(icon);
            mercurio.setText("Camarões");
        }//-------------------------------------------------------------------------------//
        else if (questao == 11) {
            if (mercurio.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[11].getMap());
            imagemMOD2.setIcon(icon);
            jupiter.setText("Canadá");
        }//-------------------------------------------------------------------------------//
        else if (questao == 12) {
            if (jupiter.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[12].getMap());
            imagemMOD2.setIcon(icon);
            saturno.setText("Chile");
        }//-------------------------------------------------------------------------------//
        else if (questao == 13) {
            if (saturno.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[13].getMap());
            imagemMOD2.setIcon(icon);
            marte.setText("Estados Unidos");
        }//-------------------------------------------------------------------------------//
        else if (questao == 14) {
            if (marte.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[14].getMap());
            imagemMOD2.setIcon(icon);
            marte.setText("México");
        }//-------------------------------------------------------------------------------//
        else if (questao == 15) {
            if (marte.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[15].getMap());
            imagemMOD2.setIcon(icon);
            saturno.setText("Portugal");
        }//-------------------------------------------------------------------------------//
        else if (questao == 16) {
            if (saturno.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            ImageIcon icon = new ImageIcon(MapContinentesOceanos[16].getMap());
            imagemMOD2.setIcon(icon);
            jupiter.setText("Rússia");
        }//-------------------------------------------------------------------------------//
        else if (questao > 16) {
            if (jupiter.isSelected() == true) {
                guest.questaoMod2(true);
            } else {
                guest.questaoMod2(false);
            }
            this.setVisible(false);
            new NewJFrame1().setVisible(true);
            JOptionPane.showMessageDialog(null, "Modo 2 -> Término");
        }//-------------------------------------------------------------------------------//
    }//GEN-LAST:event_jButton1ActionPerformed

    private void marteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marteActionPerformed

    private void uranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uranoActionPerformed

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
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagemMOD2;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jupiter;
    private javax.swing.JRadioButton marte;
    private javax.swing.JRadioButton mercurio;
    private javax.swing.JRadioButton saturno;
    private javax.swing.JLabel seleciona_pla;
    private javax.swing.JRadioButton urano;
    // End of variables declaration//GEN-END:variables
}
