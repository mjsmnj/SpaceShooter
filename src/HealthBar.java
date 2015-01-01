import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class HealthBar {
	BufferedImage image1;
	BufferedImage image2;
	BufferedImage image;
	File fImage1 = new File("heart1.png");
	File fImage2 = new File("heart2.png");
	int x;
	
	boolean health = false;
	
	public HealthBar(){
		try{
			image1 = ImageIO.read(fImage1);
			image2 = ImageIO.read(fImage2);
		}catch(Exception e){}
		if (image1 == null)
			image1.createGraphics();
		if (image2 == null)
			image2.createGraphics();
		image = image1;
		
	}
	
	public BufferedImage getImage(){
		return image;
		}
	public void setImage(){
		image = image2;
	}
	public void setHealth(){
		image = image1;
	}
	
}
