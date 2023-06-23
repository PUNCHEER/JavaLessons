package Lesson_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import java.util.logging.XMLFormatter;

/**
 * task_2
 */
public class task_2 {
    public static void task2(Logger logger) {
        int[] mas = { 11, 100, 45, 7, 14, 99, 1, 0, 509, 3, 78, 22 };

        boolean isSorted = false;
        int buf;

        System.out.println(mas);

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    logger.info(mas[i] + " - " + mas[i + 1]);
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
    }

    public static void Log() {

        Logger logger = Logger.getLogger(task_2.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
     try {
        FileHandler file = new FileHandler("log.xml");
        logger.addHandler(file);

        XMLFormatter xml = new XMLFormatter();
        file.setFormatter(xml);
    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

        task2(logger);
    }
}