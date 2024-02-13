import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStorage<Person> storage = new GenericStorage<>();

        while (true) {
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Remove a student");
            System.out.println("4. Remove a teacher");
            System.out.println("5. Search for a person");
            System.out.println("6. Display all persons");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    storage.add(new Student(studentName, studentAge));
                    break;
                case 2:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine();
                    storage.add(new Teacher(teacherName, teacherAge));
                    break;
                case 3:
                    System.out.print("Enter student ID to remove: ");
                    int studentIdToRemove = scanner.nextInt();
                    storage.remove(studentIdToRemove);
                    break;
                case 4:
                    System.out.print("Enter teacher ID to remove: ");
                    int teacherIdToRemove = scanner.nextInt();
                    storage.remove(teacherIdToRemove);
                    break;
                case 5:
                    System.out.print("Enter ID to search: ");
                    int idToSearch = scanner.nextInt();
                    Person foundPerson = storage.search(idToSearch);
                    if (foundPerson != null) {
                        System.out.println("Person found - Name: " + foundPerson.getName() + ", Age: " + foundPerson.getAge());
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 6:
                    storage.displayAllItems();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}