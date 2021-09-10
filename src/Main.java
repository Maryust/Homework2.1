public class Main {
    public static void main(String[] args) {
        int ticketPriceInKopecks = 1829_90;
        // Цена за билет выраженная в копейках
        int mileprice = 20;
        int mile = ticketPriceInKopecks / 100 / mileprice;
        System.out.print("Начислено миль:" + mile);
    }
}
