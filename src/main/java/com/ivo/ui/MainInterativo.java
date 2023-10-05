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
        jLabel5 = new javax.swing.JLabel();
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
        VarUSE1 = new javax.swing.JTextField();
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
        VarUSE2 = new javax.swing.JTextField();
        Bloco07VarU = new javax.swing.JPanel();
        VarUSE0 = new javax.swing.JTextField();
        Bloco12Oper = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Bloco10VarU = new javax.swing.JPanel();
        VarUSE03 = new javax.swing.JTextField();
        Bloco13Oper = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Bloco14Oper = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Bloco15Oper = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Operação");

        javax.swing.GroupLayout Bloco01Layout = new javax.swing.GroupLayout(Bloco01);
        Bloco01.setLayout(Bloco01Layout);
        Bloco01Layout.setHorizontalGroup(
            Bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco01Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1))
        );
        Bloco01Layout.setVerticalGroup(
            Bloco01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(38, Short.MAX_VALUE))
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

        VarUSE1.setEditable(false);
        VarUSE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout Bloco08VarULayout = new javax.swing.GroupLayout(Bloco08VarU);
        Bloco08VarU.setLayout(Bloco08VarULayout);
        Bloco08VarULayout.setHorizontalGroup(
            Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco08VarULayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(VarUSE1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bloco08VarULayout.setVerticalGroup(
            Bloco08VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco08VarULayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(VarUSE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        VarUSE2.setEditable(false);
        VarUSE2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout Bloco09VarULayout = new javax.swing.GroupLayout(Bloco09VarU);
        Bloco09VarU.setLayout(Bloco09VarULayout);
        Bloco09VarULayout.setHorizontalGroup(
            Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco09VarULayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(VarUSE2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bloco09VarULayout.setVerticalGroup(
            Bloco09VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco09VarULayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(VarUSE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        VarUSE0.setEditable(false);
        VarUSE0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout Bloco07VarULayout = new javax.swing.GroupLayout(Bloco07VarU);
        Bloco07VarU.setLayout(Bloco07VarULayout);
        Bloco07VarULayout.setHorizontalGroup(
            Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco07VarULayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(VarUSE0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Bloco07VarULayout.setVerticalGroup(
            Bloco07VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco07VarULayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(VarUSE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        VarUSE03.setEditable(false);
        VarUSE03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout Bloco10VarULayout = new javax.swing.GroupLayout(Bloco10VarU);
        Bloco10VarU.setLayout(Bloco10VarULayout);
        Bloco10VarULayout.setHorizontalGroup(
            Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bloco10VarULayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(VarUSE03, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Bloco10VarULayout.setVerticalGroup(
            Bloco10VarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloco10VarULayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(VarUSE03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bloco11Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bloco13Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bloco14Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bloco12Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Bloco15Oper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco05Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco04Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco06Var, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Bloco07VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco08VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco10VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bloco09VarU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(77, Short.MAX_VALUE))
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
                        .addComponent(Bloco02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bloco03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bloco05Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Bloco06Var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(Bloco10VarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
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

    public ArrayList<javax.swing.JPanel> blocosS = new ArrayList<javax.swing.JPanel>() {
        {
            add(Bloco00);
            add(Bloco01);
            add(Bloco02);
            add(Bloco03);
            add(Bloco04Var);
            add(Bloco05Var);
            add(Bloco06Var);
        }
    };
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
        }
    };
    
    public void encaixaBloco(Bloco blAlvo, Bloco bl, boolean lateral){
        //Encaixa tudo
        Point loc;
        if(lateral){
            loc = blAlvo.ret.getLocation();
            loc.x = (blAlvo.ret.getBounds().x) + (blAlvo.ret.getBounds().width);
            blAlvo.encaixadoLateral = bl.id;
        }else{
            loc = blAlvo.ret.getLocation();
            loc.y = (blAlvo.ret.getBounds().y) + (blAlvo.ret.getBounds().height);
            blAlvo.encaixado = bl.id;
        }
        int idD = bl.id;
        switch (idD) {
            case 1 -> {
                Bloco01.setLocation(loc);
                bl.ret = Bloco01.getBounds();
                bl.retEncaixe = Bloco01.getBounds();
                bl.retEncaixeLateral = Bloco01.getBounds();
            }
            case 2 -> {
                Bloco02.setLocation(loc);
                bl.ret = Bloco02.getBounds();
                bl.retEncaixe = Bloco02.getBounds();
                bl.retEncaixeLateral = Bloco02.getBounds();
            }
            case 3 -> {
                Bloco03.setLocation(loc);
                bl.ret = Bloco03.getBounds();
                bl.retEncaixe = Bloco03.getBounds();
                bl.retEncaixeLateral = Bloco03.getBounds();
            }
            case 4 -> {
                Bloco04Var.setLocation(loc);
                bl.ret = Bloco04Var.getBounds();
                bl.retEncaixe = Bloco04Var.getBounds();
                bl.retEncaixeLateral = Bloco04Var.getBounds();
            }
            case 5 -> {
                Bloco05Var.setLocation(loc);
                bl.ret = Bloco05Var.getBounds();
                bl.retEncaixe = Bloco05Var.getBounds();
                bl.retEncaixeLateral = Bloco05Var.getBounds();
            }
            case 6 -> {
                Bloco06Var.setLocation(loc);
                bl.ret = Bloco06Var.getBounds();
                bl.retEncaixe = Bloco06Var.getBounds();
                bl.retEncaixeLateral = Bloco06Var.getBounds();
            }
            case 7 -> {
                Bloco07VarU.setLocation(loc);
                bl.ret = Bloco07VarU.getBounds();
                bl.retEncaixe = Bloco07VarU.getBounds();
                bl.retEncaixeLateral = Bloco07VarU.getBounds();
            }
            case 8 -> {
                Bloco08VarU.setLocation(loc);
                bl.ret = Bloco08VarU.getBounds();
                bl.retEncaixe = Bloco08VarU.getBounds();
                bl.retEncaixeLateral = Bloco08VarU.getBounds();
            }
            case 9 -> {
                Bloco09VarU.setLocation(loc);
                bl.ret = Bloco09VarU.getBounds();
                bl.retEncaixe = Bloco09VarU.getBounds();
                bl.retEncaixeLateral = Bloco09VarU.getBounds();
            }
            case 10 -> {
                Bloco10VarU.setLocation(loc);
                bl.ret = Bloco10VarU.getBounds();
                bl.retEncaixe = Bloco10VarU.getBounds();
                bl.retEncaixeLateral = Bloco10VarU.getBounds();
            }
            case 11 -> {
                Bloco11Oper.setLocation(loc);
                bl.ret = Bloco11Oper.getBounds();
                bl.retEncaixe = Bloco11Oper.getBounds();
                bl.retEncaixeLateral = Bloco11Oper.getBounds();
            }
            case 12 -> {
                Bloco12Oper.setLocation(loc);
                bl.ret = Bloco12Oper.getBounds();
                bl.retEncaixe = Bloco12Oper.getBounds();
                bl.retEncaixeLateral = Bloco12Oper.getBounds();
            }
            case 13 -> {
                Bloco13Oper.setLocation(loc);
                bl.ret = Bloco13Oper.getBounds();
                bl.retEncaixe = Bloco13Oper.getBounds();
                bl.retEncaixeLateral = Bloco13Oper.getBounds();
            }
            case 14 -> {
                Bloco14Oper.setLocation(loc);
                bl.ret = Bloco14Oper.getBounds();
                bl.retEncaixe = Bloco14Oper.getBounds();
                bl.retEncaixeLateral = Bloco14Oper.getBounds();
            }
            case 15 -> {
                Bloco15Oper.setLocation(loc);
                bl.ret = Bloco15Oper.getBounds();
                bl.retEncaixe = Bloco15Oper.getBounds();
                bl.retEncaixeLateral = Bloco15Oper.getBounds();
            }
            default -> System.out.println("Erro encaixa Bloco");
        }
        bl.retEncaixe.y = bl.retEncaixe.y + 25;
        bl.retEncaixeLateral.x = bl.retEncaixeLateral.x + 25;

        blocos.set(bl.id, bl);
        blocos.set(blAlvo.id, blAlvo);
    }
    public boolean estaEncaixado(Bloco blAlvo){
    //Se o bloco que estou tentando encaixar estiver grudadoa outro, não pode encaixar                
                        if (blAlvo.encaixado != 0 || blAlvo.encaixadoLateral != 0) {
                            return true;
                        }
                        for (Bloco b : blocos) {
                            if (b.encaixadoLateral == blAlvo.id && blAlvo.id != 0) {
                                return true;
                            }
                        }
                   return false;     
    }
    
    //OBS Tentar criar um metodo estilo encaixar para mover varios de uma vez
    public void encaixa(Bloco bl) {
        //Verifica qual bloco está encaixando em qual e muda a localização para encaixar
        boolean achou = false;
        Point loc;
        for (Bloco blAlvo : blocos) {
            if ((bl.ret.intersects(blAlvo.retEncaixe) || bl.ret.intersects(blAlvo.retEncaixeLateral)) &&
                    bl.id != blAlvo.id && achou == false) {
                switch (bl.id) {
                    case 1 -> { //Operacao
                    
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        
                        achou = true;
                        System.out.println("operacao ENCAIXOU com " + blAlvo.id);
                    }
                    case 2 -> {//Escreva
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("Escreva ENCAIXOU com " + blAlvo.id);
                    }
                    case 3 -> {//Retorna
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("Retorna ENCAIXOU com " + blAlvo.id);
                    }
                    case 4 -> {
                         if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("Var ENCAIXOU com " + blAlvo.id);
                    }
                    case 5 -> {
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("Var2 ENCAIXOU com " + blAlvo.id);
                    }
                    case 6 -> {
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("Var3 ENCAIXOU com " + blAlvo.id);
                    }
                    


                    
                    
                    
                    
                    case 7 -> {
                        //ENCAIXA DE USO DE VARIAVEIS menos dos blocos 2 4 5
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("VarU7 ENCAIXOU com " + blAlvo.id);
                       
                    }
                    case 8 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA DE USO DE VARIAVEIS
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("VarU8 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 9 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA DE USO DE VARIAVEIS
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                            System.out.println("VarU9 ENCAIXOU com " + blAlvo.id);
                        
                        
                    }
                    case 10 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA DE USO DE VARIAVEIS
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;

                        System.out.println("VarU10 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 11 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA LATERAL OU SUP OPERADORES
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                            System.out.println("Oper11 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 12 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA LATERAL OU SUP OPERADORES
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                            System.out.println("Oper12 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 13 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA LATERAL OU SUP OPERADORES
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                        System.out.println("Oper13 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 14 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA LATERAL OU SUP OPERADORES
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                        System.out.println("Oper14 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    case 15 -> {

                        //FAZER UM NEGOCIO PARA NAO PODER ENCAIXAr COM O 6 E 7!!!
                        //ENCAIXA LATERAL OU SUP OPERADORES
                        if (estaEncaixado(blAlvo)) {
                            break;
                        }
                        if(bl.ret.intersects(blAlvo.retEncaixeLateral)){
                            encaixaBloco(blAlvo,bl,true);
                        }else{encaixaBloco(blAlvo,bl,false);}
                        achou = true;
                        System.out.println("Oper15 ENCAIXOU com " + blAlvo.id);
                        
                    }
                    default -> {
                        System.out.println("Erro Encaixe");
                    }
                }

            }
        }
    }

    private void Bloco01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco01MouseDragged
        //Label IF

        blocoP1.ret = Bloco01.getBounds();
        blocoP1.retEncaixe = Bloco01.getBounds();
        blocoP1.retEncaixeLateral = Bloco01.getBounds();
        blocoP1.retEncaixe.x = blocoP1.retEncaixe.x + 25;
        blocoP1.retEncaixe.y = blocoP1.retEncaixe.y + 25;
        blocoP1.encaixado = 0;
        blocoP1.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 1) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 1) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }
        
        
        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;

        Bloco01.setLocation(x, y);
        blocos.set(1, blocoP1);
        
        
        for (Bloco bl : blocos) {
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

        blocoP2.ret = Bloco02.getBounds();
        blocoP2.retEncaixe = Bloco02.getBounds();
        blocoP2.retEncaixeLateral = Bloco02.getBounds();
        blocoP2.retEncaixe.x = blocoP2.retEncaixe.x + 25;
        blocoP2.retEncaixe.y = blocoP2.retEncaixe.y + 25;
        blocoP2.encaixado = 0;
        blocoP2.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 2) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 2) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco02.setLocation(x, y);
        blocos.set(2, blocoP2);

    }//GEN-LAST:event_Bloco02MouseDragged

    private void Bloco03MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco03MouseDragged

        blocoP3.ret = Bloco03.getBounds();
        blocoP3.retEncaixe = Bloco03.getBounds();
        blocoP3.retEncaixeLateral = Bloco03.getBounds();
        blocoP3.retEncaixe.x = blocoP3.retEncaixe.x + 25;
        blocoP3.retEncaixe.y = blocoP3.retEncaixe.y + 25;
        blocoP3.encaixado = 0;
        blocoP3.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 3) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 3) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco03.setLocation(x, y);
        blocos.set(3, blocoP3);

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
        blocoP4.ret = Bloco04Var.getBounds();
        blocoP4.retEncaixe = Bloco04Var.getBounds();
        blocoP4.retEncaixeLateral = Bloco04Var.getBounds();
        blocoP4.retEncaixe.x = blocoP4.retEncaixe.x + 25;
        blocoP4.retEncaixe.y = blocoP4.retEncaixe.y + 25;
        blocoP4.encaixado = 0;
        blocoP4.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 4) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 4) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco04Var.setLocation(x, y);
        blocos.set(4, blocoP4);

    }//GEN-LAST:event_Bloco04VarMouseDragged

    private void Bloco08VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco08VarUMouseDragged
        blocoP8.ret = Bloco08VarU.getBounds();
        blocoP8.retEncaixe = Bloco08VarU.getBounds();
        blocoP8.retEncaixeLateral = Bloco08VarU.getBounds();
        blocoP8.retEncaixe.x = blocoP8.retEncaixe.x + 25;
        blocoP8.encaixado = 0;
        blocoP8.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 8) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 8) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco08VarU.setLocation(x, y);
        blocos.set(8, blocoP8);


    }//GEN-LAST:event_Bloco08VarUMouseDragged

    private void Bloco08VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco08VarUMouseReleased
        encaixa(blocoP8);
    }//GEN-LAST:event_Bloco08VarUMouseReleased

    private void Bloco05VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco05VarMouseDragged
        blocoP5.ret = Bloco05Var.getBounds();
        blocoP5.retEncaixe = Bloco05Var.getBounds();
        blocoP5.retEncaixeLateral = Bloco05Var.getBounds();
        blocoP5.retEncaixe.x = blocoP5.retEncaixe.x + 25;
        blocoP5.retEncaixe.y = blocoP5.retEncaixe.y + 25;
        blocoP5.encaixado = 0;
        blocoP5.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 5) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 5) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco05Var.setLocation(x, y);
        blocos.set(5, blocoP5);
    }//GEN-LAST:event_Bloco05VarMouseDragged

    private void Bloco05VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco05VarMouseReleased
        encaixa(blocoP5);
    }//GEN-LAST:event_Bloco05VarMouseReleased

    private void Bloco11OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco11OperMouseDragged
        blocoP11.ret = Bloco11Oper.getBounds();
        blocoP11.retEncaixe = Bloco11Oper.getBounds();
        blocoP11.retEncaixeLateral = Bloco11Oper.getBounds();
        blocoP11.retEncaixe.x = blocoP11.retEncaixe.x + 25;
        blocoP11.encaixado = 0;
        blocoP11.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 11) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 11) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco11Oper.setLocation(x, y);
        blocos.set(11, blocoP11);
    }//GEN-LAST:event_Bloco11OperMouseDragged

    private void Bloco11OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco11OperMouseReleased
        encaixa(blocoP11);
    }//GEN-LAST:event_Bloco11OperMouseReleased

    private void VarDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDECActionPerformed
        VarUSE0.setText(evt.getActionCommand());
        VarUSE03.setText(evt.getActionCommand());
        blocoP4.nome = evt.getActionCommand();
        blocoP7.nome = evt.getActionCommand();
        blocoP10.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDECActionPerformed

    private void VarDEC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDEC1ActionPerformed
        VarUSE1.setText(evt.getActionCommand());
        blocoP5.nome = evt.getActionCommand();
        blocoP8.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDEC1ActionPerformed

    private void VarDEC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDEC3ActionPerformed
        VarUSE2.setText(evt.getActionCommand());
        blocoP6.nome = evt.getActionCommand();
        blocoP9.nome = evt.getActionCommand();
    }//GEN-LAST:event_VarDEC3ActionPerformed

    private void Bloco06VarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco06VarMouseDragged
        blocoP6.ret = Bloco06Var.getBounds();
        blocoP6.retEncaixe = Bloco06Var.getBounds();
        blocoP6.retEncaixeLateral = Bloco06Var.getBounds();
        blocoP6.retEncaixe.x = blocoP6.retEncaixe.x + 25;
        blocoP6.retEncaixe.y = blocoP6.retEncaixe.y + 25;
        blocoP6.encaixado = 0;
        blocoP6.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 6) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 6) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco06Var.setLocation(x, y);
        blocos.set(6, blocoP6);
    }//GEN-LAST:event_Bloco06VarMouseDragged

    private void Bloco06VarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco06VarMouseReleased
        encaixa(blocoP6);
    }//GEN-LAST:event_Bloco06VarMouseReleased

    private void Bloco09VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco09VarUMouseDragged
        blocoP9.ret = Bloco09VarU.getBounds();
        blocoP9.retEncaixe = Bloco09VarU.getBounds();
        blocoP9.retEncaixeLateral = Bloco09VarU.getBounds();
        blocoP9.retEncaixe.x = blocoP9.retEncaixe.x + 25;
        blocoP9.encaixado = 0;
        blocoP9.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 9) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 9) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco09VarU.setLocation(x, y);
        blocos.set(9, blocoP9);
    }//GEN-LAST:event_Bloco09VarUMouseDragged

    private void Bloco09VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco09VarUMouseReleased
        encaixa(blocoP9);
    }//GEN-LAST:event_Bloco09VarUMouseReleased

    private void Bloco07VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco07VarUMouseDragged
        blocoP7.ret = Bloco07VarU.getBounds();
        blocoP7.retEncaixe = Bloco07VarU.getBounds();
        blocoP7.retEncaixeLateral = Bloco07VarU.getBounds();
        blocoP7.retEncaixe.x = blocoP7.retEncaixe.x + 25;
        blocoP7.encaixado = 0;
        blocoP7.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 7) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 7) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }
        
        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco07VarU.setLocation(x, y);
        blocos.set(7, blocoP7);
    }//GEN-LAST:event_Bloco07VarUMouseDragged

    private void Bloco07VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco07VarUMouseReleased
        encaixa(blocoP7);
    }//GEN-LAST:event_Bloco07VarUMouseReleased

    private void Bloco12OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco12OperMouseDragged
        blocoP12.ret = Bloco12Oper.getBounds();
        blocoP12.retEncaixe = Bloco12Oper.getBounds();
        blocoP12.retEncaixeLateral = Bloco12Oper.getBounds();
        blocoP12.retEncaixe.x = blocoP12.retEncaixe.x + 25;
        blocoP12.encaixado = 0;
        blocoP12.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 12) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 12) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco12Oper.setLocation(x, y);
        blocos.set(12, blocoP12);
    }//GEN-LAST:event_Bloco12OperMouseDragged

    private void Bloco12OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco12OperMouseReleased
        encaixa(blocoP12);
    }//GEN-LAST:event_Bloco12OperMouseReleased

    private void Bloco10VarUMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco10VarUMouseDragged
        blocoP10.ret = Bloco10VarU.getBounds();
        blocoP10.retEncaixe = Bloco10VarU.getBounds();
        blocoP10.retEncaixeLateral = Bloco10VarU.getBounds();
        blocoP10.retEncaixe.x = blocoP10.retEncaixe.x + 25;
        blocoP10.encaixado = 0;
        blocoP10.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 10) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 10) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco10VarU.setLocation(x, y);
        blocos.set(10, blocoP10);
    }//GEN-LAST:event_Bloco10VarUMouseDragged

    private void Bloco10VarUMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco10VarUMouseReleased
        encaixa(blocoP10);
    }//GEN-LAST:event_Bloco10VarUMouseReleased

    private void VisuCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisuCódigoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_VisuCódigoActionPerformed

    private void VisuCódigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisuCódigoMouseClicked
        System.out.println("TESDTEVisu");
        jCodigo.setBlocos(blocos);
        JFrame frame = new JFrame("Visualização do Código");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Define a ação padrão de fechar a janela
        frame.getContentPane().add(jCodigo); // Adiciona o painel da nova janela ao JFrame
        frame.pack(); // Ajusta o tamanho do JFrame de acordo com o conteúdo
        frame.setVisible(true);


    }//GEN-LAST:event_VisuCódigoMouseClicked

    private void VarDacValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor1ActionPerformed
        // TODO add your handling code here:
        blocoP4.dados = evt.getActionCommand();
        blocoP7.dados = evt.getActionCommand();
        blocoP10.dados = evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor1ActionPerformed

    private void VarDacValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor2ActionPerformed
        // TODO add your handling code here:
        blocoP5.dados = evt.getActionCommand();
        blocoP8.dados = evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor2ActionPerformed

    private void VarDacValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarDacValor3ActionPerformed
        // TODO add your handling code here:
        blocoP6.dados = evt.getActionCommand();
        blocoP9.dados = evt.getActionCommand();
    }//GEN-LAST:event_VarDacValor3ActionPerformed

    private void Bloco13OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco13OperMouseDragged
        blocoP13.ret = Bloco13Oper.getBounds();
        blocoP13.retEncaixe = Bloco13Oper.getBounds();
        blocoP13.retEncaixeLateral = Bloco13Oper.getBounds();
        blocoP13.retEncaixe.x = blocoP13.retEncaixe.x + 25;
        blocoP13.encaixado = 0;
        blocoP13.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 13) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 13) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco13Oper.setLocation(x, y);
        blocos.set(13, blocoP13);
    }//GEN-LAST:event_Bloco13OperMouseDragged

    private void Bloco13OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco13OperMouseReleased
        encaixa(blocoP13);
    }//GEN-LAST:event_Bloco13OperMouseReleased

    private void Bloco14OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco14OperMouseDragged
        blocoP14.ret = Bloco14Oper.getBounds();
        blocoP14.retEncaixe = Bloco14Oper.getBounds();
        blocoP14.retEncaixeLateral = Bloco14Oper.getBounds();
        blocoP14.retEncaixe.x = blocoP14.retEncaixe.x + 25;
        blocoP14.encaixado = 0;
        blocoP14.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 14) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 14) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco14Oper.setLocation(x, y);
        blocos.set(14, blocoP14);
    }//GEN-LAST:event_Bloco14OperMouseDragged

    private void Bloco14OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco14OperMouseReleased
        encaixa(blocoP14);
    }//GEN-LAST:event_Bloco14OperMouseReleased

    private void Bloco15OperMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco15OperMouseDragged
        blocoP15.ret = Bloco15Oper.getBounds();
        blocoP15.retEncaixe = Bloco15Oper.getBounds();
        blocoP15.retEncaixeLateral = Bloco15Oper.getBounds();
        blocoP15.retEncaixe.x = blocoP15.retEncaixe.x + 25;
        blocoP15.encaixado = 0;
        blocoP15.encaixadoLateral = 0;
        for (Bloco blAlvo : blocos) {
            if (blAlvo.encaixado == 15) {
                blAlvo.encaixado = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
            if (blAlvo.encaixadoLateral == 15) {
                blAlvo.encaixadoLateral = 0;
                blocos.set(blAlvo.id, blAlvo);
            }
        }

        int x = evt.getLocationOnScreen().x - 62 - jPanel1.getLocationOnScreen().x;
        int y = evt.getLocationOnScreen().y - 21 - jPanel1.getLocationOnScreen().y;
        Bloco15Oper.setLocation(x, y);
        blocos.set(15, blocoP15);
    }//GEN-LAST:event_Bloco15OperMouseDragged

    private void Bloco15OperMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bloco15OperMouseReleased
        encaixa(blocoP15);
    }//GEN-LAST:event_Bloco15OperMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        repositionPanels(jPanel1);
    }//GEN-LAST:event_formWindowActivated
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
    javax.swing.JTextField VarDEC;
    javax.swing.JTextField VarDEC1;
    javax.swing.JTextField VarDEC3;
    javax.swing.JTextField VarDacValor1;
    javax.swing.JTextField VarDacValor2;
    javax.swing.JTextField VarDacValor3;
    javax.swing.JTextField VarUSE0;
    javax.swing.JTextField VarUSE03;
    javax.swing.JTextField VarUSE1;
    javax.swing.JTextField VarUSE2;
    javax.swing.JMenu VisuCódigo;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
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
