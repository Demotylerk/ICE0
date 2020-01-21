import java.math.BigDecimal;

public class Application implements Runnable{

	public static BigDecimal num = new BigDecimal(1.0);
	public static Logger logger = new Logger();

	public static void main(String[] args) throws InterruptedException {

		//Start new Threads
		for(int i = 0; i < 1000; i++) {
			new Thread(new Application()).start();
		}

		Thread.sleep(2000);

		//Print when done running all threads
		System.out.println("Number Equals: " + num);
	}

	//Each thread adds to the running total, and pushes the result to the log
	@Override
	public void run() {
		if(Double.parseDouble(num.toString()) == Double.NaN) {
			logger.addLog("Invalid Number!");
		} else {
			logger.addLog(num.toString());
		}
	}


}

