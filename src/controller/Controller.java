package controller;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author bruce
 */
public class Controller {

    public static int[] getRandomIntegers(int quantity) {
        Set<Integer> integers = new TreeSet<>();
        Random r = new Random(System.currentTimeMillis());
        int i = 0;
        while (i < quantity) {
            if (integers.add(getRandomNumber(1, 60))) {
                i++;
            }
        }

        int[] result = new int[quantity];
        Iterator<Integer> iterator = integers.iterator();
        int j = 0;
        while (iterator.hasNext()) {
            result[j++] = iterator.next();
        }
        return result;
    }

    public static boolean temQuadra(int[] a, int[] b) {
        final int QUADRA = 4;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        return count == QUADRA;
    }
    
    public static boolean temQuina(int[] a, int[] b) {
        final int QUINA = 5;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        return count == QUINA;
    }
    
    public static boolean compare(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

        }
        return true;
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
}
