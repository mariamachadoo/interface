package Interface;

public class Calculando implements calculos {
	
	int num1 = 5;
	int num2 = 8;
	
	@Override
	public double somar () {
		System.out.println(num1+num2);
		return 0;
	}
	
	@Override
	public double sub () {
		System.out.println(num1-num2);
		return 0;
	}
	
	@Override
	public double mult () {
		System.out.println(num1*num2);
		return 0;
	}
	@Override
	public int div () {
		System.out.println(num1/num2);
		return 0;
	}
	@Override
	public int exp () {
		System.out.println(Math.pow(num1, num2));
		return 0;
	}

}
