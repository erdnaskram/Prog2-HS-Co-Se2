package kap4.ProgU4_3;

public class MobileTest {

    public static void main(String[] args) {
        Star star1 = new Star(2);
        Star star2 = new Star(4);
        Star star3 = new Star(9);

        Wire wire1 = new Wire(star1, star2, 4.5, 4.5);
        Wire wire2 = new Wire(wire1, star3, 5, 5);

        System.out.println(wire2);

        wire1.balance();

        System.out.println(wire2);

        wire2.balance();

        System.out.println(wire2);

    }
}
