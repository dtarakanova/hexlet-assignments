package exercise;

// BEGIN
public class TcpConnection {
    private String ip;
    private int port;
    private Connection state;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.state = new Disconnected(this);
    }

    public String getCurrentState() {
        return state.getCurrentState();
    }

    public void connect() {
        state.connect();
    }

    public void disconnect() {
        state.disconnect();
    }

    public void setState(Connection connection) {
        state = connection;
    }

    public void write(String data) {
        state.write(data);
    }
}
// END
