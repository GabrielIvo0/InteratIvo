package com.ivo.ui;

import com.ivo.tools.Bloco;
import java.util.ArrayList;

/**
 *
 * @author GabrielIvo
 */
public class Código extends javax.swing.JPanel {

    public ArrayList<Bloco> blocos = new ArrayList<>();

    public Código() {
        initComponents();

    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
        System.out.println("Montandooo");
        StringBuilder codigo = new StringBuilder();
        codigo.append("""
                      public class Codigo {
                          public static void main(String[] args) {
                      """);
///////////////////////////////////////////////////


        int i = blocos.get(0).encaixado;
        codigo.append("      ");//Começo pulo de linha
        boolean end = true;
        while (end) {
            if(escreveBlocos(i)!=null){codigo.append(escreveBlocos(i));}
            else{System.out.println("Erro codigo");}
            if(blocos.get(i).encaixadoLateral!=0){
                i = blocos.get(i).encaixadoLateral;
            }else{
                if(blocos.get(i).encaixado==0){
                    end = false;
                }else{
                    codigo.append("\n      ");//Começo pulo de linha
                }
            }
        }
        
////////////////////////////////////////////////////

        codigo.append("""
                         }
                      }""");
        TextoCodigo.setText(codigo.toString());
    }
    
    public StringBuilder escreveBlocos(int i){
        StringBuilder codigo = new StringBuilder();
        switch (i) {
                case 1:
                    i = blocos.get(i).encaixado;
                    codigo.append(";\n");
                    break;
                case 2:
                    //Escreva
                    codigo.append("System.out.println(\""
                            + blocos.get(2).dados + "\");");
                    i = blocos.get(2).encaixado;
                    break;
                case 3:
                    //Retorna
                    codigo.append("      return ");
                     
                    i = blocos.get(i).encaixado;
                    codigo.append(";\n");
                    break;
                case 4:
                    //Declaração de Var
                    codigo.append("      public int " + blocos.get(4).nome
                            + " = " + blocos.get(4).dados + ";\n");
                    i = blocos.get(4).encaixado;
                    break;
                case 5:
                    //Declaração de Var
                    codigo.append("      public int " + blocos.get(5).nome
                            + " = " + blocos.get(5).dados + ";\n");
                    i = blocos.get(5).encaixado;
                    break;
                case 6:
                    //Declaração de Var
                    codigo.append("      public int " + blocos.get(6).nome
                            + " = " + blocos.get(6).dados + ";\n");
                    i = blocos.get(6).encaixado;
                    break;
                    
                    
                default:
                    return null;
            }
    return codigo;
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoCodigo = new javax.swing.JTextArea();

        TextoCodigo.setEditable(false);
        TextoCodigo.setColumns(20);
        TextoCodigo.setRows(5);
        jScrollPane1.setViewportView(TextoCodigo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextoCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
