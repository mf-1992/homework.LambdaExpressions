public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b); // в данной строке нет проверки знаменателя на ноль
        //Ошибка возникает, потому что на ноль делить нельзя, а "b" в данном случае = 0

        //Решить проблему можно, добавив условие проверки знаменателя на ноль
        if (b != 0) {                                       //Если знаменатель не равен 0,
            int c = calc.devide.apply(a, b);                //Будет делить
            calc.println.accept(c);
        } else {
            System.out.println("На ноль делить нельзя!");   //Иначе, выведет сообщение об ошибке
        }
    }
}
