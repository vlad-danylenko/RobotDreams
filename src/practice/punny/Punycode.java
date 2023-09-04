package src.practice.punny;

import java.net.IDN;

public class Punycode {
    public static void main(String[] args) {
        String unicodeText = "кредит247.укр";

        try {
            String punycodeText = IDN.toASCII(unicodeText);
            System.out.println(punycodeText);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
