package com.ivo.tools;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author GabrielIvo
 */
public class Bloco {

    public int id;
    public Rectangle ret = new Rectangle();
    public Rectangle retEncaixe = new Rectangle();
    public Rectangle retEncaixeLateral = new Rectangle();
    public String codigo = "";
    public String nome = "";
    public String dados = "";
    public int encaixado = 0;
    public int encaixadoLateral = 0;

    public Bloco() {
    }
    
    public Rectangle getRetEncaixeLateral() {
        return retEncaixeLateral;
    }

    public void setRetEncaixeLateral(Rectangle retEncaixeLateral) {
        this.retEncaixeLateral = retEncaixeLateral;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rectangle getRet() {
        return ret;
    }

    public void setRet(Rectangle ret) {
        this.ret = ret;
    }

    public Rectangle getRetEncaixe() {
        return retEncaixe;
    }

    public void setRetEncaixe(Rectangle retEncaixe) {
        this.retEncaixe = retEncaixe;
    }

    public int getEncaixado() {
        return encaixado;
    }

    public void setEncaixado(int encaixado) {
        this.encaixado = encaixado;
    }

    public int getEncaixadoLateral() {
        return encaixadoLateral;
    }

    public void setEncaixadoLateral(int encaixadoLateral) {
        this.encaixadoLateral = encaixadoLateral;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
    @Override
    public String toString() {
        return "OI Bloco{" + "id=" + id + ", ret=" + ret + ", retEncaixe=" + retEncaixe + ", encaixado=" + encaixado + ", encaixadoLateral=" + encaixadoLateral + ", nome=" + nome + ", dados=" + dados + '}';
    }

    public Point mousePressiona(java.awt.event.MouseEvent evt) {
        Point pt = evt.getPoint();
        pt.x = pt.x + 15;
        pt.y = pt.y + 65;
        System.out.println(pt);
        return pt;
    }
}
