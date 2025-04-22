package fikirvesahne;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedImageLabel extends JLabel {
	

	


	    private int arcWidth = 40;
	    private int arcHeight = 40;

	    public RoundedImageLabel(ImageIcon image) {
	        super(image);
	        setOpaque(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g.create();
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        Shape clip = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
	        g2.setClip(clip);
	        super.paintComponent(g2);
	        g2.dispose();
	    }

	    public void setArc(int arcWidth, int arcHeight) {
	        this.arcWidth = arcWidth;
	        this.arcHeight = arcHeight;
	        repaint();
	    }
	}


