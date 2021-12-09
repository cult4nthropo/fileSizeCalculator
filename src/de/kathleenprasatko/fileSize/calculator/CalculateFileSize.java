package de.kathleenprasatko.fileSize.calculator;

import java.util.InputMismatchException;
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
	

	public static void main(String[] args) {
		/**
		 * @param the instances of scan, sound file and video file
		 * @return the file size of the instances of scan, sound file and video file
		 * As long as the user wants to calculate a file, he can chose the file class, enter the values and let the program calculate the file size
		 */
		boolean repeat = true;
		Scanner scanner = new Scanner(System.in);
		while (repeat) {
		
			//TODO: try except block repeats every 5th line -> find optimization to avoid repeating
			//TODO: round the file size to 2 decimals
			
			System.out.println("Do you want to calculat a [1] Scan, a [2] Soundfile or a [3] videofile. Press [0] to end the program?");
			String filechoice = scanner.next();
			
			switch (filechoice) {
				case "0":
					System.out.println("End");
					repeat = false;
					continue;
					
				case "1":
					Scan scan = new Scan();
					System.out.println("Width of the Scan in cm: ");
				try {
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
		scanner.close();
	}
}
