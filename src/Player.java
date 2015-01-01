import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Player {
	BufferedImage image;
	File fImage = new File("player.png");
	int x = 490,
		y = 290;
	boolean isAlive = true;
	AffineTransform at = new AffineTransform();
	
	
	public Player(){
		try{
			image = ImageIO.read(fImage);
		}catch(Exception e){}
		if (image == null)
			image.createGraphics();
	}
	
	public BufferedImage getImage(){return image;}
	
	public Rectangle getBounds() {
		return new Rectangle(x + 20,y + 20,image.getWidth() -20 , image.getHeight() -20);
	}
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public void draw(Graphics2D g2d, double theta){
		at.setToIdentity();
		at.rotate(theta, x + 50, y + 40);
		at.translate(x, y);
		g2d.drawImage(image, at, null);
	}
}
