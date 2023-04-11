package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.time.Instant;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
class App {
    public static void save(Path path, Car car) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(String.valueOf(path)), car);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car extract(Path path) {
        ObjectMapper mapper = new ObjectMapper();
        Car car;
        try {
            car = mapper.readValue(new File(String.valueOf(path)), Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
}
// END
