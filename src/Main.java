import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int boardWith = 600;
        int boardHeight = boardWith;

        //Set values for frame
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWith, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GameSnake game = new GameSnake(boardHeight, boardWith);
        frame.add(game);
        frame.pack();
        game.requestFocus();


    }
}