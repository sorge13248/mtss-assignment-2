package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanPrinterTest {
    @Test
    public void testAsciiArt_with777() {
        assertEquals(" _____    _____   _____   _       __   __ __   __ __      __  _____   _____  \n|  __ \\  /  ___| /  ___| | |      \\ \\ / / \\ \\ / / \\ \\    / / |_   _| |_   _| \n| |  | | | |     | |     | |       \\ V /   \\ V /   \\ \\  / /    | |     | |   \n| |  | | | |     | |     | |        > <     > <     \\ \\/ /     | |     | |   \n| |__| | | |___  | |___  | |____   / . \\   / . \\     \\  /     _| |_   _| |_  \n|_____/  \\_____| \\_____| |______| /_/ \\_\\ /_/ \\_\\     \\/     |_____| |_____| \n", RomanPrinter.print(777));
    }

    @Test
    public void testAsciiArt_with126() {
        assertEquals(" _____  __   __ __   __ __      __  _____  \n/  ___| \\ \\ / / \\ \\ / / \\ \\    / / |_   _| \n| |      \\ V /   \\ V /   \\ \\  / /    | |   \n| |       > <     > <     \\ \\/ /     | |   \n| |___   / . \\   / . \\     \\  /     _| |_  \n\\_____| /_/ \\_\\ /_/ \\_\\     \\/     |_____| \n", RomanPrinter.print(126));
    }

    @Test
    public void testAsciiArt_with1() {
        assertEquals(" _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| \n", RomanPrinter.print(1));
    }

    @Test
    public void testAsciiArt_with1000() {
        assertEquals(" __  __  \n|  \\/  | \n| \\  / | \n| |\\/| | \n| |  | | \n|_|  |_| \n", RomanPrinter.print(1000));
    }

    @Test
    public void testAsciiArt_with834() {
        assertEquals(" _____    _____   _____   _____  __   __ __   __ __   __  _____  __      __ \n|  __ \\  /  ___| /  ___| /  ___| \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\    / / \n| |  | | | |     | |     | |      \\ V /   \\ V /   \\ V /    | |    \\ \\  / /  \n| |  | | | |     | |     | |       > <     > <     > <     | |     \\ \\/ /   \n| |__| | | |___  | |___  | |___   / . \\   / . \\   / . \\   _| |_     \\  /    \n|_____/  \\_____| \\_____| \\_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|     \\/     \n", RomanPrinter.print(834));
    }

    @Test
    public void testAsciiArt_with563() {
        assertEquals(" _____    _       __   __  _____   _____   _____  \n|  __ \\  | |      \\ \\ / / |_   _| |_   _| |_   _| \n| |  | | | |       \\ V /    | |     | |     | |   \n| |  | | | |        > <     | |     | |     | |   \n| |__| | | |____   / . \\   _| |_   _| |_   _| |_  \n|_____/  |______| /_/ \\_\\ |_____| |_____| |_____| \n", RomanPrinter.print(563));
    }

    @Test
    public void testAsciiArt_with436() {
        assertEquals(" _____   _____   __   __ __   __ __   __ __      __  _____  \n/  ___| |  __ \\  \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _| \n| |     | |  | |  \\ V /   \\ V /   \\ V /   \\ \\  / /    | |   \n| |     | |  | |   > <     > <     > <     \\ \\/ /     | |   \n| |___  | |__| |  / . \\   / . \\   / . \\     \\  /     _| |_  \n\\_____| |_____/  /_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____| \n", RomanPrinter.print(436));
    }

    @Test
    public void testAsciiArt_with67() {
        assertEquals(" _       __   __ __      __  _____   _____  \n| |      \\ \\ / / \\ \\    / / |_   _| |_   _| \n| |       \\ V /   \\ \\  / /    | |     | |   \n| |        > <     \\ \\/ /     | |     | |   \n| |____   / . \\     \\  /     _| |_   _| |_  \n|______| /_/ \\_\\     \\/     |_____| |_____| \n", RomanPrinter.print(67));
    }

    @Test
    public void testAsciiArt_with56() {
        assertEquals(" _       __      __  _____  \n| |      \\ \\    / / |_   _| \n| |       \\ \\  / /    | |   \n| |        \\ \\/ /     | |   \n| |____     \\  /     _| |_  \n|______|     \\/     |_____| \n", RomanPrinter.print(56));
    }
}
