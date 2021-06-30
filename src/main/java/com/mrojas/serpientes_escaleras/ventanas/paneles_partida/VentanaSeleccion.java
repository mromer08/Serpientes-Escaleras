/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrojas.serpientes_escaleras.ventanas.paneles_partida;

import com.mrojas.serpientes_escaleras.jugador.Jugador;
import com.mrojas.serpientes_escaleras.jugador.VectorJugador;
import com.mrojas.serpientes_escaleras.ventanas.VentanaPartida;
import com.mrojas.serpientes_escaleras.ventanas.VentanaPartida2;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu
 */
public class VentanaSeleccion extends javax.swing.JFrame {

    private int fila = -1;
    private int seleccionado = -1;
    private VectorJugador jugadores;
    private DefaultListModel modelo = new DefaultListModel();

    public VentanaSeleccion(VectorJugador jugadores) {
        initComponents();
        this.modelo = new DefaultListModel();
        this.jugadores = jugadores;
        this.setVisible(true);
        setLocationRelativeTo(null);
        actualizarTabla();
        botonComenzar.setEnabled(false);
        if (jugadores.getSize() == 0) {
            botonSeleccionar.setEnabled(false);
            botonDeseleccionar.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        botonSeleccionar = new javax.swing.JButton();
        botonDeseleccionar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonComenzar = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJugador = new javax.swing.JTable();
        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelSeleccionados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSeleccionados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBotones.setPreferredSize(new java.awt.Dimension(200, 200));

        botonSeleccionar.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        botonSeleccionar.setText("SELECCIONAR");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        botonDeseleccionar.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        botonDeseleccionar.setText("DESELECCIONAR");
        botonDeseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeseleccionarActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonComenzar.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        botonComenzar.setText("COMENZAR!");
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDeseleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(botonComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonDeseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(botonComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.EAST);

        jPanelTabla.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanelTabla.setLayout(new java.awt.BorderLayout());

        jTableJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJugadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableJugador);

        jPanelTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelTabla, java.awt.BorderLayout.CENTER);

        jPanelSuperior.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCION DE JUGADORES");
        jPanelSuperior.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.NORTH);

        jPanelSeleccionados.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanelSeleccionados.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setText("JUGADORES SELECCIONADOS:");
        jPanelSeleccionados.add(jLabel2, java.awt.BorderLayout.NORTH);

        jListSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSeleccionadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListSeleccionados);

        jPanelSeleccionados.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelSeleccionados, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        if (fila > -1) {
            if (verificarRepetido(jugadores.getJugador(fila))) {
                JOptionPane.showMessageDialog(this, "El jugador ya se encuentra seleccionado", "Jugador repetido", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (modelo.getSize() < 6) {
                    System.out.println(modelo.getSize());
                    modelo.addElement(jugadores.getJugador(fila));
                    jListSeleccionados.setModel(modelo);
                } else {
                    JOptionPane.showMessageDialog(this, "Solo puede haber un máximo de 6 jugadores", "Maximo de jugadores", JOptionPane.WARNING_MESSAGE);
                }
            }

            fila = -1;
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado el jugador que desea agregar a la partida", "Seleccionar jugador", JOptionPane.WARNING_MESSAGE);
        }
        comenzarBotonHabilitar();
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void jTableJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJugadorMouseClicked
        fila = jTableJugador.getSelectedRow();
    }//GEN-LAST:event_jTableJugadorMouseClicked

    private void botonDeseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeseleccionarActionPerformed
        if (seleccionado > -1) {
            modelo.removeElementAt(seleccionado);
            seleccionado = -1;
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado el jugador que desea quitar", "Deseleccionar jugador", JOptionPane.WARNING_MESSAGE);
        }
        comenzarBotonHabilitar();
    }//GEN-LAST:event_botonDeseleccionarActionPerformed

    private void jListSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSeleccionadosMouseClicked
        seleccionado = jListSeleccionados.getSelectedIndex();
    }//GEN-LAST:event_jListSeleccionadosMouseClicked

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        // TODO add your handling code here:
        //new VentanaPartida();
        new VentanaPartida2(seleccionados(modelo));

    }//GEN-LAST:event_botonComenzarActionPerformed

    private void actualizarTabla() {
        Object[][] datos = new Object[jugadores.getSize()][2];

        for (int i = 0; i < jugadores.getSize(); i++) {
            datos[i][0] = jugadores.getJugador(i).getId();
            datos[i][1] = jugadores.getJugador(i);
        }

        jTableJugador.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "ID", "Nombre y Apellido"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

    }

    private boolean verificarRepetido(Object objeto) {
        boolean repetido = false;
        for (int i = 0; i < modelo.getSize(); i++) {
            if (modelo.getElementAt(i).equals(objeto)) {
                repetido = true;
            }
        }
        return repetido;
    }

    private Jugador[] seleccionados(DefaultListModel modeloList) {
        Jugador[] seleccionados = new Jugador[modeloList.getSize()];
        for (int i = 0; i < modeloList.getSize(); i++) {
            seleccionados[i] = (Jugador) modeloList.getElementAt(i);
        }
        return seleccionados;
    }

    private void comenzarBotonHabilitar() {
        if (modelo.getSize() >= 2) {
            botonComenzar.setEnabled(true);
        } else {
            botonComenzar.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonDeseleccionar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListSeleccionados;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelSeleccionados;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableJugador;
    // End of variables declaration//GEN-END:variables
}