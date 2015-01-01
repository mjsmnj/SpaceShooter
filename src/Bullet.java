import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Bullet {
	BufferedImage image;
	File fImage = new File("bullet2.png");
	File fImage1 = new File("bullet3.png");
	int x;
	int y;
	boolean fired = false;
	double theta;
	double cos;
	double sin;
	
	public Bullet(int x, int y , double theta){
		try{
			image = ImageIO.read(fImage);
		}catch(Exception e){}
		if (image == null)
			image.createGraphics();
		
		this.x = x;
		this.y = y;
		this.theta = theta;
	}
	public Bullet(int i){
		try{
			image = ImageIO.read(fImage1);
		}catch(Exception e){}
		if (image == null)
			image.createGraphics();
	}
	
	public BufferedImage getImage(){return image;}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,image.getWidth()  , image.getHeight() );
	}
	
}
