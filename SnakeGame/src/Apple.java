import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


public class Apple extends Fruit{

	Image ImageOfApple = new ImageIcon("Resources/Images/Cartoon Apple.png").getImage();
	
	private static int value = 3;
	
	public Apple(){
		fruitType = "Apple";
	}
	
	
	public void render(Graphics g){
		if(spawned = true){
		//g.setColor(Color.red);
		//g.fill3DRect(x, y, width, height, true);
			g.drawImage(ImageOfApple, this.x, this.y, 10, 10, null);
		}
	}
	
	public int getValue(){
		return value;
	}
}
