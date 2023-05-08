package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void testConvertNumber1()
    {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertNumber2()
    {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvertNumber3()
    {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertNumber4()
    {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertNumber5()
    {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertNumber6()
    {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertNumber7()
    {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertNumber8()
    {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvertNumber9()
    {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertNumber10()
    {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertNumber14()
    {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvertNumber18()
    {
        assertEquals("XVIII", IntegerToRoman.convert(18));
    }

    @Test
    public void testConvertNumber21()
    {
        assertEquals("XXI", IntegerToRoman.convert(21));
    }

    @Test
    public void testConvertNumber39()
    {
        assertEquals("XXXIX", IntegerToRoman.convert(39));
    }

    @Test
    public void testConvertNumber63()
    {
        assertEquals("LXIII", IntegerToRoman.convert(63));
    }

    @Test
    public void testConvertNumber78()
    {
        assertEquals("LXXVIII", IntegerToRoman.convert(78));
    }

    @Test
    public void testConvertNumber99()
    {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvertNumber100()
    {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertNumber103()
    {
        assertEquals("CIII", IntegerToRoman.convert(103));
    }

    @Test
    public void testConvertNumber346()
    {
        assertEquals("CCCXLVI", IntegerToRoman.convert(346));
    }

    @Test
    public void testConvertNumber492()
    {
        assertEquals("CDXCII", IntegerToRoman.convert(492));
    }

    @Test
    public void testConvertNumber579()
    {
        assertEquals("DLXXIX", IntegerToRoman.convert(579));
    }

    @Test
    public void testConvertNumber666()
    {
        assertEquals("DCLXVI", IntegerToRoman.convert(666));
    }

    @Test
    public void testConvertNumber777()
    {
        assertEquals("DCCLXXVII", IntegerToRoman.convert(777));
    }

    @Test
    public void testConvertNumber799()
    {
        assertEquals("DCCXCIX", IntegerToRoman.convert(799));
    }

    @Test
    public void testConvertNumber816()
    {
        assertEquals("DCCCXVI", IntegerToRoman.convert(816));
    }

    @Test
    public void testConvertNumber888()
    {
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
    }

    @Test
    public void testConvertNumber987()
    {
        assertEquals("CMLXXXVII", IntegerToRoman.convert(987));
    }

    @Test
    public void testConvertNumber1217()
    {
        assertEquals("MCCXVII", IntegerToRoman.convert(1217));
    }
}
