package Lesson_2;

import java.util.HashMap;
import java.util.Map;

public class task_1 {

    public static void task1() {
        Map<String, String> argum = new HashMap<String, String>();
        argum.put("name", "Ivanov");
        argum.put("country", "Russia");
        argum.put("city", "Moscow");
        argum.put("age", null);
        System.out.println(args(argum));
    }

    public static String args(Map<String, String> argum) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : argum.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();

    }
}