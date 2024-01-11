package com.ivo.ui;


/**
 *
 * @author GabrielIvo
 */
/*

 */
public class ResultadoExec extends javax.swing.JPanel {

    public ResultadoExec() {
        initComponents();
    }
    
    public void setResult(String result){
        String finalResult =  "Saída do código:\n------------------------------------------------------------------\n"
                + result ;
        textoResult.setText(finalResult);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelResult = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoResult = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(3750, 1660));
        setMinimumSize(new java.awt.Dimension(375, 166));

        textoResult.setEditable(false);
        textoResult.setBackground(new java.awt.Color(204, 255, 255));
        textoResult.setColumns(20);
        textoResult.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textoResult.setRows(5);
        jScrollPane1.setViewportView(textoResult);

        javax.swing.GroupLayout panelResultLayout = new javax.swing.GroupLayout(panelResult);
        panelResult.setLayout(panelResultLayout);
        panelResultLayout.setHorizontalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelResultLayout.setVerticalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelResult;
    private javax.swing.JTextArea textoResult;
    // End of variables declaration//GEN-END:variables
}
