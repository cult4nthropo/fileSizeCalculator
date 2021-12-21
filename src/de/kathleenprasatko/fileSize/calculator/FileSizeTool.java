package de.kathleenprasatko.fileSize.calculator;

import java.util.Scanner;

public class FileSizeTool {

	public static void main(String[] args) throws InvalidValueException {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			System.out.println("Do you want to [1] get the file size of a scan sound or video file by entering your values or"
					+ " [2] train your calculation skills? Press [0] to end the program?");
			String trainOrCalculate = scanner.next();
			
			switch (trainOrCalculate) {
			
			case "0":
				System.out.println("End");
				repeat = false;
				break;
			case "1":
				CalculateFileSize calculation = new CalculateFileSize(scanner);
				calculation.calculate();
				break;
			case "2":
				TrainFileSizeCalculation training = new TrainFileSizeCalculation(scanner);
				training.train();
				break;
			default:
				System.out.println("Please enter only [1], [2] or [3].");
			}
	
		}
		scanner.close();
	}
}
