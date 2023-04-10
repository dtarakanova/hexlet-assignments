package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> allNulls = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        if (field.getName != "flatNumber") {
            for (Field field : fields) {
                if (field.getAnnotation(NotNull.class) == null) {
                    allNulls.add(field.getName());
                }
            }
        }
        return allNulls;
    }
}
// END
