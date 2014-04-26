import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame {

   JPanel global = new JPanel();
   GridLayout gridLayout1 = new GridLayout();
   JPanel jPanel1 = new JPanel();
   JPanel jPanel2 = new JPanel();
   JPanel jPanel3 = new JPanel();
   JLabel ip = new JLabel();
   JLabel name = new JLabel();
   JTextField ipTF = new JTextField();
   JTextField nameTF = new JTextField();
   JButton cancel = new JButton();
   JButton ok = new JButton();
   Font f = new Font("SansSerif", 0, 12);
   JLabel jl1 = new JLabel();
   JLabel jl2 = new JLabel();

   public Login() {
      super("Login!!");
      try {
         jbInit();
      }
      catch(Exception e) {
         e.printStackTrace();
      }
   }

   private void jbInit() throws Exception {
      this.getContentPane().setBackground(new Color(249, 255, 255));
      this.getContentPane().setLayout(null);
      global.setBorder(BorderFactory.createEtchedBorder());
      global.setOpaque(false);
      global.setBounds(new Rectangle(3, 3, 246, 114));
      global.setLayout(gridLayout1);
      gridLayout1.setRows(3);
      gridLayout1.setColumns(1);
      gridLayout1.setVgap(5);
      jPanel3.setBorder(BorderFactory.createEtchedBorder());
      jPanel3.setOpaque(false);
      jPanel3.setLayout(null);
      jPanel2.setOpaque(false);
      jPanel2.setLayout(null);
      jPanel1.setOpaque(false);
      jPanel1.setLayout(null);
      ip.setFont(new java.awt.Font("SansSerif", 0, 12));
      ip.setText("   I        D   : ");
      ip.setBounds(new Rectangle(6, 3, 66, 27));
      name.setBounds(new Rectangle(6, 0, 66, 27));
      name.setFont(new java.awt.Font("SansSerif", 0, 12));
      name.setText("  대 화 명  : ");
      ipTF.setNextFocusableComponent(nameTF);
      ipTF.setBounds(new Rectangle(78, 3, 163, 27));
      nameTF.setNextFocusableComponent(ok);
      nameTF.setBounds(new Rectangle(78, 0, 163, 27));
      cancel.setFont(new java.awt.Font("SansSerif", 0, 12));
      cancel.setBorder(BorderFactory.createRaisedBevelBorder());
      cancel.setText("취 소");
      cancel.setBounds(new Rectangle(126, 2, 67, 26));
      ok.setBounds(new Rectangle(48, 2, 67, 26));
      ok.setFont(new java.awt.Font("SansSerif", 0, 12));
      ok.setBorder(BorderFactory.createRaisedBevelBorder());
      ok.setNextFocusableComponent(cancel);
      ok.setText("확 인");
      this.getContentPane().add(global, null);
      global.add(jPanel1, null);
      jPanel1.add(ip, null);
      jPanel1.add(ipTF, null);
      global.add(jPanel2, null);
      jPanel2.add(name, null);
      jPanel2.add(nameTF, null);
      global.add(jPanel3, null);
      jPanel3.add(cancel, null);
      jPanel3.add(ok, null);

      jl1.setFont(f);
      jl2.setFont(f);

      setBounds(200,200,267,158);
      setVisible(true);
   }

   public static void main(String[] args) {
      new Login();
   }
}