import javax.swing.*;

public class TicTacToeTileBtn extends JButton
{
    private int row;
    private int col;

    public TicTacToeTileBtn(int row, int col)
    {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }
}
