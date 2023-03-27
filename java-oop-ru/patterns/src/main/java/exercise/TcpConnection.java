package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection connection;
    private String ip;
    private int port;

    public TcpConnection (String ip, int port, Connection state){
        this.state = new Disconnected(this);
        this.ip = ip;
        this.port = port;
    }

    public String getCurrentState() {
        return connection;
    }

    public void connect() {
        this.connection = connection;
    }

    public void disconnect() {
        this.connection = connection;
    }

    public void write (String data) {
        Stringbuilder sb = new Stringbuilder("");
        sb.append(data);
        String result = sb.toString();
    }
}
// END
