/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountDown;

/**
 *
 * @author AL AMIN
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
class Countr extends JFrame
{
  public Countr()
  {
    setLocation(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final long TIME = 1800000;
    final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("mm : ss");
    final JLabel clock = new JLabel(sdf.format(new Date(TIME)),JLabel.CENTER);
    int x = 0;
    ActionListener al = new ActionListener(){
        long x = TIME - 1000;
        public void actionPerformed(ActionEvent ae){
            clock.setText(sdf.format(new Date(x)));
            x -= 1000;
        }
    };
    new javax.swing.Timer(1000, al).start();
    JPanel jp = new JPanel();
    jp.add(clock);
    getContentPane().add(jp);
    pack();
  }
  public static void main(String args[]){
      new Countr().setVisible(true);
  }
}

