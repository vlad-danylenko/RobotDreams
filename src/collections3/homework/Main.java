package src.collections3.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово українською мовою для перекладу: "); // cлова: Дякую, сонце, кошеня, вода, мама, відпочинок, книга, радість, птах, здоровʼя
        System.out.println(getTranslation(scanner.nextLine().toLowerCase()));
    }

    public static String getTranslation (String word) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("дякую","English: Thank you!, Japanese: ありがとう (Arigatou), German: Danke");
        dictionary.put("сонце","English: Sun, Japanese: 太陽 (Taiyou), German: Sonne");
        dictionary.put("кошеня","English: Kitten, Japanese: 子猫 (Koneko), German: Kätzchen");
        dictionary.put("вода","English: Water, Japanese: 水 (Mizu), German: Wasser");
        dictionary.put("мама","English: Mom/Mother, Japanese: お母さん (Okaasan), German: Mutter");
        dictionary.put("відпочинок","English: Rest, Japanese: 休息 (Kyūsoku), German: Erholung");
        dictionary.put("книга","English: Book, Japanese: 本 (Hon), German: Buch");
        dictionary.put("радість","English: Joy, Japanese: 喜び (Yorokobi), German: Freude");
        dictionary.put("птах","English: Bird, Japanese: 鳥 (Tori), German: Vogel");
        dictionary.put("здоровʼя","English: Health, Japanese: 健康 (Kenkou), German: Gesundheit");

        if (dictionary.get(word) == null) {
            return "Переклад не знайдено";
        }
        return dictionary.get(word);

    }
}
