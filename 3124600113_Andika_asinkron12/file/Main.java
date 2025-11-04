public class Main {
    public static void main(String[] args) {
        System.out.println("--- SCENARIO 1: USING MYSQL ---");
        DBConnectionInterface mySQL = new MySQLConnection();
        PasswordReminder reminderMySQL = new PasswordReminder(mySQL);
        reminderMySQL.sendReminders();

        System.out.println("\n--- SCENARIO 2: USING POSTGRESQL ---");
        DBConnectionInterface postgreSQL = new PostgreSQLConnection();
        PasswordReminder reminderPostgreSQL = new PasswordReminder(postgreSQL);
        reminderPostgreSQL.sendReminders();

        System.out.println("\n--- SCENARIO 3: USING SIMULATION (Development Mode) ---");
        DBConnectionInterface simulated = new SimulatedConnection();
        PasswordReminder reminderSim = new PasswordReminder(simulated);
        reminderSim.sendReminders();
    }
}

