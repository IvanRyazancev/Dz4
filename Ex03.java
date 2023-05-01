import java.util.Arrays;
import java.util.LinkedList;


public class Ex03 {
    public static void main(String[] args) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        summList(ls);
    }

    public static void summList(LinkedList<Integer> ls) {
        Integer summ = 0;
        for (int i = 0; i < ls.size(); i++) {
            summ = summ + ls.get(i);
        }
        System.out.println("Сумма элементов списка: " + summ);
    }
}



