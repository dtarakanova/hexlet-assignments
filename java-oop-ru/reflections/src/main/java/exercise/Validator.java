package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> allNulls = new ArrayList<>();
        Field[] fields = address.Address().getDeclaredFields();
        for (Field field : fields) {
            RandomNumber randomNumber = field.getAnnotation(Address.class);
            if (randomNumber == null) {
                allNulls.add(field);
            }
        }
        return allNulls;
    }
}
// END
