package exercise.connections;

// BEGIN
public class Disconnected implements Connectionm {
    private TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void connect() {
        connection.setState(new Connected(connection));
        System.out.println("Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Error. Try to connect when connection already established.");
    }

    @Override
    public void write(String data) {
        System.out.println("Error. Establish connection first.");
    }
}
// END
