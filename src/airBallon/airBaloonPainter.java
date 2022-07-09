package airBallon;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class airBaloonPainter extends Frame{
	public static void main(String[] args) {
		airBaloonPainter PandelonPainter = new airBaloonPainter("MyHotAirBaloon");
		PandelonPainter.setSize(600, 700);
		PandelonPainter.setVisible(true);
	}
	airBaloonPainter(String title){
		super(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		int baloonX = 40, baloonY = 40, baloonDiameter = 98;
		int basketWidth = 50, basketHeight = 40;

		//*Counting variables*/
		/*if (baloonDiameter % 10 != 0) {
			baloonDiameter = (baloonDiameter + (10 - (baloonDiameter % 10)));
		}
		int basketWidth = (baloonDiameter / 5);*/

		int basketX = baloonX + ((baloonDiameter - basketWidth) / 2),
		basketY = (baloonY + baloonDiameter) + (baloonDiameter / 2);

		int ropesY1 = (baloonY + (baloonDiameter / 2))/* - ((baloonDiameter / 10) * (1))*/,

		leftRopeX1 = baloonX/* + ((baloonDiameter / 5) * (1))*/,
		rightRopeX1 = (baloonX + baloonDiameter)/* - ((baloonDiameter / 5) * (1))*/,
		
		ropesY2 = basketY,
		
		leftRopeX2 = basketX,
		rightRopeX2 = basketX + basketWidth;

		//*Project*/
		g.drawLine(leftRopeX1, ropesY1, leftRopeX2, ropesY2);
		g.drawLine(rightRopeX1, ropesY1, rightRopeX2, ropesY2);
		g.drawRect(basketX, basketY, basketWidth, basketHeight);
		g.setColor(Color.white);
		g.fillOval(baloonX, baloonY, baloonDiameter, baloonDiameter);
		g.setColor(Color.black);
		g.drawOval(baloonX, baloonY, baloonDiameter, baloonDiameter);
	}
}
