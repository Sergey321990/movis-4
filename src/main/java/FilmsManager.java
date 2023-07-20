public class FilmsManager {
    private final int limit;
    private String[] Films = new String[0];

    public FilmsManager() {

        this.limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public String[] findALL() {
        return Films;

    }

    public void add(String films) {
        String[] tmp = new String[Films.length + 1];
        System.arraycopy(Films, 0, tmp, 0, Films.length);
        tmp[tmp.length - 1] = films;
        this.Films = tmp;
    }

    public String[] findLast() {
        int resultLength = Math.min(Films.length, limit);
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Films[Films.length - 1 - i];
        }
        return tmp;
    }
}








