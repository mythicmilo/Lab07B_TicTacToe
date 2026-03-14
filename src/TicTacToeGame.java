import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TicTacToeGame extends JFrame
{
    JPanel mainPnl, boardPnl, ctrlPnl;
    JButton quitBtn;

    public TicTacToeGame()
    {
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());
        add(mainPnl);

        setTitle("Tic Tac Toe Game");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        boardPnl = new JPanel();
        boardPnl.setLayout(new GridLayout(3, 3));
        TicTacToeBoard board = new TicTacToeBoard(boardPnl);
        mainPnl.add(boardPnl, BorderLayout.CENTER);
        createControlPanel();
    }

    public void createControlPanel()
    {
        ctrlPnl = new JPanel();
        quitBtn = new JButton("Quit");
        quitBtn.addActionListener((ActionEvent e) -> {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        });
        ctrlPnl.add(quitBtn);
        mainPnl.add(ctrlPnl, BorderLayout.SOUTH);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new TicTacToeGame());
    }
}
