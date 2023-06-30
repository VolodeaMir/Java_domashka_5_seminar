// 1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
// Пример:
// Россия идет вперед всей планеты. Планета — это не Россия.
// Запрос: Россия
// Ответ: Россия - 2
// toLoverCase().
// (Усложнение - игнорировать пунктуацию)

import java.util.HashMap;
import java.util.Map;

public class home_work_01 {
    public static void main(String[] args) {
        String sentence = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String searchWord = "Россия";

        int wordCount = countWordOccurrences(sentence, searchWord);
        System.out.println(searchWord + " - " + wordCount);
    }

    private static int countWordOccurrences(String sentence, String searchWord) {
        // Игнорирование регистра и пунктуации
        sentence = sentence.toLowerCase().replaceAll("\\p{Punct}", "");

        Map<String, Integer> wordMap = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        return wordMap.getOrDefault(searchWord.toLowerCase(), 0);
    }
}
