import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        Scanner num = new Scanner(System.in);
        System.out.println("Введите кол-во элементов: ");
        int quantity = num.nextInt();
        int sum = 0;
        sumLs(quantity, sum);
    }
    public static void sumLs(int quantity, int sum){
        Random rndGen = new Random();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < quantity; i++) {
            ls.add(rndGen.nextInt(1,100));
        }
        Iterator<Integer> iterator = ls.iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Список элементов: " + ls);
        System.out.println("Сумма элементов списка: " + sum);
    }
}


