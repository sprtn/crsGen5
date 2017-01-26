package Logic;

import java.awt.GridBagConstraints;

import graphics.TextBox;

public class Strays {

	public void gridbagSettings(TextBox textBox, GridBagConstraints c, double wx, int gx, int gy, int iy, int gw) {
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = wx;
		c.gridx = gx;
		c.gridy = gy;
		c.ipady = iy;
		c.gridwidth = gw;
	}

	

}
