import java.util.List;
import java.util.Arrays;

public class SimulatedConnection implements DBConnectionInterface {
    private boolean isConnected = false;

    @Override
    public void connect(String connectionInfo) {
        System.out.println("SimulatedConnection: Simulasi koneksi untuk development.");
        this.isConnected = true;
    }

    @Override
    public void disconnect() {
        System.out.println("SimulatedConnection: Koneksi simulasi ditutup.");
        this.isConnected = false;
    }

    @Override
    public List<String> executeQuery(String query) {
        System.out.println("SimulatedConnection: Menjalankan query '" + query + "'");
        return Arrays.asList("simulated_user1@example.com");
    }

    @Override
    public boolean isConnected() {
        return this.isConnected;
    }
}

