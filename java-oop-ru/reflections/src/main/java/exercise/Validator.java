package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.util.Stream;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> hasAnnotations = new ArrayList<>();
        List<String> allNulls = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        hasAnnotations = stream.of(fields)
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .collect(Collectors.toList());
        for (Field nullFields : hasAnnotations) {
                if (nulls.getAnnotation(NotNull.class) == null) {
                    allNulls.add(field.getName());
                }
            }
        return allNulls;
    }
}
// END
