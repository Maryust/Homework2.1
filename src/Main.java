public class Main {
    public static void main(String[] args) {
        int ticketPriceInKopecks = 1829_90;
        // Цена за билет выраженная в копейках
        int milePrice = 20;
        int mile = ticketPriceInKopecks / 100 / milePrice;
        System.out.print("Начислено миль:" + mile);
    }
}
