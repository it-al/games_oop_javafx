package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertEquals(bishopBlack.position(), Cell.A2);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Assert.assertThat(bishopBlack.copy(Cell.A3).equals(new BishopBlack(Cell.A3)), is(true));
    }

    @Test
    public void whenNotIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Assert.assertThat(bishopBlack.isDiagonal(Cell.A2, Cell.C1), is(false));
    }

    @Test
    public void whenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Assert.assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.G5), is(true));
    }
}


