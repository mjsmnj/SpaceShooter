import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game extends JFrame implements ActionListener {
	
	JButton b1 = new JButton("Play");
	JPanel p =new JPanel(new FlowLayout());
	public Game(){
		setSize(1080, 650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.BLACK);
		b1.addActionListener(this);
		p.add(b1);
		getContentPane().add(p);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread(new GamePanel()).start();
	}
	public void paint(Graphics g){
		super.paint(g);
	}
	//public static void main(String [] args){ new Game();}

}
