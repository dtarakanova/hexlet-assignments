package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.util.Stream;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> allNulls = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();

        for (Field fields : field) {
            Notnull notNull = field.getAnnotation(NotNull.class);
            try {
                field.setAccessible(true);
                if (notNull != null && field.get(address) == null) {
                    allNulls.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return allNulls;
    }
}
// END
