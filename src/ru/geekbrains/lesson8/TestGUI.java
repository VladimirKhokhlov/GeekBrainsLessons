package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {

static class SimpleGUI extends JFrame {

    public static final String DRAW_X = "DRAM_X";
    public static final String DRAW_O = "DRAM_O";

    public SimpleGUI() {
        setSize(800, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 3));
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());
        add(createButton());

        setVisible(true);
    }

    private JButton createButton() {
        return new JButton() {

            {
                setActionCommand(DRAW_O);
                addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String action = getActionCommand().equals(DRAW_O) ? DRAW_X : DRAW_O;
                        setActionCommand(action);
                    }
                });
            }

            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                if (getActionCommand().equals(DRAW_O)) {
                    graphics.drawOval(0, this.getHeight() / 4, getWidth(), getWidth());
                    graphics.setColor(Color.RED);
                    graphics.fillOval(0, this.getHeight() / 4, getWidth(), getWidth());
                } else {
                    Graphics2D g2d = (Graphics2D) graphics;
                    g2d.setStroke(new BasicStroke(10));
                    g2d.setColor(Color.BLUE);
                    g2d.drawLine(0, 0, this.getWidth(), this.getHeight());
                    g2d.drawLine(this.getWidth(), 0, 0, this.getHeight());
                }
            }
        };
    }
}

    public static void main(String[] args){
        new SimpleGUI();
    }

}
