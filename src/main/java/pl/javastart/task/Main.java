package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Mateusz", "Nowak");
        Person person2 = new Person("Ewelina", "Kowalska");

        /* Możliwe wartości priority
        Wartość ujemna -> niski priorytet
        0 -> normalny priorytet
        Wartość dodatnia -> wysoki priorytet */

        Task task1 = new Task("Sprzątanie", "Posprzątać łazienkę", 2, person1);
        Task task2 = new Task("Pranie", "Wyprać pościel", -1, person2);
        Task task3 = new Task("Zakupy", "Kupić chleb", 0, person2);
        Task task4 = new Task("Opłaty", "Zapłacić za prąd", 5, person1);

        task1.showPriorityAndTask();
        task2.showPriorityAndTask();
        task3.showPriorityAndTask();
        task4.showPriorityAndTask();

    }
}
