public class Store {
    public static void main(String[] args) {
        int productPrice1 = 15;
        int productPrice2 = 10;
        int productPrice3 = 5;

        int total1 = productPrice1 * 2;
        int total2 = productPrice2 * 3;
        int total3 = productPrice3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
