package zadanie1;

public class App {
    public static void main(String[] args) {
        StringBuilder urlTab [] = new StringBuilder[5];
        urlTab[0] = new StringBuilder("http://kurczaki.pl/blog");
        urlTab[1] = new StringBuilder("http://kurczaki.pl/blog/kura-w-miescie");
        urlTab[2] = new StringBuilder("http://kurczaki.pl");
        urlTab[3] = new StringBuilder("http://kurczaki.pl/blog/kurki/pieczone");
        urlTab[4] = new StringBuilder("http://kurczaki.pl/blog/kura-w-rosole");
        String newPartUrl = "naukajavy";
        System.out.println("old urls:");
        for (int i = 0; i < urlTab.length; i++) {
            System.out.println(urlTab[i]);
        }
        System.out.println();

        for (int i = 0; i < urlTab.length; i++) {
            urlTab[i].delete(7,15);
            urlTab[i].insert(7,newPartUrl);
        }

        System.out.println("new urls");
        for (int i = 0; i < urlTab.length; i++) {
            System.out.println(urlTab[i]);
        }
    }
}
