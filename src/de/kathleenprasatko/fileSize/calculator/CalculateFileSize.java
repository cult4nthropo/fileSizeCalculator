package de.kathleenprasatko.fileSize.calculator;

import java.util.Scanner;

import de.kathleenprasatko.fileSize.Scan;
import de.kathleenprasatko.fileSize.Soundfile;
import de.kathleenprasatko.fileSize.Videofile;

/**
 * Start class of the file size calculator.
 * Takes the values of the file by user input
 * @see java.util.Scanner#next()
 * @since 1.0.0
 * 
 * @author Kathleen Prasatko
 */

public class CalculateFileSize {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * @param the instances of scan, sound file and video file
		 * @return the file size of the instances of scan, sound file and video file
		 * As long as the user wants to calculate a file, he can chose the file class, enter the values and let the program calculate the file size
		 */
		boolean repeat = true;
		while (repeat) {
			//TODO: Add exception handling for the calculations. Right now the program breaks if the user enters a string (try catch with InputMismatchException)
			//TODO: Exception handling: avoid negative values
			//TODO: round the file size to 2 decimals
			System.out.println("Do you want to calculat a [1] Scan, a [2] Soundfile or a [3] videofile. Press [0] to end the program?");
			String filechoice = scanner.next().toLowerCase().intern();
			
			switch (filechoice) {
				case "0":
					System.out.println("End");
					repeat = false;
					break;
				case "1":
					Scan scan = new Scan();
						
					System.out.println("Width of the Scan in cm: ");
					double widthScan = scanner.nextDouble();
					scan.setWidth(widthScan);
					System.out.print("Height of the Scan in cm: ");
					double heightScan = scanner.nextDouble();
					scan.setHeight(heightScan);
					System.out.print("Depth of color: ");
					double depthScan = scanner.nextDouble();
					scan.setDepth(depthScan);
					System.out.print("Resolution of the Scan: ");
					double resolutionScan = scanner.nextDouble();
					scan.setResolution(resolutionScan);
					System.out.print("Compression of the Scan: ");
					double compressionScan = scanner.nextDouble();
					scan.setCompression(compressionScan);		
					double fileSizeScan = scan.calculateFileSize(scan);
					
					System.out.println(fileSizeScan);
					break;
				case "2" :
					Soundfile soundfile = new Soundfile();
					System.out.print("How many channels has your file: ");
					double channelsSound = scanner.nextDouble();
					soundfile.setChannels(channelsSound);
					System.out.print("How long in minutes does it go: ");
					double durationSound = scanner.nextDouble();
					soundfile.setDuration(durationSound);
					System.out.print("Which frequency in Hz does it have: ");
					double frequencySound = scanner.nextDouble();
					soundfile.setFrequency(frequencySound);
					System.out.print("Resolution of the sound file: ");
					double resolutionSound = scanner.nextDouble();
					soundfile.setResolution(resolutionSound);
					
					double fileSizeSound = soundfile.calculateFileSize(soundfile);	
					System.out.println(fileSizeSound);
					break;
				case "3":
					Videofile videofile = new Videofile();
					System.out.print("Which width has this frame in px: ");
					double widthVideo = scanner.nextDouble();
					videofile.setWidth(widthVideo);
					System.out.print("Which height has this frame in px: ");
					double heightVideo = scanner.nextDouble();
					videofile.setHeight(heightVideo);
					System.out.print("Which depth has this video: ");
					double depthVideo = scanner.nextDouble();
					videofile.setDepth(depthVideo);
					System.out.print("How many frames per second: ");
					double framesPerSecondVideo = scanner.nextDouble();
					videofile.setFramesPerSecond(framesPerSecondVideo);
					System.out.print("How long in minutes does it go: ");
					double durationVideo = scanner.nextDouble();
					videofile.setDuration(durationVideo);
					System.out.print("Compression of the video: ");
					double compressionVideo = scanner.nextDouble();
					videofile.setCompression(compressionVideo);
					
					
					double fileSizeVideo = videofile.calculateFileSize(videofile);
					System.out.println(fileSizeVideo);
					break;
				default:
					System.out.println("Bitte nur [1], [2] oder [3] eingeben.");
			}
			//scanner.close();
			//TODO: Find correct position for scanner to open and close
		}
		
	}
}
