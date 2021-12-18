
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Medium extends javax.swing.JFrame {

    ArrayList<String> a1 = new ArrayList<>();
    ArrayList<String> checking = new ArrayList<>();
     ArrayList<String> a1rand = new ArrayList<>();

    Random random = new Random(); 
    private JButton c1;
    private JButton c2;
   
    
   int firstChoice=0;
   int secondChoice=0;
   int iterator =0;
  
   int counter;
   private static boolean run = true;
   
   int sco=0;
   final int ti = 200;
     List<JButton> buttonList = new ArrayList<>();
     List<JButton> buttonList2 = new ArrayList<>();
    public Medium() {
        run =true;
        initComponents();
        a1.add("£");
        a1.add("ƒ");
        a1.add("ô");
        a1.add("§");
        a1.add("»");
        a1.add("§");
        a1.add("Ä");
        a1.add("±");
        a1.add("L");
        a1.add("ì");
        a1.add("è");
        a1.add("∩");
        for(int i=0;i<12;i++){
               
            checking.add(a1.get(i));
           
            
        }
        
       
        for(int i=0;i<12;i++){
            
            a1rand.add(a1.get(i));
            
        }
        
        Collections.shuffle(a1rand);
        
         buttonList.add(jb1);
        buttonList.add(jb2);
        buttonList.add(jb3);
        buttonList.add(jb4);
        buttonList.add(jb5);
        buttonList.add(jb6);
        buttonList.add(jb7);
        buttonList.add(jb8);
         buttonList.add(jb9);
        buttonList.add(jb10);
        buttonList.add(jb11);
        buttonList.add(jb12);
       
       buttonList2.add(jbb1);
        buttonList2.add(jbb2);
        buttonList2.add(jbb3);
        buttonList2.add(jbb4);
        buttonList2.add(jbb5);
        buttonList2.add(jbb6);
        buttonList2.add(jbb7);
        buttonList2.add(jbb8);
         buttonList2.add(jbb9);
        buttonList2.add(jbb10);
        buttonList2.add(jbb11);
        buttonList2.add(jbb12);
        
        Timer t = new Timer();
         counter = 5;
        TimerTask task = new TimerTask(){
            public void run(){
                if(run){
                silip.setText(Integer.toString(counter));
                counter--; 
                for(int i=0;i<12;i++){

                buttonList.get(i).setText((a1rand.get(i)));
                buttonList.get(i).setEnabled(false);
     
                }

                 for(int i=0;i<12;i++){

                        buttonList2.get(i).setText((a1rand.get(i)));
                        buttonList2.get(i).setEnabled(false);
                    }
                }
                if(counter == -1){
                    this.cancel();
                    run = false;
                     for(int i=0;i<12;i++){

                    buttonList.get(i).setText((""));
                    buttonList.get(i).setEnabled(true);

                    }
                     for(int i=0;i<12;i++){

                            buttonList2.get(i).setText("");
                            buttonList2.get(i).setEnabled(true);
                    }
                  boolean x=true;
            long displayMinutes=2;
            long starttime=0;
            long timepassed=0;
             long secondspassed=starttime-timepassed;
            while(x)
            {
            try {
                TimeUnit.SECONDS.sleep(1);
                
               
                if(displayMinutes>0&&secondspassed==0){
                    displayMinutes--;
                    secondspassed=59;
                }
                   
                else if(secondspassed<60)
                {
                    
                    secondspassed--;
                    
                    //starttime=System.currentTimeMillis();
                }
                
                
                if(displayMinutes==0&&secondspassed==0||iterator==8){
                    x=false;
                    gameover r = new gameover();
                    r.fin_score.setText(Integer.toString(sco));
                    r.setVisible(true);
                    exit();
                }
                
                rem_time.setText(displayMinutes+":"+secondspassed);
                     } catch (InterruptedException ex) {
                Logger.getLogger(Easy.class.getName()).log(Level.SEVERE, null, ex);
                      }
                 }
                }
                System.out.println(counter);
                
            }

            
        };
        t.scheduleAtFixedRate(task,1000,1000);
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        silip = new javax.swing.JLabel();
        giveup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jbb11 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jbb3 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbb10 = new javax.swing.JButton();
        jbb7 = new javax.swing.JButton();
        rem_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jb2 = new javax.swing.JButton();
        jbb5 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jbb2 = new javax.swing.JButton();
        jbb1 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbb9 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb11 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jbb8 = new javax.swing.JButton();
        jbb6 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jbb4 = new javax.swing.JButton();
        jbb12 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        monkeyAng = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title5.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button1.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matsing Type");
        setLocation(new java.awt.Point(170, 10));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        silip.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        silip.setText("0");
        getContentPane().add(silip, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        giveup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        giveup.setForeground(new java.awt.Color(255, 255, 255));
        giveup.setText("GIVE UP");
        giveup.setBorderPainted(false);
        giveup.setContentAreaFilled(false);
        giveup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giveup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveupActionPerformed(evt);
            }
        });
        getContentPane().add(giveup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Silip time:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        score.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setText("0");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jbb11.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb11.setForeground(new java.awt.Color(255, 255, 51));
        jbb11.setBorderPainted(false);
        jbb11.setContentAreaFilled(false);
        jbb11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb11ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 70, 70));

        jb7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb7.setForeground(new java.awt.Color(255, 255, 51));
        jb7.setBorderPainted(false);
        jb7.setContentAreaFilled(false);
        jb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 70, 70));

        jb8.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 255, 51));
        jb8.setBorderPainted(false);
        jb8.setContentAreaFilled(false);
        jb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 70, 70));

        jbb3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb3.setForeground(new java.awt.Color(255, 255, 51));
        jbb3.setBorderPainted(false);
        jbb3.setContentAreaFilled(false);
        jbb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 70, 70));

        jb3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 51));
        jb3.setBorderPainted(false);
        jb3.setContentAreaFilled(false);
        jb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, 70));

        jbb10.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb10.setForeground(new java.awt.Color(255, 255, 51));
        jbb10.setBorderPainted(false);
        jbb10.setContentAreaFilled(false);
        jbb10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb10ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 70));

        jbb7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb7.setForeground(new java.awt.Color(255, 255, 51));
        jbb7.setBorderPainted(false);
        jbb7.setContentAreaFilled(false);
        jbb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 70));

        rem_time.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rem_time.setForeground(new java.awt.Color(255, 255, 255));
        rem_time.setText("0");
        getContentPane().add(rem_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POINTS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jb2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 51));
        jb2.setBorderPainted(false);
        jb2.setContentAreaFilled(false);
        jb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 70, 70));

        jbb5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb5.setForeground(new java.awt.Color(255, 255, 51));
        jbb5.setBorderPainted(false);
        jbb5.setContentAreaFilled(false);
        jbb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, 70));

        jb4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 51));
        jb4.setBorderPainted(false);
        jb4.setContentAreaFilled(false);
        jb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 70, 70));

        jbb2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb2.setForeground(new java.awt.Color(255, 255, 51));
        jbb2.setBorderPainted(false);
        jbb2.setContentAreaFilled(false);
        jbb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 70, 70));

        jbb1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb1.setForeground(new java.awt.Color(255, 255, 51));
        jbb1.setBorderPainted(false);
        jbb1.setContentAreaFilled(false);
        jbb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 70, 70));

        jb9.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb9.setForeground(new java.awt.Color(255, 255, 51));
        jb9.setBorderPainted(false);
        jb9.setContentAreaFilled(false);
        jb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        getContentPane().add(jb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 70, 70));

        jbb9.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb9.setForeground(new java.awt.Color(255, 255, 51));
        jbb9.setBorderPainted(false);
        jbb9.setContentAreaFilled(false);
        jbb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 70, 70));

        jb6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 255, 51));
        jb6.setBorderPainted(false);
        jb6.setContentAreaFilled(false);
        jb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 70, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATSING TYPE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jb11.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb11.setForeground(new java.awt.Color(255, 255, 51));
        jb11.setBorderPainted(false);
        jb11.setContentAreaFilled(false);
        jb11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        getContentPane().add(jb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 70, 70));

        jb10.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb10.setForeground(new java.awt.Color(255, 255, 51));
        jb10.setBorderPainted(false);
        jb10.setContentAreaFilled(false);
        jb10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });
        getContentPane().add(jb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 70, 70));

        jbb8.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb8.setForeground(new java.awt.Color(255, 255, 51));
        jbb8.setBorderPainted(false);
        jbb8.setContentAreaFilled(false);
        jbb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 70, 70));

        jbb6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb6.setForeground(new java.awt.Color(255, 255, 51));
        jbb6.setBorderPainted(false);
        jbb6.setContentAreaFilled(false);
        jbb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 70, 70));

        jb1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 51));
        jb1.setBorderPainted(false);
        jb1.setContentAreaFilled(false);
        jb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 70, 70));

        jb5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb5.setForeground(new java.awt.Color(255, 255, 51));
        jb5.setBorderPainted(false);
        jb5.setContentAreaFilled(false);
        jb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        getContentPane().add(jb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 70, 70));

        jbb4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb4.setForeground(new java.awt.Color(255, 255, 51));
        jbb4.setBorderPainted(false);
        jbb4.setContentAreaFilled(false);
        jbb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 70, 70));

        jbb12.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jbb12.setForeground(new java.awt.Color(255, 255, 51));
        jbb12.setBorderPainted(false);
        jbb12.setContentAreaFilled(false);
        jbb12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbb12ActionPerformed(evt);
            }
        });
        getContentPane().add(jbb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 70, 70));

        jb12.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jb12.setForeground(new java.awt.Color(255, 255, 51));
        jb12.setBorderPainted(false);
        jb12.setContentAreaFilled(false);
        jb12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });
        getContentPane().add(jb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 70, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button33.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/square22.png"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title5.png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button1.png"))); // NOI18N
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2.png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 60));

        monkeyAng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angry1.png"))); // NOI18N
        getContentPane().add(monkeyAng, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void exit(){
        this.dispose();
    }
    private void giveupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveupActionPerformed
       gameover r = new gameover();
       r.fin_score.setText(Integer.toString(sco));
       this.dispose();
       r.setVisible(true);
    }//GEN-LAST:event_giveupActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
      jb2.setText(a1rand.get(1));
       
        if (firstChoice==0){
            firstChoice=1;
            jb2.setEnabled(false);
            c1=jb2;
        }
        else if(firstChoice==1){
             c2=jb2;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
       jb9.setText(a1rand.get(8));
       
        if (firstChoice==0){
            firstChoice=1;
            jb9.setEnabled(false);
            c1=jb9;
        }
        else if(firstChoice==1){
             c2=jb9;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        jb8.setText(a1rand.get(7));
       
        if (firstChoice==0){
            firstChoice=1;
            jb8.setEnabled(false);
            c1=jb8;
        }
        else if(firstChoice==1){
             c2=jb8;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        jb11.setText(a1rand.get(10));
       
        if (firstChoice==0){
            firstChoice=1;
            jb11.setEnabled(false);
            c1=jb11;
        }
        else if(firstChoice==1){
             c2=jb11;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        jb5.setText(a1rand.get(4));
       
        if (firstChoice==0){
            firstChoice=1;
            jb5.setEnabled(false);
            c1=jb5;
        }
        else if(firstChoice==1){
             c2=jb5;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb5ActionPerformed

    private void jbb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb1ActionPerformed
          jbb1.setText(a1rand.get(0));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb1.setEnabled(false);
            c1=jbb1;
        }
        else if(firstChoice==1){
             c2=jbb1;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb1ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
       jb1.setText(a1rand.get(0));
       
        if (firstChoice==0){
            firstChoice=1;
            jb1.setEnabled(false);
            c1=jb1;
        }
        else if(firstChoice==1){
             c2=jb1;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jbb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb4ActionPerformed
       jbb4.setText(a1rand.get(3));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb4.setEnabled(false);
            c1=jbb4;
        }
        else if(firstChoice==1){
             c2=jbb4;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb4ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
       jb4.setText(a1rand.get(3));
       
        if (firstChoice==0){
            firstChoice=1;
            jb4.setEnabled(false);
            c1=jb4;
        }
        else if(firstChoice==1){
             c2=jb4;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb4ActionPerformed

    private void jbb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb5ActionPerformed
       jbb5.setText(a1rand.get(4));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb5.setEnabled(false);
            c1=jbb5;
        }
        else if(firstChoice==1){
             c2=jbb5;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb5ActionPerformed

    private void jbb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb2ActionPerformed
       jbb2.setText(a1rand.get(1));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb2.setEnabled(false);
            c1=jbb2;
        }
        else if(firstChoice==1){
             c2=jbb2;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb2ActionPerformed

    private void jbb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb9ActionPerformed
       jbb9.setText(a1rand.get(8));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb9.setEnabled(false);
            c1=jbb9;
        }
        else if(firstChoice==1){
             c2=jbb9;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb9ActionPerformed

    private void jbb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb3ActionPerformed
        jbb3.setText(a1rand.get(2));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb3.setEnabled(false);
            c1=jbb3;
        }
        else if(firstChoice==1){
             c2=jbb3;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb3ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        jb3.setText(a1rand.get(2));
       
        if (firstChoice==0){
            firstChoice=1;
            jb3.setEnabled(false);
            c1=jb3;
        }
        else if(firstChoice==1){
             c2=jb3;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb3ActionPerformed

    private void jbb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb8ActionPerformed
        jbb8.setText(a1rand.get(7));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb8.setEnabled(false);
            c1=jbb8;
        }
        else if(firstChoice==1){
             c2=jbb8;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb8ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
       jb10.setText(a1rand.get(9));
       
        if (firstChoice==0){
            firstChoice=1;
            jb10.setEnabled(false);
            c1=jb10;
        }
        else if(firstChoice==1){
             c2=jb10;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb10ActionPerformed

    private void jbb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb10ActionPerformed
        jbb10.setText(a1rand.get(9));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb10.setEnabled(false);
            c1=jbb10;
        }
        else if(firstChoice==1){
             c2=jbb10;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb10ActionPerformed

    private void jbb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb11ActionPerformed
        jbb11.setText(a1rand.get(10));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb11.setEnabled(false);
            c1=jbb11;
        }
        else if(firstChoice==1){
             c2=jbb11;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb11ActionPerformed

    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
       jb12.setText(a1rand.get(11));
       
        if (firstChoice==0){
            firstChoice=1;
            jb12.setEnabled(false);
            c1=jb12;
        }
        else if(firstChoice==1){
             c2=jb12;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jb12ActionPerformed

    private void jbb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbb12ActionPerformed
      jbb12.setText(a1rand.get(11));
       
        if (firstChoice==0){
            firstChoice=1;
            jbb12.setEnabled(false);
            c1=jbb12;
        }
        else if(firstChoice==1){
             c2=jbb12;
             if(c1.getText() == null ? c2.getText() == null : c1.getText().equals(c2.getText())){
            c1.setEnabled(false); //disables the button
            c2.setEnabled(false);
            c1.setForeground(Color.red);
            c2.setForeground(Color.red);
          
           
            iterator++;
            sco += 200;
            score.setText(Integer.toString(sco));
            c1=null;
            c2=null;
             }
             
             else if(c1.getText() == null ? c2.getText() == null : !c1.getText().equals(c2.getText())){
                Collections.shuffle(a1rand);
                
                c1.setText("");
                c2.setText("");
                c2.setEnabled(true);
                c1.setEnabled(true);
                c2=null;
                c1=null;
             }
             firstChoice=0; 
        }
    }//GEN-LAST:event_jbb12ActionPerformed

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
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giveup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbb1;
    private javax.swing.JButton jbb10;
    private javax.swing.JButton jbb11;
    private javax.swing.JButton jbb12;
    private javax.swing.JButton jbb2;
    private javax.swing.JButton jbb3;
    private javax.swing.JButton jbb4;
    private javax.swing.JButton jbb5;
    private javax.swing.JButton jbb6;
    private javax.swing.JButton jbb7;
    private javax.swing.JButton jbb8;
    private javax.swing.JButton jbb9;
    private javax.swing.JLabel monkeyAng;
    private javax.swing.JLabel rem_time;
    private javax.swing.JLabel score;
    private javax.swing.JLabel silip;
    // End of variables declaration//GEN-END:variables
}
