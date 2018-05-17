/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class code extends javax.swing.JFrame {

    /**
     * Creates new form code
     */
    public code() {
        initComponents();
        
    }

    int x = 0, y = 0;
    
    double number, ans;
    int calculation;
    
   private void algorithmic_operation()
    {
        switch(calculation)
        {
            case 1:  
                ans = number + Double.parseDouble(txtshow.getText());
                txtshow.setText(Double.toString(ans));
                break;
                
                case 2:  
                ans = number - Double.parseDouble(txtshow.getText());
                txtshow.setText(Double.toString(ans));
                break;
                
                case 3:  
                ans = number * Double.parseDouble(txtshow.getText());
                txtshow.setText(Double.toString(ans));
                break;
                
                case 4:  
                ans = number / Double.parseDouble(txtshow.getText());
                txtshow.setText(Double.toString(ans));
                break;
                
                case 5:
                    ans = Math.sqrt(number);
                    txtshow.setText(Double.toString(ans));
                    break;
                    
                case 6:
                    ans = number*number;
                    txtshow.setText(Double.toString(ans));
                    break;
                case 7:
                    ans = 1/number;
                    txtshow.setText(Double.toString(ans));
                    break;
        }
    }
   
    
    
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        minimum = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        root = new javax.swing.JLabel();
        onedivide = new javax.swing.JLabel();
        square = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        division = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        multiply = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        equal = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        zero = new javax.swing.JLabel();
        seven = new javax.swing.JLabel();
        ce = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        pm = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblshow = new javax.swing.JLabel();
        txtshow = new javax.swing.JTextField();
        off = new javax.swing.JRadioButton();
        on = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(64, 64, 64));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimum.setBackground(new java.awt.Color(64, 64, 64));
        minimum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus.png"))); // NOI18N
        minimum.setOpaque(true);
        minimum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimumMouseExited(evt);
            }
        });
        jPanel3.add(minimum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 42));

        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Simple Calculator");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        exit1.setBackground(new java.awt.Color(64, 64, 64));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiple.png"))); // NOI18N
        exit1.setOpaque(true);
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit1MouseExited(evt);
            }
        });
        jPanel3.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 42));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        jPanel2.setBackground(new java.awt.Color(64, 64, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        root.setBackground(new java.awt.Color(38, 38, 38));
        root.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        root.setForeground(new java.awt.Color(255, 255, 255));
        root.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        root.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/root.png"))); // NOI18N
        root.setOpaque(true);
        root.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rootMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rootMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rootMouseExited(evt);
            }
        });
        jPanel2.add(root, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 131, 78, 48));

        onedivide.setBackground(new java.awt.Color(38, 38, 38));
        onedivide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        onedivide.setForeground(new java.awt.Color(255, 255, 255));
        onedivide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onedivide.setText("1/x");
        onedivide.setOpaque(true);
        onedivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onedivideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onedivideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onedivideMouseExited(evt);
            }
        });
        jPanel2.add(onedivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 131, 78, 48));

        square.setBackground(new java.awt.Color(38, 38, 38));
        square.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        square.setForeground(new java.awt.Color(255, 255, 255));
        square.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square.setText("x²");
        square.setOpaque(true);
        square.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                squareMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                squareMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                squareMouseExited(evt);
            }
        });
        jPanel2.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 131, 78, 48));

        back.setBackground(new java.awt.Color(38, 38, 38));
        back.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 185, 78, 48));

        division.setBackground(new java.awt.Color(38, 38, 38));
        division.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        division.setForeground(new java.awt.Color(255, 255, 255));
        division.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Divide_25px.png"))); // NOI18N
        division.setOpaque(true);
        division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divisionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divisionMouseExited(evt);
            }
        });
        jPanel2.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 185, 78, 48));

        nine.setBackground(new java.awt.Color(13, 13, 13));
        nine.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nine.setText("9");
        nine.setOpaque(true);
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nineMouseExited(evt);
            }
        });
        jPanel2.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 239, 78, 48));

        c.setBackground(new java.awt.Color(38, 38, 38));
        c.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("C");
        c.setOpaque(true);
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cMouseExited(evt);
            }
        });
        jPanel2.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 78, 48));

        six.setBackground(new java.awt.Color(13, 13, 13));
        six.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        six.setText("6");
        six.setOpaque(true);
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sixMouseExited(evt);
            }
        });
        jPanel2.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 293, 78, 48));

        three.setBackground(new java.awt.Color(13, 13, 13));
        three.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three.setText("3");
        three.setOpaque(true);
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                threeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                threeMouseExited(evt);
            }
        });
        jPanel2.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 347, 78, 48));

        minus.setBackground(new java.awt.Color(38, 38, 38));
        minus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus.png"))); // NOI18N
        minus.setOpaque(true);
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMouseExited(evt);
            }
        });
        jPanel2.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 293, 78, 48));

        multiply.setBackground(new java.awt.Color(38, 38, 38));
        multiply.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiple.png"))); // NOI18N
        multiply.setOpaque(true);
        multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplyMouseExited(evt);
            }
        });
        jPanel2.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 239, 78, 48));

        sum.setBackground(new java.awt.Color(38, 38, 38));
        sum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sum.setForeground(new java.awt.Color(255, 255, 255));
        sum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sum.setText("+");
        sum.setOpaque(true);
        sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sumMouseExited(evt);
            }
        });
        jPanel2.add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 347, 78, 48));

        five.setBackground(new java.awt.Color(13, 13, 13));
        five.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        five.setText("5");
        five.setOpaque(true);
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fiveMouseExited(evt);
            }
        });
        jPanel2.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 293, 78, 48));

        equal.setBackground(new java.awt.Color(38, 38, 38));
        equal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equal.setText("=");
        equal.setOpaque(true);
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalMouseExited(evt);
            }
        });
        jPanel2.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 401, 78, 48));

        dot.setBackground(new java.awt.Color(38, 38, 38));
        dot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 255, 255));
        dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dot.setText(".");
        dot.setOpaque(true);
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dotMouseExited(evt);
            }
        });
        jPanel2.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 401, 78, 48));

        eight.setBackground(new java.awt.Color(13, 13, 13));
        eight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eight.setText("8");
        eight.setOpaque(true);
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eightMouseExited(evt);
            }
        });
        jPanel2.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 239, 78, 48));

        two.setBackground(new java.awt.Color(13, 13, 13));
        two.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.setText("2");
        two.setOpaque(true);
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twoMouseExited(evt);
            }
        });
        jPanel2.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 347, 78, 48));

        zero.setBackground(new java.awt.Color(13, 13, 13));
        zero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zero.setText("0");
        zero.setOpaque(true);
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zeroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zeroMouseExited(evt);
            }
        });
        jPanel2.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 401, 78, 48));

        seven.setBackground(new java.awt.Color(13, 13, 13));
        seven.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seven.setText("7");
        seven.setOpaque(true);
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sevenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sevenMouseExited(evt);
            }
        });
        jPanel2.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 239, 78, 48));

        ce.setBackground(new java.awt.Color(38, 38, 38));
        ce.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ce.setForeground(new java.awt.Color(255, 255, 255));
        ce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ce.setText("CE");
        ce.setOpaque(true);
        ce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ceMouseExited(evt);
            }
        });
        jPanel2.add(ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, 78, 48));

        four.setBackground(new java.awt.Color(13, 13, 13));
        four.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        four.setText("4");
        four.setOpaque(true);
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fourMouseExited(evt);
            }
        });
        jPanel2.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 293, 78, 48));

        one.setBackground(new java.awt.Color(13, 13, 13));
        one.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.setText("1");
        one.setOpaque(true);
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oneMouseExited(evt);
            }
        });
        jPanel2.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 347, 78, 48));

        pm.setBackground(new java.awt.Color(38, 38, 38));
        pm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pm.setForeground(new java.awt.Color(255, 255, 255));
        pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pm.png"))); // NOI18N
        pm.setOpaque(true);
        pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pmMouseExited(evt);
            }
        });
        jPanel2.add(pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 401, 78, 48));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(64, 64, 64));
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, -1, -1));

        lblshow.setBackground(new java.awt.Color(64, 64, 64));
        lblshow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblshow.setForeground(new java.awt.Color(204, 204, 204));
        lblshow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 21, 182, 30));

        txtshow.setEditable(false);
        txtshow.setBackground(new java.awt.Color(64, 64, 64));
        txtshow.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtshow.setForeground(new java.awt.Color(255, 255, 255));
        txtshow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtshow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtshow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtshowKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtshowKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtshowKeyTyped(evt);
            }
        });
        jPanel2.add(txtshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 340, 56));

        off.setBackground(new java.awt.Color(64, 64, 64));
        off.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        off.setForeground(new java.awt.Color(255, 255, 255));
        off.setText("Off");
        off.setBorder(null);
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        jPanel2.add(off, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 20));

        on.setBackground(new java.awt.Color(64, 64, 64));
        on.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        on.setForeground(new java.awt.Color(255, 255, 255));
        on.setSelected(true);
        on.setText("On");
        on.setBorder(null);
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel2.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(341, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimumMouseEntered
        // TODO add your handling code here:
        minimum.setBackground(new Color(128, 128, 128));
    }//GEN-LAST:event_minimumMouseEntered

    private void minimumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimumMouseExited
        // TODO add your handling code here:
        minimum.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_minimumMouseExited

    private void minimumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimumMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimumMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit1MouseClicked

    private void exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseEntered
        // TODO add your handling code here:
        exit1.setBackground(Color.red);
    }//GEN-LAST:event_exit1MouseEntered

    private void exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseExited
        // TODO add your handling code here:
        exit1.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_exit1MouseExited

    private void rootMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootMouseEntered
        // TODO add your handling code here:
        root.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_rootMouseEntered

    private void squareMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareMouseEntered
        // TODO add your handling code here:
        square.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_squareMouseEntered

    private void onedivideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onedivideMouseEntered
        // TODO add your handling code here:
        onedivide.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_onedivideMouseEntered

    private void ceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceMouseEntered
        // TODO add your handling code here:
        ce.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_ceMouseEntered

    private void cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseEntered
        // TODO add your handling code here:
        c.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_cMouseEntered

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_backMouseEntered

    private void divisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionMouseEntered
        // TODO add your handling code here:
        division.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_divisionMouseEntered

    private void sevenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseEntered
        // TODO add your handling code here:
        seven.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_sevenMouseEntered

    private void eightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseEntered
        // TODO add your handling code here:
        eight.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_eightMouseEntered

    private void nineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseEntered
        // TODO add your handling code here:
        nine.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_nineMouseEntered

    private void multiplyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseEntered
        // TODO add your handling code here:
        multiply.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_multiplyMouseEntered

    private void fourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseEntered
        // TODO add your handling code here:
        four.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_fourMouseEntered

    private void fiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseEntered
        // TODO add your handling code here:
        five.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_fiveMouseEntered

    private void sixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseEntered
        // TODO add your handling code here:
        six.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_sixMouseEntered

    private void minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseEntered
        // TODO add your handling code here:
        minus.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_minusMouseEntered

    private void oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseEntered
        // TODO add your handling code here:
        one.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_oneMouseEntered

    private void twoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseEntered
        // TODO add your handling code here:
        two.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_twoMouseEntered

    private void threeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseEntered
        // TODO add your handling code here:
        three.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_threeMouseEntered

    private void sumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseEntered
        // TODO add your handling code here:
        sum.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_sumMouseEntered

    private void pmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmMouseEntered
        // TODO add your handling code here:
        pm.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_pmMouseEntered

    private void zeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseEntered
        // TODO add your handling code here:
        zero.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_zeroMouseEntered

    private void dotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseEntered
        // TODO add your handling code here:
        dot.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_dotMouseEntered

    private void equalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseEntered
        // TODO add your handling code here:
        equal.setBackground(new Color(166, 166, 166));
    }//GEN-LAST:event_equalMouseEntered

    private void rootMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootMouseExited
        // TODO add your handling code here:
        root.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_rootMouseExited

    private void squareMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareMouseExited
        // TODO add your handling code here:
        square.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_squareMouseExited

    private void onedivideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onedivideMouseExited
        // TODO add your handling code here:
        onedivide.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_onedivideMouseExited

    private void ceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceMouseExited
        // TODO add your handling code here:
        ce.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_ceMouseExited

    private void cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseExited
        // TODO add your handling code here:
        c.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_cMouseExited

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        back.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_backMouseExited

    private void divisionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionMouseExited
        // TODO add your handling code here:
        division.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_divisionMouseExited

    private void sevenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseExited
        // TODO add your handling code here:
        seven.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_sevenMouseExited

    private void eightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseExited
        // TODO add your handling code here:
        eight.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_eightMouseExited

    private void nineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseExited
        // TODO add your handling code here:
        nine.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_nineMouseExited

    private void multiplyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseExited
        // TODO add your handling code here:
        multiply.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_multiplyMouseExited

    private void fourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseExited
        // TODO add your handling code here:
        four.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_fourMouseExited

    private void fiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseExited
        // TODO add your handling code here:
        five.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_fiveMouseExited

    private void sixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseExited
        // TODO add your handling code here:
        six.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_sixMouseExited

    private void minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseExited
        // TODO add your handling code here:
        minus.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_minusMouseExited

    private void oneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseExited
        // TODO add your handling code here:
        one.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_oneMouseExited

    private void twoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseExited
        // TODO add your handling code here:
        two.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_twoMouseExited

    private void threeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseExited
        // TODO add your handling code here:
        three.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_threeMouseExited

    private void sumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseExited
        // TODO add your handling code here:
        sum.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_sumMouseExited

    private void pmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmMouseExited
        // TODO add your handling code here:
        pm.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_pmMouseExited

    private void zeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseExited
        // TODO add your handling code here:
        zero.setBackground(new Color(13, 13, 13));
    }//GEN-LAST:event_zeroMouseExited

    private void dotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseExited
        // TODO add your handling code here:
        dot.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_dotMouseExited

    private void equalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseExited
        // TODO add your handling code here:
        equal.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_equalMouseExited

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_0)
        {
            txtshow.setText((txtshow.getText()+"0"));
            zero.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_1)
        {
             txtshow.setText((txtshow.getText()+"1"));
             zero.setBackground(new Color(166, 166, 166));        
        }
        if(evt.getKeyCode() == KeyEvent.VK_2)
        {
             txtshow.setText((txtshow.getText()+"2"));
             two.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_3)
        {
             txtshow.setText((txtshow.getText()+"3"));
             three.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_4)
        {
             txtshow.setText((txtshow.getText()+"4"));
             four.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_5)
        {
             txtshow.setText((txtshow.getText()+"5"));
             five.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_6)
        {
             txtshow.setText((txtshow.getText()+"6"));
             six.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_7)
        {
             txtshow.setText((txtshow.getText()+"7"));
             seven.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_8)
        {
             txtshow.setText((txtshow.getText()+"8"));
             eight.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_9)
        {
             txtshow.setText((txtshow.getText()+"9"));
             nine.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DECIMAL)
        {
             txtshow.setText((txtshow.getText()+"."));
             dot.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            equal.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ADD)
        {
            sum.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
        {
            minus.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
        {
            multiply.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DIVIDE)
        {
            division.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
        {
            back.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_C)
        {
            c.setBackground(new Color(166, 166, 166));
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_0)
        {
            zero.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_1)
        {
             zero.setBackground(new Color(13,13,13));        
        }
        if(evt.getKeyCode() == KeyEvent.VK_2)
        {
             two.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_3)
        {
             three.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_4)
        {
             four.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_5)
        {
         
             five.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_6)
        {
             
             six.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_7)
        {
             
             seven.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_8)
        {
             
             eight.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_9)
        {
             
             nine.setBackground(new Color(13,13,13));
        }
          if(evt.getKeyCode() == KeyEvent.VK_DECIMAL)
        {
             txtshow.setText((txtshow.getText()+"."));
             dot.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            equal.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ADD)
        {
            sum.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
        {
            minus.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
        {
            multiply.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DIVIDE)
        {
            division.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
        {
            back.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_C)
        {
            c.setBackground(new Color(38,38,38));
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"0"));
    }//GEN-LAST:event_zeroMouseClicked

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"1"));
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"2"));
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"3"));
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"4"));
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"5"));
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"6"));
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"7"));
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"8"));
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        // TODO add your handling code here:
        txtshow.setText((txtshow.getText()+"9"));
    }//GEN-LAST:event_nineMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void txtshowKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtshowKeyTyped
        // TODO add your handling code here:
        
       if(txtshow.getText().length()<=12)
       {
           txtshow.setText(txtshow.getText());
       }
       else 
       {
           evt.consume();
       }
    }//GEN-LAST:event_txtshowKeyTyped

    private void txtshowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtshowKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_0)
        {
            txtshow.setText((txtshow.getText()+"0"));
            zero.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_1)
        {
             txtshow.setText((txtshow.getText()+"1"));
             zero.setBackground(new Color(166, 166, 166));        
        }
        if(evt.getKeyCode() == KeyEvent.VK_2)
        {
             txtshow.setText((txtshow.getText()+"2"));
             two.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_3)
        {
             txtshow.setText((txtshow.getText()+"3"));
             three.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_4)
        {
             txtshow.setText((txtshow.getText()+"4"));
             four.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_5)
        {
             txtshow.setText((txtshow.getText()+"5"));
             five.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_6)
        {
             txtshow.setText((txtshow.getText()+"6"));
             six.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_7)
        {
             txtshow.setText((txtshow.getText()+"7"));
             seven.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_8)
        {
             txtshow.setText((txtshow.getText()+"8"));
             eight.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_9)
        {
             txtshow.setText((txtshow.getText()+"9"));
             nine.setBackground(new Color(166, 166, 166));
        }
          if(evt.getKeyCode() == KeyEvent.VK_DECIMAL)
        {
             txtshow.setText((txtshow.getText()+"."));
             dot.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            equal.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ADD)
        {
            sum.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
        {
            minus.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
        {
            multiply.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DIVIDE)
        {
            division.setBackground(new Color(166, 166, 166));
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
        {
            back.setBackground(new Color(166, 166, 166));
            
        }
        if(evt.getKeyCode() == KeyEvent.VK_C)
        {
            c.setBackground(new Color(166, 166, 166));
        }
    }//GEN-LAST:event_txtshowKeyPressed

    private void txtshowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtshowKeyReleased
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_0)
        {
            zero.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_1)
        {
             zero.setBackground(new Color(13,13,13));        
        }
        if(evt.getKeyCode() == KeyEvent.VK_2)
        {
             two.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_3)
        {
             three.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_4)
        {
             four.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_5)
        {
         
             five.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_6)
        {
             
             six.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_7)
        {
             
             seven.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_8)
        {
             
             eight.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_9)
        {
             
             nine.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DECIMAL)
        {
             txtshow.setText((txtshow.getText()+"."));
             dot.setBackground(new Color(13,13,13));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            equal.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_ADD)
        {
            sum.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
        {
            minus.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
        {
            multiply.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_DIVIDE)
        {
            division.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
        {
            back.setBackground(new Color(38,38,38));
        }
        if(evt.getKeyCode() == KeyEvent.VK_C)
        {
            c.setBackground(new Color(38,38,38));
        }
    }//GEN-LAST:event_txtshowKeyReleased

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
       backfunction();
    }//GEN-LAST:event_backMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        // TODO add your handling code here:
        txtshow.setText("");
        lblshow.setText("");
    }//GEN-LAST:event_cMouseClicked

    private void sumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumMouseClicked
        // TODO add your handling code here:
        
        number = Double.parseDouble(txtshow.getText());
        calculation = 1;
        txtshow.setText("");
        lblshow.setText(number+ "+");
    }//GEN-LAST:event_sumMouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 2;
        txtshow.setText("");
        lblshow.setText(number+ "-");
    }//GEN-LAST:event_minusMouseClicked

    private void multiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 3;
        txtshow.setText("");
        lblshow.setText(number+ "*");
        
    }//GEN-LAST:event_multiplyMouseClicked

    private void divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 4;
        txtshow.setText("");
        lblshow.setText(number+ "/");
    }//GEN-LAST:event_divisionMouseClicked

    private void rootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 5;
        txtshow.setText("");
        algorithmic_operation();
        lblshow.setText("sqrt ("+number+")");
    }//GEN-LAST:event_rootMouseClicked

    private void squareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_squareMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 6;
        txtshow.setText("");
        algorithmic_operation();
        lblshow.setText("sqr ("+number+")");
    }//GEN-LAST:event_squareMouseClicked

    private void onedivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onedivideMouseClicked
        // TODO add your handling code here:
        number = Double.parseDouble(txtshow.getText());
        calculation = 7;
        txtshow.setText("");
        algorithmic_operation();
        lblshow.setText("1/"+number);
    }//GEN-LAST:event_onedivideMouseClicked

    private void equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseClicked
        // TODO add your handling code here:
        algorithmic_operation();
        lblshow.setText("");
    }//GEN-LAST:event_equalMouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
        // TODO add your handling code here:
        txtshow.setText(txtshow.getText() + ".");
    }//GEN-LAST:event_dotMouseClicked

    private void pmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmMouseClicked
        // TODO add your handling code here:
        
        double plusminus = Double.parseDouble(txtshow.getText());
        plusminus*=(-1);
        txtshow.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_pmMouseClicked

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        // TODO add your handling code here:
        
        root.setEnabled(true);
        square.setEnabled(true);
        onedivide.setEnabled(true);
        ce.setEnabled(true);
        c.setEnabled(true);
        back.setEnabled(true);
        division.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        multiply.setEnabled(true);
        six.setEnabled(true);
        five.setEnabled(true);
        four.setEnabled(true);
        minus.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        sum.setEnabled(true);
        pm.setEnabled(true);
        zero.setEnabled(true);
        dot.setEnabled(true);
        equal.setEnabled(true);
        off.setSelected(false);
        on.setSelected(true);
    }//GEN-LAST:event_onActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen()-x, evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
        
        root.setEnabled(false);
        square.setEnabled(false);
        onedivide.setEnabled(false);
        ce.setEnabled(false);
        c.setEnabled(false);
        back.setEnabled(false);
        division.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        multiply.setEnabled(false);
        six.setEnabled(false);
        five.setEnabled(false);
        four.setEnabled(false);
        minus.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        sum.setEnabled(false);
        pm.setEnabled(false);
        zero.setEnabled(false);
        dot.setEnabled(false);
        equal.setEnabled(false);
        off.setSelected(true);
        on.setSelected(false);
    }//GEN-LAST:event_offActionPerformed

    private void ceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceMouseClicked
        // TODO add your handling code here:
        lblshow.setText("");
       txtshow.setText("");
    }//GEN-LAST:event_ceMouseClicked

    
    private void backfunction()
    {
        int length = txtshow.getText().length();
        int number = txtshow.getText().length() - 1;
        String store;
        
        if (length > 0)
        {
            StringBuilder back = new StringBuilder(txtshow.getText());
            back.deleteCharAt(number);
            store = back.toString();
            txtshow.setText(store);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel c;
    private javax.swing.JLabel ce;
    private javax.swing.JLabel division;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel eight;
    private javax.swing.JLabel equal;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblshow;
    private javax.swing.JLabel minimum;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel multiply;
    private javax.swing.JLabel nine;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JLabel one;
    private javax.swing.JLabel onedivide;
    private javax.swing.JLabel pm;
    private javax.swing.JLabel root;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel six;
    private javax.swing.JLabel square;
    private javax.swing.JLabel sum;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    private javax.swing.JTextField txtshow;
    private javax.swing.JLabel zero;
    // End of variables declaration//GEN-END:variables
}
