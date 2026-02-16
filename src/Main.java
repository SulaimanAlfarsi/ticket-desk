import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketDesk desk = new TicketDesk(100);

        while (true) {
            System.out.println("\n=== Ticket Desk ===");
            System.out.println("1. Create Ticket");
            System.out.println("2. List Tickets");
            System.out.println("3. Update Ticket");
            System.out.println("4. Close Ticket");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    desk.createTicket(title, desc);
                    break;

                case 2:
                    desk.listTickets();
                    break;

                case 3:
                    System.out.print("Ticket ID: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("New Description: ");
                    String newDesc = scanner.nextLine();
                    desk.updateTicket(updateId, newTitle, newDesc);
                    break;

                case 4:
                    System.out.print("Ticket ID: ");
                    int closeId = Integer.parseInt(scanner.nextLine());
                    desk.closeTicket(closeId);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
