package window;

import javax.swing.*;
import java.awt.event.*;

/**
 * Стартовое окно
 */
public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGTH = 230;
    private static final int WINDOW_WIDTH = 350;

    JButton btnStart = new JButton("Start new game");
    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGTH);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                gameWindow.startNewGame(0, 3, 3, 3);
                setVisible(false);
            }

        });
        add(btnStart);
    }
}
