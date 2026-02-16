public class Ticket {
    private int id;
    private String title;
    private String description;
    private String status; // OPEN or CLOSED

    public Ticket(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "OPEN";
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    public void update(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void close() {
        this.status = "CLOSED";
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " (" + status + ") - " + description;
    }
}
