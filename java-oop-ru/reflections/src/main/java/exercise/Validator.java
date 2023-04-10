package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> allNulls = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(NotNull.class) == null) {
                allNulls.add(String.valueOf(field));
            }
        }
        return allNulls;
    }
}
// END
