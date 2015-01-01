import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class HelpWindow extends JFrame implements ActionListener{
	
	JTextArea text = new JTextArea(20 , 30);
	JButton ok = new JButton("OK!");
	JPanel panel1 = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel(new FlowLayout());
	JPanel panel3 = new JPanel(new FlowLayout());
	ImageIcon imageIcon = new ImageIcon("help.png");
	JLabel label = new JLabel();
	
	public HelpWindow(){
		super("Help!");
		setResizable(false);
		setSize(450,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		text.setText("Use :\n\tW : to move up.\n\tS : to move down.\n\tA : to move left.\n\tD : to move right.\n Use left mouse button to fire bullets.\n\n[hint] : right mouse button is your trump card.");
		text.setEditable(false);
		label.setIcon(imageIcon);
		ok.addActionListener(this);
		panel2.add(label);
		text.setBackground(getBackground());
		panel1.add(text);
		panel3.add(ok);
		add(panel2, BorderLayout.NORTH);
		add(panel1);
		add(panel3, BorderLayout.SOUTH);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
	}

}
