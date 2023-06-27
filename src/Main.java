public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        String fullName = "Ivanov Ivan Ivanovich";
        String upperCaseFullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        String fullName = "Иванов Семён Семёнович";
        String replacedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника - " + replacedFullName);
    }

}