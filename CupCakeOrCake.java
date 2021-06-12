import javax.swing.*;
import java.awt.*;
public class CupCakeOrCake{

  public static void main(String args[]){
       
    JFrame window = new JFrame();
    window.setTitle("Order Menu");      
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel label = new JLabel();
    label.setText("Please choose from the Menu");
    //label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(70,20,350,50);
    label.setFont(new Font("Verdana",Font.ITALIC,22));
    window.getContentPane().add(label);
    window.setSize(300,300);
    window.setLayout(null);
    window.setBounds(300,100,800,600);
    window.setVisible(true);
  }

} 
