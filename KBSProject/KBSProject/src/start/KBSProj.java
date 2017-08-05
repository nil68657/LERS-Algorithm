//Author : Nilanjan Chatterjee
//ID : 800960960
//Course : Knowledge Based Systems


package start;




import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.*;
public class KBSProj {



  public static void main(String[] args) throws FileNotFoundException, IOException {

	  
	  
      
	  ActionRuleUI myFrame=new ActionRuleUI();
      
      JFrame f = new JFrame();
      f.setSize(1000, 700);
      f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      f.setVisible(true);   
     
      f.setTitle("Action Rules");
      f.getContentPane().add(myFrame).setBackground(Color.white);;
      
      

  }
  
}