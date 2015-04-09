package peashooter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author patrickjoshuasaguinsin
 */
public class Peashooter extends Frame {
    
    {addWindowListener(new WindowCloser());}
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(
             RenderingHints.KEY_ANTIALIASING,
             RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        GeneralPath gp;
        Color outline = new Color(0,90,0);
        
        //rear leaf right
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(232,405);
        gp.curveTo(239, 388, 269, 379, 289, 399);
        gp.curveTo(304, 464, 205, 462, 232, 405);
        g2.setPaint(new GradientPaint(236,406,new Color(111,149,38),285,400,new Color(66,132,0)));
        g2.fill(gp);
        g2.setColor(outline);
        g2.setStroke(new BasicStroke(4));
        g2.draw(gp);
        
        //rear leaf right crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(234,415);
        gp.quadTo(247, 404, 255, 404);
        gp.quadTo(240, 411, 237, 422);
        g2.setColor(outline);
        g2.fill(gp);
        
        //rear leaf left
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(204,405);
        gp.curveTo(204, 405, 160, 366, 132, 402);
        gp.curveTo(128, 450, 220, 442, 220, 442);
        g2.setPaint(new GradientPaint(208,428,new Color(98,145,26),135,403,new Color(66,132,0)));
        g2.fill(gp);
        g2.setColor(outline);
        g2.setStroke(new BasicStroke(4));
        g2.draw(gp);
        
        //rear leaf left crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(208,420);
        gp.quadTo(199, 403, 174, 405);
        gp.quadTo(204, 411, 212, 430);
        g2.setColor(outline);
        g2.fill(gp);
        
        //stem
        g2.setColor(outline);
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(204, 322);
        gp.quadTo(178, 384, 230, 456);
        gp.lineTo(255, 452);
        gp.quadTo(212, 394, 228, 332);
        gp.closePath();
        g2.setStroke(new BasicStroke(10));
        g2.draw(gp);
        GradientPaint darkstem = new GradientPaint(212,334,new Color(150,209,48),238,440,new Color(145,206,47));
        g2.setPaint(darkstem);
        g2.fill(gp);
        
        //stem gradient highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(202,350);
        gp.quadTo(195, 400, 233, 450);
        gp.lineTo(238, 448);
        gp.quadTo(200,398,208,352);
        gp.closePath();
        GradientPaint gpnt = new GradientPaint(200,338,new Color(234,254,117),240,450,new Color(184,231,68));
        g2.setPaint(gpnt);
        g2.fill(gp);
        g2.draw(gp);
        
        //front leaf base
        g2.setStroke(new BasicStroke(5));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(236,455);
        gp.curveTo(270, 404, 352, 414, 357, 465);
        gp.curveTo(358, 494, 251, 509, 236,455);
        //g2.setPaint(new GradientPaint(304,426,new Color(169,229,60),304,464,new Color(102,204,0)));
        Color leafbase = new Color(53,157,0);
        g2.setColor(leafbase);
        g2.fill(gp);
        g2.setColor(outline);
        g2.draw(gp);
        
        //front leaf right highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(245,455);
        gp.curveTo(275, 415, 352, 419, 357, 465);
        gp.curveTo(358, 494, 255, 500, 245,455);
        g2.setPaint(new GradientPaint(304,426,new Color(169,229,60),304,464,new Color(102,204,0)));
        g2.fill(gp);
        
        //front right leaf crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(258,433);
        gp.quadTo(298, 424, 319, 442);
        gp.quadTo(290, 426, 247, 443);
        //gp.closePath();
        g2.setColor(outline);
        g2.fill(gp);
        
        //front leaf left base
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(229, 458);
        gp.curveTo(207, 410, 130, 395, 118, 472);
        gp.curveTo(119, 503, 212, 528, 229, 458);
        //g2.setPaint(new GradientPaint(164,424,new Color(169,229,60),164,466,new Color(102,204,0)));
        g2.setColor(leafbase);
        g2.fill(gp);
        g2.setColor(outline);
        g2.draw(gp);
        
        //front leaf left highlight
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(220, 458);
        gp.curveTo(204, 426, 135, 395, 122, 472);
        gp.curveTo(122, 503, 210, 518, 220, 458);
        g2.setPaint(new GradientPaint(164,424,new Color(169,229,60),164,466,new Color(102,204,0)));
        g2.fill(gp);
        
        //front left leaf crease
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(204,431);
        gp.quadTo(175, 422, 154, 444);
        gp.quadTo(183, 425, 218, 441);
        g2.setColor(outline);
        g2.fill(gp);
        
        //neck
        g2.setColor(outline);
        g2.setStroke(new BasicStroke(8));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(188, 290);
        gp.curveTo(178, 326, 244, 352, 256, 312);
        g2.draw(gp);
        g2.setColor(new Color(51,102,0));
        gp.closePath();
        g2.fill(gp);

        //hair stem dark
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(122,104);
        gp.curveTo(92, 93, 50, 152, 92, 205);
        gp.quadTo(94, 168, 126, 155);
        gp.lineTo(125, 140);
        gp.lineTo(132, 148);
        gp.lineTo(140, 143);
        gp.lineTo(134, 136);
        gp.lineTo(144, 135);
        gp.quadTo(150, 110, 122, 104);
        g2.setColor(new Color(51,102,0));
        g2.fill(gp);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(outline);
        g2.draw(gp);
        
        //hair leaf light
        g2.setStroke(new BasicStroke(5));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(122,104);
        gp.curveTo(103, 94, 51, 136, 90, 200);
        gp.quadTo(87, 164, 97, 155);
        gp.quadTo(89, 136, 95, 128);
        gp.quadTo(96, 142, 101, 143);
        gp.quadTo(118, 105, 143, 118);
        g2.setPaint(new GradientPaint(126,112,new Color(164,227,54),81,149,new Color(102,204,0)));
        g2.fill(gp);
        g2.setColor(outline);
        g2.draw(gp);
        
        //hair stem
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(168,130);
        gp.quadTo(147, 93, 106, 105);
        gp.quadTo(133, 98, 161, 138);
        g2.setColor(new Color(163,234,49));
        g2.fill(gp);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(outline);
        g2.draw(gp);
        
        //oval head
        g2.setStroke(new BasicStroke(10));
        g2.setColor(outline);
        g2.drawOval(141, 90, 235, 219);
        g2.setColor(new Color(230,250,113));
        //g2.fillOval(141, 90, 235, 219);
        
        //head gradient fill
        GradientPaint green2light = new GradientPaint(200,150,new Color(231,254,117),350,219,new Color(147,207,47));
        g2.setPaint(green2light);
        g2.fillOval(141, 90, 235, 219);
        
        //eyes back white
        g2.setColor(Color.white);
        g2.rotate(Math.toRadians(-35));     //-35º
        g2.fillOval(105, 258, 47, 63);
        g2.fillOval(170, 288, 27, 43);
        
        //eyes black
        g2.setColor(Color.BLACK);
        g2.fillOval(105, 255, 47, 63);
        g2.fillOval(170, 285, 27, 43);
        
        //eyes reflection white
        g2.setColor(Color.white);
        g2.rotate(Math.toRadians(20));      //-15º
        g2.fillOval(200, 200, 22, 30);
        g2.fillOval(265, 210, 12, 20);
        
        //mouth
        g2.setColor(outline);
        g2.rotate(Math.toRadians(30));      //15º
        g2.setStroke(new BasicStroke(7));
        g2.drawOval(396, 25, 122, 160);
        
        //mouth fill gradient
        //g2.setColor(new Color(147,207,47));
        g2.setPaint(new GradientPaint(400,140,(new Color(147,207,47)),400,28,(new Color(230,253,106))));
        g2.fillOval(392, 28, 125, 155);
        
        //mouth fill
        g2.setColor(new Color(147,207,47));
        g2.fillOval(416, 38, 100, 140);
        
        //darkgreen mouth fill outline
        g2.setColor(outline);
        g2.fillOval(430, 50, 72, 110);
        
        //lighter green mouth fill
        g2.setColor(new Color(102,153,0));      //lighter middle green
        g2.fillOval(437, 54, 68, 102);
        
        //back to normal rotation
        g2.rotate(Math.toRadians(-15));     //0º
        //minus 60 for original coordinates
        
        //white mouth glare
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(382, 170);
        gp.quadTo(400, 140, 431, 147);
        gp.curveTo(448, 150, 458, 162, 458, 162);
        gp.quadTo(432, 136, 382, 170);
        g2.setColor(Color.WHITE);
        g2.fill(gp);
        
        //semi-white mouth glare bottom
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(411, 279);
        gp.quadTo(435, 285, 454, 258);
        gp.quadTo(446, 290, 411, 279);
        g2.setColor(new Color(216,248,103));
        g2.fill(gp);
        
        //inner black mouth outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.BLACK);
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(414, 183);
        gp.curveTo(454, 177, 442, 277, 398, 257);
        gp.curveTo(380, 219, 406, 187, 414, 183);
        gp.closePath();
        g2.fill(gp);
        
        //white head glare inner curve outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.white);
        QuadCurve2D qc = new QuadCurve2D.Double(171, 205, 178, 128, 263, 97);
        g2.draw(qc);
        
        //white head glare outer curve outline
        qc = new QuadCurve2D.Double(149, 187, 172, 104, 263, 97);
        g2.draw(qc);
        g2.drawLine(172, 205, 149, 187);    //closing line
        
        //white head glare gp
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(171, 205);
        gp.quadTo(178, 128, 263, 97);
        gp.quadTo(172, 104, 149, 187);
        gp.closePath();
        g2.fill(gp);
        
        //head shadow
        g2.setColor(new Color(147,207,47));
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(152, 224);
        gp.quadTo(210, 312, 348, 250);
        gp.curveTo(302, 344, 168, 302, 152, 224);
        gp.closePath();
        g2.fill(gp);
        
        //pea animation
        int peaX = 400, peaY = 140, peaSizeX = 0, peaSizeY = 0;
        
        try {
            Thread.sleep(1000L);
        } catch(Exception e){}
        
        //pea gradient fill
        //g2.setPaint(new GradientPaint(570,112,new Color(225,235,131),195,150,new Color(138,181,31)));
        //g2.fillOval(570, 112, 195, 150);
        
        //pea outline
        g2.setStroke(new BasicStroke(5));
        g2.setColor(outline);
        g2.drawOval(peaX, peaY, 195, 150);
        
        for(;peaX<488; peaX+=5, peaY-=5, peaSizeX+=10, peaSizeY+=8) {
            g2.setColor(Color.WHITE);
            //g2.drawOval(peaX-7, peaY-2, 200, 155);
            g2.fillOval(peaX-8, peaY-5, 205, 160);
            //g2.setPaint(new GradientPaint(570,112,new Color(225,235,131),195,150,new Color(138,181,31)));
            g2.setColor(new Color(151,202,0));
            g2.fillOval(peaX, peaY, peaSizeX, peaSizeY);    //size = 195, 150
            g2.setColor(outline);
            g2.drawOval(peaX, peaY, peaSizeX, peaSizeY);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
        
        //mouth
        g2.setColor(outline);
        g2.rotate(Math.toRadians(15));      //15º
        g2.setStroke(new BasicStroke(7));
        g2.drawOval(396, 25, 122, 160);
        
        //mouth fill gradient
        //g2.setColor(new Color(147,207,47));
        g2.setPaint(new GradientPaint(400,140,(new Color(147,207,47)),400,28,(new Color(230,253,106))));
        g2.fillOval(392, 28, 125, 155);
        
        //mouth fill
        g2.setColor(new Color(147,207,47));
        g2.fillOval(416, 38, 100, 140);
        
        //darkgreen mouth fill outline
        g2.setColor(outline);
        g2.fillOval(430, 50, 72, 110);
        
        //lighter green mouth fill
        g2.setColor(new Color(102,153,0));      //lighter middle green
        g2.fillOval(437, 54, 68, 102);
        
        //back to normal rotation
        g2.rotate(Math.toRadians(-15));     //0º
        //minus 60 for original coordinates
        
        //white mouth glare
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(382, 170);
        gp.quadTo(400, 140, 431, 147);
        gp.curveTo(448, 150, 458, 162, 458, 162);
        gp.quadTo(432, 136, 382, 170);
        g2.setColor(Color.WHITE);
        g2.fill(gp);
        
        //semi-white mouth glare bottom
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(411, 279);
        gp.quadTo(435, 285, 454, 258);
        gp.quadTo(446, 290, 411, 279);
        g2.setColor(new Color(216,248,103));
        g2.fill(gp);
        
        //inner black mouth outline
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.BLACK);
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(414, 183);
        gp.curveTo(454, 177, 442, 277, 398, 257);
        gp.curveTo(380, 219, 406, 187, 414, 183);
        gp.closePath();
        g2.fill(gp);
        
        g2.setStroke(new BasicStroke(5));
        for(;peaX<810;peaX+=5) {
            g2.setColor(Color.WHITE);
            //g2.drawOval(peaX-7, peaY-2, 200, 155);
            g2.fillOval(peaX-8, peaY-5, 205, 160);
            //g2.setPaint(new GradientPaint(570,112,new Color(225,235,131),195,150,new Color(138,181,31)));
            g2.setColor(new Color(151,202,0));
            g2.fillOval(peaX, peaY, 195, 150);
            g2.setColor(outline);
            g2.drawOval(peaX, peaY, 195, 150);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            repaint();
        }
    }

    public static void main(String[] args) {
        Peashooter peaFrame = new Peashooter();
        peaFrame.setTitle("Saguinsin, Patrick Joshua - Peashooter from Plants vs Zombies");
        peaFrame.setSize(800,600);
        peaFrame.setBackground(Color.WHITE);
        peaFrame.setLocationRelativeTo(null);
        peaFrame.setVisible(true);
    }
    
}

class WindowCloser extends WindowAdapter {
    public void WindowClosing(WindowEvent e) {
        System.exit(0);
    }
}