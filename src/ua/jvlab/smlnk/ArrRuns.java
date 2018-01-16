package ua.jvlab.smlnk;

import java.util.Arrays;

        /*work with arrays*/
public class ArrRuns {
    public static void main(String[] args) {

        // обьявляем одномерный масив a типа іnt c 5 элементами и заполняем его;
        int[] a = {2, 4, 5, 7, 10};
        System.out.println(a); // вывод хеш [I@4554617c, так как в java на прямую запрещена работа с памятю;
        System.out.println(Arrays.toString(a)); // [2, 4, 5, 7, 10]

        /*в масив b скопированы елементы масива a с 0..по..3 индекс*/
        int[] b = Arrays.copyOfRange(a, 0, 3); //
        System.out.println(b); // вывод хеш [I@74a14482, сам хеш 74a14482 (в 16-тирич.с.с);
        System.out.println(Arrays.toString(b)); // [2, 4, 5];

        int[] c = Arrays.copyOf(b, 7); // копирует масив b в масив с, приэтом разширяет с трех элем. до 7;
        System.out.println(Arrays.toString(c)); // [2, 4, 5, 0, 0, 0, 0]

        Arrays.sort(c); // сортировка масива с мен.до больш.;
        System.out.println(Arrays.toString(c)); // [0, 0, 0, 0, 2, 4, 5]

        Arrays.fill(c, 7); // заполнение масива с числом 7;
        System.out.println(Arrays.toString(c) + "\n"); // [7, 7, 7, 7, 7, 7, 7]

        /* Специальный вид цикла для работы с массивами - for-each;*/
//        int[] d = {0, 2, 5, 9, 14};
//        for (int i : d) {
//            System.out.println(i + " "); // выводит в столбец 0,2,5,9,14;

        int[][] f = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(f + " "); // вывод хеш [[I@1540e19d, сам хеш 1540e19d (в 16-тирич.с.с., out: [[ - означ.2-мерн.);
        // System.out.println(Arrays.toString(f)); // вывод хеш [[I@1540e19d;
         for (int[] i : f) {
            System.out.println(Arrays.toString(i));
            /*
            [1, 2, 3]
            [4, 5, 6]
            [7, 8, 9]
            */

         // System.out.println(Arrays.copyOfRange(f,2,5)); // вывод хеш ???
        }

        /*Пример объявления, заполнения и вывода на экран 2-х мерного массива*/

        int[][] e = new int[4][5]; // обьявленние;
//        for (int i = 0; i < e.length; i++) { // обход цикла по строкам;
//            for (int j = 0; i < e[0].length; j++) { // обход цикла по столбцам;
//                e[i][j] = (i + j); // заполнение значениями;
//                System.out.println(e[i][j] + " "); // вывод на экран;
//            }
//            System.out.println("/n");
//        }
        /*Создание «рваных» массивов*/
        /*При создании 2-х мерных массивов при создании достаточно
          объявить первый размер, а второй размер объявлять динамически */

        int [][] bm =new int[8][];
//        for(int i=0;i<bm.length;i++){
//            bm[i]=new int[i];
//            for(int j=0;j<bm[i].length;j++){
//                bm[i][j]=i+j;
//                System.out.print(bm [i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}

