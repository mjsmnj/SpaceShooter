import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Verify extends JFrame implements ActionListener {
	JLabel label = new JLabel("Are you sure to exit the game?");
	JButton yes = new JButton("Yes");
	JButton no = new JButton("No");
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	public Verify() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		yes.addActionListener(this);
		no.addActionListener(this);
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		panel1.add(label);
		panel2.add(yes);
		panel2.add(no);
		add(panel1);
		add(panel2, BorderLayout.SOUTH);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == no) {
			dispose();
		} else
			System.exit(0);
	}

}