package in.mywork.oop.interfacedemos.main;

import in.mywork.oop.interfacedemos.Calculator;
import in.mywork.oop.interfacedemos.implementation.AddCalculation;
import in.mywork.oop.interfacedemos.implementation.DivideCalculation;
import in.mywork.oop.interfacedemos.implementation.MultiplyCalculation;
import in.mywork.oop.interfacedemos.implementation.SubstractCalculation;

public class MainCalculator {
	public static void main(String[] args) {
		Calculator calc = new AddCalculation();
		calc.printMessage("Addition");
		
		calc.printMessage(calc.calculate(10, 20)+"");
		
		Calculator calc1 = new SubstractCalculation();
		calc1.printMessage("Substraction");
		
		calc1.printMessage(calc1.calculate(10, 20)+"");
		
		Calculator calc2 = new MultiplyCalculation();
		calc2.printMessage("Multiplication");
		
		calc2.printMessage(calc2.calculate(10, 20)+"");
		
//		Calculator calc3 = new DivideCalculation();
//		calc3.printMessage("Division");
//		
//		calc3.printMessage(calc3.calculate(10, 20)+"");
		
		
		//anonymous class
		
		Calculator divCalc = new Calculator() {
			@Override
			public int calculate(int num1,int num2) {
				return num1/num2;
			}
		};
		
		divCalc.calculate(10, 20);
		
		
		//Lambda Expression
		Calculator moduloCalc = (number1,number2) -> number1%number2;  //lambda expression only when interface have Single Abstract Method(SAM) called as Functional Interface
		
		moduloCalc.printMessage(moduloCalc.calculate(5, 2)+"");
		
		
	}

}
