package com.raven.swing;

import com.raven.models.Ghe;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ButtonGhe extends JButton {
    private Ghe ghe;
    public ButtonGhe(Ghe ghe) {
        this.ghe = ghe;
                //  Init Color

        setColor(new Color(220, 50, 55));
        colorOver = new Color(220, 50, 55, 180);
        colorClick = new Color(255, 165, 0);
        borderColor = new Color(0, 0, 0, 0);
        
        setContentAreaFilled(false);
        //  Add event mouse
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent me) {
//                    setBackground(colorOver);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent me) {
//                if (clicked == false)
//                    setBackground(color);
//                else setBackground(colorClick);
//            }
//
//            @Override
//            public void mousePressed(MouseEvent me) {
//                if (clicked == false) { 
//                    setBackground(colorClick);
//                    clicked = true;
//                }
//                else {
//                    setBackground(new Color(220, 50, 55));
//                    clicked = false;
//                }
//            }
//
////            @Override
////            public void mouseReleased(MouseEvent me) {
////                // Maintain clicked color even if mouse exits the button
////                clicked = false;
////                setBackground(clicked ? colorClick : color);
////            }
//        });
    }
    public Ghe getGhe() {
        return ghe;
    }
    public void setText() {
        super.setText(ghe.getIdGhe()+"");
    }
      public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isOdered() {
        return odered;
    }

    public void setOdered(boolean odered) {
        this.odered = odered;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public ButtonGhe() {
        //  Init Color

        setColor(new Color(220, 50, 55));
        colorOver = new Color(220, 50, 55, 180);
        colorClick = new Color(255, 165, 0);
        borderColor = new Color(0, 0, 0, 0);
        
        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                    setBackground(colorOver);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (clicked == false)
                    setBackground(color);
                else setBackground(colorClick);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (clicked == false) { 
                    setBackground(colorClick);
                    clicked = true;
                }
                else {
                    setBackground(new Color(220, 50, 55));
                    clicked = false;
                }
            }

//            @Override
//            public void mouseReleased(MouseEvent me) {
//                // Maintain clicked color even if mouse exits the button
//                clicked = false;
//                setBackground(clicked ? colorClick : color);
//            }
        });
    }

  

    private boolean clicked = false;
    private boolean odered = false;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //  Border set 2 Pix
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}