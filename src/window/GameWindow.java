package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Игровое окно
 */
public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;
    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");
    Map map;
    SettingsWindow settings;
    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        map = new Map();
        settings = new SettingsWindow(this); // вызов стартового окна.

        btnExit.addActionListener(new ActionListener() { // добавление нового слушателя действий.
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });



        JPanel panBottom = new JPanel(new GridLayout(1,2)); // GridLayout(1,2) - разбивает компоновщик на сетку (1 х 2) здесь.
        // panBottom - это панель двух кнопок: btnStart и btnExit.
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH); // BorderLayout - компоновщик, установит панель кнопок GridLayout(1,2) внизу окна.
        add(map);
        setVisible(true);
    }

    public void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
        map.startNewGame(mode, fSzX, fSzY, wLen);
    }
}
