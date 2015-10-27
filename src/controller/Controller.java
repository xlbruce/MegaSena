package controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;

/**
 *
 * @author bruce
 */
public class Controller {

    public static Integer[] getRandomIntegers(int quantity) {
        Set<Integer> integers = new HashSet<>();
        Random r = new Random(System.currentTimeMillis());
        int i = 0;
        while (i < quantity) {
            if (integers.add(getRandomNumber(1, 60))) {
                i++;
            }
        }
        Integer[] result = new Integer[quantity];
        integers.toArray(result);
        return result;
    }

    public static boolean compare(int[] a, int[] b) {
        if (a.length == b.length) {
            int[] aTmp = a.clone();
            int[] bTmp = b.clone();
            mergeSort(aTmp);
            mergeSort(bTmp);

            for (int i = 0; i < aTmp.length; i++) {
                if (aTmp[i] != bTmp[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean compare(Integer[] a, Integer[] b) {
        int[] arrA = toIntArray(a);
        int[] arrB = toIntArray(b);
        return compare(arrA, arrB);
    }

    private static int[] toIntArray(Integer[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {
        Integer[] randomIntegers = getRandomIntegers(6);
        for (Integer inte : randomIntegers) {
            System.out.println(inte);
        }
    }

    private static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length / 2;

            int[] leftArray = Arrays.copyOfRange(A, 0, q);
            int[] rightArray = Arrays.copyOfRange(A, q, A.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A, leftArray, rightArray);
        }
    }

    private static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i, li, ri;
        i = li = ri = 0;
        while (i < totElem) {
            if ((li < l.length) && (ri < r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                } else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            } else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
    }
}
