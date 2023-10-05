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

        int i = blocos.get(0).encaixado;
        boolean end = true;
        while (end) {

            switch (i) {
                case 1:
                    //Operação
                    int x = 1;
                    codigo.append("      ");
                    boolean lateral = true;
                    x = blocos.get(x).encaixadoLateral;
                    while (lateral) {

                        //System.out.println("Tesstaaa" + " Valor de X: " + x + "; " + blocos.get(x).encaixadoLateral);
                        //TESTAR QUAL BLOCO ELE FICA PARADOO
                        switch (x) {
                            case 7, 8, 9, 10 -> {
                                codigo.append(" " + blocos.get(x).nome + " ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 11 -> {
                                System.out.println(" + ");
                                codigo.append(" + ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 12 -> {
                                codigo.append(" = ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 13 -> {
                                codigo.append(" - ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 14 -> {
                                codigo.append(" * ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 15 -> {
                                codigo.append(" / ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            default -> {
                                System.out.println("Saiu operação");
                                lateral = false;
                            }
                        }
                    }
                    i = blocos.get(i).encaixado;
                    codigo.append(";\n");
                    break;
                case 2:
                    //Escreva

                    codigo.append("      System.out.println(\""
                            + blocos.get(2).dados + "\");\n");
                    i = blocos.get(2).encaixado;
                    break;
                case 3:
                    //Retorna
                    codigo.append("      return ");
                     x = 3;
                     lateral = true;
                    x = blocos.get(x).encaixadoLateral;
                    while (lateral) {

                        //System.out.println("Tesstaaa" + " Valor de X: " + x + "; " + blocos.get(x).encaixadoLateral);
                        //TESTAR QUAL BLOCO ELE FICA PARADOO
                        switch (x) {
                            case 7, 8, 9, 10 -> {
                                codigo.append(blocos.get(x).nome + " ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 11 -> {
                                System.out.println(" + ");
                                codigo.append(" + ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            case 12 -> {
                                codigo.append(" = ");
                                x = blocos.get(x).encaixadoLateral;
                            }
                            default -> {
                                System.out.println("Saiu Return");
                                lateral = false;
                            }
                        }
                    }
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
                    end = false;
            }
        }

        codigo.append("""
                         }
                      }""");
        TextoCodigo.setText(codigo.toString());
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
