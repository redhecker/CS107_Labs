package Lab13;

import Lab11.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCircle extends JFrame {
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public ControlCircle() {
		JPanel panel = new JPanel(); // Use the panel to group buttons
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER); // Add canvas to center
		this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame

		// TODO: register listeners to the buttons
		jbtEnlarge.addActionListener(new Listener(1,canvas));
		jbtShrink.addActionListener(new Listener(2,canvas));
		
	}

	/** Main method */
	public static void main(String[] args) {
		JFrame frame = new ControlCircle();
		frame.setTitle("ControlCircle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		frame.setVisible(true);
	}

	class Listener implements ActionListener {
		private int x;
		private CirclePanel canvas;
		Listener(int x,CirclePanel canvas){
			this.x = x;
			this.canvas = canvas;
		}
		public void actionPerformed(ActionEvent e) {
			// TODO: respond to enlarge or shrink button click events
			if(x==1){
				canvas.enlarge();
			}
			else if(x==2){
				canvas.shrink();
			}
		}
	}
}

class CirclePanel extends JPanel {
	private int radius = 50; // Default circle radius

	/** Enlarge the circle */
	public void enlarge() {
		radius = (int)(radius * 1.1);
		this.repaint();
		
	}

	/** Enlarge the circle */
	public void shrink() {
		radius = (int)(radius * 0.9);
		this.repaint();
	}

	/** Repaint the circle */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawOval(this.getWidth()/2-radius, this.getHeight()/2-radius, 2 * radius, 2 * radius);
	}
}
