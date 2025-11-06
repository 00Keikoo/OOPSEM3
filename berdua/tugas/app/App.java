import base.Component;
import core.*;
import storage.*;
import periferal.*;
import pc.PC;

public class App {
    public static void main(String[] args) {
        PC pc = new PC(
            new Motherboard(200_000),
            new CPU(1_500_000),
            new RAM(400_000)
        );

        pc.addStorage(new SSD(350_000));
        pc.addPeripheral(new Mouse(75_000));
        pc.addPeripheral(new Keyboard(150_000));
        pc.addPeripheral(new Monitor(1_200_000));
        pc.addPeripheral(new WiFiCard(180_000));

        System.out.println("=== HABIB PC ===");
        System.out.printf("Total Harga: Rp%,.0f%n", pc.calculateTotalPrice());
        System.out.println("Status: " + (pc.isValid() ? "VALID" : "TIDAK VALID"));
    }
}
