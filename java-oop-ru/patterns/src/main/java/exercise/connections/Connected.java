package exercise.connections;

// BEGIN
public class Connected implements Connection{
    private TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    public String getCurrentState() {
        return "connected";
    }

    public void connect() {
        System.out.println("Error. Try to connect when connection already established.");
    }

    public void disconnect() {
        System.out.println("Will disconnect now");
        this.connection.connect(new Disonnected(this.connection));
    }

    public String write (String data) {
        Stringbuilder sb = new Stringbuilder("");
        sb.append(data);
        String result = sb.toString();
        return result;
    }

}
// END
