public class TicketDesk {

    private Ticket[] tickets;
    private int count;
    private int nextId;

    public TicketDesk(int capacity) {
        tickets = new Ticket[capacity];
        count = 0;
        nextId = 1;
    }

    public void createTicket(String title, String description) {
        if (count >= tickets.length) {
            System.out.println("Ticket storage full!");
            return;
        }
        tickets[count++] = new Ticket(nextId++, title, description);
    }

    public void listTickets() {
        if (count == 0) {
            System.out.println("No tickets available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i]);
        }
    }

    public void updateTicket(int id, String title, String description) {
        Ticket ticket = findById(id);
        if (ticket != null) {
            ticket.update(title, description);
        } else {
            System.out.println("Ticket not found.");
        }
    }

    public void closeTicket(int id) {
        Ticket ticket = findById(id);
        if (ticket != null) {
            ticket.close();
        } else {
            System.out.println("Ticket not found.");
        }
    }

    private Ticket findById(int id) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getId() == id) {
                return tickets[i];
            }
        }
        return null;
    }
}
