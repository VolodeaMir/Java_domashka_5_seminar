// 2 Вариант дз

// Дз на закрепление :
// 1) Подсчитать количество вхождения каждого слова
// Пример:
// Россия идет вперед всей планеты. Планета — это не Россия.
// toLoverCase().
// (Усложнение - игнорировать пунктуацию)*

import java.util.HashMap;
import java.util.Map;

public class home_work_03 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";

        // Удаление пунктуации и приведение к нижнему регистру
        String cleanedText = text.replaceAll("\\p{Punct}", "").toLowerCase();

        // Разделение текста на слова
        String[] words = cleanedText.split("\\s+");

        // Подсчет количества вхождений слов
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
