package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
       List<Integer> numbers1 = new ArrayList<>();
       numbers1.add(1);
       numbers1.add(2);
       numbers1.add(3);
       numbers1.add(4);
       int numberOfElements = 2;
       int[] newNumbers1 = new int[numberOfElements];
           for (var i = 0; i < numberOfElements; i++) {
           newNumbers1[i] = numbers1.get(i);
           }
       assertThat(newNumbers1).hasSize(2);
        // END
    }
}
