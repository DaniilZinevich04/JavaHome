package Game;

import javax.swing.*;

public class GameMain {
    public static class MainWindow extends JFrame {
        Game A = new Game();
     //   Game.GameMain.GameField a = new GameField();


        public MainWindow(){
            setTitle("Змейка");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(320,345);
            setLocation(400,400);
            add(new Game.GameField());
            setVisible(true);
        }

        public void setTitle(String змейка) {
        }

        public static void main(String[] args) {
            MainWindow mw = new MainWindow();
        }

        private class GameField extends GameMain.GameField {
        }
    }

    private static class GameField {
    }
}
