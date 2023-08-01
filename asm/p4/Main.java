package DSA.asm.p4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(250);
        Stack stack = new Stack(250);

        int choice;
        String inputString;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Input message");
            System.out.println("2. Send message");
            System.out.println("3. View received messages");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the string (max 250 characters): ");
                    inputString = scanner.nextLine();
                    queue.enqueue(inputString);
                    break;
                case 2:
                    while (!queue.isEmpty()) {
                        String message = queue.dequeue();
                        stack.push(message);
                    }
                    System.out.println("Messages dequeued and pushed to the stack.");
                    break;
                case 3:
                    System.out.println("Messages in the stack:");
                    while (!stack.isEmpty()) {
                        String message = stack.pop();
                        System.out.println(message);
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
