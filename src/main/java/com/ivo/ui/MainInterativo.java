package com.ivo.ui;

import bsh.EvalError;
import com.ivo.tools.Bloco;

import bsh.Interpreter;
import java.awt.Point;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.io.PrintStream;
import javax.swing.JFrame;

/**
 *
 * @author Gabriel Ivo
 */
public class MainInterativo extends javax.swing.JFrame {

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
        jLabel1 = new javax.swing.JLabel();
        variaveis0 = new javax.swing.JComboBox<>();
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
        variaveis2 = new javax.swing.JComboBox<>();
        bloco05Var = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        varDec1 = new javax.swing.JTextField();
        varDecValor2 = new javax.swing.JTextField();
        layPanel = new javax.swing.JLayeredPane();
        bloco00 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bloco11Oper = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bloco06Var = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        varDec2 = new javax.swing.JTextField();
        varDecValor3 = new javax.swing.JTextField();
        bloco09VarU = new javax.swing.JPanel();
        variaveis3 = new javax.swing.JComboBox<>();
        bloco07VarU = new javax.swing.JPanel();
        variaveis1 = new javax.swing.JComboBox<>();
        bloco12Oper = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bloco10VarU = new javax.swing.JPanel();
        variaveis4 = new javax.swing.JComboBox<>();
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
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        visuCodigo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        bloco01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloco01.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
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

        variaveis0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        variaveis0.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                variaveis0ItemStateChanged(evt);
            }
        });
        variaveis0.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                variaveis0MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                variaveis0MouseMoved(evt);
            }
        });
        variaveis0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                variaveis0FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                variaveis0FocusLost(evt);
            }
        });
        variaveis0.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                variaveis0PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis0PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis0PopupMenuWillBecomeVisible(evt);
            }
        });
        variaveis0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                variaveis0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                variaveis0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                variaveis0MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                variaveis0MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                variaveis0MouseReleased(evt);
            }
        });
        variaveis0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                variaveis0PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout bloco01Layout = new javax.swing.GroupLayout(bloco01);
        bloco01.setLayout(bloco01Layout);
        bloco01Layout.setHorizontalGroup(
            bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(variaveis0, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        bloco01Layout.setVerticalGroup(
            bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco01Layout.createSequentialGroup()
                        .addComponent(variaveis0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bloco01Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );

        bloco02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel2.setText("Escreva");

        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloco02Layout = new javax.swing.GroupLayout(bloco02);
        bloco02.setLayout(bloco02Layout);
        bloco02Layout.setHorizontalGroup(
            bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco02Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print)
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

        bloco03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloco03.setNextFocusableComponent(jLabel1);
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

        jLabel3.setText("Escreva:");

        javax.swing.GroupLayout bloco03Layout = new javax.swing.GroupLayout(bloco03);
        bloco03.setLayout(bloco03Layout);
        bloco03Layout.setHorizontalGroup(
            bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        bloco03Layout.setVerticalGroup(
            bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        bloco04Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel6.setText("Variável");

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

        bloco08VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        variaveis2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        variaveis2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                variaveis2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                variaveis2MouseMoved(evt);
            }
        });
        variaveis2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                variaveis2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                variaveis2FocusLost(evt);
            }
        });
        variaveis2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                variaveis2PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis2PopupMenuWillBecomeVisible(evt);
            }
        });
        variaveis2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                variaveis2MouseWheelMoved(evt);
            }
        });
        variaveis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                variaveis2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                variaveis2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                variaveis2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                variaveis2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                variaveis2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco08VarULayout = new javax.swing.GroupLayout(bloco08VarU);
        bloco08VarU.setLayout(bloco08VarULayout);
        bloco08VarULayout.setHorizontalGroup(
            bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco08VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        bloco08VarULayout.setVerticalGroup(
            bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco08VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bloco05Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel8.setText("Variável");

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
                .addComponent(varDecValor2)
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

        layPanel.setBackground(new java.awt.Color(255, 255, 255));
        layPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bloco00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
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
                .addContainerGap(436, Short.MAX_VALUE))
        );

        bloco11Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("+");

        javax.swing.GroupLayout bloco11OperLayout = new javax.swing.GroupLayout(bloco11Oper);
        bloco11Oper.setLayout(bloco11OperLayout);
        bloco11OperLayout.setHorizontalGroup(
            bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco11OperLayout.setVerticalGroup(
            bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco06Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel10.setText("Variável");

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
                .addComponent(varDecValor3)
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

        bloco09VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        variaveis3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        variaveis3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                variaveis3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                variaveis3MouseMoved(evt);
            }
        });
        variaveis3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                variaveis3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                variaveis3FocusLost(evt);
            }
        });
        variaveis3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                variaveis3PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis3PopupMenuWillBecomeVisible(evt);
            }
        });
        variaveis3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                variaveis3MouseWheelMoved(evt);
            }
        });
        variaveis3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                variaveis3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                variaveis3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                variaveis3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                variaveis3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                variaveis3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco09VarULayout = new javax.swing.GroupLayout(bloco09VarU);
        bloco09VarU.setLayout(bloco09VarULayout);
        bloco09VarULayout.setHorizontalGroup(
            bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco09VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        bloco09VarULayout.setVerticalGroup(
            bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco09VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bloco07VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        variaveis1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        variaveis1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                variaveis1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                variaveis1MouseMoved(evt);
            }
        });
        variaveis1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                variaveis1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                variaveis1FocusLost(evt);
            }
        });
        variaveis1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                variaveis1PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis1PopupMenuWillBecomeVisible(evt);
            }
        });
        variaveis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                variaveis1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                variaveis1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                variaveis1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                variaveis1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                variaveis1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco07VarULayout = new javax.swing.GroupLayout(bloco07VarU);
        bloco07VarU.setLayout(bloco07VarULayout);
        bloco07VarULayout.setHorizontalGroup(
            bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco07VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        bloco07VarULayout.setVerticalGroup(
            bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco07VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bloco12Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        javax.swing.GroupLayout bloco12OperLayout = new javax.swing.GroupLayout(bloco12Oper);
        bloco12Oper.setLayout(bloco12OperLayout);
        bloco12OperLayout.setHorizontalGroup(
            bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco12OperLayout.setVerticalGroup(
            bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco10VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        variaveis4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        variaveis4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                variaveis4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                variaveis4MouseMoved(evt);
            }
        });
        variaveis4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                variaveis4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                variaveis4FocusLost(evt);
            }
        });
        variaveis4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                variaveis4PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                variaveis4PopupMenuWillBecomeVisible(evt);
            }
        });
        variaveis4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                variaveis4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                variaveis4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                variaveis4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                variaveis4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                variaveis4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout bloco10VarULayout = new javax.swing.GroupLayout(bloco10VarU);
        bloco10VarU.setLayout(bloco10VarULayout);
        bloco10VarULayout.setHorizontalGroup(
            bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco10VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        bloco10VarULayout.setVerticalGroup(
            bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bloco10VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(variaveis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bloco13Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");

        javax.swing.GroupLayout bloco13OperLayout = new javax.swing.GroupLayout(bloco13Oper);
        bloco13Oper.setLayout(bloco13OperLayout);
        bloco13OperLayout.setHorizontalGroup(
            bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco13OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco13OperLayout.setVerticalGroup(
            bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco13OperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        bloco14Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("*");

        javax.swing.GroupLayout bloco14OperLayout = new javax.swing.GroupLayout(bloco14Oper);
        bloco14Oper.setLayout(bloco14OperLayout);
        bloco14OperLayout.setHorizontalGroup(
            bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco14OperLayout.setVerticalGroup(
            bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bloco15Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("/");

        javax.swing.GroupLayout bloco15OperLayout = new javax.swing.GroupLayout(bloco15Oper);
        bloco15Oper.setLayout(bloco15OperLayout);
        bloco15OperLayout.setHorizontalGroup(
            bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco15OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloco15OperLayout.setVerticalGroup(
            bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco15OperLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        bloco16IF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Se");

        ifEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntradaActionPerformed(evt);
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
                .addComponent(ifEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        bloco17Else.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Se Não");

        ifEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntrada1ActionPerformed(evt);
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
                .addGroup(bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco17ElseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(bloco17ElseLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ifEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco16IF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bloco02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloco11Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloco13Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloco14Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloco12Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloco05Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco04Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco06Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloco10VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco09VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco08VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco07VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco04Var, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco01, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(bloco05Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bloco06Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(bloco02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloco03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco07VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloco12Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(bloco11Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco08VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bloco13Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(bloco14Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloco09VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco10VarU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco16IF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(layPanel)
        );

        bloco03.getAccessibleContext().setAccessibleParent(panelPrincipal);

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 517));

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

    public ArrayList<javax.swing.JPanel> blocosS = new ArrayList<javax.swing.JPanel>() {//TESTEEE
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
                        encaixarBloco(blAlvo, bl, true);
                    }
                } else {
                    if (!estaEncaixado(blAlvo)) {
                        encaixarBloco(blAlvo, bl, false);
                    }
                }
                achou = true;
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
        int x = evt.getLocationOnScreen().x - 62 - panelPrincipal.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - panelPrincipal.getLocationOnScreen().y;

        blocoO.setLocation(x, y);
        blocos.set(bl.id, bl);

    }
    private void bloco01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco01MouseDragged

        moveBloco(evt, blocoP1);

        for (Bloco bl : blocos) {//Teste para saber qual area está sendo interceptada
            //System.out.println("Controle " + bl.id);
            if (bl.id == 1) {
                continue;
            }
            if (blocoP1.ret.intersects(bl.retEncaixe)) {
                System.out.println("Relando no " + bl.id);
            }
            if (blocoP1.ret.intersects(bl.ret)) {
                System.out.println("Relando Dentro no " + bl.id);
            }
            if (blocoP1.ret.intersects(bl.retEncaixeLateral)) {
                System.out.println("Relando Latera no " + bl.id);
            }
        }
    }//GEN-LAST:event_bloco01MouseDragged

    private void bloco02MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco02MouseDragged

        moveBloco(evt, blocoP2);

    }//GEN-LAST:event_bloco02MouseDragged

    private void bloco03MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco03MouseDragged

        moveBloco(evt, blocoP3);

    }//GEN-LAST:event_bloco03MouseDragged

    private void bloco01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco01MouseReleased
        encaixa(blocoP1);
    }//GEN-LAST:event_bloco01MouseReleased

    private void bloco02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco02MouseReleased
        encaixa(blocoP2);
    }//GEN-LAST:event_bloco02MouseReleased

    private void bloco03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco03MouseReleased
        encaixa(blocoP3);
    }//GEN-LAST:event_bloco03MouseReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        blocoP2.dados = evt.getActionCommand();

    }//GEN-LAST:event_printActionPerformed

    private void bloco04VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco04VarMouseReleased
        encaixa(blocoP4);
    }//GEN-LAST:event_bloco04VarMouseReleased

    private void bloco04VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco04VarMouseDragged
        moveBloco(evt, blocoP4);

    }//GEN-LAST:event_bloco04VarMouseDragged

    private void bloco08VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco08VarUMouseDragged
        moveBloco(evt, blocoP8);
    }//GEN-LAST:event_bloco08VarUMouseDragged

    private void bloco08VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco08VarUMouseReleased
        encaixa(blocoP8);
    }//GEN-LAST:event_bloco08VarUMouseReleased

    private void bloco05VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco05VarMouseDragged
        moveBloco(evt, blocoP5);
    }//GEN-LAST:event_bloco05VarMouseDragged

    private void bloco05VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco05VarMouseReleased
        encaixa(blocoP5);
    }//GEN-LAST:event_bloco05VarMouseReleased

    private void bloco11OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco11OperMouseDragged
        moveBloco(evt, blocoP11);
    }//GEN-LAST:event_bloco11OperMouseDragged

    private void bloco11OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco11OperMouseReleased
        encaixa(blocoP11);
    }//GEN-LAST:event_bloco11OperMouseReleased

    private void varDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDecActionPerformed
        addVariavel(evt.getActionCommand(), 0);
        blocoP4.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDecActionPerformed

    private void varDec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDec1ActionPerformed
        addVariavel(evt.getActionCommand(), 1);
        blocoP5.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec1ActionPerformed

    private void varDec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDec2ActionPerformed
        addVariavel(evt.getActionCommand(), 2);
        blocoP6.nome = evt.getActionCommand();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec2ActionPerformed

    private void bloco06VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco06VarMouseDragged
        moveBloco(evt, blocoP6);
    }//GEN-LAST:event_bloco06VarMouseDragged

    private void bloco06VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco06VarMouseReleased
        encaixa(blocoP6);
    }//GEN-LAST:event_bloco06VarMouseReleased

    private void bloco09VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco09VarUMouseDragged
        moveBloco(evt, blocoP9);
    }//GEN-LAST:event_bloco09VarUMouseDragged

    private void bloco09VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco09VarUMouseReleased
        encaixa(blocoP9);
    }//GEN-LAST:event_bloco09VarUMouseReleased

    private void bloco07VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco07VarUMouseDragged
        moveBloco(evt, blocoP7);
    }//GEN-LAST:event_bloco07VarUMouseDragged

    private void bloco07VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco07VarUMouseReleased
        encaixa(blocoP7);
    }//GEN-LAST:event_bloco07VarUMouseReleased

    private void bloco12OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco12OperMouseDragged
        moveBloco(evt, blocoP12);
    }//GEN-LAST:event_bloco12OperMouseDragged

    private void bloco12OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco12OperMouseReleased
        encaixa(blocoP12);
    }//GEN-LAST:event_bloco12OperMouseReleased

    private void bloco10VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco10VarUMouseDragged
        moveBloco(evt, blocoP10);
    }//GEN-LAST:event_bloco10VarUMouseDragged

    private void bloco10VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco10VarUMouseReleased
        encaixa(blocoP10);
    }//GEN-LAST:event_bloco10VarUMouseReleased

    private void visuCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visuCodigoMouseClicked
        System.out.println("Visualizando o Código");
        jCodigo.setBlocos(blocos, nomeList);//Chama o metodo para criar o código
        JFrame frame = new JFrame("Visualização do Código");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frame.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frame.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frame.setVisible(true);

    }//GEN-LAST:event_visuCodigoMouseClicked

    private void bloco13OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco13OperMouseDragged
        moveBloco(evt, blocoP13);
    }//GEN-LAST:event_bloco13OperMouseDragged

    private void bloco13OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco13OperMouseReleased
        encaixa(blocoP13);
    }//GEN-LAST:event_bloco13OperMouseReleased

    private void bloco14OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco14OperMouseDragged
        moveBloco(evt, blocoP4);
    }//GEN-LAST:event_bloco14OperMouseDragged

    private void bloco14OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco14OperMouseReleased
        encaixa(blocoP14);
    }//GEN-LAST:event_bloco14OperMouseReleased

    private void bloco15OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco15OperMouseDragged
        moveBloco(evt, blocoP15);
    }//GEN-LAST:event_bloco15OperMouseDragged

    private void bloco15OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco15OperMouseReleased
        encaixa(blocoP15);
    }//GEN-LAST:event_bloco15OperMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        repositionPanels(panelPrincipal);
        atualizaABlocos();
        System.out.println("Winmdsow");
    }//GEN-LAST:event_formWindowActivated

    private void variaveis0MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseMoved

    private void variaveis0PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis0PopupMenuWillBecomeVisible
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0PopupMenuWillBecomeVisible

    private void variaveis0PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis0PopupMenuWillBecomeInvisible
        repositionPanels(panelPrincipal);
        if (variaveis0.getSelectedItem() != null) {
            blocoP1.dados = variaveis0.getSelectedItem().toString();
        }
    }//GEN-LAST:event_variaveis0PopupMenuWillBecomeInvisible

    private void variaveis0PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis0PopupMenuCanceled
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0PopupMenuCanceled

    private void variaveis0MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseDragged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseDragged

    private void variaveis0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseClicked
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseClicked

    private void variaveis0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MousePressed
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MousePressed

    private void ifEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntradaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ifEntradaActionPerformed

    private void bloco16IFMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco16IFMouseDragged
        moveBloco(evt, blocoP16);
    }//GEN-LAST:event_bloco16IFMouseDragged

    private void bloco16IFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco16IFMouseReleased
        encaixa(blocoP16);
    }//GEN-LAST:event_bloco16IFMouseReleased

    private void ifEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntrada1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ifEntrada1ActionPerformed

    private void bloco17ElseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco17ElseMouseDragged
        moveBloco(evt, blocoP17);
    }//GEN-LAST:event_bloco17ElseMouseDragged

    private void bloco17ElseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloco17ElseMouseReleased
        encaixa(blocoP17);
    }//GEN-LAST:event_bloco17ElseMouseReleased

    private void variaveis1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseDragged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseDragged

    private void variaveis1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseMoved

    private void variaveis1PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis1PopupMenuCanceled
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1PopupMenuCanceled

    private void variaveis1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis1PopupMenuWillBecomeInvisible
        repositionPanels(panelPrincipal);
        blocoP7.dados = variaveis1.getSelectedItem().toString();
    }//GEN-LAST:event_variaveis1PopupMenuWillBecomeInvisible

    private void variaveis1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis1PopupMenuWillBecomeVisible
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1PopupMenuWillBecomeVisible

    private void variaveis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseClicked
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseClicked

    private void variaveis1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MousePressed
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MousePressed

    private void variaveis2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseDragged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseDragged

    private void variaveis2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseMoved

    private void variaveis2PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis2PopupMenuCanceled
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2PopupMenuCanceled

    private void variaveis2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis2PopupMenuWillBecomeInvisible
        repositionPanels(panelPrincipal);
        blocoP8.dados = variaveis2.getSelectedItem().toString();
    }//GEN-LAST:event_variaveis2PopupMenuWillBecomeInvisible

    private void variaveis2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis2PopupMenuWillBecomeVisible
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2PopupMenuWillBecomeVisible

    private void variaveis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseClicked
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseClicked

    private void variaveis2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MousePressed
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MousePressed

    private void variaveis3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseDragged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseDragged

    private void variaveis3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseMoved

    private void variaveis3PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis3PopupMenuCanceled
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3PopupMenuCanceled

    private void variaveis3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis3PopupMenuWillBecomeInvisible
        repositionPanels(panelPrincipal);
        if (variaveis0.getSelectedItem() != null) {
            blocoP9.dados = variaveis3.getSelectedItem().toString();
        }
    }//GEN-LAST:event_variaveis3PopupMenuWillBecomeInvisible

    private void variaveis3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis3PopupMenuWillBecomeVisible
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3PopupMenuWillBecomeVisible

    private void variaveis3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseClicked
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseClicked

    private void variaveis3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MousePressed
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MousePressed

    private void variaveis4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseDragged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseDragged

    private void variaveis4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseMoved

    private void variaveis4PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis4PopupMenuCanceled
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4PopupMenuCanceled

    private void variaveis4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis4PopupMenuWillBecomeInvisible
        repositionPanels(panelPrincipal);
        if (variaveis0.getSelectedItem() != null) {
            blocoP10.dados = variaveis4.getSelectedItem().toString();
        }
    }//GEN-LAST:event_variaveis4PopupMenuWillBecomeInvisible

    private void variaveis4PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_variaveis4PopupMenuWillBecomeVisible
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4PopupMenuWillBecomeVisible

    private void variaveis4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseClicked
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseClicked

    private void variaveis4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MousePressed
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MousePressed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        System.out.println("Executando Código");
        Interpreter interpreter = new Interpreter();

        try {
            // Capturar a saída do console
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);

            // Redirecionar a saída do console
            PrintStream old = System.out;
            System.setOut(ps);

            // Executar código dinâmico
            try {
                interpreter.eval("int x = 5; int y = 10; int z = x + y; System.out.println(\"Resultado: \"+ z);");
            } catch (EvalError e) {
                System.err.println("Erro ao executar o código");
                System.err.println("Mensagem: " + e.getLocalizedMessage() + "Fim");
                //Fazer uma janela de erro para avisar que o código está errado.
            }
            // Restaurar a saída do console
            System.setOut(old);

            // Capturar a saída
            String resultadoConsole = baos.toString();
            System.out.println("Saída do console: " + resultadoConsole);
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }

        /*
        jCodigo.setBlocos(blocos, nomeList);//Chama o metodo para criar o código
        JFrame frame = new JFrame("Visualização do Código");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frame.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frame.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frame.setVisible(true);*/

    }//GEN-LAST:event_jMenu1MouseClicked

    private void variaveis0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseReleased
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseReleased

    private void variaveis0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_variaveis0PropertyChange
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0PropertyChange

    private void variaveis0ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_variaveis0ItemStateChanged
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0ItemStateChanged

    private void variaveis0FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis0FocusGained
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0FocusGained

    private void variaveis0FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis0FocusLost
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0FocusLost

    private void variaveis0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseExited
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseExited

    private void variaveis0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis0MouseEntered
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis0MouseEntered

    private void variaveis1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis1FocusGained
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1FocusGained

    private void variaveis1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis1FocusLost
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1FocusLost

    private void variaveis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseEntered
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseEntered

    private void variaveis1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseExited
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseExited

    private void variaveis1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis1MouseReleased
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis1MouseReleased

    private void variaveis2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseEntered
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseEntered

    private void variaveis2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseExited
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseExited

    private void variaveis2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis2MouseReleased
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseReleased

    private void variaveis2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_variaveis2MouseWheelMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2MouseWheelMoved

    private void variaveis2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis2FocusLost
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2FocusLost

    private void variaveis2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis2FocusGained
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis2FocusGained

    private void variaveis3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis3FocusLost
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3FocusLost

    private void variaveis3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis3FocusGained
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3FocusGained

    private void variaveis3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseEntered
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseEntered

    private void variaveis3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseExited
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseExited

    private void variaveis3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis3MouseReleased
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseReleased

    private void variaveis3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_variaveis3MouseWheelMoved
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis3MouseWheelMoved

    private void variaveis4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis4FocusGained
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4FocusGained

    private void variaveis4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_variaveis4FocusLost
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4FocusLost

    private void variaveis4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseEntered
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseEntered

    private void variaveis4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseExited
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseExited

    private void variaveis4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_variaveis4MouseReleased
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_variaveis4MouseReleased

    private void varDecAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDecAncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDecAncestorMoved

    private void varDec1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDec1AncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDec1AncestorMoved

    private void varDec2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_varDec2AncestorMoved
        if (!movendo) {
            repositionPanels(panelPrincipal);
        }
    }//GEN-LAST:event_varDec2AncestorMoved

    private void varDecValor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor1KeyReleased
        nomeList[0][1] = varDecValor1.getText();
        blocoP4.dados = varDecValor1.getText();
    }//GEN-LAST:event_varDecValor1KeyReleased

    private void varDecValor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor2KeyReleased
        nomeList[1][1] = varDecValor2.getText();
        blocoP5.dados = varDecValor2.getText();
    }//GEN-LAST:event_varDecValor2KeyReleased

    private void varDecValor3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecValor3KeyReleased
        nomeList[2][1] = varDecValor3.getText();
        blocoP6.dados = varDecValor3.getText();
    }//GEN-LAST:event_varDecValor3KeyReleased

    private void varDecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDecKeyReleased
        System.out.println(varDec.getText());
        addVariavel(varDec.getText(), 0);
        blocoP4.nome = varDec.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDecKeyReleased

    private void varDec1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDec1KeyReleased
        addVariavel(varDec1.getText(), 1);
        blocoP5.nome = varDec1.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec1KeyReleased

    private void varDec2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varDec2KeyReleased
        addVariavel(varDec2.getText(), 2);
        blocoP6.nome = varDec2.getText();
        repositionPanels(panelPrincipal);
    }//GEN-LAST:event_varDec2KeyReleased
    /*
    
    Fazer o mesmo do de cima nos outros, ve se fica bom
    
    No codigo, ver se ta tudo certinho, Tira o negocio de colocar o valor quanto tem o pritVar
    E cria outro para fazer o codigo para executar.
    
    
    
    
    
    
    
     */
    private void addVariavel(String item, int i) {
        //Fazer uma matriz para adicionar os valores, aí passa tudo pra classe do codigo
        nomeList[i][0] = item;
        variaveis0.removeAllItems();
        variaveis1.removeAllItems();
        variaveis2.removeAllItems();
        variaveis3.removeAllItems();
        variaveis4.removeAllItems();

        for (int x = 0; x < 3; x++) {
            if (nomeList[x][0] != "" && nomeList[x][0] != null) {
                String string = nomeList[x][0];
                variaveis0.addItem(string);
                variaveis1.addItem(string);
                variaveis2.addItem(string);
                variaveis3.addItem(string);
                variaveis4.addItem(string);
            }
        }
        repositionPanels(panelPrincipal);
    }

    private Codigo jCodigo = new Codigo();

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

    }
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
    javax.swing.JTextField ifEntrada;
    javax.swing.JTextField ifEntrada1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel2;
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
    javax.swing.JComboBox<String> variaveis0;
    javax.swing.JComboBox<String> variaveis1;
    javax.swing.JComboBox<String> variaveis2;
    javax.swing.JComboBox<String> variaveis3;
    javax.swing.JComboBox<String> variaveis4;
    javax.swing.JMenu visuCodigo;
    // End of variables declaration//GEN-END:variables
}
