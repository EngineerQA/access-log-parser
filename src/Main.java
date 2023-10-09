import java.util.Scanner; //импортируем класс

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int firstNumber = getFirstNumber();
        int secondNumber = getSecondNumber();

        System.out.println("Сумма: " + (firstNumber+secondNumber));
        System.out.println("Разность: " + (firstNumber-secondNumber));
        System.out.println("Произведение: " + (firstNumber*secondNumber));
        if (secondNumber == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
            System.out.println("Частное: " + (double)(firstNumber/secondNumber));
        }
    }

    public static int getFirstNumber() {
        System.out.println("Введите первое целое число:");
        int firstNumber;
        if (sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
            firstNumber = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
        } else {
            System.out.println("Вы ввели некорректное значение");
            sc.next();
            firstNumber = getFirstNumber();
            }
            return firstNumber;
        }

        public static int getSecondNumber() {
            System.out.println("Введите второе целое число:");
            int secondNumber;
            if (sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
                secondNumber = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
            } else {
                System.out.println("Вы ввели некорректное значение");
                sc.next();
                secondNumber = getSecondNumber();
            }
            return secondNumber;
        }

        /*System.out.println("Введите первое целое число:");

        int firstNumber = 0;
            if (sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
            firstNumber = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
        } else {
            System.out.println("Введено некорректное значение");
            }
            return;

        System.out.println("Введите второе целое число:");
        int secondNumber = 0;
            if (sc.hasNextInt()) {
            secondNumber = sc.nextInt();
        } else {
            System.out.println("Введено некорректное значение");
            }
            return;*/


    }

/*import java.util.Scanner; //импортируем класс

public class Main {
    static Scanner sc = new Scanner(System.in); //объект класса Scanner

    public static void main(String[] args) { //последовательно получает два числа из консоли и выполняет над ними арифметические операции
        while (true) {
            int firstNumber = getFirstNumber();
            int secondNumber = getSecondNumber();
            char operation = getOperation();

            switch (operation){
                case '+':
                    System.out.println("Сумма: " + (firstNumber+secondNumber));
                    break;
                case '-':
                    System.out.println("Разность: " + (firstNumber-secondNumber));
                    break;
                case '*':
                    System.out.println("Произведение: " + (firstNumber*secondNumber));
                    break;
                case '/':
                    System.out.println("Частное: " + (double)(firstNumber/secondNumber));
                    break;
                default:
                    System.out.println("Допущена ошибка при вводе операции. Повторите ввод");
            }

        }
    }

    public static int getFirstNumber() {
        System.out.println("Введите первое целое число:");
        int firstNumber;
        if (sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
            firstNumber = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
        } else {
            System.out.println("Вы ввели некорректное значение");
            sc.next();
            firstNumber = getFirstNumber();
        }
        return firstNumber;
    }

    public static int getSecondNumber() {
        System.out.println("Введите второе целое число:");
        int secondNumber;
        if (sc.hasNextInt()) { //возвращает истинну если с потока ввода можно считать целое число
            secondNumber = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
        } else {
            System.out.println("Вы ввели некорректное значение");
            sc.next();
            secondNumber = getSecondNumber();
        }
        return secondNumber;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);

        } else {
            System.out.println("Допущена ошибка при вводе операции. Повторите ввод");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }
}*/