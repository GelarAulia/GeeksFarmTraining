public class _6FutureInvestment {
	public static void main(String[] args) {
		//double investment = parseDouble(args[0]);
		//double interest = parseDouble(args[1]);
		//int years = parseInt(args[2]);
		double investment = 1000.0;
		double interest = 10.0;
		int years = 5;
		double futureValue = 0.0;

		System.out.println("Investment: " + investment);
		System.out.println("Interest: " + interest + "%");
		System.out.println("Years: " + years);

		//investment(1+((interest/100)/12))^(years*12)
		System.out.println("years     FutureValue");
		for (int x = 1;x <= years;x++){
			futureValue = investment*Math.pow((1+((interest/100)/12)),(x*12));
			double values = (double) Math.round(futureValue * 100) / 100;
			System.out.println(x + "             " + values);
		}
	}
}