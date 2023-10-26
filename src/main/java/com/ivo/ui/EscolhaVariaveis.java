package com.ivo.ui;

import com.ivo.tools.Bloco;
import java.util.ArrayList;

/**
 *
 * @author GabrielIvo
 */
/*

 */
public class EscolhaVariaveis extends javax.swing.JPanel {

    public String[] varss = new String[3];
    public String valEscolhido = "";
    public int idValor = 0;
    
            
           

    public EscolhaVariaveis() {
        initComponents();

    }
    public void setVars(String[][] var){
        
        listaVariaveis.removeAll();
        for (int x = 0; x < 3; x++) {
            if (var[x][0] != "" && var[x][0] != null) {
                String string = var[x][0];
                this.varss[x] = string;
            }
        }
        listaVariaveis.setListData(varss);
        
    }
    public void setIdVal(int id){
        this.idValor = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscolha = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVariaveis = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(217, 126));
        setMinimumSize(new java.awt.Dimension(217, 126));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                formAncestorRemoved(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        panelEscolha.setBackground(new java.awt.Color(255, 255, 255));

        listaVariaveis.setBackground(new java.awt.Color(204, 255, 255));
        listaVariaveis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listaVariaveis.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaVariaveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaVariaveis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaVariaveisValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaVariaveis);

        javax.swing.GroupLayout panelEscolhaLayout = new javax.swing.GroupLayout(panelEscolha);
        panelEscolha.setLayout(panelEscolhaLayout);
        panelEscolhaLayout.setHorizontalGroup(
            panelEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEscolhaLayout.setVerticalGroup(
            panelEscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscolhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaVariaveisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaVariaveisValueChanged
        // TODO add your handling code here:
        System.out.println(listaVariaveis.getSelectedValue());
        this.valEscolhido = listaVariaveis.getSelectedValue();
    }//GEN-LAST:event_listaVariaveisValueChanged

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        
    }//GEN-LAST:event_formComponentRemoved

    private void formAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorRemoved
        //sSystem.out.println("TESTE!!");
    }//GEN-LAST:event_formAncestorRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaVariaveis;
    private javax.swing.JPanel panelEscolha;
    // End of variables declaration//GEN-END:variables
}
