
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;


/**
 * Write a description of class Calc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculator extends JFrame implements ActionListener
{
   JFrame frame = new JFrame("Calculator"); 
    
    JTextField value1 = new JTextField("0.0000000"); ; 
    
    JTextField value2 =new  JTextField("0.0000000");; 
    
    JTextField answer =new  JTextField("0.0000000");; 
  
   JButton addition = new JButton(" + "); 
    JButton subtraction = new JButton(" - " ); 
    JButton division = new JButton(" / "); 
    JButton multiplication = new JButton(" * "); 
    JButton clear = new JButton("AC"); 
    
    public Calculator()
    {
   
        
        JPanel answerPanel = new JPanel( new FlowLayout()); 
        JPanel button = new JPanel(new FlowLayout());
        
        button.add(addition); 
        addition.addActionListener(this); 
        
        button.add(subtraction); 
         subtraction.addActionListener(this); 
         
        button.add(division); 
         division.addActionListener(this); 
         
        button.add(multiplication); 
         multiplication.addActionListener(this); 
         
         button.add(clear); 
         clear.addActionListener(this); 
        
         
         answerPanel.add(value1); 
         answerPanel.add(value2); 
         answerPanel.add(answer); 
         
         getContentPane().setLayout(new BorderLayout());
         getContentPane().add("East", button); 
         
         getContentPane().add("West",answerPanel);
         pack();
         setVisible(true); 

    
}

public void actionPerformed(ActionEvent e)
{
    double v1 = Integer.parseInt(value1.getText()); 
    double v2 = Integer.parseInt(value2.getText()); 
    if( e.getSource() == addition)
  {
     answer.setText(String.valueOf(v1 + v2)) ; 
  }

  if (e.getSource() == subtraction)
  {
     answer.setText(String.valueOf(v1 - v2)) ; 
    
    }
    
  if (e.getSource() == division)
  {
     answer.setText(String.valueOf(v1 / v2)) ; 
  }

  if (e.getSource() == multiplication)
  {
    answer.setText(String.valueOf(v1 * v2)) ; 
  }

   if(e.getSource() == clear)
  {
    Calculator calc = new Calculator(); 
  }

   }


 }