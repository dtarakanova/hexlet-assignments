package exercise.connections;

public interface Connection {
    // BEGIN
    String getCurrentState();
    void connect();
    void disconnect();
    String write();
    // END
}
