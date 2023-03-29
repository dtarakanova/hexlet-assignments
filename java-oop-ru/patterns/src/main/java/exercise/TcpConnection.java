package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection connection;
    private String ip;
    private int port;

    public TcpConnection (String ip, int port){
        this.connection = new Disconnected(this);
        this.ip = ip;
        this.port = port;
    }

    public void SetConnection (Connection connection) {
        this.connection = connection;
    }

    public String getCurrentState() {
        return connection;
    }

    public void connect() {
        connection.connect();
    }

    public void disconnect() {
        connection.disconnect();
    }

    public void write (String data) {
        Stringbuilder sb = new Stringbuilder("");
        sb.append(data);
        String result = sb.toString();
    }
}
// END
