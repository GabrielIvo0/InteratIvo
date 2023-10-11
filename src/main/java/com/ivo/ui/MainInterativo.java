package com.ivo.ui;

import com.ivo.tools.Bloco;

import java.awt.Point;
import java.util.ArrayList;
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
        blocoP0.ret = Bloco00.getBounds();
        blocoP0.retEncaixe = Bloco00.getBounds();
        blocoP0.ret.x = blocoP0.ret.x + 7;
        blocoP0.ret.y = blocoP0.ret.y + 3;
        blocoP0.retEncaixe.y = blocoP0.retEncaixe.y + 25;
        blocoP0.encaixadoLateral = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Bloco01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Variaveis = new javax.swing.JComboBox<>();
        Bloco02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JTextField();
        Bloco03 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Bloco04Var = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        VarDEC = new javax.swing.JTextField();
        VarDacValor1 = new javax.swing.JTextField();
        Bloco08VarU = new javax.swing.JPanel();
        Variaveis2 = new javax.swing.JComboBox<>();
        Bloco05Var = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        VarDEC1 = new javax.swing.JTextField();
        VarDacValor2 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Bloco00 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Bloco11Oper = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Bloco06Var = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        VarDEC3 = new javax.swing.JTextField();
        VarDacValor3 = new javax.swing.JTextField();
        Bloco09VarU = new javax.swing.JPanel();
        Variaveis3 = new javax.swing.JComboBox<>();
        Bloco07VarU = new javax.swing.JPanel();
        Variaveis1 = new javax.swing.JComboBox<>();
        Bloco12Oper = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Bloco10VarU = new javax.swing.JPanel();
        Variaveis4 = new javax.swing.JComboBox<>();
        Bloco13Oper = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Bloco14Oper = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Bloco15Oper = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Bloco16IF = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ifEntrada = new javax.swing.JTextField();
        Bloco17Else = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ifEntrada1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        VisuCódigo = new javax.swing.JMenu();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 480));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setMaximumSize(new java.awt.Dimension(50, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        Bloco01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco01.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Bloco01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco01MouseDragged(evt);
            }
        });
        Bloco01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco01MouseReleased(evt);
            }
        });

        Variaveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        Variaveis.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                VariaveisMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VariaveisMouseMoved(evt);
            }
        });
        Variaveis.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                VariaveisPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                VariaveisPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                VariaveisPopupMenuWillBecomeVisible(evt);
            }
        });
        Variaveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VariaveisMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VariaveisMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Bloco01Layout = new javax.swing.GroupLayout(Bloco01);
        Bloco01.setLayout(Bloco01Layout);
        Bloco01Layout.setHorizontalGroup(
            Bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Variaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        Bloco01Layout.setVerticalGroup(
            Bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bloco01Layout.createSequentialGroup()
                        .addComponent(Variaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Bloco01Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );

        Bloco02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco02.setAlignmentY(0.0F);
        Bloco02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bloco02.setMaximumSize(new java.awt.Dimension(45, 34));
        Bloco02.setMinimumSize(new java.awt.Dimension(45, 34));
        Bloco02.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco02MouseDragged(evt);
            }
        });
        Bloco02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco02MouseReleased(evt);
            }
        });

        jLabel2.setText("Escreva");

        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco02Layout = new javax.swing.GroupLayout(Bloco02);
        Bloco02.setLayout(Bloco02Layout);
        Bloco02Layout.setHorizontalGroup(
            Bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco02Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print)
                .addContainerGap())
        );
        Bloco02Layout.setVerticalGroup(
            Bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco02Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bloco03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco03.setNextFocusableComponent(jLabel1);
        Bloco03.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco03MouseDragged(evt);
            }
        });
        Bloco03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco03MouseReleased(evt);
            }
        });

        jLabel3.setText("Retorna");

        javax.swing.GroupLayout Bloco03Layout = new javax.swing.GroupLayout(Bloco03);
        Bloco03.setLayout(Bloco03Layout);
        Bloco03Layout.setHorizontalGroup(
            Bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco03Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bloco03Layout.setVerticalGroup(
            Bloco03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco03Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Bloco04Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco04Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco04VarMouseDragged(evt);
            }
        });
        Bloco04Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco04VarMouseReleased(evt);
            }
        });

        jLabel6.setText("Variável");

        VarDEC.setText("Nome");
        VarDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDECActionPerformed(evt);
            }
        });

        VarDacValor1.setText("Valor");
        VarDacValor1.setName(""); // NOI18N
        VarDacValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDacValor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco04VarLayout = new javax.swing.GroupLayout(Bloco04Var);
        Bloco04Var.setLayout(Bloco04VarLayout);
        Bloco04VarLayout.setHorizontalGroup(
            Bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco04VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDEC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDacValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bloco04VarLayout.setVerticalGroup(
            Bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco04VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco04VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VarDEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VarDacValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Bloco08VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco08VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco08VarUMouseDragged(evt);
            }
        });
        Bloco08VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco08VarUMouseReleased(evt);
            }
        });

        Variaveis2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        Variaveis2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Variaveis2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Variaveis2MouseMoved(evt);
            }
        });
        Variaveis2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                Variaveis2PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis2PopupMenuWillBecomeVisible(evt);
            }
        });
        Variaveis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Variaveis2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Variaveis2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Bloco08VarULayout = new javax.swing.GroupLayout(Bloco08VarU);
        Bloco08VarU.setLayout(Bloco08VarULayout);
        Bloco08VarULayout.setHorizontalGroup(
            Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco08VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        Bloco08VarULayout.setVerticalGroup(
            Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco08VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Bloco05Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco05Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco05VarMouseDragged(evt);
            }
        });
        Bloco05Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco05VarMouseReleased(evt);
            }
        });

        jLabel8.setText("Variável");

        VarDEC1.setText("Nome");
        VarDEC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDEC1ActionPerformed(evt);
            }
        });

        VarDacValor2.setText("Valor");
        VarDacValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDacValor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco05VarLayout = new javax.swing.GroupLayout(Bloco05Var);
        Bloco05Var.setLayout(Bloco05VarLayout);
        Bloco05VarLayout.setHorizontalGroup(
            Bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco05VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDEC1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDacValor2)
                .addContainerGap())
        );
        Bloco05VarLayout.setVerticalGroup(
            Bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco05VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco05VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VarDEC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VarDacValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Bloco00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Início");

        javax.swing.GroupLayout Bloco00Layout = new javax.swing.GroupLayout(Bloco00);
        Bloco00.setLayout(Bloco00Layout);
        Bloco00Layout.setHorizontalGroup(
            Bloco00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco00Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        Bloco00Layout.setVerticalGroup(
            Bloco00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(Bloco00, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bloco00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bloco00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        Bloco11Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco11Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        Bloco11Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco11OperMouseDragged(evt);
            }
        });
        Bloco11Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco11OperMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("+");

        javax.swing.GroupLayout Bloco11OperLayout = new javax.swing.GroupLayout(Bloco11Oper);
        Bloco11Oper.setLayout(Bloco11OperLayout);
        Bloco11OperLayout.setHorizontalGroup(
            Bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bloco11OperLayout.setVerticalGroup(
            Bloco11OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco11OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Bloco06Var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco06Var.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco06VarMouseDragged(evt);
            }
        });
        Bloco06Var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco06VarMouseReleased(evt);
            }
        });

        jLabel10.setText("Variável");

        VarDEC3.setText("Nome");
        VarDEC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDEC3ActionPerformed(evt);
            }
        });

        VarDacValor3.setText("Valor");
        VarDacValor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarDacValor3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco06VarLayout = new javax.swing.GroupLayout(Bloco06Var);
        Bloco06Var.setLayout(Bloco06VarLayout);
        Bloco06VarLayout.setHorizontalGroup(
            Bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco06VarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDEC3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VarDacValor3)
                .addContainerGap())
        );
        Bloco06VarLayout.setVerticalGroup(
            Bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco06VarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco06VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VarDEC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VarDacValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Bloco09VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco09VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco09VarUMouseDragged(evt);
            }
        });
        Bloco09VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco09VarUMouseReleased(evt);
            }
        });

        Variaveis3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        Variaveis3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Variaveis3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Variaveis3MouseMoved(evt);
            }
        });
        Variaveis3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                Variaveis3PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis3PopupMenuWillBecomeVisible(evt);
            }
        });
        Variaveis3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Variaveis3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Variaveis3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Bloco09VarULayout = new javax.swing.GroupLayout(Bloco09VarU);
        Bloco09VarU.setLayout(Bloco09VarULayout);
        Bloco09VarULayout.setHorizontalGroup(
            Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco09VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        Bloco09VarULayout.setVerticalGroup(
            Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco09VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Bloco07VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco07VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco07VarUMouseDragged(evt);
            }
        });
        Bloco07VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco07VarUMouseReleased(evt);
            }
        });

        Variaveis1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        Variaveis1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Variaveis1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Variaveis1MouseMoved(evt);
            }
        });
        Variaveis1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                Variaveis1PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis1PopupMenuWillBecomeVisible(evt);
            }
        });
        Variaveis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Variaveis1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Variaveis1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Bloco07VarULayout = new javax.swing.GroupLayout(Bloco07VarU);
        Bloco07VarU.setLayout(Bloco07VarULayout);
        Bloco07VarULayout.setHorizontalGroup(
            Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco07VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        Bloco07VarULayout.setVerticalGroup(
            Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco07VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Bloco12Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco12Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        Bloco12Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco12OperMouseDragged(evt);
            }
        });
        Bloco12Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco12OperMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("=");

        javax.swing.GroupLayout Bloco12OperLayout = new javax.swing.GroupLayout(Bloco12Oper);
        Bloco12Oper.setLayout(Bloco12OperLayout);
        Bloco12OperLayout.setHorizontalGroup(
            Bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bloco12OperLayout.setVerticalGroup(
            Bloco12OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco12OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Bloco10VarU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco10VarU.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco10VarUMouseDragged(evt);
            }
        });
        Bloco10VarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco10VarUMouseReleased(evt);
            }
        });

        Variaveis4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teste"}));
        Variaveis4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Variaveis4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Variaveis4MouseMoved(evt);
            }
        });
        Variaveis4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                Variaveis4PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Variaveis4PopupMenuWillBecomeVisible(evt);
            }
        });
        Variaveis4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Variaveis4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Variaveis4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Bloco10VarULayout = new javax.swing.GroupLayout(Bloco10VarU);
        Bloco10VarU.setLayout(Bloco10VarULayout);
        Bloco10VarULayout.setHorizontalGroup(
            Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco10VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        Bloco10VarULayout.setVerticalGroup(
            Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bloco10VarULayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Variaveis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Bloco13Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco13Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        Bloco13Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco13OperMouseDragged(evt);
            }
        });
        Bloco13Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco13OperMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");

        javax.swing.GroupLayout Bloco13OperLayout = new javax.swing.GroupLayout(Bloco13Oper);
        Bloco13Oper.setLayout(Bloco13OperLayout);
        Bloco13OperLayout.setHorizontalGroup(
            Bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco13OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bloco13OperLayout.setVerticalGroup(
            Bloco13OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco13OperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        Bloco14Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco14Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        Bloco14Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco14OperMouseDragged(evt);
            }
        });
        Bloco14Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco14OperMouseReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("*");

        javax.swing.GroupLayout Bloco14OperLayout = new javax.swing.GroupLayout(Bloco14Oper);
        Bloco14Oper.setLayout(Bloco14OperLayout);
        Bloco14OperLayout.setHorizontalGroup(
            Bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bloco14OperLayout.setVerticalGroup(
            Bloco14OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco14OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Bloco15Oper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco15Oper.setPreferredSize(new java.awt.Dimension(50, 50));
        Bloco15Oper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco15OperMouseDragged(evt);
            }
        });
        Bloco15Oper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco15OperMouseReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("/");

        javax.swing.GroupLayout Bloco15OperLayout = new javax.swing.GroupLayout(Bloco15Oper);
        Bloco15Oper.setLayout(Bloco15OperLayout);
        Bloco15OperLayout.setHorizontalGroup(
            Bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco15OperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bloco15OperLayout.setVerticalGroup(
            Bloco15OperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco15OperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        Bloco16IF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco16IF.setAlignmentY(0.0F);
        Bloco16IF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bloco16IF.setMaximumSize(new java.awt.Dimension(45, 34));
        Bloco16IF.setMinimumSize(new java.awt.Dimension(45, 34));
        Bloco16IF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco16IFMouseDragged(evt);
            }
        });
        Bloco16IF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco16IFMouseReleased(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Se");

        ifEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco16IFLayout = new javax.swing.GroupLayout(Bloco16IF);
        Bloco16IF.setLayout(Bloco16IFLayout);
        Bloco16IFLayout.setHorizontalGroup(
            Bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco16IFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ifEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Bloco16IFLayout.setVerticalGroup(
            Bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco16IFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bloco16IFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ifEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bloco17Else.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bloco17Else.setAlignmentY(0.0F);
        Bloco17Else.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bloco17Else.setMaximumSize(new java.awt.Dimension(45, 34));
        Bloco17Else.setMinimumSize(new java.awt.Dimension(45, 34));
        Bloco17Else.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Bloco17ElseMouseDragged(evt);
            }
        });
        Bloco17Else.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Bloco17ElseMouseReleased(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Se Não");

        ifEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifEntrada1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloco17ElseLayout = new javax.swing.GroupLayout(Bloco17Else);
        Bloco17Else.setLayout(Bloco17ElseLayout);
        Bloco17ElseLayout.setHorizontalGroup(
            Bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco17ElseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ifEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        Bloco17ElseLayout.setVerticalGroup(
            Bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco17ElseLayout.createSequentialGroup()
                .addGroup(Bloco17ElseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bloco17ElseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(Bloco17ElseLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ifEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bloco16IF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Bloco03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bloco02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bloco01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bloco11Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bloco13Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bloco14Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bloco12Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco05Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco04Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco06Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco10VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco09VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco08VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco07VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bloco04Var, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bloco01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bloco05Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Bloco06Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bloco02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bloco03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bloco07VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco12Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(Bloco11Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bloco08VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco13Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(Bloco14Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bloco09VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bloco10VarU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bloco16IF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bloco17Else, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1)
        );

        Bloco03.getAccessibleContext().setAccessibleParent(jPanel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 517));

        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        VisuCódigo.setText("Visualizar Código");
        VisuCódigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisuCódigoMouseClicked(evt);
            }
        });
        VisuCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisuCódigoActionPerformed(evt);
            }
        });
        jMenuBar1.add(VisuCódigo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String[][] Nomelist= new String[3][2];
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
            add(Bloco00);
            add(Bloco01);
            add(Bloco02);
            add(Bloco03);
            add(Bloco04Var);
            add(Bloco05Var);
            add(Bloco06Var);
            add(Bloco07VarU);
            add(Bloco08VarU);
            add(Bloco09VarU);
            add(Bloco10VarU);
            add(Bloco11Oper);
            add(Bloco12Oper);
            add(Bloco13Oper);
            add(Bloco14Oper);
            add(Bloco15Oper);
            add(Bloco16IF);
            add(Bloco17Else);
        }
    };
    public void atualizaABlocos (){
            
            blocosS.set(1, Bloco01);
            blocosS.set(2, Bloco02);
            blocosS.set(3, Bloco03);
            blocosS.set(4, Bloco04Var);
            blocosS.set(5, Bloco05Var);
            blocosS.set(6, Bloco06Var);
            blocosS.set(7, Bloco07VarU);
            blocosS.set(8, Bloco08VarU);
            blocosS.set(9, Bloco09VarU);
            blocosS.set(10, Bloco10VarU);
            blocosS.set(11, Bloco11Oper);
            blocosS.set(12, Bloco12Oper);
            blocosS.set(13, Bloco13Oper);
            blocosS.set(14, Bloco14Oper);
            blocosS.set(15, Bloco15Oper);
            blocosS.set(16, Bloco16IF);
            blocosS.set(17, Bloco17Else);
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
    
    public void encaixaBloco(Bloco blAlvo, Bloco bl, boolean lateral){
        //Encaixa o bloco e faz as atualizações de posição e das áreas de encaixe
        Point loc;
        javax.swing.JPanel blocoO = blocosS.get(bl.id);
        if(lateral){//verifica se o encaixe é lateral
            loc = blAlvo.ret.getLocation();
            loc.x = (blAlvo.ret.getBounds().x) + (blAlvo.ret.getBounds().width);
            blAlvo.encaixadoLateral = bl.id;
        }else{
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
    public boolean estaEncaixado(Bloco blAlvo){
    //Se o bloco que estou tentando encaixar estiver grudadoa outro, não pode encaixar 
                        if (blAlvo.encaixado != 0 ) {
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
    }public boolean estaEncaixadoLateral(Bloco blAlvo){
    //Se o bloco que estou tentando encaixar estiver grudadoa outro, não pode encaixar 
                        if (blAlvo.encaixadoLateral != 0 ) {
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
    //Tentativa de desserialização
    /*public static javax.swing.JPanel clonarPanel(javax.swing.JPanel panelOriginal) {
        try {
            // Serializa o JPanel original
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(panelOriginal);
            out.flush();
            out.close();

            // Desserializa a cópia
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);
            javax.swing.JPanel panelCopia = (javax.swing.JPanel) in.readObject();
            in.close();

            return panelCopia;
        } catch (Exception e) {
            System.out.println("ERRO");
            e.printStackTrace();
            return null;
        }
    }*/
    public void encaixa(Bloco bl) {
        //Verifica qual bloco vai ser feito o encaixe e chama a função para encaixar.
        boolean achou = false;
        for (Bloco blAlvo : blocos) {
            if ((bl.ret.intersects(blAlvo.retEncaixe) || bl.ret.intersects(blAlvo.retEncaixeLateral)) &&
                bl.id != blAlvo.id && achou == false) {
                    if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                        if (!estaEncaixadoLateral(blAlvo)) {
                            encaixaBloco(blAlvo,bl,true);
                        }
                    }else{
                        if (!estaEncaixado(blAlvo)) {
                            encaixaBloco(blAlvo,bl,false);
                        }
                    }
                    achou = true;
                    System.out.println(bl.id + " ENCAIXOU com " + blAlvo.id);
            }
        }
    }
    
    
    
    
    private void moveBloco(java.awt.event.MouseEvent evt,Bloco bl){
        // Metodo para mover o bloco, é executado no mouseDragged, 
        // movimenta a partir do mouse e faz as atualizações das variaveis de encaxe, e salva nos arrays de armazenagem de dados.
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
        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;

        blocoO.setLocation(x, y);
        blocos.set(bl.id, bl);
    }
    private void Bloco01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco01MouseDragged
        
        moveBloco(evt,blocoP1);
        
        for (Bloco bl : blocos) {//Teste para saber qual area está sendo interceptada
            //System.out.println("Controle " + bl.id);
            if(bl.id == 1){continue;}
            if(blocoP1.ret.intersects(bl.retEncaixe)){
                System.out.println("Relando no "+ bl.id);
            }
            if(blocoP1.ret.intersects(bl.ret)){
                System.out.println("RelandoDentro no "+ bl.id);
            }
            if(blocoP1.ret.intersects(bl.retEncaixeLateral)){
                System.out.println("Relando Latera no "+ bl.id);
            }
        }
    }//GEN-LAST:event_Bloco01MouseDragged

    private void Bloco02MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco02MouseDragged

        moveBloco(evt,blocoP2);

    }//GEN-LAST:event_Bloco02MouseDragged

    private void Bloco03MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco03MouseDragged

        moveBloco(evt,blocoP3);

    }//GEN-LAST:event_Bloco03MouseDragged

    private void Bloco01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco01MouseReleased
        encaixa(blocoP1);
    }//GEN-LAST:event_Bloco01MouseReleased

    private void Bloco02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco02MouseReleased
        encaixa(blocoP2);
    }//GEN-LAST:event_Bloco02MouseReleased

    private void Bloco03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco03MouseReleased
        encaixa(blocoP3);
    }//GEN-LAST:event_Bloco03MouseReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        blocoP2.dados = evt.getActionCommand();

    }//GEN-LAST:event_printActionPerformed

    private void Bloco04VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco04VarMouseReleased
        encaixa(blocoP4);
    }//GEN-LAST:event_Bloco04VarMouseReleased

    private void Bloco04VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco04VarMouseDragged
        moveBloco(evt,blocoP4);

    }//GEN-LAST:event_Bloco04VarMouseDragged

    private void Bloco08VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco08VarUMouseDragged
        moveBloco(evt,blocoP8);
    }//GEN-LAST:event_Bloco08VarUMouseDragged

    private void Bloco08VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco08VarUMouseReleased
        encaixa(blocoP8);
    }//GEN-LAST:event_Bloco08VarUMouseReleased

    private void Bloco05VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco05VarMouseDragged
        moveBloco(evt,blocoP5);
    }//GEN-LAST:event_Bloco05VarMouseDragged

    private void Bloco05VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco05VarMouseReleased
        encaixa(blocoP5);
    }//GEN-LAST:event_Bloco05VarMouseReleased

    private void Bloco11OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco11OperMouseDragged
        moveBloco(evt,blocoP11);
    }//GEN-LAST:event_Bloco11OperMouseDragged

    private void Bloco11OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco11OperMouseReleased
        encaixa(blocoP11);
    }//GEN-LAST:event_Bloco11OperMouseReleased

    private void VarDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDECActionPerformed
        addVariavel(evt.getActionCommand(),0);
        blocoP4.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDECActionPerformed

    private void VarDEC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDEC1ActionPerformed
        addVariavel(evt.getActionCommand(),1);
        blocoP5.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDEC1ActionPerformed

    private void VarDEC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDEC3ActionPerformed
        addVariavel(evt.getActionCommand(),2);
        blocoP6.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDEC3ActionPerformed

    private void Bloco06VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco06VarMouseDragged
        moveBloco(evt,blocoP6);
    }//GEN-LAST:event_Bloco06VarMouseDragged

    private void Bloco06VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco06VarMouseReleased
        encaixa(blocoP6);
    }//GEN-LAST:event_Bloco06VarMouseReleased

    private void Bloco09VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco09VarUMouseDragged
        moveBloco(evt,blocoP9);
    }//GEN-LAST:event_Bloco09VarUMouseDragged

    private void Bloco09VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco09VarUMouseReleased
        encaixa(blocoP9);
    }//GEN-LAST:event_Bloco09VarUMouseReleased

    private void Bloco07VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco07VarUMouseDragged
        moveBloco(evt,blocoP7);
    }//GEN-LAST:event_Bloco07VarUMouseDragged

    private void Bloco07VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco07VarUMouseReleased
        encaixa(blocoP7);
    }//GEN-LAST:event_Bloco07VarUMouseReleased

    private void Bloco12OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco12OperMouseDragged
        moveBloco(evt,blocoP12);
    }//GEN-LAST:event_Bloco12OperMouseDragged

    private void Bloco12OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco12OperMouseReleased
        encaixa(blocoP12);
    }//GEN-LAST:event_Bloco12OperMouseReleased

    private void Bloco10VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco10VarUMouseDragged
        moveBloco(evt,blocoP10);
    }//GEN-LAST:event_Bloco10VarUMouseDragged

    private void Bloco10VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco10VarUMouseReleased
        encaixa(blocoP10);
    }//GEN-LAST:event_Bloco10VarUMouseReleased

    private void VisuCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisuCódigoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_VisuCódigoActionPerformed

    private void VisuCódigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisuCódigoMouseClicked
        System.out.println("TESDTEVisu");
        jCodigo.setBlocos(blocos, Nomelist);//Chama o metodo para criar o código
        JFrame frame = new JFrame("Visualização do Código");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frame.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frame.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frame.setVisible(true);


    }//GEN-LAST:event_VisuCódigoMouseClicked

    private void VarDacValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor1ActionPerformed
        Nomelist[0][1] = evt.getActionCommand();
        blocoP4.dados = evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor1ActionPerformed

    private void VarDacValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor2ActionPerformed
        Nomelist[1][1] = evt.getActionCommand();
        blocoP5.dados = evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor2ActionPerformed

    private void VarDacValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor3ActionPerformed
        Nomelist[2][1] = evt.getActionCommand();
        blocoP6.dados= evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor3ActionPerformed

    private void Bloco13OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco13OperMouseDragged
        moveBloco(evt,blocoP13);
    }//GEN-LAST:event_Bloco13OperMouseDragged

    private void Bloco13OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco13OperMouseReleased
        encaixa(blocoP13);
    }//GEN-LAST:event_Bloco13OperMouseReleased
 
    private void Bloco14OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco14OperMouseDragged
        moveBloco(evt,blocoP4);
    }//GEN-LAST:event_Bloco14OperMouseDragged

    private void Bloco14OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco14OperMouseReleased
        encaixa(blocoP14);
    }//GEN-LAST:event_Bloco14OperMouseReleased

    private void Bloco15OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco15OperMouseDragged
        moveBloco(evt,blocoP15);
    }//GEN-LAST:event_Bloco15OperMouseDragged

    private void Bloco15OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco15OperMouseReleased
        encaixa(blocoP15);
    }//GEN-LAST:event_Bloco15OperMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        repositionPanels(jPanel1);
        atualizaABlocos();
        System.out.println("Winmdsow");
    }//GEN-LAST:event_formWindowActivated

    private void VariaveisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VariaveisMouseMoved
       repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisMouseMoved

    private void VariaveisPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_VariaveisPopupMenuWillBecomeVisible
       repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisPopupMenuWillBecomeVisible

    private void VariaveisPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_VariaveisPopupMenuWillBecomeInvisible
       repositionPanels(jPanel1);
       blocoP1.dados = Variaveis.getSelectedItem().toString();
    }//GEN-LAST:event_VariaveisPopupMenuWillBecomeInvisible

    private void VariaveisPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_VariaveisPopupMenuCanceled
       repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisPopupMenuCanceled

    private void VariaveisMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VariaveisMouseDragged
        repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisMouseDragged

    private void VariaveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VariaveisMouseClicked
        repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisMouseClicked

    private void VariaveisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VariaveisMousePressed
        repositionPanels(jPanel1);
    }//GEN-LAST:event_VariaveisMousePressed

    private void ifEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntradaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ifEntradaActionPerformed

    private void Bloco16IFMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco16IFMouseDragged
       moveBloco(evt,blocoP16);
    }//GEN-LAST:event_Bloco16IFMouseDragged

    private void Bloco16IFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco16IFMouseReleased
       encaixa(blocoP16);
    }//GEN-LAST:event_Bloco16IFMouseReleased

    private void ifEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifEntrada1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ifEntrada1ActionPerformed

    private void Bloco17ElseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco17ElseMouseDragged
        moveBloco(evt,blocoP17);
    }//GEN-LAST:event_Bloco17ElseMouseDragged

    private void Bloco17ElseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco17ElseMouseReleased
        encaixa(blocoP17);
    }//GEN-LAST:event_Bloco17ElseMouseReleased

    private void Variaveis1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis1MouseDragged
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1MouseDragged

    private void Variaveis1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis1MouseMoved
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1MouseMoved

    private void Variaveis1PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis1PopupMenuCanceled
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1PopupMenuCanceled

    private void Variaveis1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis1PopupMenuWillBecomeInvisible
        repositionPanels(jPanel1);
        blocoP7.dados = Variaveis1.getSelectedItem().toString();
    }//GEN-LAST:event_Variaveis1PopupMenuWillBecomeInvisible

    private void Variaveis1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis1PopupMenuWillBecomeVisible
       repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1PopupMenuWillBecomeVisible

    private void Variaveis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis1MouseClicked
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1MouseClicked

    private void Variaveis1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis1MousePressed
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis1MousePressed

    private void Variaveis2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis2MouseDragged
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2MouseDragged

    private void Variaveis2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis2MouseMoved
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2MouseMoved

    private void Variaveis2PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis2PopupMenuCanceled
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2PopupMenuCanceled

    private void Variaveis2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis2PopupMenuWillBecomeInvisible
        repositionPanels(jPanel1);
        blocoP8.dados = Variaveis2.getSelectedItem().toString();
    }//GEN-LAST:event_Variaveis2PopupMenuWillBecomeInvisible

    private void Variaveis2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis2PopupMenuWillBecomeVisible
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2PopupMenuWillBecomeVisible

    private void Variaveis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis2MouseClicked
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2MouseClicked

    private void Variaveis2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis2MousePressed
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis2MousePressed

    private void Variaveis3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis3MouseDragged
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3MouseDragged

    private void Variaveis3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis3MouseMoved
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3MouseMoved

    private void Variaveis3PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis3PopupMenuCanceled
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3PopupMenuCanceled

    private void Variaveis3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis3PopupMenuWillBecomeInvisible
        repositionPanels(jPanel1);
        blocoP9.dados = Variaveis3.getSelectedItem().toString();
    }//GEN-LAST:event_Variaveis3PopupMenuWillBecomeInvisible

    private void Variaveis3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis3PopupMenuWillBecomeVisible
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3PopupMenuWillBecomeVisible

    private void Variaveis3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis3MouseClicked
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3MouseClicked

    private void Variaveis3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis3MousePressed
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis3MousePressed

    private void Variaveis4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis4MouseDragged
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4MouseDragged

    private void Variaveis4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis4MouseMoved
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4MouseMoved

    private void Variaveis4PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis4PopupMenuCanceled
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4PopupMenuCanceled
    
    private void Variaveis4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis4PopupMenuWillBecomeInvisible
        repositionPanels(jPanel1);
        blocoP10.dados = Variaveis4.getSelectedItem().toString();
    }//GEN-LAST:event_Variaveis4PopupMenuWillBecomeInvisible

    private void Variaveis4PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Variaveis4PopupMenuWillBecomeVisible
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4PopupMenuWillBecomeVisible

    private void Variaveis4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis4MouseClicked
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4MouseClicked

    private void Variaveis4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Variaveis4MousePressed
        repositionPanels(jPanel1);
    }//GEN-LAST:event_Variaveis4MousePressed
    
    private void addVariavel(String item,int i){
        //Fazer uma matriz para adicionar os valores, aí passa tudo pra classe do codigo
        Nomelist[i][0] = item;
        Variaveis.removeAllItems();
        Variaveis1.removeAllItems();
        Variaveis2.removeAllItems();
        Variaveis3.removeAllItems();
        Variaveis4.removeAllItems();
        
        for (int x = 0 ; x < 3 ; x++ ) {
            String string = Nomelist[x][0];
            Variaveis.addItem(string);
            Variaveis1.addItem(string);
            Variaveis2.addItem(string);
            Variaveis3.addItem(string);
            Variaveis4.addItem(string);
        }
    }
    
    private Código jCodigo = new Código();

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
            if(!blocoP1.getRet().getLocation().equals(pt))Bloco01.setLocation(blocoP1.getRet().getLocation());
            if(!blocoP2.getRet().getLocation().equals(pt))Bloco02.setLocation(blocoP2.getRet().getLocation());
            if(!blocoP3.getRet().getLocation().equals(pt))Bloco03.setLocation(blocoP3.getRet().getLocation());
            if(!blocoP4.getRet().getLocation().equals(pt))Bloco04Var.setLocation(blocoP4.getRet().getLocation());
            if(!blocoP5.getRet().getLocation().equals(pt))Bloco05Var.setLocation(blocoP5.getRet().getLocation());
            if(!blocoP6.getRet().getLocation().equals(pt))Bloco06Var.setLocation(blocoP6.getRet().getLocation());
            if(!blocoP7.getRet().getLocation().equals(pt))Bloco07VarU.setLocation(blocoP7.getRet().getLocation());
            if(!blocoP8.getRet().getLocation().equals(pt))Bloco08VarU.setLocation(blocoP8.getRet().getLocation());
            if(!blocoP9.getRet().getLocation().equals(pt))Bloco09VarU.setLocation(blocoP9.getRet().getLocation());
            if(!blocoP10.getRet().getLocation().equals(pt))Bloco10VarU.setLocation(blocoP10.getRet().getLocation());
            if(!blocoP11.getRet().getLocation().equals(pt))Bloco11Oper.setLocation(blocoP11.getRet().getLocation());
            if(!blocoP12.getRet().getLocation().equals(pt))Bloco12Oper.setLocation(blocoP12.getRet().getLocation());
            if(!blocoP13.getRet().getLocation().equals(pt))Bloco13Oper.setLocation(blocoP13.getRet().getLocation());
            if(!blocoP14.getRet().getLocation().equals(pt))Bloco14Oper.setLocation(blocoP14.getRet().getLocation());
            if(!blocoP15.getRet().getLocation().equals(pt))Bloco15Oper.setLocation(blocoP15.getRet().getLocation());
            if(!blocoP16.getRet().getLocation().equals(pt))Bloco16IF.setLocation(blocoP16.getRet().getLocation());
            if(!blocoP17.getRet().getLocation().equals(pt))Bloco17Else.setLocation(blocoP17.getRet().getLocation());
            
   }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel Bloco00;
    javax.swing.JPanel Bloco01;
    javax.swing.JPanel Bloco02;
    javax.swing.JPanel Bloco03;
    javax.swing.JPanel Bloco04Var;
    javax.swing.JPanel Bloco05Var;
    javax.swing.JPanel Bloco06Var;
    javax.swing.JPanel Bloco07VarU;
    javax.swing.JPanel Bloco08VarU;
    javax.swing.JPanel Bloco09VarU;
    javax.swing.JPanel Bloco10VarU;
    javax.swing.JPanel Bloco11Oper;
    javax.swing.JPanel Bloco12Oper;
    javax.swing.JPanel Bloco13Oper;
    javax.swing.JPanel Bloco14Oper;
    javax.swing.JPanel Bloco15Oper;
    javax.swing.JPanel Bloco16IF;
    javax.swing.JPanel Bloco17Else;
    javax.swing.JTextField VarDEC;
    javax.swing.JTextField VarDEC1;
    javax.swing.JTextField VarDEC3;
    javax.swing.JTextField VarDacValor1;
    javax.swing.JTextField VarDacValor2;
    javax.swing.JTextField VarDacValor3;
    javax.swing.JComboBox<String> Variaveis;
    javax.swing.JComboBox<String> Variaveis1;
    javax.swing.JComboBox<String> Variaveis2;
    javax.swing.JComboBox<String> Variaveis3;
    javax.swing.JComboBox<String> Variaveis4;
    javax.swing.JMenu VisuCódigo;
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
    javax.swing.JLayeredPane jLayeredPane1;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JTextField print;
    // End of variables declaration//GEN-END:variables
}
