package exercise;

// BEGIN
public class App {
    public static int printSquare(Circle circle) {
        try {
            return Math.round(Circle.getSquare());
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
