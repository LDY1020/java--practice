package 상속;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		CalCulator calculator = new CalCulator();
		System.out.println(calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));

	}

}
