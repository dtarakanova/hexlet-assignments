package exercise;

// BEGIN
public class App {
    public static int printSquare(Circle circle) {
        try {
            Circle.getSquare(circle);
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
