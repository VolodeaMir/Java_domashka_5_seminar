
// 2) Подсчитать количество искомого слова, через map (наполнением значение,
// где искомое слово будет являться ключом), вносить все слова не нужно

import java.util.HashMap;
import java.util.Map;

public class home_work_04 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String searchWord = "Россия";

        // Удаление пунктуации и приведение к нижнему регистру
        String cleanedText = text.replaceAll("\\p{Punct}", "").toLowerCase();

        // Разделение текста на слова
        String[] words = cleanedText.split("\\s+");

        // Подсчет количества каждого слова с использованием Map
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Получение количества искомого слова из Map
        int wordCount = wordCountMap.getOrDefault(searchWord.toLowerCase(), 0);

        // Вывод результата
        System.out.println(searchWord + " - " + wordCount);
    }
}
