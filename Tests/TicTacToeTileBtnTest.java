import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTileBtnTest
{
    TicTacToeTileBtn t1;

    @BeforeEach
    void setUp()
    {
        t1 = new TicTacToeTileBtn(1, 1);
    }

    @Test
    void getRow()
    {
        assertEquals(1, t1.getRow());
    }

    @Test
    void getCol()
    {
        assertEquals(1, t1.getCol());
    }
}