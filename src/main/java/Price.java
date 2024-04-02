public class Price {

    public static double getTotalPrice(double distance, double waitingHour) {
        if (distance <= 0 || distance > 5000) return -1;
        double openingPrice = 9000, totalPrice;
        if (distance < 1) totalPrice = openingPrice;
        else if (distance <= 30) totalPrice = openingPrice + distance * 11000;
        else totalPrice = openingPrice + 30 * 11000 + (distance - 30) * 9500;

        if (waitingHour > 0) totalPrice += 20000 * waitingHour;
        return totalPrice;
    }
}
