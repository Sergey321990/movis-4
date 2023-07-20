import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsManagerTest {
    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        String[] actual = manager.findALL();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Zero() {
        FilmsManager manager = new FilmsManager();
        String[] actual = manager.findALL();
        String[] expected = {};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void Last() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        assertArrayEquals(expected, actual);
    }
}







