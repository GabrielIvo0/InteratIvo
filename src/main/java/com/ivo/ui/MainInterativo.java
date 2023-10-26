package com.ivo.ui;

import bsh.EvalError;
import com.ivo.tools.Bloco;

import bsh.Interpreter;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.io.PrintStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel Ivo
 */
public class MainInterativo extends javax.swing.JFrame {
    
    /*
    FAZER UM CONCERTO NO ENCAIXAR, PRA ANALISAR TODOS OS INTERCEPTS ANTES PRA N BLOQUEAR SENDO QUE T
    */

    public MainInterativo() {
        blocoP0.id = 0;
        blocoP1.id = 1;
        blocoP2.id = 2;
        blocoP3.id = 3;
        blocoP4.id = 4;
        blocoP5.id = 5;
        blocoP6.id = 6;
        blocoP7.id = 7;
        blocoP8.id = 8;
        blocoP9.id = 9;
        blocoP10.id = 10;
        blocoP11.id = 11;
        blocoP12.id = 12;
        blocoP13.id = 13;
        blocoP14.id = 14;
        blocoP15.id = 15;
        blocoP16.id = 16;
        blocoP17.id = 17;
        blocoP18.id = 18;
        blocoP19.id = 19;
        blocoP20.id = 20;
        blocoP21.id = 21;
        blocoP22.id = 22;
        blocoP23.id = 23;
        blocoP24.id = 24;
        blocoP25.id = 25;
        blocoP26.id = 26;
        blocoP27.id = 27;
        initComponents();
        
        blocoP0.ret = bloco00.getBounds();
        blocoP0.retEncaixe = bloco00.getBounds();
        blocoP0.ret.x = blocoP0.ret.x + 7;
        blocoP0.ret.y = blocoP0.ret.y + 3;
        blocoP0.retEncaixe.y = blocoP0.retEncaixe.y + 25;
        blocoP0.encaixadoLateral = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        separador = new javax.swing.JSeparator();
        bloco01 = new javax.swing.JPanel();
        botaoVar0 = new javax.swing.JButton();
        bloco02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JTextField();
        bloco03 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bloco04Var = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        varDec = new javax.swing.JTextField();
        varDecValor1 = new javax.swing.JTextField();
        bloco08VarU = new javax.swing.JPanel();
        botaoVar2 = new javax.swing.JButton();
        bloco05Var = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        varDec1 = new javax.swing.JTextField();
        varDecValor2 = new javax.swing.JTextField();
        layPanel = new javax.swing.JLayeredPane();
        bloco00 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bloco11Oper = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bloco09VarU = new javax.swing.JPanel();
        botaoVar3 = new javax.swing.JButton();
        bloco07VarU = new javax.swing.JPanel();
        botaoVar1 = new javax.swing.JButton();
        bloco12Oper = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bloco10VarU = new javax.swing.JPanel();
        botaoVar4 = new javax.swing.JButton();
        bloco13Oper = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bloco14Oper = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bloco15Oper = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        bloco16IF = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ifEntrada = new javax.swing.JTextField();
        bloco17Else = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ifEntrada1 = new javax.swing.JTextField();
        bloco18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bloco19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        bloco06Var = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        varDec2 = new javax.swing.JTextField();
        varDecValor3 = new javax.swing.JTextField();
        bloco20VarU = new javax.swing.JPanel();
        botaoVar5 = new javax.swing.JButton();
        bloco21VarU = new javax.swing.JPanel();
        botaoVar6 = new javax.swing.JButton();
        bloco22VarU = new javax.swing.JPanel();
        botaoVar7 = new javax.swing.JButton();
        bloco23 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        bloco24 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bloco26 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        bloco25 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        bloco27 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        visuCodigo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panelPrincipal.setDoubleBuffered(false);
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1080, 480));

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setForeground(new java.awt.Color(0, 0, 0));
        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        separador.setMaximumSize(new java.awt.Dimension(50, 5));
        separador.setMinimumSize(new java.awt.Dimension(50, 5));
        separador.setPreferredSize(new java.awt.Dimension(50, 5));

        bloco01.setBackground(new java.awt.Color(0, 153, 153));
        bloco01.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco01.setForeground(new java.awt.Color(0, 51, 255));
        bloco01.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bloco01.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco01.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco01.setPreferredSize(new java.awt.Dimension(138, 42));
        bloco01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco01MouseDragged(evt);
            }
        });
        bloco01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco01MouseReleased(evt);
            }
        });

        botaoVar0.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar0.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar0.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar0.setText(" ");
        botaoVar0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco01Layout = new javax.swing.GroupLayout(bloco01);
        bloco01.setLayout(bloco01Layout);
        bloco01Layout.setHorizontalGroup(
            bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVar0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bloco01Layout.setVerticalGroup(
            bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco01Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(botaoVar0, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco02.setBackground(new java.awt.Color(0, 153, 153));
        bloco02.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco02.setAlignmentY(0.0F);
        bloco02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bloco02.setMaximumSize(new java.awt.Dimension(42, 34));
        bloco02.setMinimumSize(new java.awt.Dimension(42, 34));
        bloco02.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco02MouseDragged(evt);
            }
        });
        bloco02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco02MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escreva");

        print.setBackground(new java.awt.Color(204, 255, 255));
        print.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        print.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                printKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco02Layout = new javax.swing.GroupLayout(bloco02);
        bloco02.setLayout(bloco02Layout);
        bloco02Layout.setHorizontalGroup(
            bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco02Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco02Layout.setVerticalGroup(
            bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco02Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco03.setBackground(new java.awt.Color(0, 153, 153));
        bloco03.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco03.setPreferredSize(new java.awt.Dimension(77, 42));
        bloco03.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco03MouseDragged(evt);
            }
        });
        bloco03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco03MouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escreva:");

        javax.swing.GroupLayout bloco03Layout = new javax.swing.GroupLayout(bloco03);
        bloco03.setLayout(bloco03Layout);
        bloco03Layout.setHorizontalGroup(
            bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        bloco03Layout.setVerticalGroup(
            bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        bloco04Var.setBackground(new java.awt.Color(0, 153, 153));
        bloco04Var.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco04Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco04VarMouseDragged(evt);
            }
        });
        bloco04Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco04VarMouseReleased(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Variável");

        varDec.setBackground(new java.awt.Color(204, 255, 255));
        varDec.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDec.setForeground(new java.awt.Color(51, 51, 51));
        varDec.setText("Nome");
        varDec.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                varDecAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        varDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDecActionPerformed(evt);
            }
        });
        varDec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDecKeyReleased(evt);
            }
        });

        varDecValor1.setBackground(new java.awt.Color(204, 255, 255));
        varDecValor1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDecValor1.setForeground(new java.awt.Color(51, 51, 51));
        varDecValor1.setText("Valor");
        varDecValor1.setName(""); // NOI18N
        varDecValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDecValor1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco04VarLayout = new javax.swing.GroupLayout(bloco04Var);
        bloco04Var.setLayout(bloco04VarLayout);
        bloco04VarLayout.setHorizontalGroup(
            bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco04VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDec, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDecValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco04VarLayout.setVerticalGroup(
            bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco04VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varDecValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloco08VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco08VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco08VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco08VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco08VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco08VarUMouseDragged(evt);
            }
        });
        bloco08VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco08VarUMouseReleased(evt);
            }
        });

        botaoVar2.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar2.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco08VarULayout = new javax.swing.GroupLayout(bloco08VarU);
        bloco08VarU.setLayout(bloco08VarULayout);
        bloco08VarULayout.setHorizontalGroup(
            bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco08VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco08VarULayout.setVerticalGroup(
            bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco08VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco05Var.setBackground(new java.awt.Color(0, 153, 153));
        bloco05Var.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco05Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco05VarMouseDragged(evt);
            }
        });
        bloco05Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco05VarMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Variável");

        varDec1.setBackground(new java.awt.Color(204, 255, 255));
        varDec1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDec1.setForeground(new java.awt.Color(51, 51, 51));
        varDec1.setText("Nome");
        varDec1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                varDec1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        varDec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDec1ActionPerformed(evt);
            }
        });
        varDec1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDec1KeyReleased(evt);
            }
        });

        varDecValor2.setBackground(new java.awt.Color(204, 255, 255));
        varDecValor2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDecValor2.setForeground(new java.awt.Color(51, 51, 51));
        varDecValor2.setText("Valor");
        varDecValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDecValor2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco05VarLayout = new javax.swing.GroupLayout(bloco05Var);
        bloco05Var.setLayout(bloco05VarLayout);
        bloco05VarLayout.setHorizontalGroup(
            bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco05VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDec1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDecValor2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco05VarLayout.setVerticalGroup(
            bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco05VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varDec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varDecValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layPanel.setBackground(new java.awt.Color(0, 255, 255));
        layPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layPanel.setForeground(new java.awt.Color(0, 255, 255));

        bloco00.setBackground(new java.awt.Color(0, 255, 255));
        bloco00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bloco00.setForeground(new java.awt.Color(0, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Início");

        javax.swing.GroupLayout bloco00Layout = new javax.swing.GroupLayout(bloco00);
        bloco00.setLayout(bloco00Layout);
        bloco00Layout.setHorizontalGroup(
            bloco00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco00Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        bloco00Layout.setVerticalGroup(
            bloco00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layPanel.setLayer(bloco00, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layPanelLayout = new javax.swing.GroupLayout(layPanel);
        layPanel.setLayout(layPanelLayout);
        layPanelLayout.setHorizontalGroup(
            layPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloco00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layPanelLayout.setVerticalGroup(
            layPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloco00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco11Oper.setBackground(new java.awt.Color(0, 153, 153));
        bloco11Oper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco11Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco11Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco11OperMouseDragged(evt);
            }
        });
        bloco11Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco11OperMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("+");

        javax.swing.GroupLayout bloco11OperLayout = new javax.swing.GroupLayout(bloco11Oper);
        bloco11Oper.setLayout(bloco11OperLayout);
        bloco11OperLayout.setHorizontalGroup(
            bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco11OperLayout.setVerticalGroup(
            bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco09VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco09VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco09VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco09VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco09VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco09VarUMouseDragged(evt);
            }
        });
        bloco09VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco09VarUMouseReleased(evt);
            }
        });

        botaoVar3.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar3.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco09VarULayout = new javax.swing.GroupLayout(bloco09VarU);
        bloco09VarU.setLayout(bloco09VarULayout);
        bloco09VarULayout.setHorizontalGroup(
            bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco09VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco09VarULayout.setVerticalGroup(
            bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco09VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco07VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco07VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco07VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco07VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco07VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco07VarUMouseDragged(evt);
            }
        });
        bloco07VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco07VarUMouseReleased(evt);
            }
        });

        botaoVar1.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar1.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco07VarULayout = new javax.swing.GroupLayout(bloco07VarU);
        bloco07VarU.setLayout(bloco07VarULayout);
        bloco07VarULayout.setHorizontalGroup(
            bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco07VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco07VarULayout.setVerticalGroup(
            bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco07VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco12Oper.setBackground(new java.awt.Color(0, 153, 153));
        bloco12Oper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco12Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco12Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco12OperMouseDragged(evt);
            }
        });
        bloco12Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco12OperMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        javax.swing.GroupLayout bloco12OperLayout = new javax.swing.GroupLayout(bloco12Oper);
        bloco12Oper.setLayout(bloco12OperLayout);
        bloco12OperLayout.setHorizontalGroup(
            bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco12OperLayout.setVerticalGroup(
            bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco10VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco10VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco10VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco10VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco10VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco10VarUMouseDragged(evt);
            }
        });
        bloco10VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco10VarUMouseReleased(evt);
            }
        });

        botaoVar4.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar4.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco10VarULayout = new javax.swing.GroupLayout(bloco10VarU);
        bloco10VarU.setLayout(bloco10VarULayout);
        bloco10VarULayout.setHorizontalGroup(
            bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco10VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco10VarULayout.setVerticalGroup(
            bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco10VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco13Oper.setBackground(new java.awt.Color(0, 153, 153));
        bloco13Oper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco13Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco13Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco13OperMouseDragged(evt);
            }
        });
        bloco13Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco13OperMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");

        javax.swing.GroupLayout bloco13OperLayout = new javax.swing.GroupLayout(bloco13Oper);
        bloco13Oper.setLayout(bloco13OperLayout);
        bloco13OperLayout.setHorizontalGroup(
            bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco13OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco13OperLayout.setVerticalGroup(
            bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco13OperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        bloco14Oper.setBackground(new java.awt.Color(0, 153, 153));
        bloco14Oper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco14Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco14Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco14OperMouseDragged(evt);
            }
        });
        bloco14Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco14OperMouseReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("*");

        javax.swing.GroupLayout bloco14OperLayout = new javax.swing.GroupLayout(bloco14Oper);
        bloco14Oper.setLayout(bloco14OperLayout);
        bloco14OperLayout.setHorizontalGroup(
            bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco14OperLayout.setVerticalGroup(
            bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco15Oper.setBackground(new java.awt.Color(0, 153, 153));
        bloco15Oper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco15Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco15Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco15OperMouseDragged(evt);
            }
        });
        bloco15Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco15OperMouseReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("/");

        javax.swing.GroupLayout bloco15OperLayout = new javax.swing.GroupLayout(bloco15Oper);
        bloco15Oper.setLayout(bloco15OperLayout);
        bloco15OperLayout.setHorizontalGroup(
            bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco15OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco15OperLayout.setVerticalGroup(
            bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco15OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco16IF.setBackground(new java.awt.Color(0, 153, 153));
        bloco16IF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco16IF.setAlignmentY(0.0F);
        bloco16IF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bloco16IF.setMaximumSize(new java.awt.Dimension(45, 34));
        bloco16IF.setMinimumSize(new java.awt.Dimension(45, 34));
        bloco16IF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco16IFMouseDragged(evt);
            }
        });
        bloco16IF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco16IFMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Se");

        ifEntrada.setBackground(new java.awt.Color(204, 255, 255));
        ifEntrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ifEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntradaActionPerformed(evt);
            }
        });
        ifEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ifEntradaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco16IFLayout = new javax.swing.GroupLayout(bloco16IF);
        bloco16IF.setLayout(bloco16IFLayout);
        bloco16IFLayout.setHorizontalGroup(
            bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco16IFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ifEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco16IFLayout.setVerticalGroup(
            bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco16IFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ifEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco17Else.setBackground(new java.awt.Color(0, 153, 153));
        bloco17Else.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco17Else.setAlignmentY(0.0F);
        bloco17Else.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bloco17Else.setMaximumSize(new java.awt.Dimension(45, 34));
        bloco17Else.setMinimumSize(new java.awt.Dimension(45, 34));
        bloco17Else.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco17ElseMouseDragged(evt);
            }
        });
        bloco17Else.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco17ElseMouseReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Se Não");

        ifEntrada1.setBackground(new java.awt.Color(204, 255, 255));
        ifEntrada1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ifEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntrada1ActionPerformed(evt);
            }
        });
        ifEntrada1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ifEntrada1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco17ElseLayout = new javax.swing.GroupLayout(bloco17Else);
        bloco17Else.setLayout(bloco17ElseLayout);
        bloco17ElseLayout.setHorizontalGroup(
            bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco17ElseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ifEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        bloco17ElseLayout.setVerticalGroup(
            bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco17ElseLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(ifEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bloco17ElseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco18.setBackground(new java.awt.Color(0, 153, 153));
        bloco18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco18.setPreferredSize(new java.awt.Dimension(77, 42));
        bloco18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco18MouseDragged(evt);
            }
        });
        bloco18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco18MouseReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Fim Se");

        javax.swing.GroupLayout bloco18Layout = new javax.swing.GroupLayout(bloco18);
        bloco18.setLayout(bloco18Layout);
        bloco18Layout.setHorizontalGroup(
            bloco18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco18Layout.setVerticalGroup(
            bloco18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bloco19.setBackground(new java.awt.Color(0, 153, 153));
        bloco19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco19.setPreferredSize(new java.awt.Dimension(77, 42));
        bloco19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco19MouseDragged(evt);
            }
        });
        bloco19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco19MouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fim Se");

        javax.swing.GroupLayout bloco19Layout = new javax.swing.GroupLayout(bloco19);
        bloco19.setLayout(bloco19Layout);
        bloco19Layout.setHorizontalGroup(
            bloco19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco19Layout.setVerticalGroup(
            bloco19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bloco06Var.setBackground(new java.awt.Color(0, 153, 153));
        bloco06Var.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco06Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco06VarMouseDragged(evt);
            }
        });
        bloco06Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco06VarMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Variável");

        varDec2.setBackground(new java.awt.Color(204, 255, 255));
        varDec2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDec2.setForeground(new java.awt.Color(51, 51, 51));
        varDec2.setText("Nome");
        varDec2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                varDec2AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        varDec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDec2ActionPerformed(evt);
            }
        });
        varDec2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDec2KeyReleased(evt);
            }
        });

        varDecValor3.setBackground(new java.awt.Color(204, 255, 255));
        varDecValor3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        varDecValor3.setForeground(new java.awt.Color(51, 51, 51));
        varDecValor3.setText("Valor");
        varDecValor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                varDecValor3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco06VarLayout = new javax.swing.GroupLayout(bloco06Var);
        bloco06Var.setLayout(bloco06VarLayout);
        bloco06VarLayout.setHorizontalGroup(
            bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco06VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDec2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varDecValor3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco06VarLayout.setVerticalGroup(
            bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco06VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varDec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varDecValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloco20VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco20VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco20VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco20VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco20VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco20VarUMouseDragged(evt);
            }
        });
        bloco20VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco20VarUMouseReleased(evt);
            }
        });

        botaoVar5.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar5.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco20VarULayout = new javax.swing.GroupLayout(bloco20VarU);
        bloco20VarU.setLayout(bloco20VarULayout);
        bloco20VarULayout.setHorizontalGroup(
            bloco20VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco20VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco20VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco20VarULayout.setVerticalGroup(
            bloco20VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco20VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco20VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco21VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco21VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco21VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco21VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco21VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco21VarUMouseDragged(evt);
            }
        });
        bloco21VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco21VarUMouseReleased(evt);
            }
        });

        botaoVar6.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar6.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco21VarULayout = new javax.swing.GroupLayout(bloco21VarU);
        bloco21VarU.setLayout(bloco21VarULayout);
        bloco21VarULayout.setHorizontalGroup(
            bloco21VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco21VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco21VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco21VarULayout.setVerticalGroup(
            bloco21VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco21VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco21VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco22VarU.setBackground(new java.awt.Color(0, 153, 153));
        bloco22VarU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco22VarU.setMaximumSize(new java.awt.Dimension(138, 42));
        bloco22VarU.setMinimumSize(new java.awt.Dimension(138, 42));
        bloco22VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco22VarUMouseDragged(evt);
            }
        });
        bloco22VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco22VarUMouseReleased(evt);
            }
        });

        botaoVar7.setBackground(new java.awt.Color(204, 255, 255));
        botaoVar7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botaoVar7.setForeground(new java.awt.Color(0, 0, 0));
        botaoVar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVar7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloco22VarULayout = new javax.swing.GroupLayout(bloco22VarU);
        bloco22VarU.setLayout(bloco22VarULayout);
        bloco22VarULayout.setHorizontalGroup(
            bloco22VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(bloco22VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco22VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        bloco22VarULayout.setVerticalGroup(
            bloco22VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(bloco22VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco22VarULayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(botaoVar7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        bloco23.setBackground(new java.awt.Color(0, 153, 153));
        bloco23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco23.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco23MouseDragged(evt);
            }
        });
        bloco23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco23MouseReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("=");

        javax.swing.GroupLayout bloco23Layout = new javax.swing.GroupLayout(bloco23);
        bloco23.setLayout(bloco23Layout);
        bloco23Layout.setHorizontalGroup(
            bloco23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco23Layout.setVerticalGroup(
            bloco23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco24.setBackground(new java.awt.Color(0, 153, 153));
        bloco24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco24.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco24MouseDragged(evt);
            }
        });
        bloco24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco24MouseReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("+");

        javax.swing.GroupLayout bloco24Layout = new javax.swing.GroupLayout(bloco24);
        bloco24.setLayout(bloco24Layout);
        bloco24Layout.setHorizontalGroup(
            bloco24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco24Layout.setVerticalGroup(
            bloco24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco26.setBackground(new java.awt.Color(0, 153, 153));
        bloco26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco26.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco26MouseDragged(evt);
            }
        });
        bloco26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco26MouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("*");

        javax.swing.GroupLayout bloco26Layout = new javax.swing.GroupLayout(bloco26);
        bloco26.setLayout(bloco26Layout);
        bloco26Layout.setHorizontalGroup(
            bloco26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco26Layout.setVerticalGroup(
            bloco26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco25.setBackground(new java.awt.Color(0, 153, 153));
        bloco25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco25.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco25MouseDragged(evt);
            }
        });
        bloco25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco25MouseReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("-");

        javax.swing.GroupLayout bloco25Layout = new javax.swing.GroupLayout(bloco25);
        bloco25.setLayout(bloco25Layout);
        bloco25Layout.setHorizontalGroup(
            bloco25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco25Layout.setVerticalGroup(
            bloco25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        bloco27.setBackground(new java.awt.Color(0, 153, 153));
        bloco27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        bloco27.setPreferredSize(new java.awt.Dimension(50, 50));
        bloco27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bloco27MouseDragged(evt);
            }
        });
        bloco27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bloco27MouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("/");

        javax.swing.GroupLayout bloco27Layout = new javax.swing.GroupLayout(bloco27);
        bloco27.setLayout(bloco27Layout);
        bloco27Layout.setHorizontalGroup(
            bloco27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco27Layout.setVerticalGroup(
            bloco27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloco13Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco15Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco11Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco12Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco09VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco14Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco10VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(bloco16IF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco07VarU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco06Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco05Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco03, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco04Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco08VarU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(bloco24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloco26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloco20VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco21VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco22VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloco06Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloco05Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco03, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloco04Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloco16IF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco07VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloco08VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bloco12Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addComponent(bloco11Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                            .addComponent(bloco09VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bloco13Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                                .addComponent(bloco14Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                            .addComponent(bloco10VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco23, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloco18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloco24, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(bloco26, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco20VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bloco19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bloco21VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bloco25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bloco27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloco22VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(layPanel)
                .addContainerGap())
        );

        bloco03.getAccessibleContext().setAccessibleParent(panelPrincipal);

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 517));

        menuBar.setForeground(new java.awt.Color(153, 255, 255));
        menuBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        menu.setText("Inicio");
        menuBar.add(menu);

        visuCodigo.setText("Visualizar Código");
        visuCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visuCodigoMouseClicked(evt);
            }
        });
        menuBar.add(visuCodigo);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Executar Código");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    String[][] nomeList = new String[3][2];
    boolean movendo = false;
    Bloco blocoP0 = new Bloco();
    Bloco blocoP1 = new Bloco();
    Bloco blocoP2 = new Bloco();
    Bloco blocoP3 = new Bloco();
    Bloco blocoP4 = new Bloco();
    Bloco blocoP5 = new Bloco();
    Bloco blocoP6 = new Bloco();
    Bloco blocoP7 = new Bloco();
    Bloco blocoP8 = new Bloco();
    Bloco blocoP9 = new Bloco();
    Bloco blocoP10 = new Bloco();
    Bloco blocoP11 = new Bloco();
    Bloco blocoP12 = new Bloco();
    Bloco blocoP13 = new Bloco();
    Bloco blocoP14 = new Bloco();
    Bloco blocoP15 = new Bloco();
    Bloco blocoP16 = new Bloco();
    Bloco blocoP17 = new Bloco();
    Bloco blocoP18 = new Bloco();
    Bloco blocoP19 = new Bloco();
    Bloco blocoP20 = new Bloco();
    Bloco blocoP21 = new Bloco();
    Bloco blocoP22 = new Bloco();
    Bloco blocoP23 = new Bloco();
    Bloco blocoP24 = new Bloco();
    Bloco blocoP25 = new Bloco();
    Bloco blocoP26 = new Bloco();
    Bloco blocoP27 = new Bloco();

    public ArrayList<javax.swing.JPanel> blocosS = new ArrayList<javax.swing.JPanel>() {
        {
            add(bloco00);
            add(bloco01);
            add(bloco02);
            add(bloco03);
            add(bloco04Var);
            add(bloco05Var);
            add(bloco06Var);
            add(bloco07VarU);
            add(bloco08VarU);
            add(bloco09VarU);
            add(bloco10VarU);
            add(bloco11Oper);
            add(bloco12Oper);
            add(bloco13Oper);
            add(bloco14Oper);
            add(bloco15Oper);
            add(bloco16IF);
            add(bloco17Else);
            add(bloco18);
            add(bloco19);
            add(bloco20VarU);
            add(bloco21VarU);
            add(bloco22VarU);
            add(bloco23);
            add(bloco24);
            add(bloco25);
            add(bloco26);
            add(bloco27);
        }
    };

    public void atualizaABlocos() {

        blocosS.set(1, bloco01);
        blocosS.set(2, bloco02);
        blocosS.set(3, bloco03);
        blocosS.set(4, bloco04Var);
        blocosS.set(5, bloco05Var);
        blocosS.set(6, bloco06Var);
        blocosS.set(7, bloco07VarU);
        blocosS.set(8, bloco08VarU);
        blocosS.set(9, bloco09VarU);
        blocosS.set(10, bloco10VarU);
        blocosS.set(11, bloco11Oper);
        blocosS.set(12, bloco12Oper);
        blocosS.set(13, bloco13Oper);
        blocosS.set(14, bloco14Oper);
        blocosS.set(15, bloco15Oper);
        blocosS.set(16, bloco16IF);
        blocosS.set(17, bloco17Else);
        blocosS.set(18, bloco18);
        blocosS.set(19, bloco19);
        blocosS.set(20, bloco20VarU);
        blocosS.set(21, bloco21VarU);
        blocosS.set(22, bloco22VarU);
        blocosS.set(23, bloco23);
        blocosS.set(24, bloco24);
        blocosS.set(25, bloco25);
        blocosS.set(26, bloco26);
        blocosS.set(27, bloco27);
    }
    public ArrayList<Bloco> blocos = new ArrayList<Bloco>() {
        {
            add(blocoP0);
            add(blocoP1);
            add(blocoP2);
            add(blocoP3);
            add(blocoP4);
            add(blocoP5);
            add(blocoP6);
            add(blocoP7);
            add(blocoP8);
            add(blocoP9);
            add(blocoP10);
            add(blocoP11);
            add(blocoP12);
            add(blocoP13);
            add(blocoP14);
            add(blocoP15);
            add(blocoP16);
            add(blocoP17);
            add(blocoP18);
            add(blocoP19);
            add(blocoP20);
            add(blocoP21);
            add(blocoP22);
            add(blocoP23);
            add(blocoP24);
            add(blocoP25);
            add(blocoP26);
            add(blocoP27);
        }
    };

    public void encaixarBloco(Bloco blAlvo, Bloco bl, boolean lateral) {
        //Encaixa o bloco e faz as atualizações de posição e das áreas de encaixe
        Point loc;
        javax.swing.JPanel blocoO = blocosS.get(bl.id);
        if (lateral) {//verifica se o encaixe é lateral
            loc = blAlvo.ret.getLocation();
            loc.x = (blAlvo.ret.getBounds().x) + (blAlvo.ret.getBounds().width);
            blAlvo.encaixadoLateral = bl.id;
        } else {
            loc = blAlvo.ret.getLocation();
            loc.y = (blAlvo.ret.getBounds().y) + (blAlvo.ret.getBounds().height);
            blAlvo.encaixado = bl.id;
        }
        blocoO.setLocation(loc);
        bl.ret = blocoO.getBounds();
        bl.retEncaixe = blocoO.getBounds();
        bl.retEncaixeLateral = blocoO.getBounds();

        bl.retEncaixe.y = bl.retEncaixe.y + 25;
        bl.retEncaixeLateral.x = bl.retEncaixeLateral.x + 25;

        blocos.set(bl.id, bl);
        blocos.set(blAlvo.id, blAlvo);
    }

    public boolean estaEncaixado(Bloco blAlvo) {
        //Se o bloco que estou tentando encaixar estiver grudadoa outro, não pode encaixar 
        if (blAlvo.encaixado != 0) {
            System.out.println("if 1 block");
            return true;
        }
        /*for (Bloco b : blocos) {
                            if (b.encaixado == blAlvo.id && blAlvo.id != 0) {
                                
                            System.out.println("for if 2");
                                return true;
                            }
                        }*/
        return false;
    }

    public boolean estaEncaixadoLateral(Bloco blAlvo) {
        //Se o bloco que estou tentando encaixar estiver grudadoa outro, não pode encaixar 
        if (blAlvo.encaixadoLateral != 0) {
            System.out.println("if Lateral block");
            return true;
        }
        /*for (Bloco b : blocos) {
                            if (b.encaixado == blAlvo.id && blAlvo.id != 0) {
                                
                            System.out.println("for if 2");
                                return true;
                            }
                        }*/
        return false;
    }

    public void encaixa(Bloco bl) {
        //Verifica qual bloco vai ser feito o encaixe e chama a função para encaixar.
        boolean achou = false;
        for (Bloco blAlvo : blocos) {
            if ((bl.ret.intersects(blAlvo.retEncaixe) || bl.ret.intersects(blAlvo.retEncaixeLateral))
                    && bl.id != blAlvo.id && achou == false) {
                if (bl.ret.intersects(blAlvo.retEncaixeLateral)) {
                    if (!estaEncaixadoLateral(blAlvo)) {
                        achou = true;
                        encaixarBloco(blAlvo, bl, true);
                    }
                } else {
                    if (!estaEncaixado(blAlvo)) {
                        achou = true;
                        encaixarBloco(blAlvo, bl, false);
                    }
                }
                
                System.out.println(bl.id + " ENCAIXOU com " + blAlvo.id);
            }
        }
        movendo = false;
    }

    private void moveBloco(java.awt.event.MouseEvent evt, Bloco bl) {
        // Metodo para mover o bloco, é executado no mouseDragged, 
        // movimenta a partir do mouse e faz as atualizações das variaveis de encaxe, e salva nos arrays de armazenagem de dados.
        movendo = true;
        javax.swing.JPanel blocoO = blocosS.get(bl.id);
        bl.ret = blocoO.getBounds();
        bl.retEncaixe = blocoO.getBounds();
        bl.retEncaixeLateral = blocoO.getBounds();
        bl.retEncaixe.x = bl.retEncaixe.x + 25;
        bl.retEncaixe.y = bl.retEncaixe.y + 25;
        bl.encaixado = 0;
        bl.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == bl.id) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == bl.id) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }
        int meioBlocox = bl.ret.width - (bl.ret.width/2); 
        int meioBlocoy = bl.ret.height - (bl.ret.height/2); 
        int x = evt.getLocationOnScreen().x - meioBlocox - panelPrincipal.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - meioBlocoy - panelPrincipal.getLocationOnScreen().y;

        blocoO.setLocation(x, y);
        blocos.set(bl.id, bl);

    }    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos Mouses 13-"> 
    
    private void visuCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visuCodigoMouseClicked
        System.out.println("Visualizando o Código");
        jCodigo.setBlocosJava(blocos, nomeList);//Chama o metodo para criar o código
        JFrame frame = new JFrame("Visualização do Código");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frame.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frame.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frame.setVisible(true);

    }//GEN-LAST:event_visuCodigoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        repositionPanels(panelPrincipal);
        atualizaABlocos();
        System.out.println("Winmdsow");
    }//GEN-LAST:event_formWindowActivated
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos variaveis concerta Panels"> 
        // </editor-fold>
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        System.out.println("Executando Código");
        Interpreter interpreter = new Interpreter();
        String code = jCodigo.setCodigoExec(blocos, nomeList);
        String erro = "";
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);

            PrintStream old = System.out;
            System.setOut(ps);

            try {
                interpreter.eval(code);
            } catch (EvalError e) {
                erro = e.getLocalizedMessage();
                System.err.println("Erro ao executar o código");
                System.err.println("Mensagem: " + e.getLocalizedMessage() + "Fim");
                //Fazer uma janela de erro para avisar que o código está errado.
            }
            
            
            // Restaurar a saída do console
            System.setOut(old);

            // Capturar a saída
            String resultadoConsole = baos.toString();
            
            if(erro != ""){
                jCodigo.setErroCodigo(erro,blocos,nomeList);
                JFrame frameVar = new JFrame("Visualização do Código com Erro");
                frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
                frameVar.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
                frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
                frameVar.setVisible(true);
            }else{
                jResult.setResult(resultadoConsole);
                frameResult.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
                frameResult.getContentPane().add(jResult); // Adiciona o painel da nova janela ao JFrame
                frameResult.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
                frameResult.setVisible(true);
            }
            
            
            
            
            System.out.println("Saída do console: " + resultadoConsole);
            
            
            
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }

        /*
        jCodigo.setBlocosJava(blocos, nomeList);//Chama o metodo para criar o código
        JFrame frameVar = new JFrame("Visualização do Código");
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);*/

    }//GEN-LAST:event_jMenu1MouseClicked
    // <editor-fold defaultstate="collapsed" desc="Metodos variaveis concerta Panels 2/VarDecsValor e ReleseKey"> 
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        String text = jVars.valEscolhido;
        int idBotao = jVars.idValor;
        switch (idBotao) {
            case 0:
                botaoVar0.setText(text);
                blocoP1.dados = text;
                break;
            case 1:
                botaoVar1.setText(text);
                blocoP7.dados = text;
                break;
            case 2:
                botaoVar2.setText(text);
                blocoP8.dados = text;
                break;
            case 3:
                botaoVar3.setText(text);
                blocoP9.dados = text;
                break;
            case 4:
                botaoVar4.setText(text);
                blocoP10.dados = text;
                break;
            case 5:
                botaoVar5.setText(text);
                blocoP20.dados = text;
                break;
            case 6:
                botaoVar6.setText(text);
                blocoP21.dados = text;
                break;
            case 7:
                botaoVar7.setText(text);
                blocoP22.dados = text;
                break;
            default:
                System.out.println("Erro add Botao");
        }
        
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_formWindowGainedFocus

    private void bloco06VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco06VarMouseReleased
        encaixa(blocoP6);
    }//GEN-LAST:event_bloco06VarMouseReleased

    private void bloco06VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco06VarMouseDragged
        moveBloco(evt, blocoP6);
    }//GEN-LAST:event_bloco06VarMouseDragged

    private void varDecValor3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor3KeyReleased
        nomeList[2][1] = varDecValor3.getText();
        blocoP6.dados = varDecValor3.getText();
    }//GEN-LAST:event_varDecValor3KeyReleased

    private void varDec2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDec2KeyReleased
        addVariavel(varDec2.getText(), 2);
        blocoP6.nome = varDec2.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec2KeyReleased

    private void varDec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDec2ActionPerformed
        addVariavel(evt.getActionCommand(), 2);
        blocoP6.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec2ActionPerformed

    private void varDec2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDec2AncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDec2AncestorMoved

    private void bloco19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco19MouseReleased
        encaixa(blocoP19);
    }//GEN-LAST:event_bloco19MouseReleased

    private void bloco19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco19MouseDragged
        moveBloco(evt, blocoP19);
    }//GEN-LAST:event_bloco19MouseDragged

    private void bloco18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco18MouseReleased
        encaixa(blocoP18);
    }//GEN-LAST:event_bloco18MouseReleased

    private void bloco18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco18MouseDragged
        moveBloco(evt, blocoP18);
    }//GEN-LAST:event_bloco18MouseDragged

    private void bloco17ElseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco17ElseMouseReleased
        encaixa(blocoP17);
    }//GEN-LAST:event_bloco17ElseMouseReleased

    private void bloco17ElseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco17ElseMouseDragged
        moveBloco(evt, blocoP17);
    }//GEN-LAST:event_bloco17ElseMouseDragged

    private void ifEntrada1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifEntrada1KeyReleased
        blocoP17.dados = ifEntrada1.getText();
    }//GEN-LAST:event_ifEntrada1KeyReleased

    private void ifEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifEntrada1ActionPerformed

    private void bloco16IFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco16IFMouseReleased
        encaixa(blocoP16);
    }//GEN-LAST:event_bloco16IFMouseReleased

    private void bloco16IFMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco16IFMouseDragged
        moveBloco(evt, blocoP16);
    }//GEN-LAST:event_bloco16IFMouseDragged

    private void ifEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifEntradaKeyReleased
        blocoP16.dados = ifEntrada.getText();
    }//GEN-LAST:event_ifEntradaKeyReleased

    private void ifEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifEntradaActionPerformed

    private void bloco15OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco15OperMouseReleased
        encaixa(blocoP15);
    }//GEN-LAST:event_bloco15OperMouseReleased

    private void bloco15OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco15OperMouseDragged
        moveBloco(evt, blocoP15);
    }//GEN-LAST:event_bloco15OperMouseDragged

    private void bloco14OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco14OperMouseReleased
        encaixa(blocoP14);
    }//GEN-LAST:event_bloco14OperMouseReleased

    private void bloco14OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco14OperMouseDragged
        moveBloco(evt, blocoP14);
    }//GEN-LAST:event_bloco14OperMouseDragged

    private void bloco13OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco13OperMouseReleased
        encaixa(blocoP13);
    }//GEN-LAST:event_bloco13OperMouseReleased

    private void bloco13OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco13OperMouseDragged
        moveBloco(evt, blocoP13);
    }//GEN-LAST:event_bloco13OperMouseDragged

    private void bloco10VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco10VarUMouseReleased
        encaixa(blocoP10);
    }//GEN-LAST:event_bloco10VarUMouseReleased

    private void bloco10VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco10VarUMouseDragged
        moveBloco(evt, blocoP10);
    }//GEN-LAST:event_bloco10VarUMouseDragged

    private void botaoVar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar4MouseClicked
        jVars.setIdVal(4);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar4MouseClicked

    private void bloco12OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco12OperMouseReleased
        encaixa(blocoP12);
    }//GEN-LAST:event_bloco12OperMouseReleased

    private void bloco12OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco12OperMouseDragged
        moveBloco(evt, blocoP12);
    }//GEN-LAST:event_bloco12OperMouseDragged

    private void bloco07VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco07VarUMouseReleased
        encaixa(blocoP7);
    }//GEN-LAST:event_bloco07VarUMouseReleased

    private void bloco07VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco07VarUMouseDragged
        moveBloco(evt, blocoP7);
    }//GEN-LAST:event_bloco07VarUMouseDragged

    private void botaoVar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar1MouseClicked
        jVars.setIdVal(1);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar1MouseClicked

    private void bloco09VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco09VarUMouseReleased
        encaixa(blocoP9);
    }//GEN-LAST:event_bloco09VarUMouseReleased

    private void bloco09VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco09VarUMouseDragged
        moveBloco(evt, blocoP9);
    }//GEN-LAST:event_bloco09VarUMouseDragged

    private void botaoVar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar3MouseClicked
        jVars.setIdVal(3 );
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar3MouseClicked

    private void bloco11OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco11OperMouseReleased
        encaixa(blocoP11);
    }//GEN-LAST:event_bloco11OperMouseReleased

    private void bloco11OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco11OperMouseDragged
        moveBloco(evt, blocoP11);
    }//GEN-LAST:event_bloco11OperMouseDragged

    private void bloco05VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco05VarMouseReleased
        encaixa(blocoP5);
    }//GEN-LAST:event_bloco05VarMouseReleased

    private void bloco05VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco05VarMouseDragged
        moveBloco(evt, blocoP5);
    }//GEN-LAST:event_bloco05VarMouseDragged

    private void varDecValor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor2KeyReleased
        nomeList[1][1] = varDecValor2.getText();
        blocoP5.dados = varDecValor2.getText();
    }//GEN-LAST:event_varDecValor2KeyReleased

    private void varDec1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDec1KeyReleased
        addVariavel(varDec1.getText(), 1);
        blocoP5.nome = varDec1.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec1KeyReleased

    private void varDec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDec1ActionPerformed
        addVariavel(evt.getActionCommand(), 1);
        blocoP5.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec1ActionPerformed

    private void varDec1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDec1AncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDec1AncestorMoved

    private void bloco08VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco08VarUMouseReleased
        encaixa(blocoP8);
    }//GEN-LAST:event_bloco08VarUMouseReleased

    private void bloco08VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco08VarUMouseDragged
        moveBloco(evt, blocoP8);
    }//GEN-LAST:event_bloco08VarUMouseDragged

    private void botaoVar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar2MouseClicked
        jVars.setIdVal(2);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar2MouseClicked

    private void bloco04VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco04VarMouseReleased
        encaixa(blocoP4);
    }//GEN-LAST:event_bloco04VarMouseReleased

    private void bloco04VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco04VarMouseDragged
        moveBloco(evt, blocoP4);
    }//GEN-LAST:event_bloco04VarMouseDragged

    private void varDecValor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor1KeyReleased
        nomeList[0][1] = varDecValor1.getText();
        blocoP4.dados = varDecValor1.getText();
    }//GEN-LAST:event_varDecValor1KeyReleased

    private void varDecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecKeyReleased
        System.out.println(varDec.getText());
        addVariavel(varDec.getText(), 0);
        blocoP4.nome = varDec.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDecKeyReleased

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Var Decs e Metodos Mouses"> 
    private void varDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDecActionPerformed
        addVariavel(evt.getActionCommand(), 0);
        blocoP4.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDecActionPerformed

    private void varDecAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDecAncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDecAncestorMoved

    private void bloco03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco03MouseReleased
        encaixa(blocoP3);
    }//GEN-LAST:event_bloco03MouseReleased

    private void bloco03MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco03MouseDragged

        moveBloco(evt, blocoP3);
    }//GEN-LAST:event_bloco03MouseDragged

    private void bloco02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco02MouseReleased
        encaixa(blocoP2);
    }//GEN-LAST:event_bloco02MouseReleased

    private void bloco02MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco02MouseDragged
        moveBloco(evt, blocoP2);
    }//GEN-LAST:event_bloco02MouseDragged

    private void printKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_printKeyReleased
        blocoP2.dados = print.getText();
    }//GEN-LAST:event_printKeyReleased

    private void bloco01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco01MouseReleased
        encaixa(blocoP1);
    }//GEN-LAST:event_bloco01MouseReleased

    // <editor-fold defaultstate="collapsed" desc="Metodos Mouses 01 - 05 e 11"> 
    private void bloco01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco01MouseDragged
        moveBloco(evt, blocoP1);
    }//GEN-LAST:event_bloco01MouseDragged

// </editor-fold>
    private void botaoVar0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar0MouseClicked
        jVars.setIdVal(0);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar0MouseClicked

    private void botaoVar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar5MouseClicked
        jVars.setIdVal(5);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar5MouseClicked

    private void bloco20VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco20VarUMouseDragged
        moveBloco(evt, blocoP20);
    }//GEN-LAST:event_bloco20VarUMouseDragged

    private void bloco20VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco20VarUMouseReleased
        encaixa(blocoP20);
    }//GEN-LAST:event_bloco20VarUMouseReleased

    private void botaoVar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar6MouseClicked
        jVars.setIdVal(6);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar6MouseClicked

    private void bloco21VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco21VarUMouseDragged
        moveBloco(evt, blocoP21);
    }//GEN-LAST:event_bloco21VarUMouseDragged

    private void bloco21VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco21VarUMouseReleased
        encaixa(blocoP21);
    }//GEN-LAST:event_bloco21VarUMouseReleased

    private void botaoVar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVar7MouseClicked
        jVars.setIdVal(7);
        frameVar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frameVar.getContentPane().add(jVars); // Adiciona o painel da nova janela ao JFrame
        frameVar.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frameVar.setVisible(true);
    }//GEN-LAST:event_botaoVar7MouseClicked

    private void bloco22VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco22VarUMouseDragged
        moveBloco(evt, blocoP22);
    }//GEN-LAST:event_bloco22VarUMouseDragged

    private void bloco22VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco22VarUMouseReleased
        encaixa(blocoP22);
    }//GEN-LAST:event_bloco22VarUMouseReleased

    private void bloco23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco23MouseDragged
        moveBloco(evt, blocoP23);
    }//GEN-LAST:event_bloco23MouseDragged

    private void bloco23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco23MouseReleased
        encaixa(blocoP23);
    }//GEN-LAST:event_bloco23MouseReleased

    private void bloco24MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco24MouseDragged
        moveBloco(evt, blocoP24);
    }//GEN-LAST:event_bloco24MouseDragged

    private void bloco24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco24MouseReleased
        encaixa(blocoP24);
    }//GEN-LAST:event_bloco24MouseReleased

    private void bloco26MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco26MouseDragged
        moveBloco(evt, blocoP26);
    }//GEN-LAST:event_bloco26MouseDragged

    private void bloco26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco26MouseReleased
        encaixa(blocoP26);
    }//GEN-LAST:event_bloco26MouseReleased

    private void bloco25MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco25MouseDragged
        moveBloco(evt, blocoP25);
    }//GEN-LAST:event_bloco25MouseDragged

    private void bloco25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco25MouseReleased
        encaixa(blocoP25);
    }//GEN-LAST:event_bloco25MouseReleased

    private void bloco27MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco27MouseDragged
        moveBloco(evt, blocoP27);
    }//GEN-LAST:event_bloco27MouseDragged

    private void bloco27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco27MouseReleased
        encaixa(blocoP27);
    }//GEN-LAST:event_bloco27MouseReleased
    
    private void addVariavel(String item, int i) {
        //Fazer uma matriz para adicionar os valores, aí passa tudo pra classe do codigo
        nomeList[i][0] = item;
        jVars.setVars(nomeList);
        repositionPanels(panelPrincipal);
    }

    private Codigo jCodigo = new Codigo();
    private EscolhaVariaveis jVars = new EscolhaVariaveis();
    private ResultadoExec jResult = new ResultadoExec();
    private JFrame frameVar = new JFrame("Escolha de Variável");
    private JFrame frameResult = new JFrame("Resultado");
        

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
            java.util.logging.Logger.getLogger(MainInterativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterativo().setVisible(true);
            }
        });
    }

    private void repositionPanels(javax.swing.JPanel frame) {
        // Relocaliza os componentes quando minimizado
        Point pt = getLocation();
        pt.x = 0;
        pt.y = 0;
        /*atualizaABlocos();
            for (Bloco bl : blocos) {
                javax.swing.JPanel blocoO = blocosS.get(bl.id);
                if(blocoO == null){break;}
                if(!bl.getRet().getLocation().equals(pt))blocoO.setLocation(blocoP1.getRet().getLocation());
            }*/
        if (!blocoP1.getRet().getLocation().equals(pt)) {
            bloco01.setLocation(blocoP1.getRet().getLocation());
        }
        if (!blocoP2.getRet().getLocation().equals(pt)) {
            bloco02.setLocation(blocoP2.getRet().getLocation());
        }
        if (!blocoP3.getRet().getLocation().equals(pt)) {
            bloco03.setLocation(blocoP3.getRet().getLocation());
        }
        if (!blocoP4.getRet().getLocation().equals(pt)) {
            bloco04Var.setLocation(blocoP4.getRet().getLocation());
        }
        if (!blocoP5.getRet().getLocation().equals(pt)) {
            bloco05Var.setLocation(blocoP5.getRet().getLocation());
        }
        if (!blocoP6.getRet().getLocation().equals(pt)) {
            bloco06Var.setLocation(blocoP6.getRet().getLocation());
        }
        if (!blocoP7.getRet().getLocation().equals(pt)) {
            bloco07VarU.setLocation(blocoP7.getRet().getLocation());
        }
        if (!blocoP8.getRet().getLocation().equals(pt)) {
            bloco08VarU.setLocation(blocoP8.getRet().getLocation());
        }
        if (!blocoP9.getRet().getLocation().equals(pt)) {
            bloco09VarU.setLocation(blocoP9.getRet().getLocation());
        }
        if (!blocoP10.getRet().getLocation().equals(pt)) {
            bloco10VarU.setLocation(blocoP10.getRet().getLocation());
        }
        if (!blocoP11.getRet().getLocation().equals(pt)) {
            bloco11Oper.setLocation(blocoP11.getRet().getLocation());
        }
        if (!blocoP12.getRet().getLocation().equals(pt)) {
            bloco12Oper.setLocation(blocoP12.getRet().getLocation());
        }
        if (!blocoP13.getRet().getLocation().equals(pt)) {
            bloco13Oper.setLocation(blocoP13.getRet().getLocation());
        }
        if (!blocoP14.getRet().getLocation().equals(pt)) {
            bloco14Oper.setLocation(blocoP14.getRet().getLocation());
        }
        if (!blocoP15.getRet().getLocation().equals(pt)) {
            bloco15Oper.setLocation(blocoP15.getRet().getLocation());
        }
        if (!blocoP16.getRet().getLocation().equals(pt)) {
            bloco16IF.setLocation(blocoP16.getRet().getLocation());
        }
        if (!blocoP17.getRet().getLocation().equals(pt)) {
            bloco17Else.setLocation(blocoP17.getRet().getLocation());
        }
        if (!blocoP18.getRet().getLocation().equals(pt)) {
            bloco18.setLocation(blocoP18.getRet().getLocation());
        }
        if (!blocoP19.getRet().getLocation().equals(pt)) {
            bloco19.setLocation(blocoP19.getRet().getLocation());
        }
        if (!blocoP20.getRet().getLocation().equals(pt)) {
            bloco20VarU.setLocation(blocoP20.getRet().getLocation());
        }
        if (!blocoP21.getRet().getLocation().equals(pt)) {
            bloco21VarU.setLocation(blocoP21.getRet().getLocation());
        }
        if (!blocoP22.getRet().getLocation().equals(pt)) {
            bloco22VarU.setLocation(blocoP22.getRet().getLocation());
        }
        if (!blocoP23.getRet().getLocation().equals(pt)) {
            bloco23.setLocation(blocoP23.getRet().getLocation());
        }
        if (!blocoP24.getRet().getLocation().equals(pt)) {
            bloco24.setLocation(blocoP24.getRet().getLocation());
        }
        if (!blocoP25.getRet().getLocation().equals(pt)) {
            bloco25.setLocation(blocoP25.getRet().getLocation());
        }
        if (!blocoP26.getRet().getLocation().equals(pt)) {
            bloco26.setLocation(blocoP26.getRet().getLocation());
        }
        if (!blocoP27.getRet().getLocation().equals(pt)) {
            bloco27.setLocation(blocoP27.getRet().getLocation());
        }

    }
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de Variáveis"> 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel bloco00;
    javax.swing.JPanel bloco01;
    javax.swing.JPanel bloco02;
    javax.swing.JPanel bloco03;
    javax.swing.JPanel bloco04Var;
    javax.swing.JPanel bloco05Var;
    javax.swing.JPanel bloco06Var;
    javax.swing.JPanel bloco07VarU;
    javax.swing.JPanel bloco08VarU;
    javax.swing.JPanel bloco09VarU;
    javax.swing.JPanel bloco10VarU;
    javax.swing.JPanel bloco11Oper;
    javax.swing.JPanel bloco12Oper;
    javax.swing.JPanel bloco13Oper;
    javax.swing.JPanel bloco14Oper;
    javax.swing.JPanel bloco15Oper;
    javax.swing.JPanel bloco16IF;
    javax.swing.JPanel bloco17Else;
    javax.swing.JPanel bloco18;
    javax.swing.JPanel bloco19;
    javax.swing.JPanel bloco20VarU;
    javax.swing.JPanel bloco21VarU;
    javax.swing.JPanel bloco22VarU;
    javax.swing.JPanel bloco23;
    javax.swing.JPanel bloco24;
    javax.swing.JPanel bloco25;
    javax.swing.JPanel bloco26;
    javax.swing.JPanel bloco27;
    javax.swing.JButton botaoVar0;
    javax.swing.JButton botaoVar1;
    javax.swing.JButton botaoVar2;
    javax.swing.JButton botaoVar3;
    javax.swing.JButton botaoVar4;
    javax.swing.JButton botaoVar5;
    javax.swing.JButton botaoVar6;
    javax.swing.JButton botaoVar7;
    javax.swing.JTextField ifEntrada;
    javax.swing.JTextField ifEntrada1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JMenu jMenu1;
    javax.swing.JLayeredPane layPanel;
    javax.swing.JMenu menu;
    javax.swing.JMenuBar menuBar;
    javax.swing.JPanel panelPrincipal;
    javax.swing.JTextField print;
    javax.swing.JSeparator separador;
    javax.swing.JTextField varDec;
    javax.swing.JTextField varDec1;
    javax.swing.JTextField varDec2;
    javax.swing.JTextField varDecValor1;
    javax.swing.JTextField varDecValor2;
    javax.swing.JTextField varDecValor3;
    javax.swing.JMenu visuCodigo;
    // End of variables declaration//GEN-END:variables

    
// </editor-fold>
}
