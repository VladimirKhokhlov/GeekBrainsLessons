package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ru.geekbrains.lesson8.TicTacToeGraphic.*;

public class Gui {

    static class SimpleGUI extends JFrame {

        public static final String DRAW_X = "DRAM_X";
        public static final String DRAW_O = "DRAM_O";
        private static final JButton[][] jb = new JButton[SIZE][SIZE];

        public SimpleGUI() {
            setSize(800, 900);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            setLayout(new GridLayout(getSIZE(), getSIZE()));
            for (int row = 0; row < SIZE; row ++) {
                for (int col = 0; col < SIZE; col ++ ) {
                    jb[row][col] = new JButton();
                    jb[row][col].add(createButton());
                }
            }


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
                        graphics.drawOval(0, 0, getWidth(), getWidth());
                        graphics.setColor(Color.RED);
                        graphics.fillOval(0, 0, getWidth(), getWidth());
                    } else {
                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.setStroke(new BasicStroke(10));
                        g2d.setColor(Color.BLUE);
                        g2d.drawLine(0, 0, this.getWidth(), this.getHeight());
                        g2d.drawLine(this.getWidth(), 0, 0, this.getHeight());
                    }
            while (true) {
                humanTurn();
                if (checkEndGame(DOT_X)) {
                    printMap();
                    break;
                }

                computerTurn();
                printMap();
                if (checkEndGame(DOT_O)) {
                    printMap();
                    break;
                }
            }

                }
            };
        }
    }
}

