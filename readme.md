Исходный вариант
Задание 2

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   // ОБЪЯВЛЯЕМ переменную дабл а пытамся присвоить массив. Да ещё и intArray это вообще что :-)
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}



Задание 3

public static void main(String[] args) throws Exception {   // причём тут и зачем тут throws Exception
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9; 
   } catch (Throwable ex) {  // такую в конце иначе не пойдём проверять
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!"); //если считать за конечный код выше то предыдущие кетчи не нужны так как сработает только этот же
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {  //throws FileNotFoundException тут может только формат же а причём тут файл не найден
   System.out.println(a + b);
}
