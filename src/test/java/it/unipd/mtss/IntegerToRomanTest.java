package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void testConvertNumber_with1()
    {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertNumber_with2()
    {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvertNumber_with3()
    {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertNumber_with4()
    {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertNumber_with5()
    {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertNumber_with6()
    {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertNumber_with7()
    {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertNumber_with8()
    {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvertNumber_with9()
    {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertNumber_with10()
    {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertNumber_with14()
    {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvertNumber_with18()
    {
        assertEquals("XVIII", IntegerToRoman.convert(18));
    }

    @Test
    public void testConvertNumber_with21()
    {
        assertEquals("XXI", IntegerToRoman.convert(21));
    }

    @Test
    public void testConvertNumber_with39()
    {
        assertEquals("XXXIX", IntegerToRoman.convert(39));
    }

    @Test
    public void testConvertNumber_with63()
    {
        assertEquals("LXIII", IntegerToRoman.convert(63));
    }

    @Test
    public void testConvertNumber_with78()
    {
        assertEquals("LXXVIII", IntegerToRoman.convert(78));
    }

    @Test
    public void testConvertNumber_with99()
    {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvertNumber_with100()
    {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertNumber_with103()
    {
        assertEquals("CIII", IntegerToRoman.convert(103));
    }

    @Test
    public void testConvertNumber_with346()
    {
        assertEquals("CCCXLVI", IntegerToRoman.convert(346));
    }

    @Test
    public void testConvertNumber_with492()
    {
        assertEquals("CDXCII", IntegerToRoman.convert(492));
    }

    @Test
    public void testConvertNumber_with579()
    {
        assertEquals("DLXXIX", IntegerToRoman.convert(579));
    }

    @Test
    public void testConvertNumber_with666()
    {
        assertEquals("DCLXVI", IntegerToRoman.convert(666));
    }

    @Test
    public void testConvertNumber_with777()
    {
        assertEquals("DCCLXXVII", IntegerToRoman.convert(777));
    }

    @Test
    public void testConvertNumber_with799()
    {
        assertEquals("DCCXCIX", IntegerToRoman.convert(799));
    }

    @Test
    public void testConvertNumber_with816()
    {
        assertEquals("DCCCXVI", IntegerToRoman.convert(816));
    }

    @Test
    public void testConvertNumber_with888()
    {
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
    }

    @Test
    public void testConvertNumber_with987()
    {
        assertEquals("CMLXXXVII", IntegerToRoman.convert(987));
    }

    @Test
    public void testConvertNumber_with1217()
    {
        assertEquals("MCCXVII", IntegerToRoman.convert(1217));
    }
}
