import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Game extends javax.swing.JFrame {
   private JPanel back_P;
   private JLabel chosung_L;
   private JTextArea chat_area;
   
   private JPanel myp_chat;
   private JPanel myplayer_P;
   
   private JPanel p1_chat;
   private JLabel player1_info;
   
   private JPanel player1_P;
   private JPanel p2_chat;
   private JLabel player2_info;
   private JPanel player2_P;
   
   private JPanel p3_chat;
   private JLabel player3_info;

   private JButton info_B;
   private JButton logout_B;
   private JLabel my_info;
   private JPanel player3_P;

   private JPanel p4_chat;
   private JLabel player4_info;
   private JPanel player4_P;   


   /**
   * Auto-generated main method to display this JFrame
   */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            Game inst = new Game();
            inst.setLocationRelativeTo(null);
            inst.setVisible(true);
         }
      });
   }
   
   public Game() {
      super("초성게임");
      initGUI();

   }
   
   private void initGUI() {
      try {
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         getContentPane().setLayout(null);
         { // 백그라운드
            back_P = new JPanel();
            getContentPane().add(back_P);
            back_P.setBounds(0, 0, 734, 462);
            back_P.setBackground(new java.awt.Color(255,255,255));
            back_P.setLayout(null);

         }
         { // 초성퀴즈 패널
            chosung_L = new JLabel();
            back_P.add(chosung_L);
            chosung_L.setBounds(182, 188, 362, 65);
            chosung_L.setBackground(new java.awt.Color(255,255,0));
         
            chosung_L.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
         }
         { // 플레이어1
            player1_P = new JPanel();
            back_P.add(player1_P);
            player1_P.setBounds(12, 144, 100, 49);
            {
               player1_info = new JLabel();
               player1_P.add(player1_info);
               player1_info.setText("<html>사용자1<br>100 Point<br>3 | 20</html>");
               player1_info.setPreferredSize(new java.awt.Dimension(97, 45));
            }

         }
         { // 플레이어1 말풍선
            p1_chat = new JPanel();
            back_P.add(p1_chat);
            p1_chat.setBounds(12, 18, 110, 105);
            p1_chat.setBackground(new java.awt.Color(255,128,192));
         }
         
         { // 플레이어2
            player2_P = new JPanel();
            back_P.add(player2_P);
            player2_P.setBounds(12, 345, 100, 44);
            {
               player2_info = new JLabel();
               player2_P.add(player2_info);
               player2_info.setText("<html>사용자2<br>200 Point<br>3 | 20</html>");
               player2_info.setPreferredSize(new java.awt.Dimension(97,45));
            }

         }
         { // 플레이어2 말풍선
            p2_chat = new JPanel();
            back_P.add(p2_chat);
            p2_chat.setBounds(12, 215, 110, 105);
            p2_chat.setBackground(new java.awt.Color(255,128,192));
         }
         
         { // 플레이어3
            player3_P = new JPanel();
            back_P.add(player3_P);
            player3_P.setBounds(621, 128, 100, 50);
            {
               player3_info = new JLabel();
               player3_P.add(player3_info);
               player3_info.setText("<html>사용자3<br>300 Point<br>3 | 20</html>");
               player3_info.setPreferredSize(new java.awt.Dimension(97,45));
            }

         }
         { // 플레이어3 말풍선
            p3_chat = new JPanel();
            back_P.add(p3_chat);
            p3_chat.setBounds(607, 11, 110, 105);
            p3_chat.setBackground(new java.awt.Color(255,128,192));
         }
         
         { // 플레이어4
            player4_P = new JPanel();
            back_P.add(player4_P);
            player4_P.setBounds(622, 328, 100, 42);
            {
               player4_info = new JLabel();
               player4_P.add(player4_info);
               player4_info.setText("<html>사용자4<br>400 Point<br>3 | 20</html>");
               player4_info.setPreferredSize(new java.awt.Dimension(97,45));
            }

         }
         { // 플레이어4 말풍선
            p4_chat = new JPanel();
            back_P.add(p4_chat);
            p4_chat.setBounds(603, 211, 110, 105);
            p4_chat.setBackground(new java.awt.Color(255,128,192));
         }
         { // 내 플레이어
            myplayer_P = new JPanel();
            back_P.add(myplayer_P);
            myplayer_P.setBounds(246, 345, 225, 117);
            {
               my_info = new JLabel();
               myplayer_P.add(my_info);
               my_info.setText("<html>나나나<br>500 Point<br>5 | 20</html>");
               my_info.setPreferredSize(new java.awt.Dimension(190, 106));
            }
         }
         { // 내 플레이어 말풍선
            myp_chat = new JPanel();
            back_P.add(myp_chat);
            myp_chat.setBounds(246, 265, 225, 101);
            myp_chat.setBackground(new java.awt.Color(255,128,192));
         }
         {
            chat_area = new JTextArea();
            back_P.add(chat_area);
            chat_area.setText("jTextArea1");
            chat_area.setBounds(165, 15, 404, 152);
            chat_area.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
         }
         {
            logout_B = new JButton();
            back_P.add(logout_B);
            logout_B.setText("\ub85c\uadf8\uc544\uc6c3");
            logout_B.setBounds(615, 409, 62, 24);
         }
         {
            info_B = new JButton();
            back_P.add(info_B);
            info_B.setText("\ub0b4\uc815\ubcf4");
            info_B.setBounds(52, 415, 50, 24);
         }

         pack();
         this.setSize(750, 500);
      } catch (Exception e) {
          //add your error handling code here
         e.printStackTrace();
      }
   }
}