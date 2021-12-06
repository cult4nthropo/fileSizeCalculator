package de.kathleenprasatko.fileSize.calculator;

import java.util.Scanner;

import de.kathleenprasatko.fileSize.Scan;
import de.kathleenprasatko.fileSize.Soundfile;
import de.kathleenprasatko.fileSize.Videofile;

public class CalculateFileSize {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scan scan = new Scan();
			
			System.out.println("Width of the Scan: ");
			double widthScan = scanner.nextDouble();
			scan.setWidth(widthScan);
			System.out.print("Height of the Scan: ");
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
			
			scanner.close();
			double fileSizeVideo = videofile.calculateFileSize(videofile);
			System.out.println(fileSizeVideo);
	}
}
