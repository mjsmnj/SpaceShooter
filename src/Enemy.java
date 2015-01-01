import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Enemy {
	BufferedImage image;
	BufferedImage image1;

	File fImage = new File("enemy1.png");
	File fImage1 = new File("enemy.png");
	int x;
	int y;
	boolean isAlive = true;
	double theta;
	AffineTransform at = new AffineTransform();

	public Enemy() {
		try {
			image = ImageIO.read(fImage);
		} catch (Exception e) {
		}
		if (image == null)
			image.createGraphics();
		setLocation();
	}

	public Enemy(int i) {
		try {
			image = ImageIO.read(fImage1);
		} catch (Exception e) {
		}
		if (image == null)
			image.createGraphics();

		setLocation();
	}

	public BufferedImage getImage() {
		return image;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, image.getWidth() - 5, image.getHeight() - 5);
	}

	public void draw(Graphics2D g2d) {
		at.setToIdentity();
		at.rotate(theta, x + 50, y + 40);
		at.translate(x, y);
		g2d.drawImage(image, at, null);
	}

	public void setLocation() {
		int i, j, n, m;
		i = (int)(Math.random()*2 +1);
		j = (int)(Math.random()*2 +1);
		if(i == 1) x = (int)(Math.random()*220 + 1);
		else x = (int)(Math.random()*220 + 811) ;
		if(j == 1) y = (int)(Math.random()*115 + 1);
		else y = (int)(Math.random()*115 + 496) ;
		
		
//		n = ((int) (Math.random() * 245));
//		m = ((int) (Math.random() * 140));
//		i = ((int) (Math.random() * 4)) + 1;
//		j = ((int) (Math.random() * 4)) + 1;
//
//		if (i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2 || i == 3
//				&& j == 3) {
//
//			int l = ((int) (Math.random()));
//
//			if (l == 0) {
//
//				l = ((int) (Math.random()));
//				if (l == 0)
//					i = 1;
//				else
//					i = 4;
//
//			} else {
//
//				l = ((int) (Math.random()));
//				if (l == 0)
//					j = 1;
//				else
//					j = 4;
//
//			}
//		}
//
//		x = n * i;
//		y = m * j;
	}

}
