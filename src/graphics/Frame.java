package graphics;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame{
	
	static GridBagConstraints c = new GridBagConstraints();
	TextBox txt = new TextBox();

	public Frame () {
		this.settings();
		this.add(txt);
	}

	private void settings() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		this.setResizable(false);
		this.setBackground(Color.gray);
		this.pack();
		this.setSize(500, 125);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
