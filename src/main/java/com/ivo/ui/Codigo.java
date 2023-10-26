package com.ivo.ui;

import com.ivo.tools.Bloco;
import java.util.ArrayList;

/**
 *
 * @author GabrielIvo
 */
/*
DESAFIO FUTURO: Colocar um indentificador do erro que está acontecendo na linha. 
Lendo a linha e identificando qual bloco está com erro, podendo mudar a cor do bloco
com erro.
 */
public class Codigo extends javax.swing.JPanel {

    public ArrayList<Bloco> blocos = new ArrayList<>();

    public String[][] varss = new String[3][2];

    public Codigo() {
        initComponents();
        

    }
    public boolean setErroCodigo(String erro,ArrayList<Bloco> blocos, String[][] vars){
            
        this.varss = vars;
        this.blocos = blocos;
        StringBuilder codigo = new StringBuilder();
        codigo.append("""
                      public class Codigo {
                          public static void main(String[] args) {
                      """);

        codigo.append(montagemLinhasJava());

        codigo.append("}\n}");
        int linha = buscarNumeroErro(erro);
        System.out.println(linha);
        if(linha !=0){
            erro = modificarLinha(concertaCodigo(montagemLinhasJava().toString()),linha);
            textoCodigo.setText(erro);
        }else{
            if (erro.length() > 60) {
                erro = quebrarLinhas(erro);
            }
            codigo.append("\nErro no código:\n"+erro);
            textoCodigo.setText(codigo.toString());
        }
        
        
        
        return true;
    }
    public String setCodigoExec(ArrayList<Bloco> blocos, String[][] vars) {
        this.varss = vars;
        this.blocos = blocos;
        StringBuilder codigo = new StringBuilder();
        
        codigo.append(concertaCodigo(montagemLinhasJava().toString()));
        
        return codigo.toString();
    }

    public void setBlocosJava(ArrayList<Bloco> blocos, String[][] vars) {
        this.varss = vars;
        this.blocos = blocos;
        StringBuilder codigo = new StringBuilder();
        codigo.append("""
                      public class Codigo {
                          public static void main(String[] args) {
                      """);

        codigo.append(montagemLinhasJava());

        codigo.append("}\n}");
        textoCodigo.setText(codigo.toString());
    }
    public void setBlocosC(ArrayList<Bloco> blocos, String[][] vars) {
        this.varss = vars;
        this.blocos = blocos;
        StringBuilder codigo = new StringBuilder();
        codigo.append("""
                      #include <stdio.h>
                      int main(){
                      """);

        codigo.append(montagemLinhasC());

        codigo.append("}");
        textoCodigo.setText(codigo.toString());
    }
    public void setBlocosPython(ArrayList<Bloco> blocos, String[][] vars) {
        this.varss = vars;
        this.blocos = blocos;
        StringBuilder codigo = new StringBuilder();

        codigo.append(montagemLinhasPython());

        textoCodigo.setText(codigo.toString());
    }

    public StringBuilder montagemLinhasJava() {
        StringBuilder codigo = new StringBuilder();
        int i = blocos.get(0).encaixado;
        int saveBloco = 0;
        boolean lado = false;
        boolean varPrint = false;
        codigo.append("      ");//Começo pulo de linha
        boolean end = true;
        while (end) {
            if (i == 16 || i == 17) {
                if (escreveBlocosJava(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosJava(i, true));
                    } else {
                        codigo.append(escreveBlocosJava(i, false));
                    }
                } else {
                    end = false;
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
                        codigo.append("\n         ");//Começo pulo de linha
                        i = blocos.get(i).encaixado;
                    } else {
                        if (lado == true) {//Quando acabar o print lateral se tiver que voltar para printar
                            // para baixo, retorna e continua.
                            codigo.append(";\n         ");
                            lado = false;
                            i = blocos.get(saveBloco).encaixado;
                            saveBloco = 0;
                            if (varPrint) {
                                varPrint = false;
                            }//Saindo do VarPrint
                        } else {
                            end = false;
                        }
                    }
                }
            } else {
                if (escreveBlocosJava(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosJava(i, true));
                    } else {
                        codigo.append(escreveBlocosJava(i, false));
                    }
                } else {
                    end = false;
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
                            codigo.append(";\n      ");
                            lado = false;
                            i = blocos.get(saveBloco).encaixado;
                            saveBloco = 0;
                            if (varPrint) {
                                varPrint = false;
                            }//Saindo do VarPrint
                        } else {
                            end = false;
                            codigo.append("\n    ");
                        }
                    }
                }
            }
        }
        return codigo;
    }
    public StringBuilder montagemLinhasC() {
        StringBuilder codigo = new StringBuilder();
        int i = blocos.get(0).encaixado;
        int saveBloco = 0;
        boolean lado = false;
        boolean varPrint = false;
        codigo.append("      ");//Começo pulo de linha
        boolean end = true;
        while (end) {
            if (i == 16 || i == 17) {
                if (escreveBlocosC(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosC(i, true));
                    } else {
                        codigo.append(escreveBlocosC(i, false));
                    }
                } else {
                    end = false;
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
                        codigo.append("\n         ");//Começo pulo de linha
                        i = blocos.get(i).encaixado;
                    } else {
                        if (lado == true) {//Quando acabar o print lateral se tiver que voltar para printar
                            // para baixo, retorna e continua.
                            codigo.append(";\n         ");
                            lado = false;
                            i = blocos.get(saveBloco).encaixado;
                            saveBloco = 0;
                            if (varPrint) {
                                varPrint = false;
                            }//Saindo do VarPrint
                        } else {
                            end = false;
                        }
                    }
                }
            } else {
                if (escreveBlocosC(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosC(i, true));
                    } else {
                        codigo.append(escreveBlocosC(i, false));
                    }
                } else {
                    end = false;
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
                            codigo.append(";\n      ");
                            lado = false;
                            i = blocos.get(saveBloco).encaixado;
                            saveBloco = 0;
                            if (varPrint) {
                                varPrint = false;
                            }//Saindo do VarPrint
                        } else {
                            end = false;
                            codigo.append("\n    ");
                        }
                    }
                }
            }
        }
        return codigo;
    }
    public StringBuilder montagemLinhasPython() {
        StringBuilder codigo = new StringBuilder();
        int i = blocos.get(0).encaixado;
        int saveBloco = 0;
        boolean lado = false;
        boolean varPrint = false;
        boolean end = true;
        codigo.append("      ");//Começo pulo de linha
        while (end) {
            if (i == 16 || i == 17) {
                if (escreveBlocosPython(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosPython(i, true));
                    } else {
                        codigo.append(escreveBlocosPython(i, false));
                    }
                } else {
                    end = false;
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
                        codigo.append("\n         ");//Começo pulo de linha
                        i = blocos.get(i).encaixado;
                    } else {
                        if (lado == true) {//Quando acabar o print lateral se tiver que voltar para printar
                            // para baixo, retorna e continua.
                            codigo.append("\n         ");
                            lado = false;
                            i = blocos.get(saveBloco).encaixado;
                            saveBloco = 0;
                            if (varPrint) {
                                varPrint = false;
                            }//Saindo do VarPrint
                        } else {
                            end = false;
                        }
                    }
                }
            } else {
                if (escreveBlocosPython(i, false) != null) {
                    if (varPrint) {
                        codigo.append(escreveBlocosPython(i, true));
                    } else {
                        codigo.append(escreveBlocosPython(i, false));
                    }
                } else {
                    end = false;
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
                        }
                    }
                }
            }
        }
        return codigo;
    }

    public String escreveBlocosJava(int i, boolean varVal) {
        StringBuilder codigo = new StringBuilder();
        String valor = "";
        String nomeDec = "";
        switch (i) {
            case 1:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(1).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
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
                valor = blocos.get(4).dados;
                nomeDec = blocos.get(4).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" public int " + blocos.get(4).nome
                            + " = " + blocos.get(4).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" public double " + blocos.get(4).nome
                            + " = " + blocos.get(4).dados + " ;");
                    } else {
                        codigo.append(" public String " + blocos.get(4).nome
                            + " = \"" + blocos.get(4).dados + "\" ;");
                    } 
                }
                break;
            case 5:
                //Declaração de Var
                valor = blocos.get(5).dados;
                nomeDec = blocos.get(5).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" public int " + blocos.get(5).nome
                            + " = " + blocos.get(5).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" public double " + blocos.get(5).nome
                            + " = " + blocos.get(5).dados + " ;");
                    } else {
                        codigo.append(" public String " + blocos.get(5).nome
                            + " = \"" + blocos.get(5).dados + "\" ;");
                    } 
                }
                break;
            case 6:
                //Declaração de Var
                valor = blocos.get(6).dados;
                nomeDec = blocos.get(6).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" public int " + blocos.get(6).nome
                            + " = " + blocos.get(6).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" public double " + blocos.get(6).nome
                            + " = " + blocos.get(6).dados + " ;");
                    } else {
                        codigo.append(" public String " + blocos.get(6).nome
                            + " = \"" + blocos.get(6).dados + "\" ;");
                    } 
                }
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
                codigo.append(" if( " + blocos.get(16).dados + " ){");
                break;
            case 17:
                codigo.append(" else( " + blocos.get(17).dados + " ){");
                break;
            case 18:
                codigo.append(" } ");
                break;
            case 19:
                codigo.append(" } ");
                break;
            case 20:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(20).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 21:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(21).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 22:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(22).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 23:
                codigo.append(" = ");
                break;
            case 24:
                codigo.append(" + ");
                break;
            case 25:
                codigo.append(" * ");
                break;
            case 26:
                codigo.append(" - ");
                break;
            case 27:
                codigo.append(" / ");
                break;

            default:
                return null;
        }

        return codigo.toString();

    }
    public String escreveBlocosC(int i, boolean varVal) {
        StringBuilder codigo = new StringBuilder();
        String valor = "";
        String nomeDec = "";
        switch (i) {
            case 1:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(1).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" \\n\"," + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 2:
                //Escreva
                codigo.append("printf(\""
                        + blocos.get(2).dados + "\\n\");");
                break;
            case 3:
                //Escreva Variavel
                codigo.append("printf( \" %d ");
                break;
            case 4:
                //Declaração de Var
                valor = blocos.get(4).dados;
                nomeDec = blocos.get(4).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" int " + blocos.get(4).nome
                            + " = " + blocos.get(4).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" double " + blocos.get(4).nome
                            + " = " + blocos.get(4).dados + " ;");
                    } else {
                        codigo.append(" char " + blocos.get(4).nome
                            + "["+(blocos.get(4).nome.length()+1)+"]"+
                                    " = \"" + blocos.get(4).dados + "\" ;");
                    } 
                }
                break;
            case 5:
                //Declaração de Var
                valor = blocos.get(5).dados;
                nomeDec = blocos.get(5).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" int " + blocos.get(5).nome
                            + " = " + blocos.get(5).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" double " + blocos.get(5).nome
                            + " = " + blocos.get(5).dados + " ;");
                    } else {
                        codigo.append(" char " + blocos.get(5).nome
                            + "["+(blocos.get(5).nome.length()+1)+"]"+
                                    " = \"" + blocos.get(5).dados + "\" ;");
                    } 
                }
                break;
            case 6:
                //Declaração de Var
                valor = blocos.get(6).dados;
                nomeDec = blocos.get(6).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(" int " + blocos.get(6).nome
                            + " = " + blocos.get(6).dados + " ;");
                    } else if (isDouble(valor)) {
                        codigo.append(" double " + blocos.get(6).nome
                            + " = " + blocos.get(6).dados + " ;");
                    } else {
                        codigo.append(" char " + blocos.get(6).nome
                            + "["+(blocos.get(6).nome.length()+1)+"]"+
                                    " = \"" + blocos.get(6).dados + "\" ;");
                    } 
                }
                break;
            case 7:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(7).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" \\n\"," + varss[x][0] + " );");
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
                            codigo.append(" \\n\"," + varss[x][0] + " );");
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
                            codigo.append(" \\n\"," + varss[x][0] + " );");
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
                            codigo.append(" \\n\"," + varss[x][0] + " );");
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
                codigo.append(" if( " + blocos.get(16).dados + " ){");
                break;
            case 17:
                codigo.append(" else( " + blocos.get(17).dados + " ){");
                break;
            case 18:
                codigo.append(" } ");
                break;
            case 19:
                codigo.append(" } ");
                break;
            case 20:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(20).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" \\n\"," + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 21:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(21).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" \\n\"," + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 22:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(22).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" \\n\"," + varss[x][0] + " );");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 23:
                codigo.append(" = ");
                break;
            case 24:
                codigo.append(" + ");
                break;
            case 25:
                codigo.append(" * ");
                break;
            case 26:
                codigo.append(" - ");
                break;
            case 27:
                codigo.append(" / ");
                break;

            default:
                return null;
        }

        return codigo.toString();

    }
    public String escreveBlocosPython(int i, boolean varVal) {
        StringBuilder codigo = new StringBuilder();
        String valor = "";
        String nomeDec = "";
        switch (i) {
            case 1:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(1).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " )");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 2:
                //Escreva
                codigo.append("print(\""
                        + blocos.get(2).dados + "\")");
                break;
            case 3:
                //Escreva Variavel
                codigo.append("print( ");
                break;
            case 4:
                //Declaração de Var
                valor = blocos.get(4).dados;
                nomeDec = blocos.get(4).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(blocos.get(4).nome
                            + " = " + blocos.get(4).dados);
                    } else if (isDouble(valor)) {
                        codigo.append( blocos.get(4).nome
                            + " = " + blocos.get(4).dados );
                    } else {
                        codigo.append(blocos.get(4).nome +
                                    " = \"" + blocos.get(4).dados + "\"");
                    } 
                }
                break;
            case 5:
                //Declaração de Var
                valor = blocos.get(5).dados;
                nomeDec = blocos.get(5).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(blocos.get(5).nome
                            + " = " + blocos.get(5).dados);
                    } else if (isDouble(valor)) {
                        codigo.append( blocos.get(5).nome
                            + " = " + blocos.get(5).dados );
                    } else {
                        codigo.append(blocos.get(5).nome +
                                    " = \"" + blocos.get(5).dados + "\"");
                    } 
                }
                break;
            case 6:
                //Declaração de Var
                valor = blocos.get(6).dados;
                nomeDec = blocos.get(6).nome;
                if((valor.isEmpty() || valor == null) && (nomeDec.isEmpty() || nomeDec == null)){
                    codigo.append("ERRO DE DECLARAÇÃO");
                }else{
                    if (isInteger(valor)) {
                        codigo.append(blocos.get(6).nome
                            + " = " + blocos.get(6).dados);
                    } else if (isDouble(valor)) {
                        codigo.append( blocos.get(6).nome
                            + " = " + blocos.get(6).dados );
                    } else {
                        codigo.append(blocos.get(6).nome +
                                    " = \"" + blocos.get(6).dados + "\"");
                    } 
                }
                break;
            case 7:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(7).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " )");
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
                            codigo.append(" " + varss[x][0] + " )");
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
                            codigo.append(" " + varss[x][0] + " )");
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
                            codigo.append(" " + varss[x][0] + " )");
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
                codigo.append(" if " + blocos.get(16).dados + " :");
                break;
            case 17:
                codigo.append(" else " + blocos.get(17).dados + " :");
                break;
            case 18:
                codigo.append("");
                break;
            case 19:
                codigo.append("");
                break;
            case 20:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(20).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " )");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 21:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(21).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " )");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 22:
                for (int x = 0; x < 3; x++) {
                    if (blocos.get(22).dados.equals(varss[x][0])) {
                        if (varVal) {
                            codigo.append(" " + varss[x][0] + " )");
                        } else {
                            codigo.append(" " + varss[x][0] + " ");
                        }
                    }
                }
                break;
            case 23:
                codigo.append(" = ");
                break;
            case 24:
                codigo.append(" + ");
                break;
            case 25:
                codigo.append(" * ");
                break;
            case 26:
                codigo.append(" - ");
                break;
            case 27:
                codigo.append(" / ");
                break;

            default:
                return null;
        }

        return codigo.toString();

    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static String quebrarLinhas(String input) {
        StringBuilder resultado = new StringBuilder();
        String[] palavras = input.split(" ");

        int contadorCaracteres = 0;

        for (String palavra : palavras) {
            if (contadorCaracteres + palavra.length() > 60) {
                resultado.append("\n");
                contadorCaracteres = 0;
            }

            resultado.append(palavra).append(" ");
            contadorCaracteres += palavra.length() + 1;
        }

        return resultado.toString().trim();
    }
    public static int buscarNumeroErro(String input) {
        System.out.println("Busca: "+input);
        String[] palavras = input.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equals("line")) {
                if (i + 1 < palavras.length) {
                    String numeroString = palavras[i + 1].replaceAll(",", "");
                    System.out.println(numeroString);
                    try {
                        return Integer.parseInt(numeroString);
                    } catch (NumberFormatException e) {
                        return 0; // Se não for um número válido
                    }
                }
            }
        }

        return 0; // Se não encontrar a palavra "line" ou se não houver um número a seguir
    }
    public static String modificarLinha(String input, int numeroLinha) {
        String[] linhas = input.split("\n");
        System.out.println(linhas.length);
        for (String linha : linhas) {
            System.out.println(linha);
        }
        if (numeroLinha <= linhas.length) {
            System.out.println("Linha:   "+linhas[numeroLinha-1]);
            linhas[numeroLinha - 1] = linhas[numeroLinha-1] +" <----- Linha com Erro";
            return String.join("\n", linhas);
        } else {
            return input; // Retorna a string original se o número de linha for inválido
        }
    }
    public static String concertaCodigo(String input) {
        String[] linhas = input.split("\n");
        
        if (linhas.length > 0 && linhas[linhas.length - 1].trim().isEmpty()) {
            String[] novoArray = new String[linhas.length - 1];
            System.arraycopy(linhas, 0, novoArray, 0, linhas.length - 1);
            return String.join("\n", novoArray);
        } else {
            return input;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCodigo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoCodigo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        tipoCodigo = new javax.swing.JComboBox<>();

        panelCodigo.setBackground(new java.awt.Color(255, 255, 255));

        textoCodigo.setEditable(false);
        textoCodigo.setBackground(new java.awt.Color(204, 255, 255));
        textoCodigo.setColumns(20);
        textoCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textoCodigo.setRows(5);
        jScrollPane1.setViewportView(textoCodigo);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tipoCodigo.setBackground(new java.awt.Color(204, 255, 255));
        tipoCodigo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tipoCodigo.setForeground(new java.awt.Color(0, 0, 0));
        tipoCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C", "Python" }));
        tipoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(tipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(tipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelCodigoLayout = new javax.swing.GroupLayout(panelCodigo);
        panelCodigo.setLayout(panelCodigoLayout);
        panelCodigoLayout.setHorizontalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelCodigoLayout.setVerticalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tipoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCodigoActionPerformed
        System.out.println(tipoCodigo.getSelectedItem().toString());
        String tipo = tipoCodigo.getSelectedItem().toString();
        if(tipo.equals("Java")){
            setBlocosJava(this.blocos, this.varss);
        }else if(tipo.equals("C")){
            setBlocosC(this.blocos, this.varss);
        }else if(tipo.equals("Python")){
            setBlocosPython(this.blocos, this.varss);
        }
        
        
    }//GEN-LAST:event_tipoCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JTextArea textoCodigo;
    private javax.swing.JComboBox<String> tipoCodigo;
    // End of variables declaration//GEN-END:variables
}
