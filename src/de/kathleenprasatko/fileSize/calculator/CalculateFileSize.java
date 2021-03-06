package de.kathleenprasatko.fileSize.calculator;

import java.util.Scanner;

import de.kathleenprasatko.fileSize.Scan;
import de.kathleenprasatko.fileSize.Soundfile;
import de.kathleenprasatko.fileSize.Videofile;

/**
 * Start class of the file size calculator.
 * Takes the values of the file by user input
 * @see java.util.Scanner#next()
 */

public class CalculateFileSize {
	private Scanner scannerCalc;
	public CalculateFileSize(Scanner scanner) {
		this.scannerCalc = scanner;
	}
	public  void calculate() {
		/**
		 * @param the instances of scan, sound file and video file
		 * @return the file size of the instances of scan, sound file and video file
		 * As long as the user wants to calculate a file, he can chose the file class, enter the values and let the program calculate the file size
		 */
		boolean repeat = true;
		
		while (repeat) {
			//TODO: round the file size to 2 decimals
			System.out.println("Do you want to calculate a [1] Scan, a [2] Soundfile or a [3] videofile. Press [0] to end the program?");
			String filechoice = scannerCalc.next();
			
			switch (filechoice) {
				case "0":
					System.out.println("End");
					repeat = false;
					continue;
					
				case "1":
					Scan scan = new Scan();
					System.out.println("Width of the Scan in cm: ");
				try {
					scan.setWidth(scannerCalc.nextDouble());
					System.out.print("Height of the Scan in cm: ");
					scan.setHeight(scannerCalc.nextDouble());
					System.out.print("Depth of color: ");
					scan.setDepth(scannerCalc.nextDouble());
					System.out.print("Resolution of the Scan: ");
					scan.setResolution(scannerCalc.nextDouble());
					System.out.print("Compression of the Scan: ");
					scan.setCompression(scannerCalc.nextDouble());
				} catch(Exception e) {
					System.out.println("Please enter a number bigger than 0.");
					continue;
				}		
					double fileSizeScan = scan.calculateFileSize(scan);
					System.out.println(fileSizeScan);
					break;
					
				case "2" :
						Soundfile soundfile = new Soundfile();
						System.out.print("How many channels has your file: ");
					try {
						soundfile.setChannels(scannerCalc.nextDouble());
						System.out.print("How long in minutes does it go: ");
						soundfile.setDuration(scannerCalc.nextDouble());
						System.out.print("Which frequency in Hz does it have: ");
						soundfile.setFrequency(scannerCalc.nextDouble());
						System.out.print("Resolution of the sound file: ");
						soundfile.setResolution(scannerCalc.nextDouble());
					} catch(Exception e) {
						System.out.println("Please enter a number bigger than 0.");
						continue;
					}
						double fileSizeSound = soundfile.calculateFileSize(soundfile);	
						System.out.println(fileSizeSound);
						break;
					
				case "3":
					Videofile videofile = new Videofile();
					System.out.print("Which width has this frame in px: ");
					try {
						videofile.setWidth(scannerCalc.nextDouble());
						System.out.print("Which height has this frame in px: ");
						videofile.setHeight(scannerCalc.nextDouble());
						System.out.print("Which depth has this video: ");
						videofile.setDepth(scannerCalc.nextDouble());
						System.out.print("How many frames per second: ");
						videofile.setFramesPerSecond(scannerCalc.nextDouble());
						System.out.print("How long in minutes does it go: ");
						videofile.setDuration(scannerCalc.nextDouble());
						System.out.print("Compression of the video: ");
						videofile.setCompression(scannerCalc.nextDouble());
					} catch(Exception e) {
						System.out.println("Please enter a number bigger than 0.");
						continue;
					}
					double fileSizeVideo = videofile.calculateFileSize(videofile);
					System.out.println(fileSizeVideo);
					break;
				
				default:
					System.out.println("Please enter only [1], [2] or [3].");
			}
		}
	}
}
