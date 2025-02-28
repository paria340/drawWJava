package com.example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class MakePath extends JPanel {
    private int x1, y1, x2, y2;

    public MakePath(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure proper rendering
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(new Line2D.Double(x1, y1, x2, y2));
    }
}
