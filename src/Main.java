import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();

        List<Person> list = new ArrayList<>();
        generateClients(list);

        for (Person person : list) {
            queue.offer(person);
        }
        attraction(queue);
    }
    public static List<Person> generateClients(List list) {

        Person person1 = new Person(5, "Иван", "Петров");
        Person person2 = new Person(2, "Антон", "Козлов");
        Person person3 = new Person(6, "Злата", "Минаева");
        Person person4 = new Person(3, "Мария", "Шведова");
        Person person5 = new Person(1, "Василий", "Яров");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }
    public static void attraction(Queue<Person> queue) {
        while (!queue.isEmpty()) {
            for (Person person : queue) {
                System.out.println(person.name + " " + person.surname + "  Прокатился на аттракционе");
                person.ticket_number = person.ticket_number - 1;
                if (person.ticket_number == 0) {
                    queue.remove(person);
                }
            }
        }
    }
}