package zadanie2;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        StringBuilder url = new StringBuilder("wp.pl");
        char charTab [] = new char[36];

        int quantityUrl = 5000000;
        StringBuilder [] urlsTab = new StringBuilder[quantityUrl];

        for (int i = 0; i < urlsTab.length; i++) {
            urlsTab[i] = new StringBuilder(url);
        }

        for (int i = 0; i < 10; i++) {
            int tmp = i + 48;
            charTab[i] = (char) tmp;
        }
        for (int i = 10; i < charTab.length; i++) {
            int tmp = i + 87;
            charTab[i] = (char) tmp;
        }
        Random random = new Random();

        for (int i = 0; i < quantityUrl; i++) {
            for (int j = 0; j < random.nextInt(5); j++) {
                urlsTab[i].append('/');
                for (int k = 0; k < random.nextInt(10)+1; k++) {
                    urlsTab[i].append(charTab[random.nextInt(36)]);
                }
            }
        }
        StringBuilder newUrl = new StringBuilder("wirtualnapolska.pl");
        for (int i = 0; i < urlsTab.length; i++) {
            urlsTab[i].delete(0,5);
            urlsTab[i].insert(0,newUrl);
        }

        /*for (int i = 0; i < urlsTab.length; i++) {
            System.out.println(urlsTab[i]);
        }
        */

    }
}
