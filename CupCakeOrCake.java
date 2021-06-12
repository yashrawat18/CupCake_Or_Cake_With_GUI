import javax.swing.*;
import java.awt.*;
public class CupCakeOrCake{

  public static void main(String args[]){
       
    JFrame window = new JFrame();
    window.setTitle("Order Menu");      
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    ImageIcon cake = new ImageIcon("cake.jpg");
    Image scaleImage = cake.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    JLabel label = new JLabel();

    label.setIcon(new ImageIcon(scaleImage));
    
        //label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(100,150,200,200);
    //label.setFont(new Font("Verdana",Font.ITALIC,22));
    ImageIcon cupCakes = new ImageIcon("cupcakes.jpg");
    Image scaleImage2 = cupCakes.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    JLabel label2 = new JLabel();
    label2.setIcon(new ImageIcon(scaleImage2));
    label2.setBounds(475,150,200,200);

    ImageIcon bg = new ImageIcon("bg1.jpg");
    Image bgScaleImage = bg.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
     
    window.setContentPane(new JLabel((new ImageIcon(bgScaleImage))));

    window.add(label2);
    window.add(label);
    window.setSize(300,300);
    window.setLayout(null);
  
    window.setBounds(300,100,800,600);
    window.setVisible(true);
  }

} 
