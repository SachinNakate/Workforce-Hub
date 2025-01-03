package employee.management.system;


import javax.swing.*; // To set our front-end screen
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        // Using Imageicon to get image on frame
        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2 = im.getImage().getScaledInstance(1170 ,650, Image.SCALE_DEFAULT); // to scale the image
        // now we will pass i2 image into imageicons
        ImageIcon i3 = new ImageIcon(i2);
        // we can't add image to frame directly so we will use JLable to add image to the screen
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);

        // frame design
        setSize(1170 , 650);
        setLocation(200, 50);// to pop the frame at the centre
        setLayout(null); //
        setVisible(true); // by default frame visible nahi hota hai

        // we have to close the frame after 5 seconds we will use thread
        // we are closing this frame to opening the login frame
        try{
            Thread.sleep(5000);
            setVisible(false);
            new login();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static void main(String[]args){
        new Splash();
    }
}
