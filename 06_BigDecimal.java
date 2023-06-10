import java.math.BigDecimal;

class ClassBigDecimal1 {
    public static void main(String[] args) {
        double x = 1.05;
        double y = 2.55;

        BigDecimal d1 = new BigDecimal("1.05");

        BigDecimal d2 = new BigDecimal("2.55");

        System.out.println(d1.add(d2));
    }
}
