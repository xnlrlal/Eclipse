package kr.co.ezenac.nongeneric;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		Powder powder = new Powder();
		printer1.setMaterial(powder);

		Powder powder2 = printer1.getMaterial();
		System.out.println(powder2);

		ThreeDPrinter2 Printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		Printer2.setMaterial(plastic);

		Plastic plastic2 = Printer2.getMaterial();
		System.out.println(plastic2);

		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		Powder powder3 = (Powder) printer3.getMaterial();
	}
}
