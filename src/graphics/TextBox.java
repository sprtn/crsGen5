package graphics;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Logic.Strays;

@SuppressWarnings("serial")
public class TextBox extends JTextArea {

	Strays s = new Strays();
	
	TextBox() {
		Border b = BorderFactory.createLineBorder(Color.GRAY, 5);
		s.gridbagSettings(this, Frame.c, 0.0, 0, 0, 0, 3);
		this.setBorder(b);
		this.setLineWrap(true);
		this.setText("Press the button to get an insult.");
		this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	}
	
}
