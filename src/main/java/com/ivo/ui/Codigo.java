package com.ivo.ui;

import com.ivo.tools.Bloco;
import java.util.ArrayList;

/**
 *
 * @author GabrielIvo
 */
public class Codigo extends javax.swing.JPanel {

    public ArrayList<Bloco> blocos = new ArrayList<>();

    public String[][] varss = new String[3][2];

    public Codigo() {
        initComponents();

    }

    public void setBlocos(ArrayList<Bloco> blocos, String[][] vars) {
        this.varss = vars;
        this.blocos = blocos;
        System.out.println("Montandooo");
        StringBuilder codigo = new StringBuilder();
        codigo.append("""
                      public class Codigo {
                          public static void main(String[] args) {
                      """);
///////////////////////////////////////////////////

        int i = blocos.get(0).encaixado;
        int saveBloco = 0;
        boolean lado = false;
        boolean varPrint = false;
        codigo.append("      ");//Começo pulo de linha
        boolean end = true;
        while (end) {
            System.out.println(i);
            if (escreveBlocos(i, false) != null) {
                if (varPrint) {
                    System.out.println("VarPrint!");
                    codigo.append(escreveBlocos(i, true));
                } else {
                    codigo.append(escreveBlocos(i, false));
                }
            } else {
                end = false;
                System.out.println("Erro codigo");
            }
            if (blocos.get(i).encaixadoLateral != 0) {
                if (i == 3) {//Caso entrou em um Print de variaveis, muda para true para 
                    varPrint = true;
                }
                //IF para salvar a posição do bloco que iniciou o print lateral, e voltar depois
                if (blocos.get(i).encaixado != 0) {
                    saveBloco = i;
                    lado = true;
                }
                i = blocos.get(i).encaixadoLateral;
            } else {
                if (blocos.get(i).encaixado != 0) {
                    codigo.append("\n      ");//Começo pulo de linha
                    i = blocos.get(i).encaixado;
                } else {
                    if (lado == true) {//Quando acabar o print lateral se tiver que voltar para printar
                        // para baixo, retorna e continua.
                        codigo.append("\n      ");
                        lado = false;
                        i = blocos.get(saveBloco).encaixado;
                        saveBloco = 0;
                        if (varPrint) {
                            varPrint = false;
                        }//Saindo do VarPrint
                    } else {
                        end = false;
                        codigo.append("\n      ");
                    }
                }
            }
        }

////////////////////////////////////////////////////
        codigo.append("""
                         }
                      }""");
        textoCodigo.setText(codigo.toString());
    }

    public String escreveBlocos(int i, boolean varVal) {
        System.out.println("Entrou escreve bloco");
        StringBuilder codigo = new StringBuilder();
        switch (i) {
            case 1:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(1).dados.equals(varss[x][0])) {
                        System.out.println(varVal);
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            System.out.println("Nao entrou varVal");
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 2:
                //Escreva
                codigo.append("System.out.println(\""
                        + blocos.get(2).dados + "\");");
                break;
            case 3:
                //Escreva Variavel
                codigo.append("System.out.println( ");
                break;
            case 4:
                //Declaração de Var
                codigo.append(" public int " + blocos.get(4).nome
                        + " = " + blocos.get(4).dados + " ;");
                break;
            case 5:
                //Declaração de Var
                codigo.append(" public int " + blocos.get(5).nome
                        + " = " + blocos.get(5).dados + " ;");
                break;
            case 6:
                //Declaração de Var
                codigo.append(" public int " + blocos.get(6).nome
                        + " = " + blocos.get(6).dados + " ;");
                break;
            case 7:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(7).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }

                    }
                }
                break;
            case 8:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(8).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 9:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(9).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 10:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(10).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 11:
                codigo.append(" + ");
                break;
            case 12:
                codigo.append(" = ");
                break;
            case 13:
                codigo.append(" - ");
                break;
            case 14:
                codigo.append(" * ");
                break;
            case 15:
                codigo.append(" / ");
                break;
            case 16:
                codigo.append(" if( ) ");
                break;
            case 17:
                codigo.append(" else() ");
                break;

            default:
                System.out.println("Null escrevendo");
                return null;
        }

        System.out.println("Saiu escreve bloco");
        return codigo.toString();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCodigo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoCodigo = new javax.swing.JTextArea();

        textoCodigo.setEditable(false);
        textoCodigo.setColumns(20);
        textoCodigo.setRows(5);
        jScrollPane1.setViewportView(textoCodigo);

        javax.swing.GroupLayout panelCodigoLayout = new javax.swing.GroupLayout(panelCodigo);
        panelCodigo.setLayout(panelCodigoLayout);
        panelCodigoLayout.setHorizontalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCodigoLayout.setVerticalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JTextArea textoCodigo;
    // End of variables declaration//GEN-END:variables
}
