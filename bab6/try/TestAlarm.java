public class TestAlarm{
	public static void main(String args[]){
		Alarm alarm = new Alarm("1", "Bangun pagi", "10-10-2025", "04.00");

		alarm.run();
		alarm.terminate();
		alarm.snooze();
	}
}
