// 2) Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class home_work_02 {
    public static void main(String[] args) {
        String[] employees = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений имен
        for (String employee : employees) {
            String name = getFirstName(employee);
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Сортировка по убыванию популярности
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        nameCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        // Вывод повторяющихся имен с количеством повторений
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static String getFirstName(String fullName) {
        return fullName.split(" ")[0];
    }
}
