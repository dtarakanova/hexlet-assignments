package exercise.connections;

// BEGIN
public class Disconnected implements Connection{
    private TcpConnection connection;

    public Disonnected(TcpConnection connection) {
        this.connection = connection;
    }

    public String getCurrentState() {
        return "disconnected";
    }

    public void connect() {
        System.out.println("Establish connection");
        this.connection.connect(new Connected(this.connection));
    }

    public void disconnect() {
        System.out.println("Error. Try to connect when connection already established.");
    }

    public String write (String data) {
        System.out.println("Error. Establish connection first.");
    }
}
// END
