package pc;

import core.*;
import storage.*;
import periferal.*;      
import base.Component;

import java.util.ArrayList;
import java.util.List;

public class PC {
    // COMPOSITION (wajib, mati bareng)
    private final Motherboard motherboard;
    private final CPU cpu;
    private final RAM ram;
    // AGGREGATION (opsional, bisa dipindah)
    
    private final List<Component> storages = new ArrayList<>();
    private final List<Component> peripherals = new ArrayList<>(); 

    public PC(Motherboard motherboard, CPU cpu, RAM ram) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void addStorage(Component storage) {
        storages.add(storage);
    }

    public void addPeripheral(Component peripheral) {
        peripherals.add(peripheral);
    }

    public double calculateTotalPrice() {
        double total = motherboard.getPrice() + cpu.getPrice() + ram.getPrice();
        for (Component s : storages) total += s.getPrice();
        for (Component p : peripherals) total += p.getPrice(); 
        return total;
    }

    public boolean isValid() {
        return !storages.isEmpty();
    }
}